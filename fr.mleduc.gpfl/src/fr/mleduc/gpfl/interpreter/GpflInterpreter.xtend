package fr.mleduc.gpfl.interpreter

import fr.mleduc.gpfl.gpfl.AcceptCmd
import fr.mleduc.gpfl.gpfl.AlarmCmd
import fr.mleduc.gpfl.gpfl.AutomataDef
import fr.mleduc.gpfl.gpfl.AutomatonCmd
import fr.mleduc.gpfl.gpfl.CmdAdd
import fr.mleduc.gpfl.gpfl.CmdAnd
import fr.mleduc.gpfl.gpfl.CmdEq
import fr.mleduc.gpfl.gpfl.CmdGCompare
import fr.mleduc.gpfl.gpfl.CmdGECompare
import fr.mleduc.gpfl.gpfl.CmdLCompare
import fr.mleduc.gpfl.gpfl.CmdLECompare
import fr.mleduc.gpfl.gpfl.CondStmt
import fr.mleduc.gpfl.gpfl.DropCmd
import fr.mleduc.gpfl.gpfl.GExpression
import fr.mleduc.gpfl.gpfl.InPort
import fr.mleduc.gpfl.gpfl.IntLitCmd
import fr.mleduc.gpfl.gpfl.InterruptStmt
import fr.mleduc.gpfl.gpfl.IterStmt
import fr.mleduc.gpfl.gpfl.NopCmd
import fr.mleduc.gpfl.gpfl.OutPort
import fr.mleduc.gpfl.gpfl.PortLit
import fr.mleduc.gpfl.gpfl.Program
import fr.mleduc.gpfl.gpfl.SendCmd
import fr.mleduc.gpfl.gpfl.SetCmd
import fr.mleduc.gpfl.gpfl.State
import fr.mleduc.gpfl.gpfl.StpCmd
import fr.mleduc.gpfl.gpfl.StringLit
import fr.mleduc.gpfl.gpfl.Variable
import java.util.Collection
import java.util.List
import java.util.Map
import java.util.PriorityQueue
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

class GpflInterpreter implements IGpflInterpreter {

	enum Port {
		IN,
		OUT
	}

	@Accessors
	public static class Packet {
		val Port port
		val Map<String, String> datas
	}

	@Accessors
	public static class AutomatonInstance {
		val AutomataDef automata
		var State currentState
	}

	@Accessors
	@ToString
	public static class Tuple<A, B> implements Comparable {
		val A left
		val B right

		override compareTo(Object o) {
			if (left instanceof Comparable) {
				(left as Comparable).compareTo((o as Tuple).left)
			} else {
				0
			}
		}

	}

	@Accessors
	@ToString
	public static class GlobalState {
		var Integer currentTime = 0
		var Packet currentPacket
		val interrupts = new TimedPriorityQueue<InterruptStmt>()
	}

	public static class TimedPriorityQueue<X> extends PriorityQueue<Tuple<Integer, X>> {

		new(Collection<Tuple<Integer, X>> c) {
			super(c)
		}

		new() {
			super()
		}

		override comparator() {
			[o1, o2|o1.left.compareTo(o2.left)]
		}
	}

	@Accessors
	public static class Context {
		val Map<String, Object> values = newHashMap()
		val Context parent
		var Boolean processed

		new() {
			parent = null
			this.processed = false
		}

		private new(Context parent) {
			this.parent = parent
			this.processed = false
		}

		def fork() {
			new Context(this)
		}

		def Object getValue(String key) {
			if (this.values.containsKey(key))
				this.values.get(key)
			else if(this.parent !== null) this.parent.getValue(key) else null
		}

		def setValue(String key, Object value) {
			this.values.put(key, value)
		}
	}

	def createContext() {
		new Context
	}

	private val state = new GlobalState

	public abstract static class Result {
	}

	@Accessors
	@ToString
	static class AlarmResult extends Result {
		val String message
	}

	@Accessors
	@ToString
	static class PacketResult extends Result {
		val Packet packet
		val Port status
	}

	private val List<Tuple<Integer, Result>> results = newArrayList()

	override run(Program program, List<Tuple<Integer, Packet>> packets) {

		val context = this.createContext
		program.initStmts.evaluateStmts(context)

		val stack = new TimedPriorityQueue(packets)

		while (!stack.empty) {
			val packetTuple = stack.poll
			val packetTime = packetTuple.left
			val packet = packetTuple.right

			this.state.currentTime = packetTime
			this.state.currentPacket = packet

			while (this.state.interrupts.interrupted) {
				val interruption = this.state.interrupts.poll

				// FIXME: avoidable type cast
				// we resubmit the interruption if periodic
				if (interruption.right.periodic.doEvaluate(context) as Boolean) {
					this.state.interrupts.add(
						new Tuple(this.state.currentTime + interruption.right.timeout, interruption.right.stmts))
				}

				interruption.right.stmts.evaluateStmts(context)

			// TODO deal with this interruption
			}

			val packetContext = context.fork
			packetContext.setValue("_inPort", if(packet.getPort == Port.IN) "inSide" else "outSide")
			packet.datas.forEach[p1, p2|packetContext.setValue(p1, p2)]
			program.stmts.evaluateStmts(packetContext)

		}

		println(this.state)
		this.results
	}

	def Object evaluateStmts(List<GExpression> stmts, Context context) {
		for (GExpression exp : stmts) {
			if (!context.processed) {
				exp.doEvaluate(context)
			}
		}
		null
	}

	def interrupted(TimedPriorityQueue<InterruptStmt> interruptions) {
		!interruptions.empty && interruptions.peek.left <= this.state.currentTime
	}

	def dispatch Object doEvaluate(AcceptCmd expression, Context context) {
		this.results.add(new Tuple(this.state.currentTime, new PacketResult(this.state.currentPacket, Port.IN)))
		context.processed = true
	}
	
	def dispatch doEvalute(IntLitCmd intLit, Context context) {
		intLit.value
	}

	def dispatch Object doEvaluate(IntLitCmd intLit, Context context) {
		intLit.value
	}

	def dispatch Object doEvaluate(CmdEq cmdEq, Context context) {
		val l = cmdEq.left.doEvaluate(context)
		val r = cmdEq.right.doEvaluate(context)
		l == r
	}

	def dispatch Object doEvaluate(Variable variable, Context context) {
		context.getValue(variable.value)
	}

	def dispatch Object doEvaluate(PortLit port, Context context) {
		if(port.isInSide) 'inSide' else 'outSide'
	}

	def dispatch Object doEvaluate(CmdAdd expression, Context context) {
		val l = expression.left.doEvaluate(context) as Integer
		val r = expression.right.doEvaluate(context) as Integer
		l + r
	}

	def dispatch Object doEvaluate(CmdGECompare expression, Context context) {
		val l = expression.left.doEvaluate(context) as Integer
		val r = expression.right.doEvaluate(context) as Integer
		l >= r
	}

	def dispatch Object doEvaluate(CmdGCompare expression, Context context) {
		val l = expression.left.doEvaluate(context) as Integer
		val r = expression.right.doEvaluate(context) as Integer
		l > r
	}

	def dispatch Object doEvaluate(CmdLECompare expression, Context context) {
		val l = expression.left.doEvaluate(context) as Integer
		val r = expression.right.doEvaluate(context) as Integer
		l <= r
	}

	def dispatch Object doEvaluate(CmdLCompare expression, Context context) {
		val l = expression.left.doEvaluate(context) as Integer
		val r = expression.right.doEvaluate(context) as Integer
		l < r
	}

	def dispatch Object doEvaluate(AlarmCmd expression, Context context) {
		this.results.add(new Tuple(this.state.currentTime, new AlarmResult('''«expression.exp.doEvaluate(context)»''')))
	}

	def dispatch Object doEvaluate(AutomatonCmd expression, Context context) {
		val auto = new AutomatonInstance(expression.automaton) => [
			currentState = expression.automaton.init
		]
		context.setValue(expression.name, auto)
		auto
	}

	def dispatch Object doEvaluate(CondStmt condStmt, Context context) {
		val conditionResult = doEvaluate(condStmt.exp, context);
		if (Boolean.TRUE.equals(conditionResult)) {
			condStmt.stmts.evaluateStmts(context)
		}
	}

	def dispatch Object doEvaluate(CmdAnd and, Context context) {
		val l = and.left.doEvaluate(context) as Boolean
		val r = and.right.doEvaluate(context) as Boolean
		l && r
	}

	def dispatch Object doEvaluate(StringLit str, Context context) {
		str.value
	}

	def dispatch Object doEvaluate(DropCmd expression, Context context) {
		context.processed = true
	}

	def dispatch Object doEvaluate(InPort expression, Context context) {
		println('''InPort «expression»''')
		"InSide"
	}

	def dispatch Object doEvaluate(OutPort expression, Context context) {
		println('''OutPort «expression»''')
		"outSide"
	}

//	}
	def dispatch Object doEvaluate(InterruptStmt expression, Context context) {
		this.state.interrupts.add(new Tuple(this.state.currentTime + expression.timeout, expression))
	}

	def dispatch Object doEvaluate(IterStmt expression, Context context) {
		println('''IterStmt «expression»''')
	}

	def dispatch Object doEvaluate(NopCmd expression, Context context) {
		println('''NopCmd «expression»''')
	}

	def dispatch Object doEvaluate(SendCmd expression, Context context) {
		println('''SendCmd «expression»''')
	}

	def dispatch Object doEvaluate(SetCmd expression, Context context) {
		val assigned = doEvaluate(expression.exp, context)
		context.setValue(expression.name, assigned)
		assigned
	}

	def dispatch Object doEvaluate(StpCmd step, Context context) {
		val automatonInstance = context.getValue(step.automaton.name) as AutomatonInstance
		val transition = '''«step.event.doEvaluate(context)»'''

		if (automatonInstance.getCurrentState.transitions.exists[it.event == transition]) {
			automatonInstance.currentState = automatonInstance.getCurrentState.transitions.findFirst [
				it.event == transition
			].target
		} else {
			step.errors.evaluateStmts(context)
		}

	}
}
