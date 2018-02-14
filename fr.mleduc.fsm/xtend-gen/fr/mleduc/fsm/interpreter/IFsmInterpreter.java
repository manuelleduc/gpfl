package fr.mleduc.fsm.interpreter;

import fr.mleduc.fsm.fsm.Fsm;
import java.util.List;

@SuppressWarnings("all")
public interface IFsmInterpreter {
  public abstract List<String> run(final Fsm fsm, final List<String> events);
}
