/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang.simLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.mleduc.simlang.simLang.SimLangFactory
 * @model kind="package"
 * @generated
 */
public interface SimLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mleduc.fr/simlang/SimLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimLangPackage eINSTANCE = fr.mleduc.simlang.simLang.impl.SimLangPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.mleduc.simlang.simLang.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.simlang.simLang.impl.ProgramImpl
   * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Automatas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__AUTOMATAS = 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INIT = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__BODY = 3;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.mleduc.simlang.simLang.impl.AutomataDefImpl <em>Automata Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.simlang.simLang.impl.AutomataDefImpl
   * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getAutomataDef()
   * @generated
   */
  int AUTOMATA_DEF = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATA_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATA_DEF__INIT = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATA_DEF__STATES = 2;

  /**
   * The number of structural features of the '<em>Automata Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATA_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mleduc.simlang.simLang.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.simlang.simLang.impl.StateImpl
   * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getState()
   * @generated
   */
  int STATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mleduc.simlang.simLang.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.simlang.simLang.impl.TransitionImpl
   * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 3;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mleduc.simlang.simLang.impl.CondStmtImpl <em>Cond Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.simlang.simLang.impl.CondStmtImpl
   * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getCondStmt()
   * @generated
   */
  int COND_STMT = 4;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_STMT__IF = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_STMT__THEN = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cond Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_STMT_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link fr.mleduc.simlang.simLang.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see fr.mleduc.simlang.simLang.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.simlang.simLang.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mleduc.simlang.simLang.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.simlang.simLang.Program#getAutomatas <em>Automatas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Automatas</em>'.
   * @see fr.mleduc.simlang.simLang.Program#getAutomatas()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Automatas();

  /**
   * Returns the meta object for the containment reference '{@link fr.mleduc.simlang.simLang.Program#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see fr.mleduc.simlang.simLang.Program#getInit()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Init();

  /**
   * Returns the meta object for the containment reference '{@link fr.mleduc.simlang.simLang.Program#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see fr.mleduc.simlang.simLang.Program#getBody()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Body();

  /**
   * Returns the meta object for class '{@link fr.mleduc.simlang.simLang.AutomataDef <em>Automata Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Automata Def</em>'.
   * @see fr.mleduc.simlang.simLang.AutomataDef
   * @generated
   */
  EClass getAutomataDef();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.simlang.simLang.AutomataDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mleduc.simlang.simLang.AutomataDef#getName()
   * @see #getAutomataDef()
   * @generated
   */
  EAttribute getAutomataDef_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mleduc.simlang.simLang.AutomataDef#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Init</em>'.
   * @see fr.mleduc.simlang.simLang.AutomataDef#getInit()
   * @see #getAutomataDef()
   * @generated
   */
  EReference getAutomataDef_Init();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.simlang.simLang.AutomataDef#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see fr.mleduc.simlang.simLang.AutomataDef#getStates()
   * @see #getAutomataDef()
   * @generated
   */
  EReference getAutomataDef_States();

  /**
   * Returns the meta object for class '{@link fr.mleduc.simlang.simLang.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see fr.mleduc.simlang.simLang.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.simlang.simLang.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mleduc.simlang.simLang.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.simlang.simLang.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see fr.mleduc.simlang.simLang.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link fr.mleduc.simlang.simLang.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see fr.mleduc.simlang.simLang.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.simlang.simLang.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see fr.mleduc.simlang.simLang.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Event();

  /**
   * Returns the meta object for the reference '{@link fr.mleduc.simlang.simLang.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see fr.mleduc.simlang.simLang.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for class '{@link fr.mleduc.simlang.simLang.CondStmt <em>Cond Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cond Stmt</em>'.
   * @see fr.mleduc.simlang.simLang.CondStmt
   * @generated
   */
  EClass getCondStmt();

  /**
   * Returns the meta object for the containment reference '{@link fr.mleduc.simlang.simLang.CondStmt#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see fr.mleduc.simlang.simLang.CondStmt#getIf()
   * @see #getCondStmt()
   * @generated
   */
  EReference getCondStmt_If();

  /**
   * Returns the meta object for the containment reference '{@link fr.mleduc.simlang.simLang.CondStmt#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see fr.mleduc.simlang.simLang.CondStmt#getThen()
   * @see #getCondStmt()
   * @generated
   */
  EReference getCondStmt_Then();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimLangFactory getSimLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.mleduc.simlang.simLang.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.simlang.simLang.impl.ProgramImpl
     * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Automatas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__AUTOMATAS = eINSTANCE.getProgram_Automatas();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INIT = eINSTANCE.getProgram_Init();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__BODY = eINSTANCE.getProgram_Body();

    /**
     * The meta object literal for the '{@link fr.mleduc.simlang.simLang.impl.AutomataDefImpl <em>Automata Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.simlang.simLang.impl.AutomataDefImpl
     * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getAutomataDef()
     * @generated
     */
    EClass AUTOMATA_DEF = eINSTANCE.getAutomataDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTOMATA_DEF__NAME = eINSTANCE.getAutomataDef_Name();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTOMATA_DEF__INIT = eINSTANCE.getAutomataDef_Init();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTOMATA_DEF__STATES = eINSTANCE.getAutomataDef_States();

    /**
     * The meta object literal for the '{@link fr.mleduc.simlang.simLang.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.simlang.simLang.impl.StateImpl
     * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '{@link fr.mleduc.simlang.simLang.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.simlang.simLang.impl.TransitionImpl
     * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '{@link fr.mleduc.simlang.simLang.impl.CondStmtImpl <em>Cond Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.simlang.simLang.impl.CondStmtImpl
     * @see fr.mleduc.simlang.simLang.impl.SimLangPackageImpl#getCondStmt()
     * @generated
     */
    EClass COND_STMT = eINSTANCE.getCondStmt();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_STMT__IF = eINSTANCE.getCondStmt_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_STMT__THEN = eINSTANCE.getCondStmt_Then();

  }

} //SimLangPackage
