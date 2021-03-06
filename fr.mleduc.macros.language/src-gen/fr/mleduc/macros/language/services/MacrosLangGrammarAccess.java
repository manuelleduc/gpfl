/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.macros.language.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.services.XtextGrammarAccess;

@Singleton
public class MacrosLangGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.mleduc.macros.language.MacrosLang.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLanguageKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPathAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cPathGrammarCrossReference_3_0 = (CrossReference)cPathAssignment_3.eContents().get(0);
		private final RuleCall cPathGrammarGrammarIDParserRuleCall_3_0_1 = (RuleCall)cPathGrammarCrossReference_3_0.eContents().get(1);
		
		//Model:
		//	'package' name=ID
		//	'language' path=[xtext::Grammar|GrammarID];
		@Override public ParserRule getRule() { return rule; }
		
		//'package' name=ID 'language' path=[xtext::Grammar|GrammarID]
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'language'
		public Keyword getLanguageKeyword_2() { return cLanguageKeyword_2; }
		
		//path=[xtext::Grammar|GrammarID]
		public Assignment getPathAssignment_3() { return cPathAssignment_3; }
		
		//[xtext::Grammar|GrammarID]
		public CrossReference getPathGrammarCrossReference_3_0() { return cPathGrammarCrossReference_3_0; }
		
		//GrammarID
		public RuleCall getPathGrammarGrammarIDParserRuleCall_3_0_1() { return cPathGrammarGrammarIDParserRuleCall_3_0_1; }
	}
	
	
	private final ModelElements pModel;
	
	private final Grammar grammar;
	
	private final XtextGrammarAccess gaXtext;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MacrosLangGrammarAccess(GrammarProvider grammarProvider,
			XtextGrammarAccess gaXtext,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaXtext = gaXtext;
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.mleduc.macros.language.MacrosLang".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public XtextGrammarAccess getXtextGrammarAccess() {
		return gaXtext;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	'package' name=ID
	//	'language' path=[xtext::Grammar|GrammarID];
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Grammar:
	//	'grammar' name=GrammarID ('with' usedGrammars+=[Grammar|GrammarID] (',' usedGrammars+=[Grammar|GrammarID])*)?
	//	(definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule|RuleID] (',' hiddenTokens+=[AbstractRule|RuleID])*)?
	//	')')?
	//	metamodelDeclarations+=AbstractMetamodelDeclaration*
	//	rules+=AbstractRule+;
	public XtextGrammarAccess.GrammarElements getGrammarAccess() {
		return gaXtext.getGrammarAccess();
	}
	
	public ParserRule getGrammarRule() {
		return getGrammarAccess().getRule();
	}
	
	//GrammarID:
	//	ValidID ('.' ValidID)*;
	public XtextGrammarAccess.GrammarIDElements getGrammarIDAccess() {
		return gaXtext.getGrammarIDAccess();
	}
	
	public ParserRule getGrammarIDRule() {
		return getGrammarIDAccess().getRule();
	}
	
	//AbstractRule:
	//	ParserRule | TerminalRule | EnumRule;
	public XtextGrammarAccess.AbstractRuleElements getAbstractRuleAccess() {
		return gaXtext.getAbstractRuleAccess();
	}
	
	public ParserRule getAbstractRuleRule() {
		return getAbstractRuleAccess().getRule();
	}
	
	//AbstractMetamodelDeclaration:
	//	GeneratedMetamodel | ReferencedMetamodel;
	public XtextGrammarAccess.AbstractMetamodelDeclarationElements getAbstractMetamodelDeclarationAccess() {
		return gaXtext.getAbstractMetamodelDeclarationAccess();
	}
	
	public ParserRule getAbstractMetamodelDeclarationRule() {
		return getAbstractMetamodelDeclarationAccess().getRule();
	}
	
	//// constraint: typeSelect(GeneratedMetamodel).size() == typeSelect(GeneratedMetamodel).alias.size()
	//// generated metamodels have to have different aliases
	//GeneratedMetamodel:
	//	'generate' name=ValidID ePackage=[ecore::EPackage|STRING] ('as' alias=ValidID)?;
	public XtextGrammarAccess.GeneratedMetamodelElements getGeneratedMetamodelAccess() {
		return gaXtext.getGeneratedMetamodelAccess();
	}
	
	public ParserRule getGeneratedMetamodelRule() {
		return getGeneratedMetamodelAccess().getRule();
	}
	
	//// referenced metamodels may share aliases with other referenced metamodels
	//// and with generated metamodels
	//ReferencedMetamodel:
	//	'import' ePackage=[ecore::EPackage|STRING] ('as' alias=ValidID)?;
	public XtextGrammarAccess.ReferencedMetamodelElements getReferencedMetamodelAccess() {
		return gaXtext.getReferencedMetamodelAccess();
	}
	
	public ParserRule getReferencedMetamodelRule() {
		return getReferencedMetamodelAccess().getRule();
	}
	
	////fragment Alias returns AbstractMetamodelDeclaration:
	////	'as' alias=ValidID
	////;
	//Annotation:
	//	'@' name=ID;
	public XtextGrammarAccess.AnnotationElements getAnnotationAccess() {
		return gaXtext.getAnnotationAccess();
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}
	
	//ParserRule:
	//	annotations+=Annotation? (^fragment?='fragment' RuleNameAndParams (wildcard?='*' | ('returns' type=TypeRef)?) |
	//	RuleNameAndParams ('returns' type=TypeRef)?) (definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule|RuleID]
	//	(',' hiddenTokens+=[AbstractRule|RuleID])*)? ')')? ':'
	//	alternatives=Alternatives
	//	';';
	public XtextGrammarAccess.ParserRuleElements getParserRuleAccess() {
		return gaXtext.getParserRuleAccess();
	}
	
	public ParserRule getParserRuleRule() {
		return getParserRuleAccess().getRule();
	}
	
	//fragment RuleNameAndParams returns ParserRule:
	//	name=ValidID ('<' (parameters+=Parameter (',' parameters+=Parameter)*)? '>')?;
	public XtextGrammarAccess.RuleNameAndParamsElements getRuleNameAndParamsAccess() {
		return gaXtext.getRuleNameAndParamsAccess();
	}
	
	public ParserRule getRuleNameAndParamsRule() {
		return getRuleNameAndParamsAccess().getRule();
	}
	
	//Parameter:
	//	name=ID;
	public XtextGrammarAccess.ParameterElements getParameterAccess() {
		return gaXtext.getParameterAccess();
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//TypeRef:
	//	(metamodel=[AbstractMetamodelDeclaration] '::')? classifier=[ecore::EClassifier];
	public XtextGrammarAccess.TypeRefElements getTypeRefAccess() {
		return gaXtext.getTypeRefAccess();
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}
	
	//Alternatives AbstractElement:
	//	ConditionalBranch ({Alternatives.elements+=current} ('|' elements+=ConditionalBranch)+)?;
	public XtextGrammarAccess.AlternativesElements getAlternativesAccess() {
		return gaXtext.getAlternativesAccess();
	}
	
	public ParserRule getAlternativesRule() {
		return getAlternativesAccess().getRule();
	}
	
	//ConditionalBranch AbstractElement:
	//	UnorderedGroup
	//	| {Group} '<' guardCondition=Disjunction '>' elements+=AbstractToken+;
	public XtextGrammarAccess.ConditionalBranchElements getConditionalBranchAccess() {
		return gaXtext.getConditionalBranchAccess();
	}
	
	public ParserRule getConditionalBranchRule() {
		return getConditionalBranchAccess().getRule();
	}
	
	//UnorderedGroup AbstractElement:
	//	Group ({UnorderedGroup.elements+=current} ('&' elements+=Group)+)?;
	public XtextGrammarAccess.UnorderedGroupElements getUnorderedGroupAccess() {
		return gaXtext.getUnorderedGroupAccess();
	}
	
	public ParserRule getUnorderedGroupRule() {
		return getUnorderedGroupAccess().getRule();
	}
	
	//Group AbstractElement:
	//	AbstractToken ({Group.elements+=current} elements+=AbstractToken+)?;
	public XtextGrammarAccess.GroupElements getGroupAccess() {
		return gaXtext.getGroupAccess();
	}
	
	public ParserRule getGroupRule() {
		return getGroupAccess().getRule();
	}
	
	//AbstractToken AbstractElement:
	//	AbstractTokenWithCardinality | Action;
	public XtextGrammarAccess.AbstractTokenElements getAbstractTokenAccess() {
		return gaXtext.getAbstractTokenAccess();
	}
	
	public ParserRule getAbstractTokenRule() {
		return getAbstractTokenAccess().getRule();
	}
	
	///* SuppressWarnings[potentialOverride]: Handled in CardinalityAwareEcoreFactory */ AbstractTokenWithCardinality
	//AbstractElement:
	//	(Assignment | AbstractTerminal) cardinality=('?' | '*' | '+')?;
	public XtextGrammarAccess.AbstractTokenWithCardinalityElements getAbstractTokenWithCardinalityAccess() {
		return gaXtext.getAbstractTokenWithCardinalityAccess();
	}
	
	public ParserRule getAbstractTokenWithCardinalityRule() {
		return getAbstractTokenWithCardinalityAccess().getRule();
	}
	
	//Action:
	//	'{' type=TypeRef ('.' feature=ValidID operator=('=' | '+=') 'current')? '}';
	public XtextGrammarAccess.ActionElements getActionAccess() {
		return gaXtext.getActionAccess();
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//AbstractTerminal AbstractElement:
	//	Keyword | RuleCall | ParenthesizedElement | PredicatedKeyword | PredicatedRuleCall | PredicatedGroup;
	public XtextGrammarAccess.AbstractTerminalElements getAbstractTerminalAccess() {
		return gaXtext.getAbstractTerminalAccess();
	}
	
	public ParserRule getAbstractTerminalRule() {
		return getAbstractTerminalAccess().getRule();
	}
	
	//Keyword:
	//	value=STRING;
	public XtextGrammarAccess.KeywordElements getKeywordAccess() {
		return gaXtext.getKeywordAccess();
	}
	
	public ParserRule getKeywordRule() {
		return getKeywordAccess().getRule();
	}
	
	//RuleCall:
	//	rule=[AbstractRule|RuleID] ('<' arguments+=NamedArgument (',' arguments+=NamedArgument)* '>')?;
	public XtextGrammarAccess.RuleCallElements getRuleCallAccess() {
		return gaXtext.getRuleCallAccess();
	}
	
	public ParserRule getRuleCallRule() {
		return getRuleCallAccess().getRule();
	}
	
	//NamedArgument:
	//	(parameter=[Parameter] calledByName?='=')?
	//	value=Disjunction;
	public XtextGrammarAccess.NamedArgumentElements getNamedArgumentAccess() {
		return gaXtext.getNamedArgumentAccess();
	}
	
	public ParserRule getNamedArgumentRule() {
		return getNamedArgumentAccess().getRule();
	}
	
	//LiteralCondition:
	//	{LiteralCondition} (true?='true' | 'false');
	public XtextGrammarAccess.LiteralConditionElements getLiteralConditionAccess() {
		return gaXtext.getLiteralConditionAccess();
	}
	
	public ParserRule getLiteralConditionRule() {
		return getLiteralConditionAccess().getRule();
	}
	
	//Disjunction Condition:
	//	Conjunction ({Disjunction.left=current} '|' right=Conjunction)*;
	public XtextGrammarAccess.DisjunctionElements getDisjunctionAccess() {
		return gaXtext.getDisjunctionAccess();
	}
	
	public ParserRule getDisjunctionRule() {
		return getDisjunctionAccess().getRule();
	}
	
	//Conjunction Condition:
	//	Negation ({Conjunction.left=current} '&' right=Negation)*;
	public XtextGrammarAccess.ConjunctionElements getConjunctionAccess() {
		return gaXtext.getConjunctionAccess();
	}
	
	public ParserRule getConjunctionRule() {
		return getConjunctionAccess().getRule();
	}
	
	//Negation Condition:
	//	Atom | {Negation} '!' value=Negation;
	public XtextGrammarAccess.NegationElements getNegationAccess() {
		return gaXtext.getNegationAccess();
	}
	
	public ParserRule getNegationRule() {
		return getNegationAccess().getRule();
	}
	
	//Atom Condition:
	//	ParameterReference | ParenthesizedCondition | LiteralCondition;
	public XtextGrammarAccess.AtomElements getAtomAccess() {
		return gaXtext.getAtomAccess();
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}
	
	//ParenthesizedCondition Condition:
	//	'(' Disjunction ')';
	public XtextGrammarAccess.ParenthesizedConditionElements getParenthesizedConditionAccess() {
		return gaXtext.getParenthesizedConditionAccess();
	}
	
	public ParserRule getParenthesizedConditionRule() {
		return getParenthesizedConditionAccess().getRule();
	}
	
	//ParameterReference:
	//	parameter=[Parameter];
	public XtextGrammarAccess.ParameterReferenceElements getParameterReferenceAccess() {
		return gaXtext.getParameterReferenceAccess();
	}
	
	public ParserRule getParameterReferenceRule() {
		return getParameterReferenceAccess().getRule();
	}
	
	//TerminalRuleCall RuleCall:
	//	rule=[AbstractRule|RuleID];
	public XtextGrammarAccess.TerminalRuleCallElements getTerminalRuleCallAccess() {
		return gaXtext.getTerminalRuleCallAccess();
	}
	
	public ParserRule getTerminalRuleCallRule() {
		return getTerminalRuleCallAccess().getRule();
	}
	
	//RuleID:
	//	ValidID ('::' ValidID)*;
	public XtextGrammarAccess.RuleIDElements getRuleIDAccess() {
		return gaXtext.getRuleIDAccess();
	}
	
	public ParserRule getRuleIDRule() {
		return getRuleIDAccess().getRule();
	}
	
	//ValidID:
	//	ID | 'true' | 'false';
	public XtextGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXtext.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}
	
	//PredicatedKeyword Keyword:
	//	(predicated?='=>' | firstSetPredicated?='->') value=STRING;
	public XtextGrammarAccess.PredicatedKeywordElements getPredicatedKeywordAccess() {
		return gaXtext.getPredicatedKeywordAccess();
	}
	
	public ParserRule getPredicatedKeywordRule() {
		return getPredicatedKeywordAccess().getRule();
	}
	
	//PredicatedRuleCall RuleCall:
	//	(predicated?='=>' | firstSetPredicated?='->') rule=[AbstractRule|RuleID] ('<' arguments+=NamedArgument (','
	//	arguments+=NamedArgument)* '>')?;
	public XtextGrammarAccess.PredicatedRuleCallElements getPredicatedRuleCallAccess() {
		return gaXtext.getPredicatedRuleCallAccess();
	}
	
	public ParserRule getPredicatedRuleCallRule() {
		return getPredicatedRuleCallAccess().getRule();
	}
	
	//Assignment:
	//	(predicated?='=>' | firstSetPredicated?='->')? feature=ValidID operator=('+=' | '=' | '?=')
	//	^terminal=AssignableTerminal;
	public XtextGrammarAccess.AssignmentElements getAssignmentAccess() {
		return gaXtext.getAssignmentAccess();
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//AssignableTerminal AbstractElement:
	//	Keyword | RuleCall | ParenthesizedAssignableElement | CrossReference;
	public XtextGrammarAccess.AssignableTerminalElements getAssignableTerminalAccess() {
		return gaXtext.getAssignableTerminalAccess();
	}
	
	public ParserRule getAssignableTerminalRule() {
		return getAssignableTerminalAccess().getRule();
	}
	
	//ParenthesizedAssignableElement AbstractElement:
	//	'(' AssignableAlternatives ')';
	public XtextGrammarAccess.ParenthesizedAssignableElementElements getParenthesizedAssignableElementAccess() {
		return gaXtext.getParenthesizedAssignableElementAccess();
	}
	
	public ParserRule getParenthesizedAssignableElementRule() {
		return getParenthesizedAssignableElementAccess().getRule();
	}
	
	//AssignableAlternatives AbstractElement:
	//	AssignableTerminal ({Alternatives.elements+=current} ('|' elements+=AssignableTerminal)+)?;
	public XtextGrammarAccess.AssignableAlternativesElements getAssignableAlternativesAccess() {
		return gaXtext.getAssignableAlternativesAccess();
	}
	
	public ParserRule getAssignableAlternativesRule() {
		return getAssignableAlternativesAccess().getRule();
	}
	
	//CrossReference:
	//	'[' type=TypeRef ('|' ^terminal=CrossReferenceableTerminal)? ']';
	public XtextGrammarAccess.CrossReferenceElements getCrossReferenceAccess() {
		return gaXtext.getCrossReferenceAccess();
	}
	
	public ParserRule getCrossReferenceRule() {
		return getCrossReferenceAccess().getRule();
	}
	
	//CrossReferenceableTerminal AbstractElement:
	//	Keyword | RuleCall;
	public XtextGrammarAccess.CrossReferenceableTerminalElements getCrossReferenceableTerminalAccess() {
		return gaXtext.getCrossReferenceableTerminalAccess();
	}
	
	public ParserRule getCrossReferenceableTerminalRule() {
		return getCrossReferenceableTerminalAccess().getRule();
	}
	
	//ParenthesizedElement AbstractElement:
	//	'(' Alternatives ')';
	public XtextGrammarAccess.ParenthesizedElementElements getParenthesizedElementAccess() {
		return gaXtext.getParenthesizedElementAccess();
	}
	
	public ParserRule getParenthesizedElementRule() {
		return getParenthesizedElementAccess().getRule();
	}
	
	//PredicatedGroup Group:
	//	(predicated?='=>' | firstSetPredicated?='->') '(' elements+=Alternatives ')';
	public XtextGrammarAccess.PredicatedGroupElements getPredicatedGroupAccess() {
		return gaXtext.getPredicatedGroupAccess();
	}
	
	public ParserRule getPredicatedGroupRule() {
		return getPredicatedGroupAccess().getRule();
	}
	
	//TerminalRule:
	//	annotations+=Annotation?
	//	'terminal' (^fragment?='fragment' name=ValidID | name=ValidID ('returns' type=TypeRef)?) ':'
	//	alternatives=TerminalAlternatives
	//	';';
	public XtextGrammarAccess.TerminalRuleElements getTerminalRuleAccess() {
		return gaXtext.getTerminalRuleAccess();
	}
	
	public ParserRule getTerminalRuleRule() {
		return getTerminalRuleAccess().getRule();
	}
	
	//TerminalAlternatives AbstractElement:
	//	TerminalGroup ({Alternatives.elements+=current} ('|' elements+=TerminalGroup)+)?;
	public XtextGrammarAccess.TerminalAlternativesElements getTerminalAlternativesAccess() {
		return gaXtext.getTerminalAlternativesAccess();
	}
	
	public ParserRule getTerminalAlternativesRule() {
		return getTerminalAlternativesAccess().getRule();
	}
	
	//TerminalGroup AbstractElement:
	//	TerminalToken ({Group.elements+=current} elements+=TerminalToken+)?;
	public XtextGrammarAccess.TerminalGroupElements getTerminalGroupAccess() {
		return gaXtext.getTerminalGroupAccess();
	}
	
	public ParserRule getTerminalGroupRule() {
		return getTerminalGroupAccess().getRule();
	}
	
	///* SuppressWarnings[potentialOverride]: Handled in CardinalityAwareEcoreFactory */ TerminalToken AbstractElement:
	//	TerminalTokenElement cardinality=('?' | '*' | '+')?;
	public XtextGrammarAccess.TerminalTokenElements getTerminalTokenAccess() {
		return gaXtext.getTerminalTokenAccess();
	}
	
	public ParserRule getTerminalTokenRule() {
		return getTerminalTokenAccess().getRule();
	}
	
	//TerminalTokenElement AbstractElement:
	//	CharacterRange | TerminalRuleCall | ParenthesizedTerminalElement | AbstractNegatedToken | Wildcard | ^EOF;
	public XtextGrammarAccess.TerminalTokenElementElements getTerminalTokenElementAccess() {
		return gaXtext.getTerminalTokenElementAccess();
	}
	
	public ParserRule getTerminalTokenElementRule() {
		return getTerminalTokenElementAccess().getRule();
	}
	
	//ParenthesizedTerminalElement AbstractElement:
	//	'(' TerminalAlternatives ')';
	public XtextGrammarAccess.ParenthesizedTerminalElementElements getParenthesizedTerminalElementAccess() {
		return gaXtext.getParenthesizedTerminalElementAccess();
	}
	
	public ParserRule getParenthesizedTerminalElementRule() {
		return getParenthesizedTerminalElementAccess().getRule();
	}
	
	//AbstractNegatedToken:
	//	NegatedToken | UntilToken;
	public XtextGrammarAccess.AbstractNegatedTokenElements getAbstractNegatedTokenAccess() {
		return gaXtext.getAbstractNegatedTokenAccess();
	}
	
	public ParserRule getAbstractNegatedTokenRule() {
		return getAbstractNegatedTokenAccess().getRule();
	}
	
	//NegatedToken:
	//	'!' ^terminal=TerminalTokenElement;
	public XtextGrammarAccess.NegatedTokenElements getNegatedTokenAccess() {
		return gaXtext.getNegatedTokenAccess();
	}
	
	public ParserRule getNegatedTokenRule() {
		return getNegatedTokenAccess().getRule();
	}
	
	//UntilToken:
	//	'->' ^terminal=TerminalTokenElement;
	public XtextGrammarAccess.UntilTokenElements getUntilTokenAccess() {
		return gaXtext.getUntilTokenAccess();
	}
	
	public ParserRule getUntilTokenRule() {
		return getUntilTokenAccess().getRule();
	}
	
	//Wildcard:
	//	{Wildcard} '.';
	public XtextGrammarAccess.WildcardElements getWildcardAccess() {
		return gaXtext.getWildcardAccess();
	}
	
	public ParserRule getWildcardRule() {
		return getWildcardAccess().getRule();
	}
	
	//^EOF:
	//	{^EOF} 'EOF';
	public XtextGrammarAccess.EOFElements getEOFAccess() {
		return gaXtext.getEOFAccess();
	}
	
	public ParserRule getEOFRule() {
		return getEOFAccess().getRule();
	}
	
	//CharacterRange AbstractElement:
	//	Keyword ({CharacterRange.left=current} '..' right=Keyword)?;
	public XtextGrammarAccess.CharacterRangeElements getCharacterRangeAccess() {
		return gaXtext.getCharacterRangeAccess();
	}
	
	public ParserRule getCharacterRangeRule() {
		return getCharacterRangeAccess().getRule();
	}
	
	//EnumRule:
	//	annotations+=Annotation?
	//	'enum' name=ValidID ('returns' type=TypeRef)? ':'
	//	alternatives=EnumLiterals
	//	';';
	public XtextGrammarAccess.EnumRuleElements getEnumRuleAccess() {
		return gaXtext.getEnumRuleAccess();
	}
	
	public ParserRule getEnumRuleRule() {
		return getEnumRuleAccess().getRule();
	}
	
	//EnumLiterals AbstractElement:
	//	EnumLiteralDeclaration ({Alternatives.elements+=current} ('|' elements+=EnumLiteralDeclaration)+)?;
	public XtextGrammarAccess.EnumLiteralsElements getEnumLiteralsAccess() {
		return gaXtext.getEnumLiteralsAccess();
	}
	
	public ParserRule getEnumLiteralsRule() {
		return getEnumLiteralsAccess().getRule();
	}
	
	//EnumLiteralDeclaration:
	//	enumLiteral=[ecore::EEnumLiteral] ('=' literal=Keyword)?;
	public XtextGrammarAccess.EnumLiteralDeclarationElements getEnumLiteralDeclarationAccess() {
		return gaXtext.getEnumLiteralDeclarationAccess();
	}
	
	public ParserRule getEnumLiteralDeclarationRule() {
		return getEnumLiteralDeclarationAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
