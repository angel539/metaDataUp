/*
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.rule.validation

import org.eclipse.xtext.validation.Check
import eagledata.core.dsl.rule.ruleDsl.Rule
import eagledata.core.dsl.pattern.streamingDsl.Phrase

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RuleDslValidator extends AbstractRuleDslValidator {
	public static val CONCEPTS_NAME = 'conceptsInvalid'
//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					RuleDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def checkDataTypeOptions(Rule rule) {
		val Phrase phrase = rule.event
		/*for()
		for(Property property : subsequence.properties){
			val String propertyLit = property.literal
			
			switch propertyLit{
				case "lower_case":
					for(Property propertyList : subsequence.properties){
						if(propertyList.literal.equals("upper_case")){
							error('Properties are not valid for subsequence. Cant be lowercase and uppercase at the same time', StreamingDslPackage.Literals.SUBSEQUENCE_CONCEPT__NAME, SUBSEQ_OPTION_NAME) 
						}
					}
				case "upper_case":
					for(Property propertyList : subsequence.properties){
						if(propertyList.literal.equals("lower_case")){
							error('Properties are not valid for subsequence. Cant be lowercase and uppercase at the same time', StreamingDslPackage.Literals.SUBSEQUENCE_CONCEPT__NAME, SUBSEQ_OPTION_NAME) 
						}
						if(propertyList.literal.equals("ignore_case")){
							error('Properties are not compatible. Cant be upper_case and ignore_case at the same time', StreamingDslPackage.Literals.SUBSEQUENCE_CONCEPT__NAME, SUBSEQ_OPTION_NAME) 
						}
					}
				case "ignore_case":
					for(Property propertyList : subsequence.properties){
						if(propertyList.literal.equals("upper_case")){
							error('PProperties are not compatible. Cant be upper_case and ignore_case at the same time', StreamingDslPackage.Literals.SUBSEQUENCE_CONCEPT__NAME, SUBSEQ_OPTION_NAME) 
						}
					}
				case "numbers":
					for(Property propertyList : subsequence.properties){
						if(propertyList.literal.equals("ignore_accents") || propertyList.literal.equals("ignore_case") || propertyList.literal.equals("ignore_vowels") || propertyList.literal.equals("lower_case") || propertyList.literal.equals("upper_case")){
							error('Number property is not compatible with the others.', StreamingDslPackage.Literals.SUBSEQUENCE_CONCEPT__NAME, SUBSEQ_OPTION_NAME) 
						}
					}
			}
		}*/
	}
	
}