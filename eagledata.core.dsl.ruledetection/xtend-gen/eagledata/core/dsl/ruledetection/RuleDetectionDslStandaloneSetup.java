/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.ruledetection;

import eagledata.core.dsl.ruledetection.RuleDetectionDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RuleDetectionDslStandaloneSetup extends RuleDetectionDslStandaloneSetupGenerated {
  public static void doSetup() {
    RuleDetectionDslStandaloneSetup _ruleDetectionDslStandaloneSetup = new RuleDetectionDslStandaloneSetup();
    _ruleDetectionDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
