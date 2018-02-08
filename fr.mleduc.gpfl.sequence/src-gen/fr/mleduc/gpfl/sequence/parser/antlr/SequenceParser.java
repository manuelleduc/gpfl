/*
 * generated by Xtext 2.13.0
 */
package fr.mleduc.gpfl.sequence.parser.antlr;

import com.google.inject.Inject;
import fr.mleduc.gpfl.sequence.parser.antlr.internal.InternalSequenceParser;
import fr.mleduc.gpfl.sequence.services.SequenceGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SequenceParser extends AbstractAntlrParser {

	@Inject
	private SequenceGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSequenceParser createParser(XtextTokenStream stream) {
		return new InternalSequenceParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public SequenceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SequenceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
