package fr.mleduc.gpfl.scoping

import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider
import org.eclipse.xtext.common.types.JvmIdentifiableElement

class GpflIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {

	override getSimpleName(JvmIdentifiableElement element) {
//		println('''>>>> «element.simpleName»''')
		if (element === null || element.eIsProxy()) {
			return null;
		}
//		super.getSimpleName(element)
	}

}
