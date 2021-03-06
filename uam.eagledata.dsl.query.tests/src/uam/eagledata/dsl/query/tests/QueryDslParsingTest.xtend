/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.query.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import query.QuerySet

@RunWith(XtextRunner)
@InjectWith(QueryDslInjectorProvider)
class QueryDslParsingTest{

	@Inject
	ParseHelper<QuerySet> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
