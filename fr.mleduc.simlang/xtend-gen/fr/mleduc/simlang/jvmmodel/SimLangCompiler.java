package fr.mleduc.simlang.jvmmodel;

import fr.mleduc.simlang.simLang.CondStmt;
import java.util.Arrays;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
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
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

@SuppressWarnings("all")
public class SimLangCompiler extends XbaseCompiler {
  protected void _toJavaStatement(final CondStmt expr, final ITreeAppendable b, final boolean isReferenced) {
    if (isReferenced) {
      this.declareSyntheticVariable(expr, b);
    }
    this.internalToJavaStatement(expr.getIf(), b, true);
    b.newLine().append("if (");
    this.internalToJavaExpression(expr.getIf(), b);
    b.append(") {").increaseIndentation();
    final boolean canBeReferenced = (isReferenced && (!this.isPrimitiveVoid(expr.getThen())));
    this.internalToJavaStatement(expr.getThen(), b, canBeReferenced);
    if (canBeReferenced) {
      b.newLine();
      b.append(this.getVarName(expr, b));
      b.append(" = ");
      this.internalToConvertedExpression(expr.getThen(), b, this.getLightweightType(expr));
      b.append(";");
    }
    b.decreaseIndentation().newLine().append("}");
  }
  
  @Override
  protected void doInternalToJavaStatement(final XExpression obj, final ITreeAppendable appendable, final boolean isReferenced) {
    if ((obj instanceof CondStmt)) {
      this.toJavaStatement(obj, appendable, isReferenced);
    } else {
      super.doInternalToJavaStatement(obj, appendable, isReferenced);
    }
  }
  
  public void toJavaStatement(final XExpression expr, final ITreeAppendable b, final boolean isReferenced) {
    if (expr instanceof XDoWhileExpression) {
      _toJavaStatement((XDoWhileExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XFeatureCall) {
      _toJavaStatement((XFeatureCall)expr, b, isReferenced);
      return;
    } else if (expr instanceof XListLiteral) {
      _toJavaStatement((XListLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XSetLiteral) {
      _toJavaStatement((XSetLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XWhileExpression) {
      _toJavaStatement((XWhileExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof CondStmt) {
      _toJavaStatement((CondStmt)expr, b, isReferenced);
      return;
    } else if (expr instanceof XAbstractFeatureCall) {
      _toJavaStatement((XAbstractFeatureCall)expr, b, isReferenced);
      return;
    } else if (expr instanceof XBasicForLoopExpression) {
      _toJavaStatement((XBasicForLoopExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XBlockExpression) {
      _toJavaStatement((XBlockExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XBooleanLiteral) {
      _toJavaStatement((XBooleanLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XCastedExpression) {
      _toJavaStatement((XCastedExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XClosure) {
      _toJavaStatement((XClosure)expr, b, isReferenced);
      return;
    } else if (expr instanceof XConstructorCall) {
      _toJavaStatement((XConstructorCall)expr, b, isReferenced);
      return;
    } else if (expr instanceof XForLoopExpression) {
      _toJavaStatement((XForLoopExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XIfExpression) {
      _toJavaStatement((XIfExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XInstanceOfExpression) {
      _toJavaStatement((XInstanceOfExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XNullLiteral) {
      _toJavaStatement((XNullLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XNumberLiteral) {
      _toJavaStatement((XNumberLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XReturnExpression) {
      _toJavaStatement((XReturnExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XStringLiteral) {
      _toJavaStatement((XStringLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XSwitchExpression) {
      _toJavaStatement((XSwitchExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XSynchronizedExpression) {
      _toJavaStatement((XSynchronizedExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XThrowExpression) {
      _toJavaStatement((XThrowExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XTryCatchFinallyExpression) {
      _toJavaStatement((XTryCatchFinallyExpression)expr, b, isReferenced);
      return;
    } else if (expr instanceof XTypeLiteral) {
      _toJavaStatement((XTypeLiteral)expr, b, isReferenced);
      return;
    } else if (expr instanceof XVariableDeclaration) {
      _toJavaStatement((XVariableDeclaration)expr, b, isReferenced);
      return;
    } else if (expr != null) {
      _toJavaStatement(expr, b, isReferenced);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, b, isReferenced).toString());
    }
  }
}
