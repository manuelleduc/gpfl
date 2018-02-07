package fr.mleduc.gpfl.scoping

import org.eclipse.xtext.xbase.resource.XbaseResourceDescriptionStrategy
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.resource.IEObjectDescription

class GpflResourceDescriptionStrategy extends XbaseResourceDescriptionStrategy {

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		false
	}

}
