package fr.mleduc.lambda.interpreter

import fr.mleduc.gpfl.interpreter.GpflInterpreter
import fr.mleduc.lambda.lambda.MethodCall
import fr.mleduc.lambda.lambda.MethodDef

class LambdaInterpreter extends GpflInterpreter {

	def dispatch Object doEvaluate(MethodCall expression, Context context) {
		val paramsEval = expression.params.map[it.doEvaluate(context)]
		val paramsNames = expression.method.params.map[name]
		val methodCtx = context.fork
		for (var i = 0; i < paramsEval.length; i++) {
			methodCtx.setValue(paramsNames.get(i), paramsEval.get(i))
		}
		expression.method.doEvaluateMethod(methodCtx)
	}

	def dispatch Object doEvaluate(MethodDef expression, Context context) {
		// only evaluate methode definition on method call
	}

	def Object doEvaluateMethod(MethodDef expression, Context context) {
		expression.stmts.evaluateStmts(context)
	}
}
