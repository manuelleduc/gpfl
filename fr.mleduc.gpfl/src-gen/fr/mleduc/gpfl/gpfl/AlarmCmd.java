/**
 * generated by Xtext 2.13.0
 */
package fr.mleduc.gpfl.gpfl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.AlarmCmd#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gpfl.gpfl.GpflPackage#getAlarmCmd()
 * @model
 * @generated
 */
public interface AlarmCmd extends XExpression
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
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getAlarmCmd_Exp()
   * @model containment="true"
   * @generated
   */
  XExpression getExp();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.AlarmCmd#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(XExpression value);

} // AlarmCmd