/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern;

import eagledata.core.dsl.pattern.PatternDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PatternDslStandaloneSetup extends PatternDslStandaloneSetupGenerated {
  public static void doSetup() {
    PatternDslStandaloneSetup _patternDslStandaloneSetup = new PatternDslStandaloneSetup();
    _patternDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
