/**
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.annotations;

import uam.eagledata.dsl.annotations.AnnotationsDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class AnnotationsDslStandaloneSetup extends AnnotationsDslStandaloneSetupGenerated {
  public static void doSetup() {
    AnnotationsDslStandaloneSetup _annotationsDslStandaloneSetup = new AnnotationsDslStandaloneSetup();
    _annotationsDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
