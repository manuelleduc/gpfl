package fr.mleduc.gpfl.interpreter

import fr.mleduc.gpfl.gpfl.Program
import fr.mleduc.gpfl.interpreter.GpflInterpreter.Packet
import fr.mleduc.gpfl.interpreter.GpflInterpreter.Result
import fr.mleduc.gpfl.interpreter.GpflInterpreter.Tuple
import java.util.List

interface IGpflInterpreter {
	def List<Tuple<Integer, Result>> run(Program program, List<Tuple<Integer, Packet>> packets)
}
