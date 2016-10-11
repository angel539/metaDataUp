/*
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.datadesc.formatting2

import com.google.inject.Inject
import eagledata.core.dsl.datadesc.dataDsl.DataModel
import eagledata.core.dsl.datadesc.dataDsl.DataModelElement
import eagledata.core.dsl.datadesc.dataDsl.SpecificationElement
import eagledata.core.dsl.datadesc.dataDsl.Tag
import eagledata.core.dsl.datadesc.services.DataDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import eagledata.core.dsl.datadesc.dataDsl.DataDslPackage
import eagledata.core.dsl.datadesc.dataDsl.Node

class DataDslFormatter extends AbstractFormatter2 {
	@Inject extension DataDslGrammarAccess

	def dispatch void format(DataModel dataModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (DataModelElement elements : dataModel.getElements()) {
			elements.format;
		}
	}

	def dispatch void format(eagledata.core.dsl.datadesc.dataDsl.Package _package, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Tag tags : _package.getTags()) {
			tags.format;
		}
		for (SpecificationElement elements : _package.getElements()) {
			elements.format;
		}
	}
	
	def dispatch void format(eagledata.core.dsl.datadesc.dataDsl.AbstractDescription description, extension IFormattableDocument document){
		//description.append[newLine]
		description.interior[indent]
		//description.regionFor.feature(DataDslPackage.Literals.SPECIFICATION_ELEMENT__NAME).prepend[oneSpace] // tab
		description.regionFor.keyword("{").prepend[oneSpace].append[newLine]
		//description.regionFor.keyword("{").prepend[newLine]
		for(Node node : description.nodes) node.format
		description.regionFor.keyword("}").prepend[newLine]
		
	}
	
	def dispatch void format(eagledata.core.dsl.datadesc.dataDsl.Enumeration enumeration, extension IFormattableDocument document){
		enumeration.append[newLine]
	}
	
	def dispatch void format(eagledata.core.dsl.datadesc.dataDsl.Node node, extension IFormattableDocument document){
		node.append[newLine]
	}
	// TODO: implement for CompositeNode, FragmentNode, PrimitiveNode, DataDescription, Fragment, DataTypeRefinement
}
