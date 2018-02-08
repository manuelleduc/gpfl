package fr.mleduc.gpfl.interpreter

import fr.mleduc.gpfl.gpfl.AcceptCmd
import fr.mleduc.gpfl.gpfl.AlarmCmd
import fr.mleduc.gpfl.gpfl.AutomataDef
import fr.mleduc.gpfl.gpfl.AutomatonCmd
import fr.mleduc.gpfl.gpfl.CondStmt
import fr.mleduc.gpfl.gpfl.DropCmd
import fr.mleduc.gpfl.gpfl.InPort
import fr.mleduc.gpfl.gpfl.InterruptStmt
import fr.mleduc.gpfl.gpfl.IterStmt
import fr.mleduc.gpfl.gpfl.NopCmd
import fr.mleduc.gpfl.gpfl.OutPort
import fr.mleduc.gpfl.gpfl.Program
import fr.mleduc.gpfl.gpfl.SendCmd
import fr.mleduc.gpfl.gpfl.SetCmd
import fr.mleduc.gpfl.gpfl.State
import fr.mleduc.gpfl.gpfl.StpCmd
import java.util.Collection
import java.util.List
import java.util.Map
import java.util.PriorityQueue
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString
import org.eclipse.xtext.xbase.XBooleanLiteral
import fr.mleduc.gpfl.gpfl.IntLitCmd

class GpflInterpreter {

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
		val State currentState
	}

	@Accessors
	@ToString
	public static class Tuple<A, B> {
		val A left
		val B right
	}

	@Accessors
	@ToString
	public static class GlobalState {
		var Integer currentTime = 0
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

		new() {
			parent = null
		}

		private new(Context parent) {
			this.parent = parent
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

	def List<String> run(Program program, List<Tuple<Integer, Packet>> packets) {

		val context = this.createContext
		program.initStmts.forEach [
			doEvaluate(context)
		]

		val stack = new TimedPriorityQueue(packets)

		while (!stack.empty) {
			val packageTuple = stack.poll
			val packageTime = packageTuple.left
			val package = packageTuple.right

			this.state.currentTime = packageTime

			while (this.state.interrupts.interrupted) {
				val interruption = this.state.interrupts.poll

				// FIXME: avoidable type cast
				// we resubmit the interruption if periodic
				if ((interruption.right.periodic as XBooleanLiteral).isTrue) {
					this.state.interrupts.add(
						new Tuple(this.state.currentTime + interruption.right.timeout, interruption.right.stmts))
				}

				interruption.right.stmts.forEach [
					it.doEvaluate(context)
				]

			// TODO deal with this interruption
			}

			val packetContext = context.fork
			packetContext.setValue("_inPort", if(package.getPort == Port.IN) "inSide" else "outSide")
			package.datas.forEach[p1, p2|packetContext.setValue(p1, p2)]
			program.stmts.forEach[it.doEvaluate(packetContext)]

		}

		println(this.state)
		newArrayList
	}

	def interrupted(TimedPriorityQueue<InterruptStmt> interruptions) {
		!interruptions.empty && interruptions.peek.left <= this.state.currentTime
	}

	def dispatch doEvaluate(AcceptCmd expression, Context context) {
		println('''AcceptCmd «expression»''')
	}
	
	def dispatch doEvalute(IntLitCmd intLit, Context context) {
		intLit.value
	}

	def dispatch doEvaluate(AlarmCmd expression, Context context) {
		println('''AlarmCmd «expression»''')
	}

	def dispatch doEvaluate(AutomatonCmd expression, Context context) {
		val auto = new AutomatonInstance(expression.automaton, expression.automaton.init)
		context.setValue(expression.name, auto)
		auto
	}

	def dispatch doEvaluate(CondStmt condStmt, Context context) {
//		val exp = this.invokeOperation(condStmt.exp, context)
//
//		if (Boolean.TRUE == exp) {
//			condStmt.stmts.map [
//				this.internalEvaluate(it, context)
//			].last
//		}
		val conditionResult = doEvaluate(condStmt.exp, context);
		if (Boolean.TRUE.equals(conditionResult)) {
			condStmt.stmts.map[doEvaluate(it, context)].last
		}
	}

	def dispatch doEvaluate(DropCmd expression, Context context) {
		println('''DropCmd «expression»''')
	}

	def dispatch doEvaluate(InPort expression, Context context) {
		println('''InPort «expression»''')
		"InSide"
	}

	def dispatch doEvaluate(OutPort expression, Context context) {
		println('''OutPort «expression»''')
		"outSide"
	}

//	}
	def dispatch doEvaluate(InterruptStmt expression, Context context) {
		this.state.interrupts.add(new Tuple(this.state.currentTime + expression.timeout, expression))
	}

	def dispatch doEvaluate(IterStmt expression, Context context) {
		println('''IterStmt «expression»''')
	}

	def dispatch doEvaluate(NopCmd expression, Context context) {
		println('''NopCmd «expression»''')
	}

	def dispatch doEvaluate(SendCmd expression, Context context) {
		println('''SendCmd «expression»''')
	}

	def dispatch doEvaluate(SetCmd expression, Context context) {
		val assigned = doEvaluate(expression.exp, context)
		context.setValue(expression.name, assigned)
		assigned
	}

	def dispatch doEvaluate(StpCmd expression, Context context) {
		println('''StpCmd «expression»''')
	}
}
