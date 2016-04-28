/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.ui.labeling;

import com.google.inject.Inject;
import eagledata.core.dsl.datadesc.dataDsl.DataFragment;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class DataDslLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public DataDslLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final DataFragment ele) {
    return ele.getName();
  }
  
  public Object image(final DataFragment ele) {
    return null;
  }
}
