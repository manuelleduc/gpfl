/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.fsm.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.mleduc.fsm.ide.contentassist.antlr.internal.InternalFsmParser;
import fr.mleduc.fsm.services.FsmGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class FsmParser extends AbstractContentAssistParser {

	@Inject
	private FsmGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFsmParser createParser() {
		InternalFsmParser result = new InternalFsmParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFsmAccess().getGroup(), "rule__Fsm__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateAccess().getGroup_1(), "rule__State__Group_1__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getFsmAccess().getNameAssignment_1(), "rule__Fsm__NameAssignment_1");
					put(grammarAccess.getFsmAccess().getStateAssignment_4(), "rule__Fsm__StateAssignment_4");
					put(grammarAccess.getFsmAccess().getStatesAssignment_5(), "rule__Fsm__StatesAssignment_5");
					put(grammarAccess.getStateAccess().getNameAssignment_0(), "rule__State__NameAssignment_0");
					put(grammarAccess.getStateAccess().getTransitionsAssignment_1_1(), "rule__State__TransitionsAssignment_1_1");
					put(grammarAccess.getTransitionAccess().getNameAssignment_0(), "rule__Transition__NameAssignment_0");
					put(grammarAccess.getTransitionAccess().getStateAssignment_2(), "rule__Transition__StateAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FsmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FsmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
