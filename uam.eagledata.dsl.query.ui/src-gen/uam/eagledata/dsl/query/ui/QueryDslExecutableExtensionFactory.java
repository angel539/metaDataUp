/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.query.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import uam.eagledata.dsl.query.ui.internal.QueryActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class QueryDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return QueryActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return QueryActivator.getInstance().getInjector(QueryActivator.UAM_EAGLEDATA_DSL_QUERY_QUERYDSL);
	}
	
}
