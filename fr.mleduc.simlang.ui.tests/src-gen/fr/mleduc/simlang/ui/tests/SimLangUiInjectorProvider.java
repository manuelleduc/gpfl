/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang.ui.tests;

import com.google.inject.Injector;
import fr.mleduc.simlang.ui.internal.SimlangActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class SimLangUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SimlangActivator.getInstance().getInjector("fr.mleduc.simlang.SimLang");
	}

}
