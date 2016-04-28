/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.ui.quickfix;

import eagledata.core.dsl.datadesc.ui.quickfix.SemanticModification;
import eagledata.core.dsl.datadesc.validation.DataDslValidator;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#quick-fixes
 */
@SuppressWarnings("all")
public class DataDslQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(DataDslValidator.DATATYPE_OPTION_NAME)
  public void capitalizeName(final Issue issue, final IssueResolutionAcceptor acceptor) {
    SemanticModification _semanticModification = new SemanticModification();
    acceptor.accept(issue, "Options are not valid", "Remove invalid options", "upcase.png", _semanticModification);
  }
}
