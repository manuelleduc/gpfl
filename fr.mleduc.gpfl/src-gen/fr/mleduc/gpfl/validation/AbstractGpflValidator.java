/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGpflValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.mleduc.gpfl.gpfl.GpflPackage.eINSTANCE);
		return result;
	}
	
}
