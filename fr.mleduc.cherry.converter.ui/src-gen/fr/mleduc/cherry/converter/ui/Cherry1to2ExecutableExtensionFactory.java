/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.cherry.converter.ui;

import com.google.inject.Injector;
import fr.mleduc.cherry.converter.ui.internal.ConverterActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Cherry1to2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ConverterActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ConverterActivator.getInstance().getInjector(ConverterActivator.FR_MLEDUC_CHERRY_CONVERTER_CHERRY1TO2);
	}
	
}
