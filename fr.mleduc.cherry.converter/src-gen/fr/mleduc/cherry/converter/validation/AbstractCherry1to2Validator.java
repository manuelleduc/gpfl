/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.cherry.converter.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractCherry1to2Validator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.mleduc.cherry.converter.cherry1to2.Cherry1to2Package.eINSTANCE);
		return result;
	}
	
}
