/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.annotations


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AnnotationsDslStandaloneSetup extends AnnotationsDslStandaloneSetupGenerated {

	def static void doSetup() {
		new AnnotationsDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
