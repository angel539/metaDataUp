/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.web;

import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.servlet.annotation.WebServlet;

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = "XtextServices", urlPatterns = "/xtext-service/*")
@SuppressWarnings("all")
public class PatternDslServlet /* implements XtextServlet  */{
  private final List<ExecutorService> executorServices /* Skipped initializer because of errors */;
  
  @Override
  public Object init() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\n=> cannot be resolved."
      + "\n+= cannot be resolved."
      + "\nThe method createInjectorAndDoEMFRegistration() is undefined for the type PatternDslWebSetup"
      + "\nInvalid number of arguments. The constructor PatternDslWebSetup() is not applicable for the arguments (Provider<ExecutorService>)"
      + "\ninit cannot be resolved");
  }
  
  @Override
  public Object destroy() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ndestroy cannot be resolved");
  }
}
