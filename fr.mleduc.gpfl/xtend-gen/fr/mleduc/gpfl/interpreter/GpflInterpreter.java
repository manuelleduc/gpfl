package fr.mleduc.gpfl.interpreter;

import com.google.common.base.Objects;
import fr.mleduc.gpfl.gpfl.AcceptCmd;
import fr.mleduc.gpfl.gpfl.AlarmCmd;
import fr.mleduc.gpfl.gpfl.AutomataDef;
import fr.mleduc.gpfl.gpfl.AutomatonCmd;
import fr.mleduc.gpfl.gpfl.CondStmt;
import fr.mleduc.gpfl.gpfl.DropCmd;
import fr.mleduc.gpfl.gpfl.GExpression;
import fr.mleduc.gpfl.gpfl.InPort;
import fr.mleduc.gpfl.gpfl.IntLitCmd;
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
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class GpflInterpreter {
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
  
  @Accessors
  public static class Context {
    private final Map<String, Object> values = CollectionLiterals.<String, Object>newHashMap();
    
    private final GpflInterpreter.Context parent;
    
    public Context() {
      this.parent = null;
    }
    
    private Context(final GpflInterpreter.Context parent) {
      this.parent = parent;
    }
    
    public GpflInterpreter.Context fork() {
      return new GpflInterpreter.Context(this);
    }
    
    public Object getValue(final String key) {
      Object _xifexpression = null;
      boolean _containsKey = this.values.containsKey(key);
      if (_containsKey) {
        _xifexpression = this.values.get(key);
      } else {
        Object _xifexpression_1 = null;
        if ((this.parent != null)) {
          _xifexpression_1 = this.parent.getValue(key);
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    }
    
    public Object setValue(final String key, final Object value) {
      return this.values.put(key, value);
    }
    
    @Pure
    public Map<String, Object> getValues() {
      return this.values;
    }
    
    @Pure
    public GpflInterpreter.Context getParent() {
      return this.parent;
    }
  }
  
  public GpflInterpreter.Context createContext() {
    return new GpflInterpreter.Context();
  }
  
  private final GpflInterpreter.GlobalState state = new GpflInterpreter.GlobalState();
  
  public List<String> run(final Program program, final List<GpflInterpreter.Tuple<Integer, GpflInterpreter.Packet>> packets) {
    ArrayList<String> _xblockexpression = null;
    {
      final GpflInterpreter.Context context = this.createContext();
      final Consumer<GExpression> _function = (GExpression it) -> {
        this.doEvaluate(it, context);
      };
      program.getInitStmts().forEach(_function);
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
              GExpression _periodic = interruption.right.getPeriodic();
              boolean _isIsTrue = ((XBooleanLiteral) _periodic).isIsTrue();
              if (_isIsTrue) {
                int _timeout = interruption.right.getTimeout();
                int _plus = ((this.state.currentTime).intValue() + _timeout);
                EList<GExpression> _stmts = interruption.right.getStmts();
                GpflInterpreter.Tuple _tuple = new GpflInterpreter.Tuple(Integer.valueOf(_plus), _stmts);
                this.state.interrupts.add(_tuple);
              }
              final Consumer<GExpression> _function_1 = (GExpression it) -> {
                this.doEvaluate(it, context);
              };
              interruption.right.getStmts().forEach(_function_1);
            }
          }
          final GpflInterpreter.Context packetContext = context.fork();
          String _xifexpression = null;
          GpflInterpreter.Port _port = package_.getPort();
          boolean _equals = Objects.equal(_port, GpflInterpreter.Port.IN);
          if (_equals) {
            _xifexpression = "inSide";
          } else {
            _xifexpression = "outSide";
          }
          packetContext.setValue("_inPort", _xifexpression);
          final BiConsumer<String, String> _function_1 = (String p1, String p2) -> {
            packetContext.setValue(p1, p2);
          };
          package_.datas.forEach(_function_1);
          final Consumer<GExpression> _function_2 = (GExpression it) -> {
            this.doEvaluate(it, packetContext);
          };
          program.getStmts().forEach(_function_2);
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
  
  protected Object _doEvaluate(final AcceptCmd expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("AcceptCmd ");
    _builder.append(expression);
    return InputOutput.<String>println(_builder.toString());
  }
  
  protected int _doEvalute(final IntLitCmd intLit, final GpflInterpreter.Context context) {
    return intLit.getValue();
  }
  
  protected Object _doEvaluate(final AlarmCmd expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("AlarmCmd ");
    _builder.append(expression);
    return InputOutput.<String>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final AutomatonCmd expression, final GpflInterpreter.Context context) {
    GpflInterpreter.AutomatonInstance _xblockexpression = null;
    {
      AutomataDef _automaton = expression.getAutomaton();
      State _init = expression.getAutomaton().getInit();
      final GpflInterpreter.AutomatonInstance auto = new GpflInterpreter.AutomatonInstance(_automaton, _init);
      context.setValue(expression.getName(), auto);
      _xblockexpression = auto;
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final CondStmt condStmt, final GpflInterpreter.Context context) {
    Object _xblockexpression = null;
    {
      final Object conditionResult = this.doEvaluate(condStmt.getExp(), context);
      Object _xifexpression = null;
      boolean _equals = Boolean.TRUE.equals(conditionResult);
      if (_equals) {
        final Function1<GExpression, Object> _function = (GExpression it) -> {
          return this.doEvaluate(it, context);
        };
        _xifexpression = IterableExtensions.<Object>last(ListExtensions.<GExpression, Object>map(condStmt.getStmts(), _function));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final DropCmd expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DropCmd ");
    _builder.append(expression);
    return InputOutput.<String>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final InPort expression, final GpflInterpreter.Context context) {
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
  
  protected Object _doEvaluate(final OutPort expression, final GpflInterpreter.Context context) {
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
  
  protected Object _doEvaluate(final InterruptStmt expression, final GpflInterpreter.Context context) {
    int _timeout = expression.getTimeout();
    int _plus = ((this.state.currentTime).intValue() + _timeout);
    GpflInterpreter.Tuple<Integer, InterruptStmt> _tuple = new GpflInterpreter.Tuple<Integer, InterruptStmt>(Integer.valueOf(_plus), expression);
    return Boolean.valueOf(this.state.interrupts.add(_tuple));
  }
  
  protected Object _doEvaluate(final IterStmt expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IterStmt ");
    _builder.append(expression);
    return InputOutput.<String>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final NopCmd expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("NopCmd ");
    _builder.append(expression);
    return InputOutput.<String>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final SendCmd expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SendCmd ");
    _builder.append(expression);
    return InputOutput.<String>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final SetCmd expression, final GpflInterpreter.Context context) {
    Object _xblockexpression = null;
    {
      final Object assigned = this.doEvaluate(expression.getExp(), context);
      context.setValue(expression.getName(), assigned);
      _xblockexpression = assigned;
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final StpCmd expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("StpCmd ");
    _builder.append(expression);
    return InputOutput.<String>println(_builder.toString());
  }
  
  public Object doEvaluate(final GExpression expression, final GpflInterpreter.Context context) {
    if (expression instanceof AcceptCmd) {
      return _doEvaluate((AcceptCmd)expression, context);
    } else if (expression instanceof AlarmCmd) {
      return _doEvaluate((AlarmCmd)expression, context);
    } else if (expression instanceof AutomatonCmd) {
      return _doEvaluate((AutomatonCmd)expression, context);
    } else if (expression instanceof CondStmt) {
      return _doEvaluate((CondStmt)expression, context);
    } else if (expression instanceof DropCmd) {
      return _doEvaluate((DropCmd)expression, context);
    } else if (expression instanceof InPort) {
      return _doEvaluate((InPort)expression, context);
    } else if (expression instanceof InterruptStmt) {
      return _doEvaluate((InterruptStmt)expression, context);
    } else if (expression instanceof IterStmt) {
      return _doEvaluate((IterStmt)expression, context);
    } else if (expression instanceof NopCmd) {
      return _doEvaluate((NopCmd)expression, context);
    } else if (expression instanceof OutPort) {
      return _doEvaluate((OutPort)expression, context);
    } else if (expression instanceof SendCmd) {
      return _doEvaluate((SendCmd)expression, context);
    } else if (expression instanceof SetCmd) {
      return _doEvaluate((SetCmd)expression, context);
    } else if (expression instanceof StpCmd) {
      return _doEvaluate((StpCmd)expression, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, context).toString());
    }
  }
  
  public int doEvalute(final IntLitCmd intLit, final GpflInterpreter.Context context) {
    return _doEvalute(intLit, context);
  }
}
