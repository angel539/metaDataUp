/**
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.events;

import uam.eagledata.dsl.events.EventSetManagerDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class EventSetManagerDslStandaloneSetup extends EventSetManagerDslStandaloneSetupGenerated {
  public static void doSetup() {
    EventSetManagerDslStandaloneSetup _eventSetManagerDslStandaloneSetup = new EventSetManagerDslStandaloneSetup();
    _eventSetManagerDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
