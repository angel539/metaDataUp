/*
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ui.tests;

import com.google.inject.Injector;
import eagledata.core.dsl.rule.ui.internal.RuleActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class RuleDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RuleActivator.getInstance().getInjector("eagledata.core.dsl.rule.RuleDsl");
	}

}