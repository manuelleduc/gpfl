/*
 * generated by Xtext 2.13.0
 */
package fr.mleduc.gpfl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GpflStandaloneSetup extends GpflStandaloneSetupGenerated {

	def static void doSetup() {
		new GpflStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
