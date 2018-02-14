package fr.mleduc.fsm.interpreter;

import com.google.common.base.Objects;
import fr.mleduc.fsm.fsm.Fsm;
import fr.mleduc.fsm.fsm.State;
import fr.mleduc.fsm.fsm.Transition;
import fr.mleduc.fsm.interpreter.IFsmInterpreter;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FsmInterpreter implements IFsmInterpreter {
  @Override
  public List<String> run(final Fsm fsm, final List<String> events) {
    List<String> _xblockexpression = null;
    {
      State current = fsm.getState();
      final List<String> states = new ArrayList<String>();
      for (final String event : events) {
        {
          states.add(current.getName());
          final Function1<Transition, Boolean> _function = (Transition it) -> {
            String _name = it.getName();
            return Boolean.valueOf(Objects.equal(_name, event));
          };
          current = IterableExtensions.<Transition>findFirst(current.getTransitions(), _function).getState();
        }
      }
      _xblockexpression = states;
    }
    return _xblockexpression;
  }
}
