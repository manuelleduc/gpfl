/**
 * generated by Xtext 2.13.0
 */
package fr.mleduc.lambda.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.mleduc.lambda.LambdaRuntimeModule;
import fr.mleduc.lambda.LambdaStandaloneSetup;
import fr.mleduc.lambda.ide.LambdaIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class LambdaIdeSetup extends LambdaStandaloneSetup {
  @Override
  public Injector createInjector() {
    LambdaRuntimeModule _lambdaRuntimeModule = new LambdaRuntimeModule();
    LambdaIdeModule _lambdaIdeModule = new LambdaIdeModule();
    return Guice.createInjector(Modules2.mixin(_lambdaRuntimeModule, _lambdaIdeModule));
  }
}
