package fr.mleduc.gpfl.interpreter

import com.google.inject.Inject
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
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.XBooleanLiteral
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations

class GpflInterpreter extends XbaseInterpreter {

	@Inject extension IJvmModelAssociations 


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

	val indicator = CancelIndicator.NullImpl
	private val state = new GlobalState

	def List<String> run(Program program, List<Tuple<Integer, Packet>> packets) {
		
		program.jvmElements.forEach[sourceElements]
		
		val context = this.createContext
		program.initStmts.forEach[
			doEvaluate(context, indicator)
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
					it.doEvaluate(context, indicator)
				]

			// TODO deal with this interruption
			}

			val packetContext = context.fork
			packetContext.newValue(QualifiedName.create("_inPort"),
				if(package.getPort == Port.IN) "inSide" else "outSide")
			package.datas.forEach[p1, p2|packetContext.newValue(QualifiedName.create(p1), p2)]
			program.stmts.forEach [
				it.doEvaluate(packetContext, this.indicator)
			]

		}

		println(this.state)
		newArrayList
	}

	def interrupted(TimedPriorityQueue<InterruptStmt> interruptions) {
		!interruptions.empty && interruptions.peek.left <= this.state.currentTime
	}

	def dispatch doEvaluate(AcceptCmd expression, IEvaluationContext context, CancelIndicator indicator) {
		println('''AcceptCmd «expression»''')
	}

	def dispatch doEvaluate(AlarmCmd expression, IEvaluationContext context, CancelIndicator indicator) {
		println('''AlarmCmd «expression»''')
	}

	def dispatch doEvaluate(AutomatonCmd expression, IEvaluationContext context, CancelIndicator indicator) {
		val auto = new AutomatonInstance(expression.automaton, expression.automaton.init)
		context.newValue(QualifiedName.create(expression.name), auto)
		auto
	}

	def dispatch doEvaluate(CondStmt condStmt, IEvaluationContext context, CancelIndicator indicator) {
		val exp = this.evaluate(condStmt.exp, context, indicator)

		if (Boolean.TRUE == exp) {
			condStmt.stmts.map [
				this.internalEvaluate(it, context, indicator)
			].last
		}
	}

	def dispatch doEvaluate(DropCmd expression, IEvaluationContext context, CancelIndicator indicator) {
		println('''DropCmd «expression»''')
	}

	def dispatch doEvaluate(InPort expression, IEvaluationContext context, CancelIndicator indicator) {
		println('''InPort «expression»''')
		"InSide"
	}
	
	def dispatch doEvaluate(OutPort expression, IEvaluationContext context, CancelIndicator indicator) {
		println('''OutPort «expression»''')
		"outSide"
	}

	def dispatch doEvaluate(InterruptStmt expression, IEvaluationContext context, CancelIndicator indicator) {
		this.state.interrupts.add(new Tuple(this.state.currentTime + expression.timeout, expression))
	}

	def dispatch doEvaluate(IterStmt expression, IEvaluationContext context, CancelIndicator indicator) {
		println('''IterStmt «expression»''')
	}

	def dispatch doEvaluate(NopCmd expression, IEvaluationContext context, CancelIndicator indicator) {
		println('''NopCmd «expression»''')
	}


	def dispatch doEvaluate(SendCmd expression, IEvaluationContext context, CancelIndicator indicator) {
		println('''SendCmd «expression»''')
	}

	def dispatch doEvaluate(SetCmd expression, IEvaluationContext context, CancelIndicator indicator) {
		val assigned = doEvaluate(expression.exp, context, indicator)
		context.newValue(QualifiedName.create(expression.name), assigned)
		assigned
	}

	def dispatch doEvaluate(StpCmd expression, IEvaluationContext context, CancelIndicator indicator) {
		println('''StpCmd «expression»''')
	}
}
