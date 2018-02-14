package fr.mleduc.simlang.jvmmodel

import fr.mleduc.simlang.simLang.AcceptCmd
import fr.mleduc.simlang.simLang.CondStmt
import fr.mleduc.simlang.simLang.IterStmt
import fr.mleduc.simlang.simLang.NopCmd
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import fr.mleduc.simlang.simLang.DropCmd
import fr.mleduc.simlang.simLang.Program

class SimLangCompiler extends XbaseCompiler {
	def dispatch void toJavaStatement(CondStmt expr, ITreeAppendable b, boolean isReferenced) {
		if (isReferenced)
			expr.declareSyntheticVariable(b)
		expr.^if.internalToJavaStatement(b, true)
		b.newLine.append("if (")
		expr.^if.internalToJavaExpression(b)
		b.append(") {").increaseIndentation
		val canBeReferenced = isReferenced && !expr.then.isPrimitiveVoid
		expr.then.internalToJavaStatement(b, canBeReferenced)
		if (canBeReferenced) {
			b.newLine
			b.append(expr.getVarName(b))
			b.append(" = ")
			expr.then.internalToConvertedExpression(b, getLightweightType(expr))
			b.append(";")
		}
		b.decreaseIndentation.newLine.append("}")
	}

	def dispatch void toJavaStatement(IterStmt expr, ITreeAppendable b, boolean isReferenced) {
		val needsStatement = !canCompileToJavaExpression(expr.exp, b);
		var String varName = null;
		if (needsStatement) {
			internalToJavaStatement(expr.exp, b, true);
			varName = b.declareSyntheticVariable(expr, "_while");
			b.newLine().append("boolean ").append(varName).append(" = ");
			internalToJavaExpression(expr.exp, b);
			b.append(";");
		}

		val loopVarName = varName = b.declareSyntheticVariable(expr, "_iter");

		b.newLine().append('''for(long «loopVarName»=0; «loopVarName»<''');
		if (needsStatement) {
			b.append(varName);
		} else {
			internalToJavaExpression(expr.exp, b);
		}
		b.append('''; «loopVarName»++) {''').increaseIndentation();
		b.openPseudoScope();
		internalToJavaStatement(expr.getBody(), b, false);
		if (needsStatement && !isEarlyExit(expr.getBody())) {
			internalToJavaStatement(expr.exp, b, true);
			b.newLine();
			b.append(varName).append(" = ");
			internalToJavaExpression(expr.exp, b);
			b.append(";");
		}
		b.closeScope();
		b.decreaseIndentation().newLine().append("}");
	}

	def dispatch void toJavaStatement(NopCmd expr, ITreeAppendable b, boolean isReferenced) {
	}

	def dispatch void toJavaStatement(AcceptCmd expr, ITreeAppendable b, boolean isReferenced) {
	}

	def dispatch void toJavaStatement(DropCmd expr, ITreeAppendable b, boolean isReferenced) {
	}

	override protected doInternalToJavaStatement(XExpression obj, ITreeAppendable appendable, boolean isReferenced) {
		if (obj instanceof Program)
			println("OKOK")
		if (obj instanceof CondStmt || obj instanceof IterStmt || obj instanceof NopCmd || obj instanceof AcceptCmd ||
			obj instanceof DropCmd)
			this.toJavaStatement(obj, appendable, isReferenced)
		else
			super.doInternalToJavaStatement(obj, appendable, isReferenced)
	}

}
