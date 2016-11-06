/*
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.ui;

import com.google.inject.Injector;
import eagledata.core.dsl.streamingdata.ui.internal.StreamingdataActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PatternDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return StreamingdataActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return StreamingdataActivator.getInstance().getInjector(StreamingdataActivator.EAGLEDATA_CORE_DSL_PATTERN_PATTERNDSL);
	}
	
}
