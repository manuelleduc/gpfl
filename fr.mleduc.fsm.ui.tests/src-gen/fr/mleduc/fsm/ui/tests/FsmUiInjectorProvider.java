/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.fsm.ui.tests;

import com.google.inject.Injector;
import fr.mleduc.fsm.ui.internal.FsmActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class FsmUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FsmActivator.getInstance().getInjector("fr.mleduc.fsm.Fsm");
	}

}
