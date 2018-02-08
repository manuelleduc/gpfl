/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.lambda.lambda;

import fr.mleduc.gpfl.gpfl.GpflPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fr.mleduc.lambda.lambda.LambdaFactory
 * @model kind="package"
 * @generated
 */
public interface LambdaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lambda";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mleduc.fr/lambda/Lambda";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lambda";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LambdaPackage eINSTANCE = fr.mleduc.lambda.lambda.impl.LambdaPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.mleduc.lambda.lambda.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.lambda.lambda.impl.ParameterImpl
   * @see fr.mleduc.lambda.lambda.impl.LambdaPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.mleduc.lambda.lambda.impl.MethodDefImpl <em>Method Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.lambda.lambda.impl.MethodDefImpl
   * @see fr.mleduc.lambda.lambda.impl.LambdaPackageImpl#getMethodDef()
   * @generated
   */
  int METHOD_DEF = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEF__EXPRESSION = GpflPackage.GEXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEF__NAME = GpflPackage.GEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEF__PARAMS = GpflPackage.GEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEF__STMTS = GpflPackage.GEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Method Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEF_FEATURE_COUNT = GpflPackage.GEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.mleduc.lambda.lambda.impl.MethodCallImpl <em>Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.lambda.lambda.impl.MethodCallImpl
   * @see fr.mleduc.lambda.lambda.impl.LambdaPackageImpl#getMethodCall()
   * @generated
   */
  int METHOD_CALL = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__EXPRESSION = GpflPackage.GEXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__METHOD = GpflPackage.GEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__PARAMS = GpflPackage.GEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_FEATURE_COUNT = GpflPackage.GEXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link fr.mleduc.lambda.lambda.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see fr.mleduc.lambda.lambda.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.lambda.lambda.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mleduc.lambda.lambda.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link fr.mleduc.lambda.lambda.MethodDef <em>Method Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Def</em>'.
   * @see fr.mleduc.lambda.lambda.MethodDef
   * @generated
   */
  EClass getMethodDef();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.lambda.lambda.MethodDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mleduc.lambda.lambda.MethodDef#getName()
   * @see #getMethodDef()
   * @generated
   */
  EAttribute getMethodDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.lambda.lambda.MethodDef#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see fr.mleduc.lambda.lambda.MethodDef#getParams()
   * @see #getMethodDef()
   * @generated
   */
  EReference getMethodDef_Params();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.lambda.lambda.MethodDef#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see fr.mleduc.lambda.lambda.MethodDef#getStmts()
   * @see #getMethodDef()
   * @generated
   */
  EReference getMethodDef_Stmts();

  /**
   * Returns the meta object for class '{@link fr.mleduc.lambda.lambda.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Call</em>'.
   * @see fr.mleduc.lambda.lambda.MethodCall
   * @generated
   */
  EClass getMethodCall();

  /**
   * Returns the meta object for the reference '{@link fr.mleduc.lambda.lambda.MethodCall#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see fr.mleduc.lambda.lambda.MethodCall#getMethod()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_Method();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.lambda.lambda.MethodCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see fr.mleduc.lambda.lambda.MethodCall#getParams()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_Params();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LambdaFactory getLambdaFactory();

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
     * The meta object literal for the '{@link fr.mleduc.lambda.lambda.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.lambda.lambda.impl.ParameterImpl
     * @see fr.mleduc.lambda.lambda.impl.LambdaPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link fr.mleduc.lambda.lambda.impl.MethodDefImpl <em>Method Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.lambda.lambda.impl.MethodDefImpl
     * @see fr.mleduc.lambda.lambda.impl.LambdaPackageImpl#getMethodDef()
     * @generated
     */
    EClass METHOD_DEF = eINSTANCE.getMethodDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DEF__NAME = eINSTANCE.getMethodDef_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEF__PARAMS = eINSTANCE.getMethodDef_Params();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEF__STMTS = eINSTANCE.getMethodDef_Stmts();

    /**
     * The meta object literal for the '{@link fr.mleduc.lambda.lambda.impl.MethodCallImpl <em>Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.lambda.lambda.impl.MethodCallImpl
     * @see fr.mleduc.lambda.lambda.impl.LambdaPackageImpl#getMethodCall()
     * @generated
     */
    EClass METHOD_CALL = eINSTANCE.getMethodCall();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__METHOD = eINSTANCE.getMethodCall_Method();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__PARAMS = eINSTANCE.getMethodCall_Params();

  }

} //LambdaPackage