/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.semanticnodes.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import semanticmanager.Resource
import semanticmanager.SemanticmanagerPackage
import semanticmanager.RepositoryManager
import org.eclipse.xtext.EcoreUtil2
import java.util.List
import uam.extremo.extensions.AssistantFactory
import semanticmanager.FormatAssistant
import org.eclipse.xtext.scoping.Scopes
import semanticmanager.MetaDataValue
import semanticmanager.MetaData
import semanticmanager.NamedElement
import java.util.ArrayList

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class SemanticNodesDslScopeProvider extends AbstractSemanticNodesDslScopeProvider {
	override getScope(EObject context, EReference reference) {
		//Si no se hace esto... dangling reference
		if (context instanceof Resource 
    		&& reference == SemanticmanagerPackage.Literals.RESOURCE__ASSISTANT) {
    		val RepositoryManager rootElement = EcoreUtil2.getRootContainer(context) as RepositoryManager
    		val List<FormatAssistant> assistants = AssistantFactory.getInstance().assistances
    		
    		if(!rootElement.assistants.equals(assistants)){
				rootElement.assistants.clear
				rootElement.assistants.addAll(assistants)
			}
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(rootElement, FormatAssistant))
		}
		
		if (context instanceof MetaDataValue 
    		&& reference == SemanticmanagerPackage.Literals.META_DATA_VALUE__KEY_META_DATA) {
    		val RepositoryManager rootElement = EcoreUtil2.getRootContainer(context) as RepositoryManager
    		val List<MetaData> metadata = AssistantFactory.getInstance().registeredMetaData
    		
    		// controlling the dangling reference
    		if(!rootElement.metadata.equals(metadata)){
				rootElement.metadata.clear
				rootElement.metadata.addAll(metadata)
			}
			
			// filtering if metadata should be applied
			var List<MetaData> metadataApplicable = new ArrayList<MetaData>	
			
			//println("before... " + metadataApplicable)
			//println("before on model... " + rootElement.metadata)
			//println("econtainer... " + context.eContainer)
			
			for(MetaData m : rootElement.metadata){
				if(m.select(context.eContainer as NamedElement)){
					metadataApplicable.add(m)
				}
			}
			
			//metadataApplicable = rootElement.metadata.filter[m | m.select(context.eContainer as NamedElement)].toList
			
			//println("after... " + metadataApplicable)
			
			return Scopes.scopeFor(metadataApplicable)
		}

		return super.getScope(context, reference);
	}
}
