/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.lambdafsm.lambdaFsm;

import fr.mleduc.fsm.fsm.State;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.lambdafsm.lambdaFsm.MethodDef#getParams <em>Params</em>}</li>
 *   <li>{@link fr.mleduc.lambdafsm.lambdaFsm.MethodDef#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.lambdafsm.lambdaFsm.LambdaFsmPackage#getMethodDef()
 * @model
 * @generated
 */
public interface MethodDef extends State
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.lambdafsm.lambdaFsm.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see fr.mleduc.lambdafsm.lambdaFsm.LambdaFsmPackage#getMethodDef_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.fsm.fsm.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmts</em>' containment reference list.
   * @see fr.mleduc.lambdafsm.lambdaFsm.LambdaFsmPackage#getMethodDef_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<State> getStmts();

} // MethodDef