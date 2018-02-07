/**
 * generated by Xtext 2.13.0
 */
package fr.mleduc.gpfl.gpfl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.SendCmd#getPort <em>Port</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.SendCmd#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gpfl.gpfl.GpflPackage#getSendCmd()
 * @model
 * @generated
 */
public interface SendCmd extends XExpression
{
  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(XExpression)
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getSendCmd_Port()
   * @model containment="true"
   * @generated
   */
  XExpression getPort();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.SendCmd#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(XExpression value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.gpfl.gpfl.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getSendCmd_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // SendCmd