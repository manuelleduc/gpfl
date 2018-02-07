package fr.mleduc.gpfl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.resource.XbaseResourceDescriptionStrategy;

@SuppressWarnings("all")
public class GpflResourceDescriptionStrategy extends XbaseResourceDescriptionStrategy {
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    return false;
  }
}
