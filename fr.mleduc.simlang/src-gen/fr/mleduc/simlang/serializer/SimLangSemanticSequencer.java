/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang.serializer;

import com.google.inject.Inject;
import fr.mleduc.simlang.services.SimLangGrammarAccess;
import fr.mleduc.simlang.simLang.AcceptCmd;
import fr.mleduc.simlang.simLang.AutomataDef;
import fr.mleduc.simlang.simLang.CondStmt;
import fr.mleduc.simlang.simLang.DropCmd;
import fr.mleduc.simlang.simLang.IterStmt;
import fr.mleduc.simlang.simLang.NopCmd;
import fr.mleduc.simlang.simLang.Program;
import fr.mleduc.simlang.simLang.SimLangPackage;
import fr.mleduc.simlang.simLang.State;
import fr.mleduc.simlang.simLang.Transition;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public class SimLangSemanticSequencer extends XbaseSemanticSequencer {

	@Inject
	private SimLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SimLangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimLangPackage.ACCEPT_CMD:
				sequence_XPrimaryExpression(context, (AcceptCmd) semanticObject); 
				return; 
			case SimLangPackage.AUTOMATA_DEF:
				sequence_AutomataDef(context, (AutomataDef) semanticObject); 
				return; 
			case SimLangPackage.COND_STMT:
				sequence_XPrimaryExpression(context, (CondStmt) semanticObject); 
				return; 
			case SimLangPackage.DROP_CMD:
				sequence_XPrimaryExpression(context, (DropCmd) semanticObject); 
				return; 
			case SimLangPackage.ITER_STMT:
				sequence_XPrimaryExpression(context, (IterStmt) semanticObject); 
				return; 
			case SimLangPackage.NOP_CMD:
				sequence_Cmd(context, (NopCmd) semanticObject); 
				return; 
			case SimLangPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case SimLangPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case SimLangPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if (rule == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if (rule == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if (action == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()) {
					sequence_JvmParameterizedTypeReference_JvmInnerTypeReference_1_4_0_0_0(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmTypeReferenceRule()
						|| action == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()
						|| rule == grammarAccess.getJvmParameterizedTypeReferenceRule()
						|| rule == grammarAccess.getJvmArgumentTypeReferenceRule()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if (rule == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if (epackage == XbasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
				return; 
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XBINARY_OPERATION:
				sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
				return; 
			case XbasePackage.XBLOCK_EXPRESSION:
				if (rule == grammarAccess.getRootBlockExpressionRule()) {
					sequence_RootBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXbaseXPrimaryExpressionRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXBlockExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
				return; 
			case XbasePackage.XCASE_PART:
				sequence_XCasePart(context, (XCasePart) semanticObject); 
				return; 
			case XbasePackage.XCASTED_EXPRESSION:
				sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
				return; 
			case XbasePackage.XCATCH_CLAUSE:
				sequence_XCatchClause(context, (XCatchClause) semanticObject); 
				return; 
			case XbasePackage.XCLOSURE:
				if (rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXbaseXPrimaryExpressionRule()
						|| rule == grammarAccess.getXLiteralRule()
						|| rule == grammarAccess.getXClosureRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
				return; 
			case XbasePackage.XDO_WHILE_EXPRESSION:
				sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
				return; 
			case XbasePackage.XFEATURE_CALL:
				sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XIF_EXPRESSION:
				sequence_XIfExpression(context, (XIfExpression) semanticObject); 
				return; 
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
				return; 
			case XbasePackage.XLIST_LITERAL:
				sequence_XListLiteral(context, (XListLiteral) semanticObject); 
				return; 
			case XbasePackage.XMEMBER_FEATURE_CALL:
				sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XNULL_LITERAL:
				sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
				return; 
			case XbasePackage.XNUMBER_LITERAL:
				sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
				return; 
			case XbasePackage.XPOSTFIX_OPERATION:
				sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
				return; 
			case XbasePackage.XRETURN_EXPRESSION:
				sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
				return; 
			case XbasePackage.XSET_LITERAL:
				sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
				return; 
			case XbasePackage.XSTRING_LITERAL:
				sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
				return; 
			case XbasePackage.XSWITCH_EXPRESSION:
				sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
				return; 
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
				return; 
			case XbasePackage.XTHROW_EXPRESSION:
				sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
				return; 
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
				return; 
			case XbasePackage.XTYPE_LITERAL:
				sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
				return; 
			case XbasePackage.XUNARY_OPERATION:
				sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
				return; 
			case XbasePackage.XVARIABLE_DECLARATION:
				sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
				return; 
			case XbasePackage.XWHILE_EXPRESSION:
				sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
				return; 
			}
		else if (epackage == XtypePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AutomataDef returns AutomataDef
	 *
	 * Constraint:
	 *     (name=ID init=[State|ID] states+=State)
	 */
	protected void sequence_AutomataDef(ISerializationContext context, AutomataDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XPrimaryExpression returns NopCmd
	 *     Cmd returns NopCmd
	 *     XExpression returns NopCmd
	 *     XAssignment returns NopCmd
	 *     XAssignment.XBinaryOperation_1_1_0_0_0 returns NopCmd
	 *     XOrExpression returns NopCmd
	 *     XOrExpression.XBinaryOperation_1_0_0_0 returns NopCmd
	 *     XAndExpression returns NopCmd
	 *     XAndExpression.XBinaryOperation_1_0_0_0 returns NopCmd
	 *     XEqualityExpression returns NopCmd
	 *     XEqualityExpression.XBinaryOperation_1_0_0_0 returns NopCmd
	 *     XRelationalExpression returns NopCmd
	 *     XRelationalExpression.XInstanceOfExpression_1_0_0_0_0 returns NopCmd
	 *     XRelationalExpression.XBinaryOperation_1_1_0_0_0 returns NopCmd
	 *     XOtherOperatorExpression returns NopCmd
	 *     XOtherOperatorExpression.XBinaryOperation_1_0_0_0 returns NopCmd
	 *     XAdditiveExpression returns NopCmd
	 *     XAdditiveExpression.XBinaryOperation_1_0_0_0 returns NopCmd
	 *     XMultiplicativeExpression returns NopCmd
	 *     XMultiplicativeExpression.XBinaryOperation_1_0_0_0 returns NopCmd
	 *     XUnaryOperation returns NopCmd
	 *     XCastedExpression returns NopCmd
	 *     XCastedExpression.XCastedExpression_1_0_0_0 returns NopCmd
	 *     XPostfixOperation returns NopCmd
	 *     XPostfixOperation.XPostfixOperation_1_0_0 returns NopCmd
	 *     XMemberFeatureCall returns NopCmd
	 *     XMemberFeatureCall.XAssignment_1_0_0_0_0 returns NopCmd
	 *     XMemberFeatureCall.XMemberFeatureCall_1_1_0_0_0 returns NopCmd
	 *     XPrimaryExpression returns NopCmd
	 *     XParenthesizedExpression returns NopCmd
	 *     XExpressionOrVarDeclaration returns NopCmd
	 *
	 * Constraint:
	 *     {NopCmd}
	 */
	protected void sequence_Cmd(ISerializationContext context, NopCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (name=QualifiedName automatas+=AutomataDef? init=RootBlockExpression? body=RootBlockExpression)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootBlockExpression returns XBlockExpression
	 *
	 * Constraint:
	 *     expressions+=XExpressionOrVarDeclaration*
	 */
	protected void sequence_RootBlockExpression(ISerializationContext context, XBlockExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID transitions+=Transition*)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (event=ID target=[State|ID])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimLangPackage.Literals.TRANSITION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimLangPackage.Literals.TRANSITION__EVENT));
			if (transientValues.isValueTransient(semanticObject, SimLangPackage.Literals.TRANSITION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimLangPackage.Literals.TRANSITION__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionAccess().getEventIDTerminalRuleCall_1_0(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_3_0_1(), semanticObject.eGet(SimLangPackage.Literals.TRANSITION__TARGET, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XPrimaryExpression returns AcceptCmd
	 *     XExpression returns AcceptCmd
	 *     XAssignment returns AcceptCmd
	 *     XAssignment.XBinaryOperation_1_1_0_0_0 returns AcceptCmd
	 *     XOrExpression returns AcceptCmd
	 *     XOrExpression.XBinaryOperation_1_0_0_0 returns AcceptCmd
	 *     XAndExpression returns AcceptCmd
	 *     XAndExpression.XBinaryOperation_1_0_0_0 returns AcceptCmd
	 *     XEqualityExpression returns AcceptCmd
	 *     XEqualityExpression.XBinaryOperation_1_0_0_0 returns AcceptCmd
	 *     XRelationalExpression returns AcceptCmd
	 *     XRelationalExpression.XInstanceOfExpression_1_0_0_0_0 returns AcceptCmd
	 *     XRelationalExpression.XBinaryOperation_1_1_0_0_0 returns AcceptCmd
	 *     XOtherOperatorExpression returns AcceptCmd
	 *     XOtherOperatorExpression.XBinaryOperation_1_0_0_0 returns AcceptCmd
	 *     XAdditiveExpression returns AcceptCmd
	 *     XAdditiveExpression.XBinaryOperation_1_0_0_0 returns AcceptCmd
	 *     XMultiplicativeExpression returns AcceptCmd
	 *     XMultiplicativeExpression.XBinaryOperation_1_0_0_0 returns AcceptCmd
	 *     XUnaryOperation returns AcceptCmd
	 *     XCastedExpression returns AcceptCmd
	 *     XCastedExpression.XCastedExpression_1_0_0_0 returns AcceptCmd
	 *     XPostfixOperation returns AcceptCmd
	 *     XPostfixOperation.XPostfixOperation_1_0_0 returns AcceptCmd
	 *     XMemberFeatureCall returns AcceptCmd
	 *     XMemberFeatureCall.XAssignment_1_0_0_0_0 returns AcceptCmd
	 *     XMemberFeatureCall.XMemberFeatureCall_1_1_0_0_0 returns AcceptCmd
	 *     XPrimaryExpression returns AcceptCmd
	 *     XParenthesizedExpression returns AcceptCmd
	 *     XExpressionOrVarDeclaration returns AcceptCmd
	 *
	 * Constraint:
	 *     {AcceptCmd}
	 */
	protected void sequence_XPrimaryExpression(ISerializationContext context, AcceptCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XPrimaryExpression returns CondStmt
	 *     XExpression returns CondStmt
	 *     XAssignment returns CondStmt
	 *     XAssignment.XBinaryOperation_1_1_0_0_0 returns CondStmt
	 *     XOrExpression returns CondStmt
	 *     XOrExpression.XBinaryOperation_1_0_0_0 returns CondStmt
	 *     XAndExpression returns CondStmt
	 *     XAndExpression.XBinaryOperation_1_0_0_0 returns CondStmt
	 *     XEqualityExpression returns CondStmt
	 *     XEqualityExpression.XBinaryOperation_1_0_0_0 returns CondStmt
	 *     XRelationalExpression returns CondStmt
	 *     XRelationalExpression.XInstanceOfExpression_1_0_0_0_0 returns CondStmt
	 *     XRelationalExpression.XBinaryOperation_1_1_0_0_0 returns CondStmt
	 *     XOtherOperatorExpression returns CondStmt
	 *     XOtherOperatorExpression.XBinaryOperation_1_0_0_0 returns CondStmt
	 *     XAdditiveExpression returns CondStmt
	 *     XAdditiveExpression.XBinaryOperation_1_0_0_0 returns CondStmt
	 *     XMultiplicativeExpression returns CondStmt
	 *     XMultiplicativeExpression.XBinaryOperation_1_0_0_0 returns CondStmt
	 *     XUnaryOperation returns CondStmt
	 *     XCastedExpression returns CondStmt
	 *     XCastedExpression.XCastedExpression_1_0_0_0 returns CondStmt
	 *     XPostfixOperation returns CondStmt
	 *     XPostfixOperation.XPostfixOperation_1_0_0 returns CondStmt
	 *     XMemberFeatureCall returns CondStmt
	 *     XMemberFeatureCall.XAssignment_1_0_0_0_0 returns CondStmt
	 *     XMemberFeatureCall.XMemberFeatureCall_1_1_0_0_0 returns CondStmt
	 *     XPrimaryExpression returns CondStmt
	 *     XParenthesizedExpression returns CondStmt
	 *     XExpressionOrVarDeclaration returns CondStmt
	 *
	 * Constraint:
	 *     (if=XExpression then=XExpression)
	 */
	protected void sequence_XPrimaryExpression(ISerializationContext context, CondStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimLangPackage.Literals.COND_STMT__IF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimLangPackage.Literals.COND_STMT__IF));
			if (transientValues.isValueTransient(semanticObject, SimLangPackage.Literals.COND_STMT__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimLangPackage.Literals.COND_STMT__THEN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXPrimaryExpressionAccess().getIfXExpressionParserRuleCall_1_3_0(), semanticObject.getIf());
		feeder.accept(grammarAccess.getXPrimaryExpressionAccess().getThenXExpressionParserRuleCall_1_5_0(), semanticObject.getThen());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XPrimaryExpression returns DropCmd
	 *     XExpression returns DropCmd
	 *     XAssignment returns DropCmd
	 *     XAssignment.XBinaryOperation_1_1_0_0_0 returns DropCmd
	 *     XOrExpression returns DropCmd
	 *     XOrExpression.XBinaryOperation_1_0_0_0 returns DropCmd
	 *     XAndExpression returns DropCmd
	 *     XAndExpression.XBinaryOperation_1_0_0_0 returns DropCmd
	 *     XEqualityExpression returns DropCmd
	 *     XEqualityExpression.XBinaryOperation_1_0_0_0 returns DropCmd
	 *     XRelationalExpression returns DropCmd
	 *     XRelationalExpression.XInstanceOfExpression_1_0_0_0_0 returns DropCmd
	 *     XRelationalExpression.XBinaryOperation_1_1_0_0_0 returns DropCmd
	 *     XOtherOperatorExpression returns DropCmd
	 *     XOtherOperatorExpression.XBinaryOperation_1_0_0_0 returns DropCmd
	 *     XAdditiveExpression returns DropCmd
	 *     XAdditiveExpression.XBinaryOperation_1_0_0_0 returns DropCmd
	 *     XMultiplicativeExpression returns DropCmd
	 *     XMultiplicativeExpression.XBinaryOperation_1_0_0_0 returns DropCmd
	 *     XUnaryOperation returns DropCmd
	 *     XCastedExpression returns DropCmd
	 *     XCastedExpression.XCastedExpression_1_0_0_0 returns DropCmd
	 *     XPostfixOperation returns DropCmd
	 *     XPostfixOperation.XPostfixOperation_1_0_0 returns DropCmd
	 *     XMemberFeatureCall returns DropCmd
	 *     XMemberFeatureCall.XAssignment_1_0_0_0_0 returns DropCmd
	 *     XMemberFeatureCall.XMemberFeatureCall_1_1_0_0_0 returns DropCmd
	 *     XPrimaryExpression returns DropCmd
	 *     XParenthesizedExpression returns DropCmd
	 *     XExpressionOrVarDeclaration returns DropCmd
	 *
	 * Constraint:
	 *     {DropCmd}
	 */
	protected void sequence_XPrimaryExpression(ISerializationContext context, DropCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XPrimaryExpression returns IterStmt
	 *     XExpression returns IterStmt
	 *     XAssignment returns IterStmt
	 *     XAssignment.XBinaryOperation_1_1_0_0_0 returns IterStmt
	 *     XOrExpression returns IterStmt
	 *     XOrExpression.XBinaryOperation_1_0_0_0 returns IterStmt
	 *     XAndExpression returns IterStmt
	 *     XAndExpression.XBinaryOperation_1_0_0_0 returns IterStmt
	 *     XEqualityExpression returns IterStmt
	 *     XEqualityExpression.XBinaryOperation_1_0_0_0 returns IterStmt
	 *     XRelationalExpression returns IterStmt
	 *     XRelationalExpression.XInstanceOfExpression_1_0_0_0_0 returns IterStmt
	 *     XRelationalExpression.XBinaryOperation_1_1_0_0_0 returns IterStmt
	 *     XOtherOperatorExpression returns IterStmt
	 *     XOtherOperatorExpression.XBinaryOperation_1_0_0_0 returns IterStmt
	 *     XAdditiveExpression returns IterStmt
	 *     XAdditiveExpression.XBinaryOperation_1_0_0_0 returns IterStmt
	 *     XMultiplicativeExpression returns IterStmt
	 *     XMultiplicativeExpression.XBinaryOperation_1_0_0_0 returns IterStmt
	 *     XUnaryOperation returns IterStmt
	 *     XCastedExpression returns IterStmt
	 *     XCastedExpression.XCastedExpression_1_0_0_0 returns IterStmt
	 *     XPostfixOperation returns IterStmt
	 *     XPostfixOperation.XPostfixOperation_1_0_0 returns IterStmt
	 *     XMemberFeatureCall returns IterStmt
	 *     XMemberFeatureCall.XAssignment_1_0_0_0_0 returns IterStmt
	 *     XMemberFeatureCall.XMemberFeatureCall_1_1_0_0_0 returns IterStmt
	 *     XPrimaryExpression returns IterStmt
	 *     XParenthesizedExpression returns IterStmt
	 *     XExpressionOrVarDeclaration returns IterStmt
	 *
	 * Constraint:
	 *     (exp=XExpression body=XExpression)
	 */
	protected void sequence_XPrimaryExpression(ISerializationContext context, IterStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimLangPackage.Literals.ITER_STMT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimLangPackage.Literals.ITER_STMT__EXP));
			if (transientValues.isValueTransient(semanticObject, SimLangPackage.Literals.ITER_STMT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimLangPackage.Literals.ITER_STMT__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXPrimaryExpressionAccess().getExpXExpressionParserRuleCall_2_3_0(), semanticObject.getExp());
		feeder.accept(grammarAccess.getXPrimaryExpressionAccess().getBodyXExpressionParserRuleCall_2_5_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
}
