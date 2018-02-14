/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang.validation

import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.xbase.XExpression
import fr.mleduc.simlang.simLang.SimLangPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SimLangValidator extends AbstractSimLangValidator {
	
	override protected isValueExpectedRecursive(XExpression expr) {
		val feature = expr.eContainingFeature();
		return if(feature == SimLangPackage.Literals.COND_STMT__IF) {
			true
		} else super.isValueExpectedRecursive(expr)
		
	}
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					SimLangPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
}