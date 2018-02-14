/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang.simLang.impl;

import fr.mleduc.simlang.simLang.*;

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
public class SimLangFactoryImpl extends EFactoryImpl implements SimLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimLangFactory init()
  {
    try
    {
      SimLangFactory theSimLangFactory = (SimLangFactory)EPackage.Registry.INSTANCE.getEFactory(SimLangPackage.eNS_URI);
      if (theSimLangFactory != null)
      {
        return theSimLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimLangFactoryImpl()
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
      case SimLangPackage.PROGRAM: return createProgram();
      case SimLangPackage.AUTOMATA_DEF: return createAutomataDef();
      case SimLangPackage.STATE: return createState();
      case SimLangPackage.TRANSITION: return createTransition();
      case SimLangPackage.COND_STMT: return createCondStmt();
      case SimLangPackage.ITER_STMT: return createIterStmt();
      case SimLangPackage.ACCEPT_CMD: return createAcceptCmd();
      case SimLangPackage.DROP_CMD: return createDropCmd();
      case SimLangPackage.NOP_CMD: return createNopCmd();
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
  public SimLangPackage getSimLangPackage()
  {
    return (SimLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimLangPackage getPackage()
  {
    return SimLangPackage.eINSTANCE;
  }

} //SimLangFactoryImpl
