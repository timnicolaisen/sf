/**
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.util.Modules;
import de.htwdd.sf.beleg.MyDslRuntimeModule;
import de.htwdd.sf.beleg.MyDslStandaloneSetup;
import de.htwdd.sf.beleg.web.MyDslWebModule;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class MyDslWebSetup extends MyDslStandaloneSetup {
  private final Provider<ExecutorService> executorServiceProvider;
  
  @Override
  public Injector createInjector() {
    final MyDslRuntimeModule runtimeModule = new MyDslRuntimeModule();
    final MyDslWebModule webModule = new MyDslWebModule(this.executorServiceProvider);
    Modules.OverriddenModuleBuilder _override = Modules.override(runtimeModule);
    Module _with = _override.with(webModule);
    return Guice.createInjector(_with);
  }
  
  public MyDslWebSetup(final Provider<ExecutorService> executorServiceProvider) {
    super();
    this.executorServiceProvider = executorServiceProvider;
  }
}
