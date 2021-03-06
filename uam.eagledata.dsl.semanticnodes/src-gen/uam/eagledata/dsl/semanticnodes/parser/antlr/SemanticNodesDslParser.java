/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.semanticnodes.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uam.eagledata.dsl.semanticnodes.parser.antlr.internal.InternalSemanticNodesDslParser;
import uam.eagledata.dsl.semanticnodes.services.SemanticNodesDslGrammarAccess;

public class SemanticNodesDslParser extends AbstractAntlrParser {

	@Inject
	private SemanticNodesDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSemanticNodesDslParser createParser(XtextTokenStream stream) {
		return new InternalSemanticNodesDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RepositoryManager";
	}

	public SemanticNodesDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SemanticNodesDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
