/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.fsmwithmethods.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractFsmWithMethodsValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.mleduc.fsmwithmethods.fsmWithMethods.FsmWithMethodsPackage.eINSTANCE);
		return result;
	}
	
}
