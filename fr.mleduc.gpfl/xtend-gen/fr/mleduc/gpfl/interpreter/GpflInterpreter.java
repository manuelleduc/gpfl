package fr.mleduc.gpfl.interpreter;

import com.google.common.base.Objects;
import fr.mleduc.gpfl.gpfl.AcceptCmd;
import fr.mleduc.gpfl.gpfl.AlarmCmd;
import fr.mleduc.gpfl.gpfl.AutomataDef;
import fr.mleduc.gpfl.gpfl.AutomatonCmd;
import fr.mleduc.gpfl.gpfl.CmdAdd;
import fr.mleduc.gpfl.gpfl.CmdAnd;
import fr.mleduc.gpfl.gpfl.CmdEq;
import fr.mleduc.gpfl.gpfl.CmdGCompare;
import fr.mleduc.gpfl.gpfl.CmdGECompare;
import fr.mleduc.gpfl.gpfl.CmdLCompare;
import fr.mleduc.gpfl.gpfl.CmdLECompare;
import fr.mleduc.gpfl.gpfl.CondStmt;
import fr.mleduc.gpfl.gpfl.DropCmd;
import fr.mleduc.gpfl.gpfl.GExpression;
import fr.mleduc.gpfl.gpfl.InPort;
import fr.mleduc.gpfl.gpfl.IntLitCmd;
import fr.mleduc.gpfl.gpfl.InterruptStmt;
import fr.mleduc.gpfl.gpfl.IterStmt;
import fr.mleduc.gpfl.gpfl.NopCmd;
import fr.mleduc.gpfl.gpfl.OutPort;
import fr.mleduc.gpfl.gpfl.PortLit;
import fr.mleduc.gpfl.gpfl.Program;
import fr.mleduc.gpfl.gpfl.SendCmd;
import fr.mleduc.gpfl.gpfl.SetCmd;
import fr.mleduc.gpfl.gpfl.State;
import fr.mleduc.gpfl.gpfl.StpCmd;
import fr.mleduc.gpfl.gpfl.StringLit;
import fr.mleduc.gpfl.gpfl.Transition;
import fr.mleduc.gpfl.gpfl.Variable;
import fr.mleduc.gpfl.interpreter.IGpflInterpreter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.BiConsumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class GpflInterpreter implements IGpflInterpreter {
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
    
    private State currentState;
    
    public AutomatonInstance(final AutomataDef automata) {
      super();
      this.automata = automata;
    }
    
    @Pure
    public AutomataDef getAutomata() {
      return this.automata;
    }
    
    @Pure
    public State getCurrentState() {
      return this.currentState;
    }
    
    public void setCurrentState(final State currentState) {
      this.currentState = currentState;
    }
  }
  
  @Accessors
  @ToString
  public static class Tuple<A extends Object, B extends Object> implements Comparable {
    private final A left;
    
    private final B right;
    
    @Override
    public int compareTo(final Object o) {
      int _xifexpression = (int) 0;
      if ((this.left instanceof Comparable)) {
        _xifexpression = ((Comparable) this.left).compareTo(((GpflInterpreter.Tuple) o).left);
      } else {
        _xifexpression = 0;
      }
      return _xifexpression;
    }
    
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
    
    private GpflInterpreter.Packet currentPacket;
    
    private final GpflInterpreter.TimedPriorityQueue<InterruptStmt> interrupts = new GpflInterpreter.TimedPriorityQueue<InterruptStmt>();
    
    @Pure
    public Integer getCurrentTime() {
      return this.currentTime;
    }
    
    public void setCurrentTime(final Integer currentTime) {
      this.currentTime = currentTime;
    }
    
    @Pure
    public GpflInterpreter.Packet getCurrentPacket() {
      return this.currentPacket;
    }
    
    public void setCurrentPacket(final GpflInterpreter.Packet currentPacket) {
      this.currentPacket = currentPacket;
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
      b.add("currentPacket", this.currentPacket);
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
    
    private Boolean processed;
    
    public Context() {
      this.parent = null;
      this.processed = Boolean.valueOf(false);
    }
    
    private Context(final GpflInterpreter.Context parent) {
      this.parent = parent;
      this.processed = Boolean.valueOf(false);
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
    
    @Pure
    public Boolean getProcessed() {
      return this.processed;
    }
    
    public void setProcessed(final Boolean processed) {
      this.processed = processed;
    }
  }
  
  public static abstract class Result {
  }
  
  @Accessors
  @ToString
  public static class AlarmResult extends GpflInterpreter.Result {
    private final String message;
    
    public AlarmResult(final String message) {
      super();
      this.message = message;
    }
    
    @Pure
    public String getMessage() {
      return this.message;
    }
    
    @Override
    @Pure
    public String toString() {
      String result = new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
      return result;
    }
  }
  
  @Accessors
  @ToString
  public static class PacketResult extends GpflInterpreter.Result {
    private final GpflInterpreter.Packet packet;
    
    private final GpflInterpreter.Port status;
    
    public PacketResult(final GpflInterpreter.Packet packet, final GpflInterpreter.Port status) {
      super();
      this.packet = packet;
      this.status = status;
    }
    
    @Pure
    public GpflInterpreter.Packet getPacket() {
      return this.packet;
    }
    
    @Pure
    public GpflInterpreter.Port getStatus() {
      return this.status;
    }
    
    @Override
    @Pure
    public String toString() {
      String result = new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
      return result;
    }
  }
  
  public GpflInterpreter.Context createContext() {
    return new GpflInterpreter.Context();
  }
  
  private final GpflInterpreter.GlobalState state = new GpflInterpreter.GlobalState();
  
  private final List<GpflInterpreter.Tuple<Integer, GpflInterpreter.Result>> results = CollectionLiterals.<GpflInterpreter.Tuple<Integer, GpflInterpreter.Result>>newArrayList();
  
  @Override
  public List<GpflInterpreter.Tuple<Integer, GpflInterpreter.Result>> run(final Program program, final List<GpflInterpreter.Tuple<Integer, GpflInterpreter.Packet>> packets) {
    List<GpflInterpreter.Tuple<Integer, GpflInterpreter.Result>> _xblockexpression = null;
    {
      final GpflInterpreter.Context context = this.createContext();
      this.evaluateStmts(program.getInitStmts(), context);
      final GpflInterpreter.TimedPriorityQueue<GpflInterpreter.Packet> stack = new GpflInterpreter.TimedPriorityQueue<GpflInterpreter.Packet>(packets);
      while ((!stack.isEmpty())) {
        {
          final GpflInterpreter.Tuple<Integer, GpflInterpreter.Packet> packetTuple = stack.poll();
          final Integer packetTime = packetTuple.left;
          final GpflInterpreter.Packet packet = packetTuple.right;
          this.state.currentTime = packetTime;
          this.state.currentPacket = packet;
          while (this.interrupted(this.state.interrupts)) {
            {
              final GpflInterpreter.Tuple<Integer, InterruptStmt> interruption = this.state.interrupts.poll();
              Object _doEvaluate = this.doEvaluate(interruption.right.getPeriodic(), context);
              if ((((Boolean) _doEvaluate)).booleanValue()) {
                int _timeout = interruption.right.getTimeout();
                int _plus = ((this.state.currentTime).intValue() + _timeout);
                EList<GExpression> _stmts = interruption.right.getStmts();
                GpflInterpreter.Tuple _tuple = new GpflInterpreter.Tuple(Integer.valueOf(_plus), _stmts);
                this.state.interrupts.add(_tuple);
              }
              this.evaluateStmts(interruption.right.getStmts(), context);
            }
          }
          final GpflInterpreter.Context packetContext = context.fork();
          String _xifexpression = null;
          GpflInterpreter.Port _port = packet.getPort();
          boolean _equals = Objects.equal(_port, GpflInterpreter.Port.IN);
          if (_equals) {
            _xifexpression = "inSide";
          } else {
            _xifexpression = "outSide";
          }
          packetContext.setValue("_inPort", _xifexpression);
          final BiConsumer<String, String> _function = (String p1, String p2) -> {
            packetContext.setValue(p1, p2);
          };
          packet.datas.forEach(_function);
          this.evaluateStmts(program.getStmts(), packetContext);
        }
      }
      InputOutput.<GpflInterpreter.GlobalState>println(this.state);
      _xblockexpression = this.results;
    }
    return _xblockexpression;
  }
  
  public Object evaluateStmts(final List<GExpression> stmts, final GpflInterpreter.Context context) {
    Object _xblockexpression = null;
    {
      for (final GExpression exp : stmts) {
        if ((!(context.processed).booleanValue())) {
          this.doEvaluate(exp, context);
        }
      }
      _xblockexpression = null;
    }
    return _xblockexpression;
  }
  
  public boolean interrupted(final GpflInterpreter.TimedPriorityQueue<InterruptStmt> interruptions) {
    return ((!interruptions.isEmpty()) && (interruptions.peek().left.compareTo(this.state.currentTime) <= 0));
  }
  
  protected Object _doEvaluate(final AcceptCmd expression, final GpflInterpreter.Context context) {
    Boolean _xblockexpression = null;
    {
      GpflInterpreter.PacketResult _packetResult = new GpflInterpreter.PacketResult(this.state.currentPacket, GpflInterpreter.Port.IN);
      GpflInterpreter.Tuple<Integer, GpflInterpreter.Result> _tuple = new GpflInterpreter.Tuple<Integer, GpflInterpreter.Result>(this.state.currentTime, _packetResult);
      this.results.add(_tuple);
      _xblockexpression = context.processed = Boolean.valueOf(true);
    }
    return _xblockexpression;
  }
  
  protected int _doEvalute(final IntLitCmd intLit, final GpflInterpreter.Context context) {
    return intLit.getValue();
  }
  
  protected Object _doEvaluate(final IntLitCmd intLit, final GpflInterpreter.Context context) {
    return Integer.valueOf(intLit.getValue());
  }
  
  protected Object _doEvaluate(final CmdEq cmdEq, final GpflInterpreter.Context context) {
    boolean _xblockexpression = false;
    {
      final Object l = this.doEvaluate(cmdEq.getLeft(), context);
      final Object r = this.doEvaluate(cmdEq.getRight(), context);
      _xblockexpression = Objects.equal(l, r);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Object _doEvaluate(final Variable variable, final GpflInterpreter.Context context) {
    return context.getValue(variable.getValue());
  }
  
  protected Object _doEvaluate(final PortLit port, final GpflInterpreter.Context context) {
    String _xifexpression = null;
    boolean _isInSide = port.isInSide();
    if (_isInSide) {
      _xifexpression = "inSide";
    } else {
      _xifexpression = "outSide";
    }
    return _xifexpression;
  }
  
  protected Object _doEvaluate(final CmdAdd expression, final GpflInterpreter.Context context) {
    int _xblockexpression = (int) 0;
    {
      Object _doEvaluate = this.doEvaluate(expression.getLeft(), context);
      final Integer l = ((Integer) _doEvaluate);
      Object _doEvaluate_1 = this.doEvaluate(expression.getRight(), context);
      final Integer r = ((Integer) _doEvaluate_1);
      _xblockexpression = ((l).intValue() + (r).intValue());
    }
    return Integer.valueOf(_xblockexpression);
  }
  
  protected Object _doEvaluate(final CmdGECompare expression, final GpflInterpreter.Context context) {
    boolean _xblockexpression = false;
    {
      Object _doEvaluate = this.doEvaluate(expression.getLeft(), context);
      final Integer l = ((Integer) _doEvaluate);
      Object _doEvaluate_1 = this.doEvaluate(expression.getRight(), context);
      final Integer r = ((Integer) _doEvaluate_1);
      _xblockexpression = (l.compareTo(r) >= 0);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Object _doEvaluate(final CmdGCompare expression, final GpflInterpreter.Context context) {
    boolean _xblockexpression = false;
    {
      Object _doEvaluate = this.doEvaluate(expression.getLeft(), context);
      final Integer l = ((Integer) _doEvaluate);
      Object _doEvaluate_1 = this.doEvaluate(expression.getRight(), context);
      final Integer r = ((Integer) _doEvaluate_1);
      _xblockexpression = (l.compareTo(r) > 0);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Object _doEvaluate(final CmdLECompare expression, final GpflInterpreter.Context context) {
    boolean _xblockexpression = false;
    {
      Object _doEvaluate = this.doEvaluate(expression.getLeft(), context);
      final Integer l = ((Integer) _doEvaluate);
      Object _doEvaluate_1 = this.doEvaluate(expression.getRight(), context);
      final Integer r = ((Integer) _doEvaluate_1);
      _xblockexpression = (l.compareTo(r) <= 0);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Object _doEvaluate(final CmdLCompare expression, final GpflInterpreter.Context context) {
    boolean _xblockexpression = false;
    {
      Object _doEvaluate = this.doEvaluate(expression.getLeft(), context);
      final Integer l = ((Integer) _doEvaluate);
      Object _doEvaluate_1 = this.doEvaluate(expression.getRight(), context);
      final Integer r = ((Integer) _doEvaluate_1);
      _xblockexpression = (l.compareTo(r) < 0);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Object _doEvaluate(final AlarmCmd expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    Object _doEvaluate = this.doEvaluate(expression.getExp(), context);
    _builder.append(_doEvaluate);
    GpflInterpreter.AlarmResult _alarmResult = new GpflInterpreter.AlarmResult(_builder.toString());
    GpflInterpreter.Tuple<Integer, GpflInterpreter.Result> _tuple = new GpflInterpreter.Tuple<Integer, GpflInterpreter.Result>(this.state.currentTime, _alarmResult);
    return Boolean.valueOf(this.results.add(_tuple));
  }
  
  protected Object _doEvaluate(final AutomatonCmd expression, final GpflInterpreter.Context context) {
    GpflInterpreter.AutomatonInstance _xblockexpression = null;
    {
      AutomataDef _automaton = expression.getAutomaton();
      GpflInterpreter.AutomatonInstance _automatonInstance = new GpflInterpreter.AutomatonInstance(_automaton);
      final Procedure1<GpflInterpreter.AutomatonInstance> _function = (GpflInterpreter.AutomatonInstance it) -> {
        it.currentState = expression.getAutomaton().getInit();
      };
      final GpflInterpreter.AutomatonInstance auto = ObjectExtensions.<GpflInterpreter.AutomatonInstance>operator_doubleArrow(_automatonInstance, _function);
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
        _xifexpression = this.evaluateStmts(condStmt.getStmts(), context);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final CmdAnd and, final GpflInterpreter.Context context) {
    boolean _xblockexpression = false;
    {
      Object _doEvaluate = this.doEvaluate(and.getLeft(), context);
      final Boolean l = ((Boolean) _doEvaluate);
      Object _doEvaluate_1 = this.doEvaluate(and.getRight(), context);
      final Boolean r = ((Boolean) _doEvaluate_1);
      _xblockexpression = ((l).booleanValue() && (r).booleanValue());
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Object _doEvaluate(final StringLit str, final GpflInterpreter.Context context) {
    return str.getValue();
  }
  
  protected Object _doEvaluate(final DropCmd expression, final GpflInterpreter.Context context) {
    return context.processed = Boolean.valueOf(true);
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
    return InputOutput.<Object>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final NopCmd expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("NopCmd ");
    _builder.append(expression);
    return InputOutput.<Object>println(_builder.toString());
  }
  
  protected Object _doEvaluate(final SendCmd expression, final GpflInterpreter.Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SendCmd ");
    _builder.append(expression);
    return InputOutput.<Object>println(_builder.toString());
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
  
  protected Object _doEvaluate(final StpCmd step, final GpflInterpreter.Context context) {
    Object _xblockexpression = null;
    {
      Object _value = context.getValue(step.getAutomaton().getName());
      final GpflInterpreter.AutomatonInstance automatonInstance = ((GpflInterpreter.AutomatonInstance) _value);
      StringConcatenation _builder = new StringConcatenation();
      Object _doEvaluate = this.doEvaluate(step.getEvent(), context);
      _builder.append(_doEvaluate);
      final String transition = _builder.toString();
      Object _xifexpression = null;
      final Function1<Transition, Boolean> _function = (Transition it) -> {
        String _event = it.getEvent();
        return Boolean.valueOf(Objects.equal(_event, transition));
      };
      boolean _exists = IterableExtensions.<Transition>exists(automatonInstance.getCurrentState().getTransitions(), _function);
      if (_exists) {
        final Function1<Transition, Boolean> _function_1 = (Transition it) -> {
          String _event = it.getEvent();
          return Boolean.valueOf(Objects.equal(_event, transition));
        };
        _xifexpression = automatonInstance.currentState = IterableExtensions.<Transition>findFirst(automatonInstance.getCurrentState().getTransitions(), _function_1).getTarget();
      } else {
        _xifexpression = this.evaluateStmts(step.getErrors(), context);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object doEvaluate(final GExpression expression, final GpflInterpreter.Context context) {
    if (expression instanceof AcceptCmd) {
      return _doEvaluate((AcceptCmd)expression, context);
    } else if (expression instanceof AlarmCmd) {
      return _doEvaluate((AlarmCmd)expression, context);
    } else if (expression instanceof AutomatonCmd) {
      return _doEvaluate((AutomatonCmd)expression, context);
    } else if (expression instanceof CmdAdd) {
      return _doEvaluate((CmdAdd)expression, context);
    } else if (expression instanceof CmdAnd) {
      return _doEvaluate((CmdAnd)expression, context);
    } else if (expression instanceof CmdEq) {
      return _doEvaluate((CmdEq)expression, context);
    } else if (expression instanceof CmdGCompare) {
      return _doEvaluate((CmdGCompare)expression, context);
    } else if (expression instanceof CmdGECompare) {
      return _doEvaluate((CmdGECompare)expression, context);
    } else if (expression instanceof CmdLCompare) {
      return _doEvaluate((CmdLCompare)expression, context);
    } else if (expression instanceof CmdLECompare) {
      return _doEvaluate((CmdLECompare)expression, context);
    } else if (expression instanceof CondStmt) {
      return _doEvaluate((CondStmt)expression, context);
    } else if (expression instanceof DropCmd) {
      return _doEvaluate((DropCmd)expression, context);
    } else if (expression instanceof InPort) {
      return _doEvaluate((InPort)expression, context);
    } else if (expression instanceof IntLitCmd) {
      return _doEvaluate((IntLitCmd)expression, context);
    } else if (expression instanceof InterruptStmt) {
      return _doEvaluate((InterruptStmt)expression, context);
    } else if (expression instanceof IterStmt) {
      return _doEvaluate((IterStmt)expression, context);
    } else if (expression instanceof NopCmd) {
      return _doEvaluate((NopCmd)expression, context);
    } else if (expression instanceof OutPort) {
      return _doEvaluate((OutPort)expression, context);
    } else if (expression instanceof PortLit) {
      return _doEvaluate((PortLit)expression, context);
    } else if (expression instanceof SendCmd) {
      return _doEvaluate((SendCmd)expression, context);
    } else if (expression instanceof SetCmd) {
      return _doEvaluate((SetCmd)expression, context);
    } else if (expression instanceof StpCmd) {
      return _doEvaluate((StpCmd)expression, context);
    } else if (expression instanceof StringLit) {
      return _doEvaluate((StringLit)expression, context);
    } else if (expression instanceof Variable) {
      return _doEvaluate((Variable)expression, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, context).toString());
    }
  }
  
  public int doEvalute(final IntLitCmd intLit, final GpflInterpreter.Context context) {
    return _doEvalute(intLit, context);
  }
}
