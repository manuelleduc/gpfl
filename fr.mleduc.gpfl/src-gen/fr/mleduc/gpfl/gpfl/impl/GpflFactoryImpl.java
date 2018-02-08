/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.gpfl.impl;

import fr.mleduc.gpfl.gpfl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpflFactoryImpl extends EFactoryImpl implements GpflFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GpflFactory init()
  {
    try
    {
      GpflFactory theGpflFactory = (GpflFactory)EPackage.Registry.INSTANCE.getEFactory(GpflPackage.eNS_URI);
      if (theGpflFactory != null)
      {
        return theGpflFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GpflFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GpflFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GpflPackage.PROGRAM: return createProgram();
      case GpflPackage.GEXPRESSION: return createGExpression();
      case GpflPackage.FIELD: return createField();
      case GpflPackage.AUTOMATA_DEF: return createAutomataDef();
      case GpflPackage.STATE: return createState();
      case GpflPackage.TRANSITION: return createTransition();
      case GpflPackage.COND_STMT: return createCondStmt();
      case GpflPackage.ITER_STMT: return createIterStmt();
      case GpflPackage.INTERRUPT_STMT: return createInterruptStmt();
      case GpflPackage.NOP_CMD: return createNopCmd();
      case GpflPackage.ACCEPT_CMD: return createAcceptCmd();
      case GpflPackage.DROP_CMD: return createDropCmd();
      case GpflPackage.SEND_CMD: return createSendCmd();
      case GpflPackage.ALARM_CMD: return createAlarmCmd();
      case GpflPackage.SET_CMD: return createSetCmd();
      case GpflPackage.AUTOMATON_CMD: return createAutomatonCmd();
      case GpflPackage.STP_CMD: return createStpCmd();
      case GpflPackage.CMD_AND: return createCmdAnd();
      case GpflPackage.CMD_EQ: return createCmdEq();
      case GpflPackage.CMD_NEQ: return createCmdNEq();
      case GpflPackage.CMD_GE_COMPARE: return createCmdGECompare();
      case GpflPackage.CMD_LE_COMPARE: return createCmdLECompare();
      case GpflPackage.CMD_GCOMPARE: return createCmdGCompare();
      case GpflPackage.CMD_LCOMPARE: return createCmdLCompare();
      case GpflPackage.CMD_ADD: return createCmdAdd();
      case GpflPackage.CMD_SUB: return createCmdSub();
      case GpflPackage.INT_LIT_CMD: return createIntLitCmd();
      case GpflPackage.GBOOL_TRUE: return createGBoolTrue();
      case GpflPackage.GBOOL_FALSE: return createGBoolFalse();
      case GpflPackage.STRING_LIT: return createStringLit();
      case GpflPackage.VARIABLE: return createVariable();
      case GpflPackage.PORT_LIT: return createPortLit();
      case GpflPackage.IN_PORT: return createInPort();
      case GpflPackage.OUT_PORT: return createOutPort();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GExpression createGExpression()
  {
    GExpressionImpl gExpression = new GExpressionImpl();
    return gExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutomataDef createAutomataDef()
  {
    AutomataDefImpl automataDef = new AutomataDefImpl();
    return automataDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CondStmt createCondStmt()
  {
    CondStmtImpl condStmt = new CondStmtImpl();
    return condStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterStmt createIterStmt()
  {
    IterStmtImpl iterStmt = new IterStmtImpl();
    return iterStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterruptStmt createInterruptStmt()
  {
    InterruptStmtImpl interruptStmt = new InterruptStmtImpl();
    return interruptStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NopCmd createNopCmd()
  {
    NopCmdImpl nopCmd = new NopCmdImpl();
    return nopCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AcceptCmd createAcceptCmd()
  {
    AcceptCmdImpl acceptCmd = new AcceptCmdImpl();
    return acceptCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropCmd createDropCmd()
  {
    DropCmdImpl dropCmd = new DropCmdImpl();
    return dropCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SendCmd createSendCmd()
  {
    SendCmdImpl sendCmd = new SendCmdImpl();
    return sendCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlarmCmd createAlarmCmd()
  {
    AlarmCmdImpl alarmCmd = new AlarmCmdImpl();
    return alarmCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetCmd createSetCmd()
  {
    SetCmdImpl setCmd = new SetCmdImpl();
    return setCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutomatonCmd createAutomatonCmd()
  {
    AutomatonCmdImpl automatonCmd = new AutomatonCmdImpl();
    return automatonCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StpCmd createStpCmd()
  {
    StpCmdImpl stpCmd = new StpCmdImpl();
    return stpCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdAnd createCmdAnd()
  {
    CmdAndImpl cmdAnd = new CmdAndImpl();
    return cmdAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdEq createCmdEq()
  {
    CmdEqImpl cmdEq = new CmdEqImpl();
    return cmdEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdNEq createCmdNEq()
  {
    CmdNEqImpl cmdNEq = new CmdNEqImpl();
    return cmdNEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdGECompare createCmdGECompare()
  {
    CmdGECompareImpl cmdGECompare = new CmdGECompareImpl();
    return cmdGECompare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdLECompare createCmdLECompare()
  {
    CmdLECompareImpl cmdLECompare = new CmdLECompareImpl();
    return cmdLECompare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdGCompare createCmdGCompare()
  {
    CmdGCompareImpl cmdGCompare = new CmdGCompareImpl();
    return cmdGCompare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdLCompare createCmdLCompare()
  {
    CmdLCompareImpl cmdLCompare = new CmdLCompareImpl();
    return cmdLCompare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdAdd createCmdAdd()
  {
    CmdAddImpl cmdAdd = new CmdAddImpl();
    return cmdAdd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdSub createCmdSub()
  {
    CmdSubImpl cmdSub = new CmdSubImpl();
    return cmdSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLitCmd createIntLitCmd()
  {
    IntLitCmdImpl intLitCmd = new IntLitCmdImpl();
    return intLitCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GBoolTrue createGBoolTrue()
  {
    GBoolTrueImpl gBoolTrue = new GBoolTrueImpl();
    return gBoolTrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GBoolFalse createGBoolFalse()
  {
    GBoolFalseImpl gBoolFalse = new GBoolFalseImpl();
    return gBoolFalse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLit createStringLit()
  {
    StringLitImpl stringLit = new StringLitImpl();
    return stringLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortLit createPortLit()
  {
    PortLitImpl portLit = new PortLitImpl();
    return portLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InPort createInPort()
  {
    InPortImpl inPort = new InPortImpl();
    return inPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutPort createOutPort()
  {
    OutPortImpl outPort = new OutPortImpl();
    return outPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GpflPackage getGpflPackage()
  {
    return (GpflPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GpflPackage getPackage()
  {
    return GpflPackage.eINSTANCE;
  }

} //GpflFactoryImpl
