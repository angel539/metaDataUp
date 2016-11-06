/*
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ui;

import com.google.inject.Injector;
import eagledata.core.dsl.rule.ui.internal.RuleActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RuleDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RuleActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RuleActivator.getInstance().getInjector(RuleActivator.EAGLEDATA_CORE_DSL_RULE_RULEDSL);
	}
	
}
