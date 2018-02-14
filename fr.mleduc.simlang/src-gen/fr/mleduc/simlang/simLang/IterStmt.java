/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang.simLang;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iter Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.simlang.simLang.IterStmt#getExp <em>Exp</em>}</li>
 *   <li>{@link fr.mleduc.simlang.simLang.IterStmt#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.simlang.simLang.SimLangPackage#getIterStmt()
 * @model
 * @generated
 */
public interface IterStmt extends XExpression
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
   * @see #setExp(XExpression)
   * @see fr.mleduc.simlang.simLang.SimLangPackage#getIterStmt_Exp()
   * @model containment="true"
   * @generated
   */
  XExpression getExp();

  /**
   * Sets the value of the '{@link fr.mleduc.simlang.simLang.IterStmt#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(XExpression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XExpression)
   * @see fr.mleduc.simlang.simLang.SimLangPackage#getIterStmt_Body()
   * @model containment="true"
   * @generated
   */
  XExpression getBody();

  /**
   * Sets the value of the '{@link fr.mleduc.simlang.simLang.IterStmt#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XExpression value);

} // IterStmt
