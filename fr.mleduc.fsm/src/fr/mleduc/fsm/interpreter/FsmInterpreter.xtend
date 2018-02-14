package fr.mleduc.fsm.interpreter

import fr.mleduc.fsm.interpreter.IFsmInterpreter
import fr.mleduc.fsm.fsm.Fsm
import java.util.List
import java.util.ArrayList

class FsmInterpreter implements IFsmInterpreter {

	override run(Fsm fsm, List<String> events) {
		var current = fsm.state
		val List<String> states = new ArrayList

		for (String event : events) {
			states.add(current.name)
			current = current.transitions.findFirst[it.name == event].state
		}

		states
	}

}
