/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.cherry.converter.ide

import com.google.inject.Guice
import fr.mleduc.cherry.converter.Cherry1to2RuntimeModule
import fr.mleduc.cherry.converter.Cherry1to2StandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class Cherry1to2IdeSetup extends Cherry1to2StandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new Cherry1to2RuntimeModule, new Cherry1to2IdeModule))
	}
	
}
