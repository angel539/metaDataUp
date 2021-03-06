/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.query.validation

import org.eclipse.xtext.validation.Check
import query.Select
import query.QueryPackage
import query.SimpleFrom
import query.CompositeFrom
import query.From

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class QueryDslValidator extends AbstractQueryDslValidator {
	public static val QUERY_SYNTAX_ERROR = 'querySyntaxError'
//
	@Check
	def checkGreetingStartsWithCapital(Select select) {
		var boolean valid = true
		
		for (from : select.from) {
			val int index = select.from.indexOf(from)
			
			if(index == 0 && from instanceof CompositeFrom) 
				valid = false
			else{
				if(index < (select.from.size - 1)){
					val From next = select.from.get(index + 1)
					
					if((from instanceof CompositeFrom) && (next != null && next instanceof SimpleFrom)){
						valid = false
					}
				}
			}			
		}
		
		if (!valid) {
			error('Query syntax error: from cannot have a sequence composed by a set of joins and simple nodes', 
					QueryPackage.Literals.SELECT__FROM,
					QUERY_SYNTAX_ERROR)
		}
	}
	
}
