package fr.mleduc.gpfl.interpreter;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import fr.mleduc.gpfl.gpfl.AcceptCmd;
import fr.mleduc.gpfl.gpfl.AlarmCmd;
import fr.mleduc.gpfl.gpfl.AutomataDef;
import fr.mleduc.gpfl.gpfl.AutomatonCmd;
import fr.mleduc.gpfl.gpfl.CondStmt;
import fr.mleduc.gpfl.gpfl.DropCmd;
import fr.mleduc.gpfl.gpfl.InPort;
import fr.mleduc.gpfl.gpfl.InterruptStmt;
import fr.mleduc.gpfl.gpfl.IterStmt;
import fr.mleduc.gpfl.gpfl.NopCmd;
import fr.mleduc.gpfl.gpfl.OutPort;
import fr.mleduc.gpfl.gpfl.Program;
import fr.mleduc.gpfl.gpfl.SendCmd;
import fr.mleduc.gpfl.gpfl.SetCmd;
import fr.mleduc.gpfl.gpfl.State;
import fr.mleduc.gpfl.gpfl.StpCmd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class GpflInterpreter extends XbaseInterpreter {
  public enum Port {
    IN,
    
    OUT;
  }
  
  @Accessors
  public static class Packet {
    private final GpflInterpreter.Port port;
    
    private final Map<String, String> datas;
    
    public Packet(final GpflInterpreter.Port port, final Map<String, String> datas) {
      super();
      this.port = port;
      this.datas = datas;
    }
    
    @Pure
    public GpflInterpreter.Port getPort() {
      return this.port;
    }
    
    @Pure
    public Map<String, String> getDatas() {
      return this.datas;
    }
  }
  
  @Accessors
  public static class AutomatonInstance {
    private final AutomataDef automata;
    
    private final State currentState;
    
    public AutomatonInstance(final AutomataDef automata, final State currentState) {
      super();
      this.automata = automata;
      this.currentState = currentState;
    }
    
    @Pure
    public AutomataDef getAutomata() {
      return this.automata;
    }
    
    @Pure
    public State getCurrentState() {
      return this.currentState;
    }
  }
  
  @Accessors
  @ToString
  public static class Tuple<A extends Object, B extends Object> {
    private final A left;
    
    private final B right;
    
    public Tuple(final A left, final B right) {
      super();
      this.left = left;
      this.right = right;
    }
    
    @Pure
    public A getLeft() {
      return this.left;
    }
    
    @Pure
    public B getRight() {
      return this.right;
    }
    
    @Override
    @Pure
    public String toString() {
      ToStringBuilder b = new ToStringBuilder(this);
      b.add("left", this.left);
      b.add("right", this.right);
      return b.toString();
    }
  }
  
  @Accessors
  @ToString
  public static class GlobalState {
    private Integer currentTime = Integer.valueOf(0);
    
    private final GpflInterpreter.TimedPriorityQueue<InterruptStmt> interrupts = new GpflInterpreter.TimedPriorityQueue<InterruptStmt>();
    
    @Pure
    public Integer getCurrentTime() {
      return this.currentTime;
    }
    
    public void setCurrentTime(final Integer currentTime) {
      this.currentTime = currentTime;
    }
    
    @Pure
    public GpflInterpreter.TimedPriorityQueue<InterruptStmt> getInterrupts() {
      return this.interrupts;
    }
    
    @Override
    @Pure
    public String toString() {
      ToStringBuilder b = new ToStringBuilder(this);
      b.add("currentTime", this.currentTime);
      b.add("interrupts", this.interrupts);
      return b.toString();
    }
  }
  
  public static class TimedPriorityQueue<X extends Object> extends PriorityQueue<GpflInterpreter.Tuple<Integer, X>> {
    public TimedPriorityQueue(final Collection<GpflInterpreter.Tuple<Integer, X>> c) {
      super(c);
    }
    
    public TimedPriorityQueue() {
      super();
    }
    
    @Override
    public Comparator<? super GpflInterpreter.Tuple<Integer, X>> comparator() {
      final Comparator<GpflInterpreter.Tuple<Integer, X>> _function = (GpflInterpreter.Tuple<Integer, X> o1, GpflInterpreter.Tuple<Integer, X> o2) -> {
        return o1.left.compareTo(o2.left);
      };
      return _function;
    }
  }
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  private final CancelIndicator indicator = CancelIndicator.NullImpl;
  
  private final GpflInterpreter.GlobalState state = new GpflInterpreter.GlobalState();
  
  public List<String> run(final Program program, final List<GpflInterpreter.Tuple<Integer, GpflInterpreter.Packet>> packets) {
    ArrayList<String> _xblockexpression = null;
    {
      final Consumer<EObject> _function = (EObject it) -> {
        this._iJvmModelAssociations.getSourceElements(it);
      };
      this._iJvmModelAssociations.getJvmElements(program).forEach(_function);
      final IEvaluationContext context = this.createContext();
      final Consumer<XExpression> _function_1 = (XExpression it) -> {
        this.doEvaluate(it, context, this.indicator);
      };
      program.getInitStmts().forEach(_function_1);
      final GpflInterpreter.TimedPriorityQueue<GpflInterpreter.Packet> stack = new GpflInterpreter.TimedPriorityQueue<GpflInterpreter.Packet>(packets);
      while ((!stack.isEmpty())) {
        {
          final GpflInterpreter.Tuple<Integer, GpflInterpreter.Packet> packageTuple = stack.poll();
          final Integer packageTime = packageTuple.left;
          final GpflInterpreter.Packet package_ = packageTuple.right;
          this.state.currentTime = packageTime;
          while (this.interrupted(this.state.interrupts)) {
            {
              final GpflInterpreter.Tuple<Integer, InterruptStmt> interruption = this.state.interrupts.poll();
              XExpression _periodic = interruption.right.getPeriodic();
              boolean _isIsTrue = ((XBooleanLiteral) _periodic).isIsTrue();
              if (_isIsTrue) {
                int _timeout = interruption.right.getTimeout();
                int _plus = ((this.state.currentTime).intValue() + _timeout);
                EList<XExpression> _stmts = interruption.right.getStmts();
                GpflInterpreter.Tuple _tuple = new GpflInterpreter.Tuple(Integer.valueOf(_plus), _stmts);
                this.state.interrupts.add(_tuple);
              }
              final Consumer<XExpression> _function_2 = (XExpression it) -> {
                this.doEvaluate(it, context, this.indicator);
              };
              interruption.right.getStmts().forEach(_function_2);
            }
          }
          final IEvaluationContext packetContext = context.fork();
          QualifiedName _create = QualifiedName.create("_inPort");
          String _xifexpression = null;
          GpflInterpreter.Port _port = package_.getPort();
          boolean _equals = Objects.equal(_port, GpflInterpreter.Port.IN);
          if (_equals) {
            _xifexpression = "inSide";
          } else {
            _xifexpression = "outSide";
          }
          packetContext.newValue(_create, _xifexpression);
          final BiConsumer<String, String> _function_2 = (String p1, String p2) -> {
            packetContext.newValue(QualifiedName.create(p1), p2);
          };
          package_.datas.forEach(_function_2);
          final Consumer<XExpression> _function_3 = (XExpression it) -> {
            this.doEvaluate(it, packetContext, this.indicator);
          };
          program.getStmts().forEach(_function_3);
        }
      }
      InputOutput.<GpflInterpreter.GlobalState>println(this.state);
      _xblockexpression = CollectionLiterals.<String>newArrayList();
    }
    return _xblockexpression;
  }
  
  public boolean interrupted(final GpflInterpreter.TimedPriorityQueue<InterruptStmt> interruptions) {
    return ((!interruptions.isEmpty()) && (interruptions.peek().left.compareTo(this.state.currentTime) <= 0));
  }
  
  protected Object _doEvaluate(final AcceptCmd expression, final IEvaluationContext context, final CancelIndicator indicator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("AcceptCmd ");
    _builder.append(expression);
    return InputOutput.<Object>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final AlarmCmd expression, final IEvaluationContext context, final CancelIndicator indicator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("AlarmCmd ");
    _builder.append(expression);
    return InputOutput.<Object>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final AutomatonCmd expression, final IEvaluationContext context, final CancelIndicator indicator) {
    GpflInterpreter.AutomatonInstance _xblockexpression = null;
    {
      AutomataDef _automaton = expression.getAutomaton();
      State _init = expression.getAutomaton().getInit();
      final GpflInterpreter.AutomatonInstance auto = new GpflInterpreter.AutomatonInstance(_automaton, _init);
      context.newValue(QualifiedName.create(expression.getName()), auto);
      _xblockexpression = auto;
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final CondStmt condStmt, final IEvaluationContext context, final CancelIndicator indicator) {
    Object _xblockexpression = null;
    {
      final IEvaluationResult exp = this.evaluate(condStmt.getExp(), context, indicator);
      Object _xifexpression = null;
      boolean _equals = Objects.equal(Boolean.TRUE, exp);
      if (_equals) {
        final Function1<XExpression, Object> _function = (XExpression it) -> {
          return this.internalEvaluate(it, context, indicator);
        };
        _xifexpression = IterableExtensions.<Object>last(ListExtensions.<XExpression, Object>map(condStmt.getStmts(), _function));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final DropCmd expression, final IEvaluationContext context, final CancelIndicator indicator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DropCmd ");
    _builder.append(expression);
    return InputOutput.<Object>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final InPort expression, final IEvaluationContext context, final CancelIndicator indicator) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("InPort ");
      _builder.append(expression);
      InputOutput.<String>println(_builder.toString());
      _xblockexpression = "InSide";
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final OutPort expression, final IEvaluationContext context, final CancelIndicator indicator) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("OutPort ");
      _builder.append(expression);
      InputOutput.<String>println(_builder.toString());
      _xblockexpression = "outSide";
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final InterruptStmt expression, final IEvaluationContext context, final CancelIndicator indicator) {
    int _timeout = expression.getTimeout();
    int _plus = ((this.state.currentTime).intValue() + _timeout);
    GpflInterpreter.Tuple<Integer, InterruptStmt> _tuple = new GpflInterpreter.Tuple<Integer, InterruptStmt>(Integer.valueOf(_plus), expression);
    return Boolean.valueOf(this.state.interrupts.add(_tuple));
  }
  
  protected Object _doEvaluate(final IterStmt expression, final IEvaluationContext context, final CancelIndicator indicator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IterStmt ");
    _builder.append(expression);
    return InputOutput.<Object>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final NopCmd expression, final IEvaluationContext context, final CancelIndicator indicator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("NopCmd ");
    _builder.append(expression);
    return InputOutput.<Object>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final SendCmd expression, final IEvaluationContext context, final CancelIndicator indicator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SendCmd ");
    _builder.append(expression);
    return InputOutput.<Object>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final SetCmd expression, final IEvaluationContext context, final CancelIndicator indicator) {
    Object _xblockexpression = null;
    {
      final Object assigned = this.doEvaluate(expression.getExp(), context, indicator);
      context.newValue(QualifiedName.create(expression.getName()), assigned);
      _xblockexpression = assigned;
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final StpCmd expression, final IEvaluationContext context, final CancelIndicator indicator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("StpCmd ");
    _builder.append(expression);
    return InputOutput.<Object>println(_builder.toString());
  }
  
  public Object doEvaluate(final XExpression expression, final IEvaluationContext context, final CancelIndicator indicator) {
    if (expression instanceof XAssignment) {
      return _doEvaluate((XAssignment)expression, context, indicator);
    } else if (expression instanceof XDoWhileExpression) {
      return _doEvaluate((XDoWhileExpression)expression, context, indicator);
    } else if (expression instanceof XFeatureCall) {
      return _doEvaluate((XFeatureCall)expression, context, indicator);
    } else if (expression instanceof XListLiteral) {
      return _doEvaluate((XListLiteral)expression, context, indicator);
    } else if (expression instanceof XMemberFeatureCall) {
      return _doEvaluate((XMemberFeatureCall)expression, context, indicator);
    } else if (expression instanceof XSetLiteral) {
      return _doEvaluate((XSetLiteral)expression, context, indicator);
    } else if (expression instanceof XWhileExpression) {
      return _doEvaluate((XWhileExpression)expression, context, indicator);
    } else if (expression instanceof AcceptCmd) {
      return _doEvaluate((AcceptCmd)expression, context, indicator);
    } else if (expression instanceof AlarmCmd) {
      return _doEvaluate((AlarmCmd)expression, context, indicator);
    } else if (expression instanceof AutomatonCmd) {
      return _doEvaluate((AutomatonCmd)expression, context, indicator);
    } else if (expression instanceof CondStmt) {
      return _doEvaluate((CondStmt)expression, context, indicator);
    } else if (expression instanceof DropCmd) {
      return _doEvaluate((DropCmd)expression, context, indicator);
    } else if (expression instanceof InPort) {
      return _doEvaluate((InPort)expression, context, indicator);
    } else if (expression instanceof InterruptStmt) {
      return _doEvaluate((InterruptStmt)expression, context, indicator);
    } else if (expression instanceof IterStmt) {
      return _doEvaluate((IterStmt)expression, context, indicator);
    } else if (expression instanceof NopCmd) {
      return _doEvaluate((NopCmd)expression, context, indicator);
    } else if (expression instanceof OutPort) {
      return _doEvaluate((OutPort)expression, context, indicator);
    } else if (expression instanceof SendCmd) {
      return _doEvaluate((SendCmd)expression, context, indicator);
    } else if (expression instanceof SetCmd) {
      return _doEvaluate((SetCmd)expression, context, indicator);
    } else if (expression instanceof StpCmd) {
      return _doEvaluate((StpCmd)expression, context, indicator);
    } else if (expression instanceof XAbstractFeatureCall) {
      return _doEvaluate((XAbstractFeatureCall)expression, context, indicator);
    } else if (expression instanceof XBasicForLoopExpression) {
      return _doEvaluate((XBasicForLoopExpression)expression, context, indicator);
    } else if (expression instanceof XBlockExpression) {
      return _doEvaluate((XBlockExpression)expression, context, indicator);
    } else if (expression instanceof XBooleanLiteral) {
      return _doEvaluate((XBooleanLiteral)expression, context, indicator);
    } else if (expression instanceof XCastedExpression) {
      return _doEvaluate((XCastedExpression)expression, context, indicator);
    } else if (expression instanceof XClosure) {
      return _doEvaluate((XClosure)expression, context, indicator);
    } else if (expression instanceof XConstructorCall) {
      return _doEvaluate((XConstructorCall)expression, context, indicator);
    } else if (expression instanceof XForLoopExpression) {
      return _doEvaluate((XForLoopExpression)expression, context, indicator);
    } else if (expression instanceof XIfExpression) {
      return _doEvaluate((XIfExpression)expression, context, indicator);
    } else if (expression instanceof XInstanceOfExpression) {
      return _doEvaluate((XInstanceOfExpression)expression, context, indicator);
    } else if (expression instanceof XNullLiteral) {
      return _doEvaluate((XNullLiteral)expression, context, indicator);
    } else if (expression instanceof XNumberLiteral) {
      return _doEvaluate((XNumberLiteral)expression, context, indicator);
    } else if (expression instanceof XReturnExpression) {
      return _doEvaluate((XReturnExpression)expression, context, indicator);
    } else if (expression instanceof XStringLiteral) {
      return _doEvaluate((XStringLiteral)expression, context, indicator);
    } else if (expression instanceof XSwitchExpression) {
      return _doEvaluate((XSwitchExpression)expression, context, indicator);
    } else if (expression instanceof XSynchronizedExpression) {
      return _doEvaluate((XSynchronizedExpression)expression, context, indicator);
    } else if (expression instanceof XThrowExpression) {
      return _doEvaluate((XThrowExpression)expression, context, indicator);
    } else if (expression instanceof XTryCatchFinallyExpression) {
      return _doEvaluate((XTryCatchFinallyExpression)expression, context, indicator);
    } else if (expression instanceof XTypeLiteral) {
      return _doEvaluate((XTypeLiteral)expression, context, indicator);
    } else if (expression instanceof XVariableDeclaration) {
      return _doEvaluate((XVariableDeclaration)expression, context, indicator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, context, indicator).toString());
    }
  }
}
