/*
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDymeLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage.eINSTANCE);
		return result;
	}
}
