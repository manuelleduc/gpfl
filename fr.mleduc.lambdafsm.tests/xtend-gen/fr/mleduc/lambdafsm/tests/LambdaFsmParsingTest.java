/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.lambdafsm.tests;

import com.google.inject.Inject;
import fr.mleduc.fsm.fsm.Fsm;
import fr.mleduc.lambdafsm.tests.LambdaFsmInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(LambdaFsmInjectorProvider.class)
@SuppressWarnings("all")
public class LambdaFsmParsingTest {
  @Inject
  private ParseHelper<Fsm> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Fsm result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
