package fr.mleduc.gpfl.scoping;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;

@SuppressWarnings("all")
public class GpflIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
  @Override
  public String getSimpleName(final JvmIdentifiableElement element) {
    if (((element == null) || element.eIsProxy())) {
      return null;
    }
    return null;
  }
}
