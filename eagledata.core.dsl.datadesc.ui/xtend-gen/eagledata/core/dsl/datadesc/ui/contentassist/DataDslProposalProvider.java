/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.ui.contentassist;

import eagledata.core.dsl.datadesc.dataDsl.DataOption;
import eagledata.core.dsl.datadesc.ui.contentassist.AbstractDataDslProposalProvider;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class DataDslProposalProvider extends AbstractDataDslProposalProvider {
  public final static String CONNECTION_EXTENSIONS_ID = "eagledata.core.extensions.assistant";
  
  @Override
  public void completeDataDescription_Format(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final IExtensionRegistry registry = Platform.getExtensionRegistry();
    final IConfigurationElement[] extensions = registry.getConfigurationElementsFor(DataDslProposalProvider.CONNECTION_EXTENSIONS_ID);
    for (final IConfigurationElement ext : extensions) {
      String _name = ext.getName();
      boolean _equals = _name.equals("dataassistant");
      if (_equals) {
        String _attribute = ext.getAttribute("name");
        String _plus = ("\"" + _attribute);
        String _plus_1 = (_plus + "\"");
        String _attribute_1 = ext.getAttribute("name");
        ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_plus_1, _attribute_1, null, context);
        acceptor.accept(_createCompletionProposal);
      }
    }
  }
  
  @Override
  public void completeDataOption_Key(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final IExtensionRegistry registry = Platform.getExtensionRegistry();
    final IConfigurationElement[] extensions = registry.getConfigurationElementsFor(DataDslProposalProvider.CONNECTION_EXTENSIONS_ID);
    for (final IConfigurationElement ext : extensions) {
      {
        final IConfigurationElement[] children = ext.getChildren("option");
        for (final IConfigurationElement child : children) {
          String _attribute = child.getAttribute("key");
          String _plus = ("\"" + _attribute);
          String _plus_1 = (_plus + "\"");
          String _attribute_1 = child.getAttribute("key");
          ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_plus_1, _attribute_1, null, context);
          acceptor.accept(_createCompletionProposal);
        }
      }
    }
  }
  
  @Override
  public void completeDataOption_Value(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    if ((model instanceof DataOption)) {
      final IExtensionRegistry registry = Platform.getExtensionRegistry();
      final IConfigurationElement[] extensions = registry.getConfigurationElementsFor(DataDslProposalProvider.CONNECTION_EXTENSIONS_ID);
      for (final IConfigurationElement ext : extensions) {
        {
          final IConfigurationElement[] children = ext.getChildren("option");
          for (final IConfigurationElement child : children) {
            String _attribute = child.getAttribute("key");
            String _key = ((DataOption)model).getKey();
            boolean _equals = _attribute.equals(_key);
            if (_equals) {
              String _attribute_1 = child.getAttribute("values");
              final String[] values = _attribute_1.split(":");
              for (final String value : values) {
                ICompletionProposal _createCompletionProposal = this.createCompletionProposal((("\"" + value) + "\""), value, null, context);
                acceptor.accept(_createCompletionProposal);
              }
            }
          }
        }
      }
    }
  }
}