/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.events.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uam.eagledata.dsl.events.parser.antlr.internal.InternalEventSetManagerDslParser;
import uam.eagledata.dsl.events.services.EventSetManagerDslGrammarAccess;

public class EventSetManagerDslParser extends AbstractAntlrParser {

	@Inject
	private EventSetManagerDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEventSetManagerDslParser createParser(XtextTokenStream stream) {
		return new InternalEventSetManagerDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "EventSetManager";
	}

	public EventSetManagerDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EventSetManagerDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
