/**
 * generated by Xtext 2.13.0
 */
package fr.mleduc.gpfl.sequence.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.mleduc.gpfl.sequence.SequenceRuntimeModule;
import fr.mleduc.gpfl.sequence.SequenceStandaloneSetup;
import fr.mleduc.gpfl.sequence.ide.SequenceIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SequenceIdeSetup extends SequenceStandaloneSetup {
  @Override
  public Injector createInjector() {
    SequenceRuntimeModule _sequenceRuntimeModule = new SequenceRuntimeModule();
    SequenceIdeModule _sequenceIdeModule = new SequenceIdeModule();
    return Guice.createInjector(Modules2.mixin(_sequenceRuntimeModule, _sequenceIdeModule));
  }
}
