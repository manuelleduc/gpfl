/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang

import fr.mleduc.simlang.jvmmodel.SimLangCompiler
import fr.mleduc.simlang.typesystem.SimLangTypeComputer
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputer

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class SimLangRuntimeModule extends AbstractSimLangRuntimeModule {
	def Class<? extends ITypeComputer> bindITypeComputer() {
		SimLangTypeComputer
	}

	def Class<? extends XbaseCompiler> bindXbaseCompiler() {
		SimLangCompiler
	}
}
