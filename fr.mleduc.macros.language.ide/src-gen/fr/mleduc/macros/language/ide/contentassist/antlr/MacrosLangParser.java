/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.macros.language.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.mleduc.macros.language.ide.contentassist.antlr.internal.InternalMacrosLangParser;
import fr.mleduc.macros.language.services.MacrosLangGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MacrosLangParser extends AbstractContentAssistParser {

	@Inject
	private MacrosLangGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMacrosLangParser createParser() {
		InternalMacrosLangParser result = new InternalMacrosLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractRuleAccess().getAlternatives(), "rule__AbstractRule__Alternatives");
					put(grammarAccess.getAbstractMetamodelDeclarationAccess().getAlternatives(), "rule__AbstractMetamodelDeclaration__Alternatives");
					put(grammarAccess.getParserRuleAccess().getAlternatives_1(), "rule__ParserRule__Alternatives_1");
					put(grammarAccess.getParserRuleAccess().getAlternatives_1_0_2(), "rule__ParserRule__Alternatives_1_0_2");
					put(grammarAccess.getConditionalBranchAccess().getAlternatives(), "rule__ConditionalBranch__Alternatives");
					put(grammarAccess.getAbstractTokenAccess().getAlternatives(), "rule__AbstractToken__Alternatives");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getAlternatives_0(), "rule__AbstractTokenWithCardinality__Alternatives_0");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAlternatives_1_0(), "rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0");
					put(grammarAccess.getActionAccess().getOperatorAlternatives_2_2_0(), "rule__Action__OperatorAlternatives_2_2_0");
					put(grammarAccess.getAbstractTerminalAccess().getAlternatives(), "rule__AbstractTerminal__Alternatives");
					put(grammarAccess.getLiteralConditionAccess().getAlternatives_1(), "rule__LiteralCondition__Alternatives_1");
					put(grammarAccess.getNegationAccess().getAlternatives(), "rule__Negation__Alternatives");
					put(grammarAccess.getAtomAccess().getAlternatives(), "rule__Atom__Alternatives");
					put(grammarAccess.getValidIDAccess().getAlternatives(), "rule__ValidID__Alternatives");
					put(grammarAccess.getPredicatedKeywordAccess().getAlternatives_0(), "rule__PredicatedKeyword__Alternatives_0");
					put(grammarAccess.getPredicatedRuleCallAccess().getAlternatives_0(), "rule__PredicatedRuleCall__Alternatives_0");
					put(grammarAccess.getAssignmentAccess().getAlternatives_0(), "rule__Assignment__Alternatives_0");
					put(grammarAccess.getAssignmentAccess().getOperatorAlternatives_2_0(), "rule__Assignment__OperatorAlternatives_2_0");
					put(grammarAccess.getAssignableTerminalAccess().getAlternatives(), "rule__AssignableTerminal__Alternatives");
					put(grammarAccess.getCrossReferenceableTerminalAccess().getAlternatives(), "rule__CrossReferenceableTerminal__Alternatives");
					put(grammarAccess.getPredicatedGroupAccess().getAlternatives_0(), "rule__PredicatedGroup__Alternatives_0");
					put(grammarAccess.getTerminalRuleAccess().getAlternatives_2(), "rule__TerminalRule__Alternatives_2");
					put(grammarAccess.getTerminalTokenAccess().getCardinalityAlternatives_1_0(), "rule__TerminalToken__CardinalityAlternatives_1_0");
					put(grammarAccess.getTerminalTokenElementAccess().getAlternatives(), "rule__TerminalTokenElement__Alternatives");
					put(grammarAccess.getAbstractNegatedTokenAccess().getAlternatives(), "rule__AbstractNegatedToken__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getGrammarAccess().getGroup(), "rule__Grammar__Group__0");
					put(grammarAccess.getGrammarAccess().getGroup_2(), "rule__Grammar__Group_2__0");
					put(grammarAccess.getGrammarAccess().getGroup_2_2(), "rule__Grammar__Group_2_2__0");
					put(grammarAccess.getGrammarAccess().getGroup_3(), "rule__Grammar__Group_3__0");
					put(grammarAccess.getGrammarAccess().getGroup_3_2(), "rule__Grammar__Group_3_2__0");
					put(grammarAccess.getGrammarAccess().getGroup_3_2_1(), "rule__Grammar__Group_3_2_1__0");
					put(grammarAccess.getGrammarIDAccess().getGroup(), "rule__GrammarID__Group__0");
					put(grammarAccess.getGrammarIDAccess().getGroup_1(), "rule__GrammarID__Group_1__0");
					put(grammarAccess.getGeneratedMetamodelAccess().getGroup(), "rule__GeneratedMetamodel__Group__0");
					put(grammarAccess.getGeneratedMetamodelAccess().getGroup_3(), "rule__GeneratedMetamodel__Group_3__0");
					put(grammarAccess.getReferencedMetamodelAccess().getGroup(), "rule__ReferencedMetamodel__Group__0");
					put(grammarAccess.getReferencedMetamodelAccess().getGroup_2(), "rule__ReferencedMetamodel__Group_2__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getParserRuleAccess().getGroup(), "rule__ParserRule__Group__0");
					put(grammarAccess.getParserRuleAccess().getGroup_1_0(), "rule__ParserRule__Group_1_0__0");
					put(grammarAccess.getParserRuleAccess().getGroup_1_0_2_1(), "rule__ParserRule__Group_1_0_2_1__0");
					put(grammarAccess.getParserRuleAccess().getGroup_1_1(), "rule__ParserRule__Group_1_1__0");
					put(grammarAccess.getParserRuleAccess().getGroup_1_1_1(), "rule__ParserRule__Group_1_1_1__0");
					put(grammarAccess.getParserRuleAccess().getGroup_2(), "rule__ParserRule__Group_2__0");
					put(grammarAccess.getParserRuleAccess().getGroup_2_2(), "rule__ParserRule__Group_2_2__0");
					put(grammarAccess.getParserRuleAccess().getGroup_2_2_1(), "rule__ParserRule__Group_2_2_1__0");
					put(grammarAccess.getRuleNameAndParamsAccess().getGroup(), "rule__RuleNameAndParams__Group__0");
					put(grammarAccess.getRuleNameAndParamsAccess().getGroup_1(), "rule__RuleNameAndParams__Group_1__0");
					put(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1(), "rule__RuleNameAndParams__Group_1_1__0");
					put(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1_1(), "rule__RuleNameAndParams__Group_1_1_1__0");
					put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
					put(grammarAccess.getTypeRefAccess().getGroup_0(), "rule__TypeRef__Group_0__0");
					put(grammarAccess.getAlternativesAccess().getGroup(), "rule__Alternatives__Group__0");
					put(grammarAccess.getAlternativesAccess().getGroup_1(), "rule__Alternatives__Group_1__0");
					put(grammarAccess.getAlternativesAccess().getGroup_1_1(), "rule__Alternatives__Group_1_1__0");
					put(grammarAccess.getConditionalBranchAccess().getGroup_1(), "rule__ConditionalBranch__Group_1__0");
					put(grammarAccess.getUnorderedGroupAccess().getGroup(), "rule__UnorderedGroup__Group__0");
					put(grammarAccess.getUnorderedGroupAccess().getGroup_1(), "rule__UnorderedGroup__Group_1__0");
					put(grammarAccess.getUnorderedGroupAccess().getGroup_1_1(), "rule__UnorderedGroup__Group_1_1__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_1(), "rule__Group__Group_1__0");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getGroup(), "rule__AbstractTokenWithCardinality__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_2(), "rule__Action__Group_2__0");
					put(grammarAccess.getRuleCallAccess().getGroup(), "rule__RuleCall__Group__0");
					put(grammarAccess.getRuleCallAccess().getGroup_1(), "rule__RuleCall__Group_1__0");
					put(grammarAccess.getRuleCallAccess().getGroup_1_2(), "rule__RuleCall__Group_1_2__0");
					put(grammarAccess.getNamedArgumentAccess().getGroup(), "rule__NamedArgument__Group__0");
					put(grammarAccess.getNamedArgumentAccess().getGroup_0(), "rule__NamedArgument__Group_0__0");
					put(grammarAccess.getLiteralConditionAccess().getGroup(), "rule__LiteralCondition__Group__0");
					put(grammarAccess.getDisjunctionAccess().getGroup(), "rule__Disjunction__Group__0");
					put(grammarAccess.getDisjunctionAccess().getGroup_1(), "rule__Disjunction__Group_1__0");
					put(grammarAccess.getConjunctionAccess().getGroup(), "rule__Conjunction__Group__0");
					put(grammarAccess.getConjunctionAccess().getGroup_1(), "rule__Conjunction__Group_1__0");
					put(grammarAccess.getNegationAccess().getGroup_1(), "rule__Negation__Group_1__0");
					put(grammarAccess.getParenthesizedConditionAccess().getGroup(), "rule__ParenthesizedCondition__Group__0");
					put(grammarAccess.getRuleIDAccess().getGroup(), "rule__RuleID__Group__0");
					put(grammarAccess.getRuleIDAccess().getGroup_1(), "rule__RuleID__Group_1__0");
					put(grammarAccess.getPredicatedKeywordAccess().getGroup(), "rule__PredicatedKeyword__Group__0");
					put(grammarAccess.getPredicatedRuleCallAccess().getGroup(), "rule__PredicatedRuleCall__Group__0");
					put(grammarAccess.getPredicatedRuleCallAccess().getGroup_2(), "rule__PredicatedRuleCall__Group_2__0");
					put(grammarAccess.getPredicatedRuleCallAccess().getGroup_2_2(), "rule__PredicatedRuleCall__Group_2_2__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getParenthesizedAssignableElementAccess().getGroup(), "rule__ParenthesizedAssignableElement__Group__0");
					put(grammarAccess.getAssignableAlternativesAccess().getGroup(), "rule__AssignableAlternatives__Group__0");
					put(grammarAccess.getAssignableAlternativesAccess().getGroup_1(), "rule__AssignableAlternatives__Group_1__0");
					put(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1(), "rule__AssignableAlternatives__Group_1_1__0");
					put(grammarAccess.getCrossReferenceAccess().getGroup(), "rule__CrossReference__Group__0");
					put(grammarAccess.getCrossReferenceAccess().getGroup_2(), "rule__CrossReference__Group_2__0");
					put(grammarAccess.getParenthesizedElementAccess().getGroup(), "rule__ParenthesizedElement__Group__0");
					put(grammarAccess.getPredicatedGroupAccess().getGroup(), "rule__PredicatedGroup__Group__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup(), "rule__TerminalRule__Group__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup_2_0(), "rule__TerminalRule__Group_2_0__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup_2_1(), "rule__TerminalRule__Group_2_1__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup_2_1_1(), "rule__TerminalRule__Group_2_1_1__0");
					put(grammarAccess.getTerminalAlternativesAccess().getGroup(), "rule__TerminalAlternatives__Group__0");
					put(grammarAccess.getTerminalAlternativesAccess().getGroup_1(), "rule__TerminalAlternatives__Group_1__0");
					put(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1(), "rule__TerminalAlternatives__Group_1_1__0");
					put(grammarAccess.getTerminalGroupAccess().getGroup(), "rule__TerminalGroup__Group__0");
					put(grammarAccess.getTerminalGroupAccess().getGroup_1(), "rule__TerminalGroup__Group_1__0");
					put(grammarAccess.getTerminalTokenAccess().getGroup(), "rule__TerminalToken__Group__0");
					put(grammarAccess.getParenthesizedTerminalElementAccess().getGroup(), "rule__ParenthesizedTerminalElement__Group__0");
					put(grammarAccess.getNegatedTokenAccess().getGroup(), "rule__NegatedToken__Group__0");
					put(grammarAccess.getUntilTokenAccess().getGroup(), "rule__UntilToken__Group__0");
					put(grammarAccess.getWildcardAccess().getGroup(), "rule__Wildcard__Group__0");
					put(grammarAccess.getEOFAccess().getGroup(), "rule__EOF__Group__0");
					put(grammarAccess.getCharacterRangeAccess().getGroup(), "rule__CharacterRange__Group__0");
					put(grammarAccess.getCharacterRangeAccess().getGroup_1(), "rule__CharacterRange__Group_1__0");
					put(grammarAccess.getEnumRuleAccess().getGroup(), "rule__EnumRule__Group__0");
					put(grammarAccess.getEnumRuleAccess().getGroup_3(), "rule__EnumRule__Group_3__0");
					put(grammarAccess.getEnumLiteralsAccess().getGroup(), "rule__EnumLiterals__Group__0");
					put(grammarAccess.getEnumLiteralsAccess().getGroup_1(), "rule__EnumLiterals__Group_1__0");
					put(grammarAccess.getEnumLiteralsAccess().getGroup_1_1(), "rule__EnumLiterals__Group_1_1__0");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getGroup(), "rule__EnumLiteralDeclaration__Group__0");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getGroup_1(), "rule__EnumLiteralDeclaration__Group_1__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getPathAssignment_3(), "rule__Model__PathAssignment_3");
					put(grammarAccess.getGrammarAccess().getNameAssignment_1(), "rule__Grammar__NameAssignment_1");
					put(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_1(), "rule__Grammar__UsedGrammarsAssignment_2_1");
					put(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_2_1(), "rule__Grammar__UsedGrammarsAssignment_2_2_1");
					put(grammarAccess.getGrammarAccess().getDefinesHiddenTokensAssignment_3_0(), "rule__Grammar__DefinesHiddenTokensAssignment_3_0");
					put(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_0(), "rule__Grammar__HiddenTokensAssignment_3_2_0");
					put(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_1_1(), "rule__Grammar__HiddenTokensAssignment_3_2_1_1");
					put(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4(), "rule__Grammar__MetamodelDeclarationsAssignment_4");
					put(grammarAccess.getGrammarAccess().getRulesAssignment_5(), "rule__Grammar__RulesAssignment_5");
					put(grammarAccess.getGeneratedMetamodelAccess().getNameAssignment_1(), "rule__GeneratedMetamodel__NameAssignment_1");
					put(grammarAccess.getGeneratedMetamodelAccess().getEPackageAssignment_2(), "rule__GeneratedMetamodel__EPackageAssignment_2");
					put(grammarAccess.getGeneratedMetamodelAccess().getAliasAssignment_3_1(), "rule__GeneratedMetamodel__AliasAssignment_3_1");
					put(grammarAccess.getReferencedMetamodelAccess().getEPackageAssignment_1(), "rule__ReferencedMetamodel__EPackageAssignment_1");
					put(grammarAccess.getReferencedMetamodelAccess().getAliasAssignment_2_1(), "rule__ReferencedMetamodel__AliasAssignment_2_1");
					put(grammarAccess.getAnnotationAccess().getNameAssignment_1(), "rule__Annotation__NameAssignment_1");
					put(grammarAccess.getParserRuleAccess().getAnnotationsAssignment_0(), "rule__ParserRule__AnnotationsAssignment_0");
					put(grammarAccess.getParserRuleAccess().getFragmentAssignment_1_0_0(), "rule__ParserRule__FragmentAssignment_1_0_0");
					put(grammarAccess.getParserRuleAccess().getWildcardAssignment_1_0_2_0(), "rule__ParserRule__WildcardAssignment_1_0_2_0");
					put(grammarAccess.getParserRuleAccess().getTypeAssignment_1_0_2_1_1(), "rule__ParserRule__TypeAssignment_1_0_2_1_1");
					put(grammarAccess.getParserRuleAccess().getTypeAssignment_1_1_1_1(), "rule__ParserRule__TypeAssignment_1_1_1_1");
					put(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensAssignment_2_0(), "rule__ParserRule__DefinesHiddenTokensAssignment_2_0");
					put(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_0(), "rule__ParserRule__HiddenTokensAssignment_2_2_0");
					put(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_1_1(), "rule__ParserRule__HiddenTokensAssignment_2_2_1_1");
					put(grammarAccess.getParserRuleAccess().getAlternativesAssignment_4(), "rule__ParserRule__AlternativesAssignment_4");
					put(grammarAccess.getRuleNameAndParamsAccess().getNameAssignment_0(), "rule__RuleNameAndParams__NameAssignment_0");
					put(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_0(), "rule__RuleNameAndParams__ParametersAssignment_1_1_0");
					put(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_1_1(), "rule__RuleNameAndParams__ParametersAssignment_1_1_1_1");
					put(grammarAccess.getParameterAccess().getNameAssignment(), "rule__Parameter__NameAssignment");
					put(grammarAccess.getTypeRefAccess().getMetamodelAssignment_0_0(), "rule__TypeRef__MetamodelAssignment_0_0");
					put(grammarAccess.getTypeRefAccess().getClassifierAssignment_1(), "rule__TypeRef__ClassifierAssignment_1");
					put(grammarAccess.getAlternativesAccess().getElementsAssignment_1_1_1(), "rule__Alternatives__ElementsAssignment_1_1_1");
					put(grammarAccess.getConditionalBranchAccess().getGuardConditionAssignment_1_2(), "rule__ConditionalBranch__GuardConditionAssignment_1_2");
					put(grammarAccess.getConditionalBranchAccess().getElementsAssignment_1_4(), "rule__ConditionalBranch__ElementsAssignment_1_4");
					put(grammarAccess.getUnorderedGroupAccess().getElementsAssignment_1_1_1(), "rule__UnorderedGroup__ElementsAssignment_1_1_1");
					put(grammarAccess.getGroupAccess().getElementsAssignment_1_1(), "rule__Group__ElementsAssignment_1_1");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAssignment_1(), "rule__AbstractTokenWithCardinality__CardinalityAssignment_1");
					put(grammarAccess.getActionAccess().getTypeAssignment_1(), "rule__Action__TypeAssignment_1");
					put(grammarAccess.getActionAccess().getFeatureAssignment_2_1(), "rule__Action__FeatureAssignment_2_1");
					put(grammarAccess.getActionAccess().getOperatorAssignment_2_2(), "rule__Action__OperatorAssignment_2_2");
					put(grammarAccess.getKeywordAccess().getValueAssignment(), "rule__Keyword__ValueAssignment");
					put(grammarAccess.getRuleCallAccess().getRuleAssignment_0(), "rule__RuleCall__RuleAssignment_0");
					put(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_1(), "rule__RuleCall__ArgumentsAssignment_1_1");
					put(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_2_1(), "rule__RuleCall__ArgumentsAssignment_1_2_1");
					put(grammarAccess.getNamedArgumentAccess().getParameterAssignment_0_0(), "rule__NamedArgument__ParameterAssignment_0_0");
					put(grammarAccess.getNamedArgumentAccess().getCalledByNameAssignment_0_1(), "rule__NamedArgument__CalledByNameAssignment_0_1");
					put(grammarAccess.getNamedArgumentAccess().getValueAssignment_1(), "rule__NamedArgument__ValueAssignment_1");
					put(grammarAccess.getLiteralConditionAccess().getTrueAssignment_1_0(), "rule__LiteralCondition__TrueAssignment_1_0");
					put(grammarAccess.getDisjunctionAccess().getRightAssignment_1_2(), "rule__Disjunction__RightAssignment_1_2");
					put(grammarAccess.getConjunctionAccess().getRightAssignment_1_2(), "rule__Conjunction__RightAssignment_1_2");
					put(grammarAccess.getNegationAccess().getValueAssignment_1_2(), "rule__Negation__ValueAssignment_1_2");
					put(grammarAccess.getParameterReferenceAccess().getParameterAssignment(), "rule__ParameterReference__ParameterAssignment");
					put(grammarAccess.getTerminalRuleCallAccess().getRuleAssignment(), "rule__TerminalRuleCall__RuleAssignment");
					put(grammarAccess.getPredicatedKeywordAccess().getPredicatedAssignment_0_0(), "rule__PredicatedKeyword__PredicatedAssignment_0_0");
					put(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedAssignment_0_1(), "rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1");
					put(grammarAccess.getPredicatedKeywordAccess().getValueAssignment_1(), "rule__PredicatedKeyword__ValueAssignment_1");
					put(grammarAccess.getPredicatedRuleCallAccess().getPredicatedAssignment_0_0(), "rule__PredicatedRuleCall__PredicatedAssignment_0_0");
					put(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedAssignment_0_1(), "rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1");
					put(grammarAccess.getPredicatedRuleCallAccess().getRuleAssignment_1(), "rule__PredicatedRuleCall__RuleAssignment_1");
					put(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_1(), "rule__PredicatedRuleCall__ArgumentsAssignment_2_1");
					put(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_2_1(), "rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1");
					put(grammarAccess.getAssignmentAccess().getPredicatedAssignment_0_0(), "rule__Assignment__PredicatedAssignment_0_0");
					put(grammarAccess.getAssignmentAccess().getFirstSetPredicatedAssignment_0_1(), "rule__Assignment__FirstSetPredicatedAssignment_0_1");
					put(grammarAccess.getAssignmentAccess().getFeatureAssignment_1(), "rule__Assignment__FeatureAssignment_1");
					put(grammarAccess.getAssignmentAccess().getOperatorAssignment_2(), "rule__Assignment__OperatorAssignment_2");
					put(grammarAccess.getAssignmentAccess().getTerminalAssignment_3(), "rule__Assignment__TerminalAssignment_3");
					put(grammarAccess.getAssignableAlternativesAccess().getElementsAssignment_1_1_1(), "rule__AssignableAlternatives__ElementsAssignment_1_1_1");
					put(grammarAccess.getCrossReferenceAccess().getTypeAssignment_1(), "rule__CrossReference__TypeAssignment_1");
					put(grammarAccess.getCrossReferenceAccess().getTerminalAssignment_2_1(), "rule__CrossReference__TerminalAssignment_2_1");
					put(grammarAccess.getPredicatedGroupAccess().getPredicatedAssignment_0_0(), "rule__PredicatedGroup__PredicatedAssignment_0_0");
					put(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedAssignment_0_1(), "rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1");
					put(grammarAccess.getPredicatedGroupAccess().getElementsAssignment_2(), "rule__PredicatedGroup__ElementsAssignment_2");
					put(grammarAccess.getTerminalRuleAccess().getAnnotationsAssignment_0(), "rule__TerminalRule__AnnotationsAssignment_0");
					put(grammarAccess.getTerminalRuleAccess().getFragmentAssignment_2_0_0(), "rule__TerminalRule__FragmentAssignment_2_0_0");
					put(grammarAccess.getTerminalRuleAccess().getNameAssignment_2_0_1(), "rule__TerminalRule__NameAssignment_2_0_1");
					put(grammarAccess.getTerminalRuleAccess().getNameAssignment_2_1_0(), "rule__TerminalRule__NameAssignment_2_1_0");
					put(grammarAccess.getTerminalRuleAccess().getTypeAssignment_2_1_1_1(), "rule__TerminalRule__TypeAssignment_2_1_1_1");
					put(grammarAccess.getTerminalRuleAccess().getAlternativesAssignment_4(), "rule__TerminalRule__AlternativesAssignment_4");
					put(grammarAccess.getTerminalAlternativesAccess().getElementsAssignment_1_1_1(), "rule__TerminalAlternatives__ElementsAssignment_1_1_1");
					put(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1(), "rule__TerminalGroup__ElementsAssignment_1_1");
					put(grammarAccess.getTerminalTokenAccess().getCardinalityAssignment_1(), "rule__TerminalToken__CardinalityAssignment_1");
					put(grammarAccess.getNegatedTokenAccess().getTerminalAssignment_1(), "rule__NegatedToken__TerminalAssignment_1");
					put(grammarAccess.getUntilTokenAccess().getTerminalAssignment_1(), "rule__UntilToken__TerminalAssignment_1");
					put(grammarAccess.getCharacterRangeAccess().getRightAssignment_1_2(), "rule__CharacterRange__RightAssignment_1_2");
					put(grammarAccess.getEnumRuleAccess().getAnnotationsAssignment_0(), "rule__EnumRule__AnnotationsAssignment_0");
					put(grammarAccess.getEnumRuleAccess().getNameAssignment_2(), "rule__EnumRule__NameAssignment_2");
					put(grammarAccess.getEnumRuleAccess().getTypeAssignment_3_1(), "rule__EnumRule__TypeAssignment_3_1");
					put(grammarAccess.getEnumRuleAccess().getAlternativesAssignment_5(), "rule__EnumRule__AlternativesAssignment_5");
					put(grammarAccess.getEnumLiteralsAccess().getElementsAssignment_1_1_1(), "rule__EnumLiterals__ElementsAssignment_1_1_1");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralAssignment_0(), "rule__EnumLiteralDeclaration__EnumLiteralAssignment_0");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralAssignment_1_1(), "rule__EnumLiteralDeclaration__LiteralAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MacrosLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MacrosLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
