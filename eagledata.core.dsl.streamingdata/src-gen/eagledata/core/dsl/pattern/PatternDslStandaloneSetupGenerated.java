/*
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern;

import com.google.inject.Guice;
import com.google.inject.Injector;
import eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.XbaseStandaloneSetup;

@SuppressWarnings("all")
public class PatternDslStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		XbaseStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new PatternDslRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.core.eagledata/dsl/streamingdata/StreamingDsl")) {
			EPackage.Registry.INSTANCE.put("http://www.core.eagledata/dsl/streamingdata/StreamingDsl", StreamingDslPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("streamd", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("streamd", serviceProvider);
	}
}