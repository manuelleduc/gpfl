package fr.mleduc.gpfl.interpreter;

import fr.mleduc.gpfl.gpfl.Program;
import fr.mleduc.gpfl.interpreter.GpflInterpreter;
import java.util.List;

@SuppressWarnings("all")
public interface IGpflInterpreter {
  public abstract List<GpflInterpreter.Tuple<Integer, GpflInterpreter.Result>> run(final Program program, final List<GpflInterpreter.Tuple<Integer, GpflInterpreter.Packet>> packets);
}
