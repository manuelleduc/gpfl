/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang.simLang;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cond Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.simlang.simLang.CondStmt#getIf <em>If</em>}</li>
 *   <li>{@link fr.mleduc.simlang.simLang.CondStmt#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.simlang.simLang.SimLangPackage#getCondStmt()
 * @model
 * @generated
 */
public interface CondStmt extends XExpression
{
  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(XExpression)
   * @see fr.mleduc.simlang.simLang.SimLangPackage#getCondStmt_If()
   * @model containment="true"
   * @generated
   */
  XExpression getIf();

  /**
   * Sets the value of the '{@link fr.mleduc.simlang.simLang.CondStmt#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(XExpression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(XExpression)
   * @see fr.mleduc.simlang.simLang.SimLangPackage#getCondStmt_Then()
   * @model containment="true"
   * @generated
   */
  XExpression getThen();

  /**
   * Sets the value of the '{@link fr.mleduc.simlang.simLang.CondStmt#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(XExpression value);

} // CondStmt