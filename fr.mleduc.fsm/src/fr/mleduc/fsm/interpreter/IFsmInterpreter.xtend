package fr.mleduc.fsm.interpreter

import fr.mleduc.fsm.fsm.Fsm
import java.util.List

interface IFsmInterpreter {
	def List<String> run(Fsm fsm, List<String> events)
}