/*
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import eagledata.core.dsl.datadesc.validation.DataDslValidator
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import eagledata.core.dsl.datadesc.dataDsl.Option
import eagledata.core.dsl.datadesc.dataDsl.BasicType
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import java.util.List
import eagledata.core.dsl.datadesc.dataDsl.StringOption
import eagledata.core.dsl.datadesc.dataDsl.PrimitiveNode

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#quick-fixes
 */
class DataDslQuickfixProvider extends DefaultQuickfixProvider {
	@Fix(DataDslValidator.DATATYPE_OPTION_NAME)
	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Options are not valid', 'Remove invalid options', 'upcase.png', new SemanticModification())
	}
}

class SemanticModification implements ISemanticModification {
	override apply(EObject element, IModificationContext context) throws Exception {
		if (element instanceof PrimitiveNode) {
			val node = element as PrimitiveNode
			
			if(node.type != null){
				val BasicType datatype = node.type
				var List<Option> deletes = new ArrayList<Option>()
				
				switch datatype.literal{
					case "int":
						for(Option option : node.options){
							if(option instanceof StringOption){
								if(!option.key.literal.equals("null") && !option.key.literal.equals("separator") && !option.key.literal.equals("default")){
									deletes += option
								}
							}
						}
					case "real":
						for(Option option : node.options){
							if(option instanceof StringOption){
								if(!option.key.literal.equals("null") && !option.key.literal.equals("separator") && !option.key.literal.equals("default") && !option.key.literal.equals("decimalchar") && !option.key.literal.equals("groupchar") && !option.key.literal.equals("pattern")){
									deletes += option
								}
							}
						}	
					case "boolean":
					 	for(Option option : node.options){
					 		if(option instanceof StringOption){
					 			if(!option.key.literal.equals("null") && !option.key.literal.equals("format")){
									deletes += option
								}
					 		}
							
						}
					case "date":
						for(Option option : node.options){
							if(option instanceof StringOption){
								if(!option.key.literal.equals("null") && !option.key.literal.equals("format") && !option.key.literal.equals("separator")){
									deletes += option
								}
							}		
						}
					case "time":
					 	for(Option option : node.options){
					 		if(option instanceof StringOption){
					 			if(!option.key.literal.equals("null") && !option.key.literal.equals("format") && !option.key.literal.equals("separator")){
									deletes += option
								}
					 		}
						}
					case "year":
					 	for(Option option : node.options){
					 		if(option instanceof StringOption){
								if(!option.key.literal.equals("null") && !option.key.literal.equals("format")){
									deletes += option
								}
							}
						}
					case "month":
					 	for(Option option : node.options){
					 		if(option instanceof StringOption){
								if(!option.key.literal.equals("null") && !option.key.literal.equals("format")){
									deletes += option
								}						
							}
						}
					case "day":
					 	for(Option option : node.options){
					 		if(option instanceof StringOption){
								if(!option.key.literal.equals("null") && !option.key.literal.equals("format")){
									deletes += option
								}
							}
						}
					case "string":
					 	for(Option option : node.options){
					 		if(option instanceof StringOption){
					 			if(!option.key.literal.equals("null") && !option.key.literal.equals("regex") && !option.key.literal.equals("flags")){
									deletes += option
								}
					 		}		
						}
					case "lat":
					 	for(Option option : node.options){
					 		if(option instanceof StringOption){
					 			if(!option.key.literal.equals("null")){
									deletes += option
								}
					 		}	
						}
					case "long":
					 	for(Option option : node.options){
					 		if(option instanceof StringOption){
					 			if(!option.key.literal.equals("null")){
									deletes += option
								}
					 		}							
						}
				}
				
				node.options.removeAll(deletes)
			}
		}
	}
} 

/*
 * [
			context |
			val xtextDocument = context.xtextDocument
			
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
 */