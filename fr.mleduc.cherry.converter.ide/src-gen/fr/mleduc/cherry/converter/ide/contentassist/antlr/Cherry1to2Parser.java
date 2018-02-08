/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.cherry.converter.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.mleduc.cherry.converter.ide.contentassist.antlr.internal.InternalCherry1to2Parser;
import fr.mleduc.cherry.converter.services.Cherry1to2GrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class Cherry1to2Parser extends AbstractContentAssistParser {

	@Inject
	private Cherry1to2GrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCherry1to2Parser createParser() {
		InternalCherry1to2Parser result = new InternalCherry1to2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
					put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
					put(grammarAccess.getGreetingAccess().getNameAssignment_1(), "rule__Greeting__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Cherry1to2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Cherry1to2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
