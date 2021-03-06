/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.serializer;

import com.google.inject.Inject;
import fr.mleduc.gpfl.services.GpflGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class GpflSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GpflGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CmdLit_LeftParenthesisKeyword_6_0_a;
	protected AbstractElementAlias match_CmdLit_LeftParenthesisKeyword_6_0_p;
	protected AbstractElementAlias match_Program_AUTOMATASKeyword_4_0_q;
	protected AbstractElementAlias match_Program_INITKeyword_5_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GpflGrammarAccess) access;
		match_CmdLit_LeftParenthesisKeyword_6_0_a = new TokenAlias(true, true, grammarAccess.getCmdLitAccess().getLeftParenthesisKeyword_6_0());
		match_CmdLit_LeftParenthesisKeyword_6_0_p = new TokenAlias(true, false, grammarAccess.getCmdLitAccess().getLeftParenthesisKeyword_6_0());
		match_Program_AUTOMATASKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getProgramAccess().getAUTOMATASKeyword_4_0());
		match_Program_INITKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getProgramAccess().getINITKeyword_5_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_CmdLit_LeftParenthesisKeyword_6_0_a.equals(syntax))
				emit_CmdLit_LeftParenthesisKeyword_6_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CmdLit_LeftParenthesisKeyword_6_0_p.equals(syntax))
				emit_CmdLit_LeftParenthesisKeyword_6_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Program_AUTOMATASKeyword_4_0_q.equals(syntax))
				emit_Program_AUTOMATASKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Program_INITKeyword_5_0_q.equals(syntax))
				emit_Program_INITKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '!' expression=CmdLit
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'outSide' (rule start)
	 *     (rule start) (ambiguity) 'true' (rule start)
	 *     (rule start) (ambiguity) inSide?='inSide'
	 *     (rule start) (ambiguity) value=ID
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {CmdAdd.left=}
	 *     (rule start) (ambiguity) {CmdAnd.left=}
	 *     (rule start) (ambiguity) {CmdEq.left=}
	 *     (rule start) (ambiguity) {CmdGCompare.left=}
	 *     (rule start) (ambiguity) {CmdGECompare.left=}
	 *     (rule start) (ambiguity) {CmdLCompare.left=}
	 *     (rule start) (ambiguity) {CmdLECompare.left=}
	 *     (rule start) (ambiguity) {CmdNEq.left=}
	 *     (rule start) (ambiguity) {CmdSub.left=}
	 */
	protected void emit_CmdLit_LeftParenthesisKeyword_6_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '!' expression=CmdLit
	 *     (rule start) (ambiguity) {CmdAdd.left=}
	 *     (rule start) (ambiguity) {CmdAnd.left=}
	 *     (rule start) (ambiguity) {CmdEq.left=}
	 *     (rule start) (ambiguity) {CmdGCompare.left=}
	 *     (rule start) (ambiguity) {CmdGECompare.left=}
	 *     (rule start) (ambiguity) {CmdLCompare.left=}
	 *     (rule start) (ambiguity) {CmdLECompare.left=}
	 *     (rule start) (ambiguity) {CmdNEq.left=}
	 *     (rule start) (ambiguity) {CmdSub.left=}
	 */
	protected void emit_CmdLit_LeftParenthesisKeyword_6_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'AUTOMATAS'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID 'PROLOGUE' (ambiguity) 'INIT' initStmts+=GExpression
	 *     name=ID 'PROLOGUE' (ambiguity) 'INIT'? 'FILTER' (rule end)
	 *     name=ID 'PROLOGUE' (ambiguity) 'INIT'? 'FILTER' stmts+=GExpression
	 */
	protected void emit_Program_AUTOMATASKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'INIT'?
	 *
	 * This ambiguous syntax occurs at:
	 *     automatas+=AutomataDef (ambiguity) 'FILTER' (rule end)
	 *     automatas+=AutomataDef (ambiguity) 'FILTER' stmts+=GExpression
	 *     name=ID 'PROLOGUE' 'AUTOMATAS'? (ambiguity) 'FILTER' (rule end)
	 *     name=ID 'PROLOGUE' 'AUTOMATAS'? (ambiguity) 'FILTER' stmts+=GExpression
	 */
	protected void emit_Program_INITKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
