/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.ui;

import com.google.inject.Injector;
import fr.mleduc.gpfl.ui.internal.GpflActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GpflExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GpflActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GpflActivator.getInstance().getInjector(GpflActivator.FR_MLEDUC_GPFL_GPFL);
	}
	
}
