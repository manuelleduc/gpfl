/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.gpfl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cond Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.CondStmt#getExp <em>Exp</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.CondStmt#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gpfl.gpfl.GpflPackage#getCondStmt()
 * @model
 * @generated
 */
public interface CondStmt extends GExpression
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(GExpression)
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getCondStmt_Exp()
   * @model containment="true"
   * @generated
   */
  GExpression getExp();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.CondStmt#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(GExpression value);

  /**
   * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.gpfl.gpfl.GExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmts</em>' containment reference list.
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getCondStmt_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<GExpression> getStmts();

} // CondStmt
