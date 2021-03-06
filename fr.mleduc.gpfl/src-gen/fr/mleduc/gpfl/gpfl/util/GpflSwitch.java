/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.gpfl.util;

import fr.mleduc.gpfl.gpfl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.mleduc.gpfl.gpfl.GpflPackage
 * @generated
 */
public class GpflSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GpflPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GpflSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GpflPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GpflPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.GEXPRESSION:
      {
        GExpression gExpression = (GExpression)theEObject;
        T result = caseGExpression(gExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.AUTOMATA_DEF:
      {
        AutomataDef automataDef = (AutomataDef)theEObject;
        T result = caseAutomataDef(automataDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.COND_STMT:
      {
        CondStmt condStmt = (CondStmt)theEObject;
        T result = caseCondStmt(condStmt);
        if (result == null) result = caseGExpression(condStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.ITER_STMT:
      {
        IterStmt iterStmt = (IterStmt)theEObject;
        T result = caseIterStmt(iterStmt);
        if (result == null) result = caseGExpression(iterStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.INTERRUPT_STMT:
      {
        InterruptStmt interruptStmt = (InterruptStmt)theEObject;
        T result = caseInterruptStmt(interruptStmt);
        if (result == null) result = caseGExpression(interruptStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.NOP_CMD:
      {
        NopCmd nopCmd = (NopCmd)theEObject;
        T result = caseNopCmd(nopCmd);
        if (result == null) result = caseGExpression(nopCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.ACCEPT_CMD:
      {
        AcceptCmd acceptCmd = (AcceptCmd)theEObject;
        T result = caseAcceptCmd(acceptCmd);
        if (result == null) result = caseGExpression(acceptCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.DROP_CMD:
      {
        DropCmd dropCmd = (DropCmd)theEObject;
        T result = caseDropCmd(dropCmd);
        if (result == null) result = caseGExpression(dropCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.SEND_CMD:
      {
        SendCmd sendCmd = (SendCmd)theEObject;
        T result = caseSendCmd(sendCmd);
        if (result == null) result = caseGExpression(sendCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.ALARM_CMD:
      {
        AlarmCmd alarmCmd = (AlarmCmd)theEObject;
        T result = caseAlarmCmd(alarmCmd);
        if (result == null) result = caseGExpression(alarmCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.SET_CMD:
      {
        SetCmd setCmd = (SetCmd)theEObject;
        T result = caseSetCmd(setCmd);
        if (result == null) result = caseGExpression(setCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.AUTOMATON_CMD:
      {
        AutomatonCmd automatonCmd = (AutomatonCmd)theEObject;
        T result = caseAutomatonCmd(automatonCmd);
        if (result == null) result = caseGExpression(automatonCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.STP_CMD:
      {
        StpCmd stpCmd = (StpCmd)theEObject;
        T result = caseStpCmd(stpCmd);
        if (result == null) result = caseGExpression(stpCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.CMD_AND:
      {
        CmdAnd cmdAnd = (CmdAnd)theEObject;
        T result = caseCmdAnd(cmdAnd);
        if (result == null) result = caseGExpression(cmdAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.CMD_EQ:
      {
        CmdEq cmdEq = (CmdEq)theEObject;
        T result = caseCmdEq(cmdEq);
        if (result == null) result = caseGExpression(cmdEq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.CMD_NEQ:
      {
        CmdNEq cmdNEq = (CmdNEq)theEObject;
        T result = caseCmdNEq(cmdNEq);
        if (result == null) result = caseGExpression(cmdNEq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.CMD_GE_COMPARE:
      {
        CmdGECompare cmdGECompare = (CmdGECompare)theEObject;
        T result = caseCmdGECompare(cmdGECompare);
        if (result == null) result = caseGExpression(cmdGECompare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.CMD_LE_COMPARE:
      {
        CmdLECompare cmdLECompare = (CmdLECompare)theEObject;
        T result = caseCmdLECompare(cmdLECompare);
        if (result == null) result = caseGExpression(cmdLECompare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.CMD_GCOMPARE:
      {
        CmdGCompare cmdGCompare = (CmdGCompare)theEObject;
        T result = caseCmdGCompare(cmdGCompare);
        if (result == null) result = caseGExpression(cmdGCompare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.CMD_LCOMPARE:
      {
        CmdLCompare cmdLCompare = (CmdLCompare)theEObject;
        T result = caseCmdLCompare(cmdLCompare);
        if (result == null) result = caseGExpression(cmdLCompare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.CMD_ADD:
      {
        CmdAdd cmdAdd = (CmdAdd)theEObject;
        T result = caseCmdAdd(cmdAdd);
        if (result == null) result = caseGExpression(cmdAdd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.CMD_SUB:
      {
        CmdSub cmdSub = (CmdSub)theEObject;
        T result = caseCmdSub(cmdSub);
        if (result == null) result = caseGExpression(cmdSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.INT_LIT_CMD:
      {
        IntLitCmd intLitCmd = (IntLitCmd)theEObject;
        T result = caseIntLitCmd(intLitCmd);
        if (result == null) result = caseGExpression(intLitCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.GBOOL_TRUE:
      {
        GBoolTrue gBoolTrue = (GBoolTrue)theEObject;
        T result = caseGBoolTrue(gBoolTrue);
        if (result == null) result = caseGExpression(gBoolTrue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.GBOOL_FALSE:
      {
        GBoolFalse gBoolFalse = (GBoolFalse)theEObject;
        T result = caseGBoolFalse(gBoolFalse);
        if (result == null) result = caseGExpression(gBoolFalse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.STRING_LIT:
      {
        StringLit stringLit = (StringLit)theEObject;
        T result = caseStringLit(stringLit);
        if (result == null) result = caseGExpression(stringLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseGExpression(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.PORT_LIT:
      {
        PortLit portLit = (PortLit)theEObject;
        T result = casePortLit(portLit);
        if (result == null) result = caseGExpression(portLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.IN_PORT:
      {
        InPort inPort = (InPort)theEObject;
        T result = caseInPort(inPort);
        if (result == null) result = caseGExpression(inPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GpflPackage.OUT_PORT:
      {
        OutPort outPort = (OutPort)theEObject;
        T result = caseOutPort(outPort);
        if (result == null) result = caseGExpression(outPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGExpression(GExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Automata Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Automata Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAutomataDef(AutomataDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cond Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cond Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondStmt(CondStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iter Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iter Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIterStmt(IterStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interrupt Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interrupt Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterruptStmt(InterruptStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nop Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nop Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNopCmd(NopCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accept Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accept Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcceptCmd(AcceptCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropCmd(DropCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Send Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Send Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSendCmd(SendCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alarm Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alarm Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlarmCmd(AlarmCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetCmd(SetCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Automaton Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Automaton Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAutomatonCmd(AutomatonCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stp Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stp Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStpCmd(StpCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmdAnd(CmdAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd Eq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd Eq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmdEq(CmdEq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd NEq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd NEq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmdNEq(CmdNEq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd GE Compare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd GE Compare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmdGECompare(CmdGECompare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd LE Compare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd LE Compare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmdLECompare(CmdLECompare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd GCompare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd GCompare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmdGCompare(CmdGCompare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd LCompare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd LCompare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmdLCompare(CmdLCompare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd Add</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd Add</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmdAdd(CmdAdd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmdSub(CmdSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Lit Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Lit Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLitCmd(IntLitCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GBool True</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GBool True</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGBoolTrue(GBoolTrue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GBool False</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GBool False</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGBoolFalse(GBoolFalse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLit(StringLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePortLit(PortLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInPort(InPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutPort(OutPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GpflSwitch
