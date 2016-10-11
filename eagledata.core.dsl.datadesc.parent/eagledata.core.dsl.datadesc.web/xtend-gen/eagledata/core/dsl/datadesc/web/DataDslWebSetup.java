/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.util.Modules;
import eagledata.core.dsl.datadesc.DataDslRuntimeModule;
import eagledata.core.dsl.datadesc.DataDslStandaloneSetup;
import eagledata.core.dsl.datadesc.web.DataDslWebModule;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class DataDslWebSetup extends DataDslStandaloneSetup {
  private final Provider<ExecutorService> executorServiceProvider;
  
  @Override
  public Injector createInjector() {
    final DataDslRuntimeModule runtimeModule = new DataDslRuntimeModule();
    final DataDslWebModule webModule = new DataDslWebModule(this.executorServiceProvider);
    Modules.OverriddenModuleBuilder _override = Modules.override(runtimeModule);
    Module _with = _override.with(webModule);
    return Guice.createInjector(_with);
  }
  
  public DataDslWebSetup(final Provider<ExecutorService> executorServiceProvider) {
    super();
    this.executorServiceProvider = executorServiceProvider;
  }
}
