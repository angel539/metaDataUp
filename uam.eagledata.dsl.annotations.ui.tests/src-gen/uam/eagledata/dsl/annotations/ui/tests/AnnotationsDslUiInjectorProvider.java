/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.annotations.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import uam.eagledata.dsl.annotations.ui.internal.AnnotationsActivator;

public class AnnotationsDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AnnotationsActivator.getInstance().getInjector("uam.eagledata.dsl.annotations.AnnotationsDsl");
	}

}