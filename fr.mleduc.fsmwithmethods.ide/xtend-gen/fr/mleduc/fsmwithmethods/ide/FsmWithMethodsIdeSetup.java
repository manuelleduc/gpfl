/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.fsmwithmethods.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.mleduc.fsmwithmethods.FsmWithMethodsRuntimeModule;
import fr.mleduc.fsmwithmethods.FsmWithMethodsStandaloneSetup;
import fr.mleduc.fsmwithmethods.ide.FsmWithMethodsIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class FsmWithMethodsIdeSetup extends FsmWithMethodsStandaloneSetup {
  @Override
  public Injector createInjector() {
    FsmWithMethodsRuntimeModule _fsmWithMethodsRuntimeModule = new FsmWithMethodsRuntimeModule();
    FsmWithMethodsIdeModule _fsmWithMethodsIdeModule = new FsmWithMethodsIdeModule();
    return Guice.createInjector(Modules2.mixin(_fsmWithMethodsRuntimeModule, _fsmWithMethodsIdeModule));
  }
}
