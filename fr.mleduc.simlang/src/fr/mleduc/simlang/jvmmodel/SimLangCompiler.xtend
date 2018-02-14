package fr.mleduc.simlang.jvmmodel

import fr.mleduc.simlang.simLang.CondStmt
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.XExpression

class SimLangCompiler extends XbaseCompiler {
	def dispatch void toJavaStatement(CondStmt expr, ITreeAppendable b, boolean isReferenced) {
		if (isReferenced)
			declareSyntheticVariable(expr, b);
		internalToJavaStatement(expr.^if, b, true);
		b.newLine().append("if (");
		internalToJavaExpression(expr.^if, b);
		b.append(") {").increaseIndentation();
		val canBeReferenced = isReferenced && !isPrimitiveVoid(expr.then);
		internalToJavaStatement(expr.then, b, canBeReferenced);
		if (canBeReferenced) {
			b.newLine();
			b.append(getVarName(expr, b));
			b.append(" = ");
			internalToConvertedExpression(expr.then, b, getLightweightType(expr));
			b.append(";");
		}
		b.decreaseIndentation().newLine().append("}");
	}

	override protected doInternalToJavaStatement(XExpression obj, ITreeAppendable appendable, boolean isReferenced) {
		if (obj instanceof CondStmt)
			this.toJavaStatement(obj, appendable, isReferenced)
		else
			super.doInternalToJavaStatement(obj, appendable, isReferenced)
	}

}
