/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.macros.language.parser.antlr;

import com.google.inject.Inject;
import fr.mleduc.macros.language.parser.antlr.internal.InternalMacrosLangParser;
import fr.mleduc.macros.language.services.MacrosLangGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MacrosLangParser extends AbstractAntlrParser {

	@Inject
	private MacrosLangGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMacrosLangParser createParser(XtextTokenStream stream) {
		return new InternalMacrosLangParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MacrosLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MacrosLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
