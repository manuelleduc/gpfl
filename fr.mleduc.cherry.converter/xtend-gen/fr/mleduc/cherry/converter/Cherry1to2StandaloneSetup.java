/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.cherry.converter;

import fr.mleduc.cherry.converter.Cherry1to2StandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class Cherry1to2StandaloneSetup extends Cherry1to2StandaloneSetupGenerated {
  public static void doSetup() {
    new Cherry1to2StandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
