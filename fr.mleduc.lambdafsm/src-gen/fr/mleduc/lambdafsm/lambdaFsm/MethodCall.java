/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.lambdafsm.lambdaFsm;

import fr.mleduc.fsm.fsm.State;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.lambdafsm.lambdaFsm.MethodCall#getMethod <em>Method</em>}</li>
 *   <li>{@link fr.mleduc.lambdafsm.lambdaFsm.MethodCall#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.lambdafsm.lambdaFsm.LambdaFsmPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends State
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(MethodDef)
   * @see fr.mleduc.lambdafsm.lambdaFsm.LambdaFsmPackage#getMethodCall_Method()
   * @model
   * @generated
   */
  MethodDef getMethod();

  /**
   * Sets the value of the '{@link fr.mleduc.lambdafsm.lambdaFsm.MethodCall#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(MethodDef value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.fsm.fsm.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see fr.mleduc.lambdafsm.lambdaFsm.LambdaFsmPackage#getMethodCall_Params()
   * @model containment="true"
   * @generated
   */
  EList<State> getParams();

} // MethodCall