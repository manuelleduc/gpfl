/*
 * generated by Xtext 2.13.0
 */
package fr.mleduc.gpfl.ide

import com.google.inject.Guice
import fr.mleduc.gpfl.GpflRuntimeModule
import fr.mleduc.gpfl.GpflStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class GpflIdeSetup extends GpflStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new GpflRuntimeModule, new GpflIdeModule))
	}
	
}
