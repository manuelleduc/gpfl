package fr.mleduc.simlang.typesystem

import fr.mleduc.simlang.simLang.CondStmt
import fr.mleduc.simlang.simLang.IterStmt
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer

class SimLangTypeComputer extends XbaseTypeComputer {

	def dispatch void computeTypes(CondStmt expression, ITypeComputationState state) {
		state.withExpectation(getRawTypeForName(Boolean, state)).computeTypes(expression.^if)
		val thenExpression = expression.then;
		val thenState = reassignCheckedType(expression.^if, thenExpression, state);
		thenState.computeTypes(thenExpression);
	}

	def dispatch void computeTypes(IterStmt expression, ITypeComputationState state) {
		state.withExpectation(getRawTypeForName(Long, state)).computeTypes(expression.exp)
		val bodyState = reassignCheckedType(expression.exp, expression.body, state.withoutExpectation());
		bodyState.computeTypes(expression.body);
	}

}
