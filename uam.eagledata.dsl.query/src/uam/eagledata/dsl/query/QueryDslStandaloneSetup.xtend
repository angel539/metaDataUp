/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.query


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class QueryDslStandaloneSetup extends QueryDslStandaloneSetupGenerated {

	def static void doSetup() {
		new QueryDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
