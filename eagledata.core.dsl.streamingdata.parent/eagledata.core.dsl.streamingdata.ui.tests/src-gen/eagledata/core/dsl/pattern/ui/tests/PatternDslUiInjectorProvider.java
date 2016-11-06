/*
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.ui.tests;

import com.google.inject.Injector;
import eagledata.core.dsl.streamingdata.ui.internal.StreamingdataActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class PatternDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return StreamingdataActivator.getInstance().getInjector("eagledata.core.dsl.pattern.PatternDsl");
	}

}
