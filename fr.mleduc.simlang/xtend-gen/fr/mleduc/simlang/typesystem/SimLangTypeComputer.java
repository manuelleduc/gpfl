package fr.mleduc.simlang.typesystem;

import fr.mleduc.simlang.simLang.CondStmt;
import fr.mleduc.simlang.simLang.IterStmt;
import java.util.Arrays;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer;

@SuppressWarnings("all")
public class SimLangTypeComputer extends XbaseTypeComputer {
  protected void _computeTypes(final CondStmt expression, final ITypeComputationState state) {
    state.withExpectation(this.getRawTypeForName(Boolean.class, state)).computeTypes(expression.getIf());
    final XExpression thenExpression = expression.getThen();
    final ITypeComputationState thenState = this.reassignCheckedType(expression.getIf(), thenExpression, state);
    thenState.computeTypes(thenExpression);
  }
  
  protected void _computeTypes(final IterStmt expression, final ITypeComputationState state) {
    state.withExpectation(this.getRawTypeForName(Long.class, state)).computeTypes(expression.getExp());
    final ITypeComputationState bodyState = this.reassignCheckedType(expression.getExp(), expression.getBody(), state.withoutExpectation());
    bodyState.computeTypes(expression.getBody());
  }
  
  public void computeTypes(final XExpression expression, final ITypeComputationState state) {
    if (expression instanceof XAssignment) {
      _computeTypes((XAssignment)expression, state);
      return;
    } else if (expression instanceof XDoWhileExpression) {
      _computeTypes((XDoWhileExpression)expression, state);
      return;
    } else if (expression instanceof XListLiteral) {
      _computeTypes((XListLiteral)expression, state);
      return;
    } else if (expression instanceof XSetLiteral) {
      _computeTypes((XSetLiteral)expression, state);
      return;
    } else if (expression instanceof XWhileExpression) {
      _computeTypes((XWhileExpression)expression, state);
      return;
    } else if (expression instanceof CondStmt) {
      _computeTypes((CondStmt)expression, state);
      return;
    } else if (expression instanceof IterStmt) {
      _computeTypes((IterStmt)expression, state);
      return;
    } else if (expression instanceof XAbstractFeatureCall) {
      _computeTypes((XAbstractFeatureCall)expression, state);
      return;
    } else if (expression instanceof XBasicForLoopExpression) {
      _computeTypes((XBasicForLoopExpression)expression, state);
      return;
    } else if (expression instanceof XBlockExpression) {
      _computeTypes((XBlockExpression)expression, state);
      return;
    } else if (expression instanceof XBooleanLiteral) {
      _computeTypes((XBooleanLiteral)expression, state);
      return;
    } else if (expression instanceof XCastedExpression) {
      _computeTypes((XCastedExpression)expression, state);
      return;
    } else if (expression instanceof XClosure) {
      _computeTypes((XClosure)expression, state);
      return;
    } else if (expression instanceof XConstructorCall) {
      _computeTypes((XConstructorCall)expression, state);
      return;
    } else if (expression instanceof XForLoopExpression) {
      _computeTypes((XForLoopExpression)expression, state);
      return;
    } else if (expression instanceof XIfExpression) {
      _computeTypes((XIfExpression)expression, state);
      return;
    } else if (expression instanceof XInstanceOfExpression) {
      _computeTypes((XInstanceOfExpression)expression, state);
      return;
    } else if (expression instanceof XNullLiteral) {
      _computeTypes((XNullLiteral)expression, state);
      return;
    } else if (expression instanceof XNumberLiteral) {
      _computeTypes((XNumberLiteral)expression, state);
      return;
    } else if (expression instanceof XReturnExpression) {
      _computeTypes((XReturnExpression)expression, state);
      return;
    } else if (expression instanceof XStringLiteral) {
      _computeTypes((XStringLiteral)expression, state);
      return;
    } else if (expression instanceof XSwitchExpression) {
      _computeTypes((XSwitchExpression)expression, state);
      return;
    } else if (expression instanceof XSynchronizedExpression) {
      _computeTypes((XSynchronizedExpression)expression, state);
      return;
    } else if (expression instanceof XThrowExpression) {
      _computeTypes((XThrowExpression)expression, state);
      return;
    } else if (expression instanceof XTryCatchFinallyExpression) {
      _computeTypes((XTryCatchFinallyExpression)expression, state);
      return;
    } else if (expression instanceof XTypeLiteral) {
      _computeTypes((XTypeLiteral)expression, state);
      return;
    } else if (expression instanceof XVariableDeclaration) {
      _computeTypes((XVariableDeclaration)expression, state);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, state).toString());
    }
  }
}
