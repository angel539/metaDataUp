/*
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RuleDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("eagledata/core/dsl/rule/parser/antlr/internal/InternalRuleDsl.tokens");
	}
}