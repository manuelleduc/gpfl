/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.fsm;

import fr.mleduc.fsm.FsmStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class FsmStandaloneSetup extends FsmStandaloneSetupGenerated {
  public static void doSetup() {
    new FsmStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
