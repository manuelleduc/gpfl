/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.lambda.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.mleduc.lambda.ide.contentassist.antlr.internal.InternalLambdaParser;
import fr.mleduc.lambda.services.LambdaGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LambdaParser extends AbstractContentAssistParser {

	@Inject
	private LambdaGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalLambdaParser createParser() {
		InternalLambdaParser result = new InternalLambdaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGExpressionAccess().getAlternatives(), "rule__GExpression__Alternatives");
					put(grammarAccess.getGpflGExpressionAccess().getAlternatives(), "superGExpression__Alternatives");
					put(grammarAccess.getCmdAccess().getAlternatives(), "rule__Cmd__Alternatives");
					put(grammarAccess.getCmdNotAccess().getAlternatives(), "rule__CmdNot__Alternatives");
					put(grammarAccess.getCmdLitAccess().getAlternatives(), "rule__CmdLit__Alternatives");
					put(grammarAccess.getCmdLitAccess().getAlternatives_5_1(), "rule__CmdLit__Alternatives_5_1");
					put(grammarAccess.getPortAccess().getAlternatives(), "rule__Port__Alternatives");
					put(grammarAccess.getGExpressionAccess().getGroup_0(), "rule__GExpression__Group_0__0");
					put(grammarAccess.getGExpressionAccess().getGroup_0_4(), "rule__GExpression__Group_0_4__0");
					put(grammarAccess.getGExpressionAccess().getGroup_0_4_1(), "rule__GExpression__Group_0_4_1__0");
					put(grammarAccess.getGExpressionAccess().getGroup_2(), "rule__GExpression__Group_2__0");
					put(grammarAccess.getGExpressionAccess().getGroup_2_4(), "rule__GExpression__Group_2_4__0");
					put(grammarAccess.getGExpressionAccess().getGroup_2_4_1(), "rule__GExpression__Group_2_4_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_4(), "rule__Program__Group_4__0");
					put(grammarAccess.getProgramAccess().getGroup_5(), "rule__Program__Group_5__0");
					put(grammarAccess.getGpflGExpressionAccess().getGroup_1(), "superGExpression__Group_1__0");
					put(grammarAccess.getGpflGExpressionAccess().getGroup_2(), "superGExpression__Group_2__0");
					put(grammarAccess.getGpflGExpressionAccess().getGroup_3(), "superGExpression__Group_3__0");
					put(grammarAccess.getCmdAccess().getGroup_0(), "rule__Cmd__Group_0__0");
					put(grammarAccess.getCmdAccess().getGroup_1(), "rule__Cmd__Group_1__0");
					put(grammarAccess.getCmdAccess().getGroup_2(), "rule__Cmd__Group_2__0");
					put(grammarAccess.getCmdAccess().getGroup_3(), "rule__Cmd__Group_3__0");
					put(grammarAccess.getCmdAccess().getGroup_4(), "rule__Cmd__Group_4__0");
					put(grammarAccess.getCmdAccess().getGroup_5(), "rule__Cmd__Group_5__0");
					put(grammarAccess.getCmdAccess().getGroup_6(), "rule__Cmd__Group_6__0");
					put(grammarAccess.getCmdAccess().getGroup_7(), "rule__Cmd__Group_7__0");
					put(grammarAccess.getCmdOrAccess().getGroup(), "rule__CmdOr__Group__0");
					put(grammarAccess.getCmdOrAccess().getGroup_1(), "rule__CmdOr__Group_1__0");
					put(grammarAccess.getCmdOrAccess().getGroup_1_0(), "rule__CmdOr__Group_1_0__0");
					put(grammarAccess.getCmdOrAccess().getGroup_1_0_0(), "rule__CmdOr__Group_1_0_0__0");
					put(grammarAccess.getCmdAndAccess().getGroup(), "rule__CmdAnd__Group__0");
					put(grammarAccess.getCmdAndAccess().getGroup_1(), "rule__CmdAnd__Group_1__0");
					put(grammarAccess.getCmdAndAccess().getGroup_1_0(), "rule__CmdAnd__Group_1_0__0");
					put(grammarAccess.getCmdAndAccess().getGroup_1_0_0(), "rule__CmdAnd__Group_1_0_0__0");
					put(grammarAccess.getCmdEqAccess().getGroup(), "rule__CmdEq__Group__0");
					put(grammarAccess.getCmdEqAccess().getGroup_1(), "rule__CmdEq__Group_1__0");
					put(grammarAccess.getCmdEqAccess().getGroup_1_0(), "rule__CmdEq__Group_1_0__0");
					put(grammarAccess.getCmdEqAccess().getGroup_1_0_0(), "rule__CmdEq__Group_1_0_0__0");
					put(grammarAccess.getCmdNeqAccess().getGroup(), "rule__CmdNeq__Group__0");
					put(grammarAccess.getCmdNeqAccess().getGroup_1(), "rule__CmdNeq__Group_1__0");
					put(grammarAccess.getCmdNeqAccess().getGroup_1_0(), "rule__CmdNeq__Group_1_0__0");
					put(grammarAccess.getCmdNeqAccess().getGroup_1_0_0(), "rule__CmdNeq__Group_1_0_0__0");
					put(grammarAccess.getCmdGECompareAccess().getGroup(), "rule__CmdGECompare__Group__0");
					put(grammarAccess.getCmdGECompareAccess().getGroup_1(), "rule__CmdGECompare__Group_1__0");
					put(grammarAccess.getCmdGECompareAccess().getGroup_1_0(), "rule__CmdGECompare__Group_1_0__0");
					put(grammarAccess.getCmdGECompareAccess().getGroup_1_0_0(), "rule__CmdGECompare__Group_1_0_0__0");
					put(grammarAccess.getCmdLECompareAccess().getGroup(), "rule__CmdLECompare__Group__0");
					put(grammarAccess.getCmdLECompareAccess().getGroup_1(), "rule__CmdLECompare__Group_1__0");
					put(grammarAccess.getCmdLECompareAccess().getGroup_1_0(), "rule__CmdLECompare__Group_1_0__0");
					put(grammarAccess.getCmdLECompareAccess().getGroup_1_0_0(), "rule__CmdLECompare__Group_1_0_0__0");
					put(grammarAccess.getCmdGCompareAccess().getGroup(), "rule__CmdGCompare__Group__0");
					put(grammarAccess.getCmdGCompareAccess().getGroup_1(), "rule__CmdGCompare__Group_1__0");
					put(grammarAccess.getCmdGCompareAccess().getGroup_1_0(), "rule__CmdGCompare__Group_1_0__0");
					put(grammarAccess.getCmdGCompareAccess().getGroup_1_0_0(), "rule__CmdGCompare__Group_1_0_0__0");
					put(grammarAccess.getCmdLCompareAccess().getGroup(), "rule__CmdLCompare__Group__0");
					put(grammarAccess.getCmdLCompareAccess().getGroup_1(), "rule__CmdLCompare__Group_1__0");
					put(grammarAccess.getCmdLCompareAccess().getGroup_1_0(), "rule__CmdLCompare__Group_1_0__0");
					put(grammarAccess.getCmdLCompareAccess().getGroup_1_0_0(), "rule__CmdLCompare__Group_1_0_0__0");
					put(grammarAccess.getCmdAddAccess().getGroup(), "rule__CmdAdd__Group__0");
					put(grammarAccess.getCmdAddAccess().getGroup_1(), "rule__CmdAdd__Group_1__0");
					put(grammarAccess.getCmdAddAccess().getGroup_1_0(), "rule__CmdAdd__Group_1_0__0");
					put(grammarAccess.getCmdAddAccess().getGroup_1_0_0(), "rule__CmdAdd__Group_1_0_0__0");
					put(grammarAccess.getCmdSubAccess().getGroup(), "rule__CmdSub__Group__0");
					put(grammarAccess.getCmdSubAccess().getGroup_1(), "rule__CmdSub__Group_1__0");
					put(grammarAccess.getCmdSubAccess().getGroup_1_0(), "rule__CmdSub__Group_1_0__0");
					put(grammarAccess.getCmdSubAccess().getGroup_1_0_0(), "rule__CmdSub__Group_1_0_0__0");
					put(grammarAccess.getCmdNotAccess().getGroup_0(), "rule__CmdNot__Group_0__0");
					put(grammarAccess.getCmdLitAccess().getGroup_0(), "rule__CmdLit__Group_0__0");
					put(grammarAccess.getCmdLitAccess().getGroup_1(), "rule__CmdLit__Group_1__0");
					put(grammarAccess.getCmdLitAccess().getGroup_2(), "rule__CmdLit__Group_2__0");
					put(grammarAccess.getCmdLitAccess().getGroup_3(), "rule__CmdLit__Group_3__0");
					put(grammarAccess.getCmdLitAccess().getGroup_4(), "rule__CmdLit__Group_4__0");
					put(grammarAccess.getCmdLitAccess().getGroup_5(), "rule__CmdLit__Group_5__0");
					put(grammarAccess.getCmdLitAccess().getGroup_6(), "rule__CmdLit__Group_6__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getPortAccess().getGroup_0(), "rule__Port__Group_0__0");
					put(grammarAccess.getPortAccess().getGroup_1(), "rule__Port__Group_1__0");
					put(grammarAccess.getAutomataDefAccess().getGroup(), "rule__AutomataDef__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getGExpressionAccess().getNameAssignment_0_2(), "rule__GExpression__NameAssignment_0_2");
					put(grammarAccess.getGExpressionAccess().getParamsAssignment_0_4_0(), "rule__GExpression__ParamsAssignment_0_4_0");
					put(grammarAccess.getGExpressionAccess().getParamsAssignment_0_4_1_1(), "rule__GExpression__ParamsAssignment_0_4_1_1");
					put(grammarAccess.getGExpressionAccess().getStmtsAssignment_0_7(), "rule__GExpression__StmtsAssignment_0_7");
					put(grammarAccess.getGExpressionAccess().getMethodAssignment_2_2(), "rule__GExpression__MethodAssignment_2_2");
					put(grammarAccess.getGExpressionAccess().getParamsAssignment_2_4_0(), "rule__GExpression__ParamsAssignment_2_4_0");
					put(grammarAccess.getGExpressionAccess().getParamsAssignment_2_4_1_1(), "rule__GExpression__ParamsAssignment_2_4_1_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getProgramAccess().getNameAssignment_2(), "rule__Program__NameAssignment_2");
					put(grammarAccess.getProgramAccess().getAutomatasAssignment_4_1(), "rule__Program__AutomatasAssignment_4_1");
					put(grammarAccess.getProgramAccess().getInitStmtsAssignment_5_1(), "rule__Program__InitStmtsAssignment_5_1");
					put(grammarAccess.getProgramAccess().getStmtsAssignment_7(), "rule__Program__StmtsAssignment_7");
					put(grammarAccess.getGpflGExpressionAccess().getExpAssignment_1_3(), "superGExpression__ExpAssignment_1_3");
					put(grammarAccess.getGpflGExpressionAccess().getStmtsAssignment_1_5(), "superGExpression__StmtsAssignment_1_5");
					put(grammarAccess.getGpflGExpressionAccess().getExpAssignment_2_3(), "superGExpression__ExpAssignment_2_3");
					put(grammarAccess.getGpflGExpressionAccess().getStmtsAssignment_2_5(), "superGExpression__StmtsAssignment_2_5");
					put(grammarAccess.getGpflGExpressionAccess().getTimeoutAssignment_3_3(), "superGExpression__TimeoutAssignment_3_3");
					put(grammarAccess.getGpflGExpressionAccess().getPeriodicAssignment_3_5(), "superGExpression__PeriodicAssignment_3_5");
					put(grammarAccess.getGpflGExpressionAccess().getStmtsAssignment_3_7(), "superGExpression__StmtsAssignment_3_7");
					put(grammarAccess.getCmdAccess().getPortAssignment_3_3(), "rule__Cmd__PortAssignment_3_3");
					put(grammarAccess.getCmdAccess().getFieldsAssignment_3_5(), "rule__Cmd__FieldsAssignment_3_5");
					put(grammarAccess.getCmdAccess().getExpAssignment_4_3(), "rule__Cmd__ExpAssignment_4_3");
					put(grammarAccess.getCmdAccess().getNameAssignment_5_3(), "rule__Cmd__NameAssignment_5_3");
					put(grammarAccess.getCmdAccess().getExpAssignment_5_5(), "rule__Cmd__ExpAssignment_5_5");
					put(grammarAccess.getCmdAccess().getNameAssignment_6_3(), "rule__Cmd__NameAssignment_6_3");
					put(grammarAccess.getCmdAccess().getAutomatonAssignment_6_5(), "rule__Cmd__AutomatonAssignment_6_5");
					put(grammarAccess.getCmdAccess().getAutomatonAssignment_7_3(), "rule__Cmd__AutomatonAssignment_7_3");
					put(grammarAccess.getCmdAccess().getEventAssignment_7_5(), "rule__Cmd__EventAssignment_7_5");
					put(grammarAccess.getCmdAccess().getErrorsAssignment_7_7(), "rule__Cmd__ErrorsAssignment_7_7");
					put(grammarAccess.getCmdOrAccess().getRightAssignment_1_1(), "rule__CmdOr__RightAssignment_1_1");
					put(grammarAccess.getCmdAndAccess().getRightAssignment_1_1(), "rule__CmdAnd__RightAssignment_1_1");
					put(grammarAccess.getCmdEqAccess().getRightAssignment_1_1(), "rule__CmdEq__RightAssignment_1_1");
					put(grammarAccess.getCmdNeqAccess().getRightAssignment_1_1(), "rule__CmdNeq__RightAssignment_1_1");
					put(grammarAccess.getCmdGECompareAccess().getRightAssignment_1_1(), "rule__CmdGECompare__RightAssignment_1_1");
					put(grammarAccess.getCmdLECompareAccess().getRightAssignment_1_1(), "rule__CmdLECompare__RightAssignment_1_1");
					put(grammarAccess.getCmdGCompareAccess().getRightAssignment_1_1(), "rule__CmdGCompare__RightAssignment_1_1");
					put(grammarAccess.getCmdLCompareAccess().getRightAssignment_1_1(), "rule__CmdLCompare__RightAssignment_1_1");
					put(grammarAccess.getCmdAddAccess().getRightAssignment_1_1(), "rule__CmdAdd__RightAssignment_1_1");
					put(grammarAccess.getCmdSubAccess().getRightAssignment_1_1(), "rule__CmdSub__RightAssignment_1_1");
					put(grammarAccess.getCmdNotAccess().getExpressionAssignment_0_1(), "rule__CmdNot__ExpressionAssignment_0_1");
					put(grammarAccess.getCmdLitAccess().getValueAssignment_0_1(), "rule__CmdLit__ValueAssignment_0_1");
					put(grammarAccess.getCmdLitAccess().getValueAssignment_3_1(), "rule__CmdLit__ValueAssignment_3_1");
					put(grammarAccess.getCmdLitAccess().getValueAssignment_4_1(), "rule__CmdLit__ValueAssignment_4_1");
					put(grammarAccess.getCmdLitAccess().getInSideAssignment_5_1_0(), "rule__CmdLit__InSideAssignment_5_1_0");
					put(grammarAccess.getFieldAccess().getNameAssignment_0(), "rule__Field__NameAssignment_0");
					put(grammarAccess.getFieldAccess().getValueAssignment_2(), "rule__Field__ValueAssignment_2");
					put(grammarAccess.getAutomataDefAccess().getNameAssignment_1(), "rule__AutomataDef__NameAssignment_1");
					put(grammarAccess.getAutomataDefAccess().getInitAssignment_4(), "rule__AutomataDef__InitAssignment_4");
					put(grammarAccess.getAutomataDefAccess().getStatesAssignment_5(), "rule__AutomataDef__StatesAssignment_5");
					put(grammarAccess.getStateAccess().getNameAssignment_0(), "rule__State__NameAssignment_0");
					put(grammarAccess.getStateAccess().getTransitionsAssignment_1(), "rule__State__TransitionsAssignment_1");
					put(grammarAccess.getTransitionAccess().getEventAssignment_1(), "rule__Transition__EventAssignment_1");
					put(grammarAccess.getTransitionAccess().getTargetAssignment_3(), "rule__Transition__TargetAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LambdaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LambdaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
