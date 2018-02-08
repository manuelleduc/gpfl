package fr.mleduc.lambda.interpreter;

import fr.mleduc.gpfl.gpfl.AcceptCmd;
import fr.mleduc.gpfl.gpfl.AlarmCmd;
import fr.mleduc.gpfl.gpfl.AutomatonCmd;
import fr.mleduc.gpfl.gpfl.CmdAdd;
import fr.mleduc.gpfl.gpfl.CmdAnd;
import fr.mleduc.gpfl.gpfl.CmdEq;
import fr.mleduc.gpfl.gpfl.CmdGCompare;
import fr.mleduc.gpfl.gpfl.CmdGECompare;
import fr.mleduc.gpfl.gpfl.CmdLCompare;
import fr.mleduc.gpfl.gpfl.CmdLECompare;
import fr.mleduc.gpfl.gpfl.CondStmt;
import fr.mleduc.gpfl.gpfl.DropCmd;
import fr.mleduc.gpfl.gpfl.GExpression;
import fr.mleduc.gpfl.gpfl.InPort;
import fr.mleduc.gpfl.gpfl.IntLitCmd;
import fr.mleduc.gpfl.gpfl.InterruptStmt;
import fr.mleduc.gpfl.gpfl.IterStmt;
import fr.mleduc.gpfl.gpfl.NopCmd;
import fr.mleduc.gpfl.gpfl.OutPort;
import fr.mleduc.gpfl.gpfl.PortLit;
import fr.mleduc.gpfl.gpfl.SendCmd;
import fr.mleduc.gpfl.gpfl.SetCmd;
import fr.mleduc.gpfl.gpfl.StpCmd;
import fr.mleduc.gpfl.gpfl.StringLit;
import fr.mleduc.gpfl.gpfl.Variable;
import fr.mleduc.gpfl.interpreter.GpflInterpreter;
import fr.mleduc.lambda.lambda.MethodCall;
import fr.mleduc.lambda.lambda.MethodDef;
import fr.mleduc.lambda.lambda.Parameter;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class LambdaInterpreter extends GpflInterpreter {
  protected Object _doEvaluate(final MethodCall expression, final GpflInterpreter.Context context) {
    Object _xblockexpression = null;
    {
      final Function1<GExpression, Object> _function = (GExpression it) -> {
        return this.doEvaluate(it, context);
      };
      final List<Object> paramsEval = ListExtensions.<GExpression, Object>map(expression.getParams(), _function);
      final Function1<Parameter, String> _function_1 = (Parameter it) -> {
        return it.getName();
      };
      final List<String> paramsNames = ListExtensions.<Parameter, String>map(expression.getMethod().getParams(), _function_1);
      final GpflInterpreter.Context methodCtx = context.fork();
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(paramsEval, Object.class)).length); i++) {
        methodCtx.setValue(paramsNames.get(i), paramsEval.get(i));
      }
      _xblockexpression = this.doEvaluateMethod(expression.getMethod(), methodCtx);
    }
    return _xblockexpression;
  }
  
  protected Object _doEvaluate(final MethodDef expression, final GpflInterpreter.Context context) {
    return null;
  }
  
  public Object doEvaluateMethod(final MethodDef expression, final GpflInterpreter.Context context) {
    return this.evaluateStmts(expression.getStmts(), context);
  }
  
  public Object doEvaluate(final GExpression expression, final GpflInterpreter.Context context) {
    if (expression instanceof AcceptCmd) {
      return _doEvaluate((AcceptCmd)expression, context);
    } else if (expression instanceof AlarmCmd) {
      return _doEvaluate((AlarmCmd)expression, context);
    } else if (expression instanceof AutomatonCmd) {
      return _doEvaluate((AutomatonCmd)expression, context);
    } else if (expression instanceof CmdAdd) {
      return _doEvaluate((CmdAdd)expression, context);
    } else if (expression instanceof CmdAnd) {
      return _doEvaluate((CmdAnd)expression, context);
    } else if (expression instanceof CmdEq) {
      return _doEvaluate((CmdEq)expression, context);
    } else if (expression instanceof CmdGCompare) {
      return _doEvaluate((CmdGCompare)expression, context);
    } else if (expression instanceof CmdGECompare) {
      return _doEvaluate((CmdGECompare)expression, context);
    } else if (expression instanceof CmdLCompare) {
      return _doEvaluate((CmdLCompare)expression, context);
    } else if (expression instanceof CmdLECompare) {
      return _doEvaluate((CmdLECompare)expression, context);
    } else if (expression instanceof CondStmt) {
      return _doEvaluate((CondStmt)expression, context);
    } else if (expression instanceof DropCmd) {
      return _doEvaluate((DropCmd)expression, context);
    } else if (expression instanceof InPort) {
      return _doEvaluate((InPort)expression, context);
    } else if (expression instanceof IntLitCmd) {
      return _doEvaluate((IntLitCmd)expression, context);
    } else if (expression instanceof InterruptStmt) {
      return _doEvaluate((InterruptStmt)expression, context);
    } else if (expression instanceof IterStmt) {
      return _doEvaluate((IterStmt)expression, context);
    } else if (expression instanceof NopCmd) {
      return _doEvaluate((NopCmd)expression, context);
    } else if (expression instanceof OutPort) {
      return _doEvaluate((OutPort)expression, context);
    } else if (expression instanceof PortLit) {
      return _doEvaluate((PortLit)expression, context);
    } else if (expression instanceof SendCmd) {
      return _doEvaluate((SendCmd)expression, context);
    } else if (expression instanceof SetCmd) {
      return _doEvaluate((SetCmd)expression, context);
    } else if (expression instanceof StpCmd) {
      return _doEvaluate((StpCmd)expression, context);
    } else if (expression instanceof StringLit) {
      return _doEvaluate((StringLit)expression, context);
    } else if (expression instanceof Variable) {
      return _doEvaluate((Variable)expression, context);
    } else if (expression instanceof MethodCall) {
      return _doEvaluate((MethodCall)expression, context);
    } else if (expression instanceof MethodDef) {
      return _doEvaluate((MethodDef)expression, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, context).toString());
    }
  }
}
