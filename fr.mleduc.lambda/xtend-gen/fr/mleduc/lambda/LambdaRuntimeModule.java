/**
 * generated by Xtext 2.13.0
 */
package fr.mleduc.lambda;

import com.google.inject.Module;
import fr.mleduc.gpfl.interpreter.IGpflInterpreter;
import fr.mleduc.lambda.AbstractLambdaRuntimeModule;
import fr.mleduc.lambda.interpreter.LambdaInterpreter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class LambdaRuntimeModule extends AbstractLambdaRuntimeModule implements Module {
  public LambdaRuntimeModule() {
    super();
  }
  
  @Override
  public Class<? extends IGpflInterpreter> bindIGpflInterpreter() {
    return LambdaInterpreter.class;
  }
}
