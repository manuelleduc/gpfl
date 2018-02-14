/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.fsm

import fr.mleduc.fsm.interpreter.IFsmInterpreter
import fr.mleduc.fsm.interpreter.FsmInterpreter

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class FsmRuntimeModule extends AbstractFsmRuntimeModule {

	def Class<? extends IFsmInterpreter> bindIFsmInterpreter() {
		FsmInterpreter
	}
}
