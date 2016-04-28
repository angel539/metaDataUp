/*
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.tests

import com.google.inject.Inject
import eagledata.core.dsl.pattern.streamingDsl.StreamingModel
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(PatternDslInjectorProvider)
class PatternDslParsingTest{

	@Inject
	ParseHelper<StreamingModel> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
