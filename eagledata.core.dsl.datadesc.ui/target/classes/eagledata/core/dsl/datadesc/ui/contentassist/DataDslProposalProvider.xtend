/*
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.core.runtime.IExtensionRegistry
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import eagledata.core.dsl.datadesc.dataDsl.DataOption

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class DataDslProposalProvider extends AbstractDataDslProposalProvider {
	public static final String CONNECTION_EXTENSIONS_ID = "eagledata.core.extensions.assistant";
	
	override completeDataDescription_Format(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val IExtensionRegistry registry = Platform.getExtensionRegistry();
		val IConfigurationElement[] extensions = registry.getConfigurationElementsFor(CONNECTION_EXTENSIONS_ID);
		
		for (ext : extensions) {
			if (ext.getName().equals("dataassistant")) {
					acceptor.accept(createCompletionProposal("\"" + ext.getAttribute("name") + "\"", ext.getAttribute("name"), null, context));
			}
		}
	}
	
	override completeDataOption_Key(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val IExtensionRegistry registry = Platform.getExtensionRegistry();
		val IConfigurationElement[] extensions = registry.getConfigurationElementsFor(CONNECTION_EXTENSIONS_ID);
		
		for (ext : extensions) {
			val IConfigurationElement[] children = ext.getChildren("option");
			for(child : children){
				acceptor.accept(createCompletionProposal("\"" + child.getAttribute("key") + "\"", child.getAttribute("key"), null, context));
			}
		}
	}
	
	override completeDataOption_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if(model instanceof DataOption){
			val IExtensionRegistry registry = Platform.getExtensionRegistry();
			val IConfigurationElement[] extensions = registry.getConfigurationElementsFor(CONNECTION_EXTENSIONS_ID);
			
			for (ext : extensions) {
				val IConfigurationElement[] children = ext.getChildren("option");
				for(child : children){
					if(child.getAttribute("key").equals(model.key)){
						val String[] values = child.getAttribute("values").split(":");
						for(value : values){
							acceptor.accept(createCompletionProposal("\"" + value + "\"", value, null, context));
						}		
					}
				}
			}
		}	
	}
}