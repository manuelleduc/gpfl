/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.gpfl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.CmdAdd#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.CmdAdd#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gpfl.gpfl.GpflPackage#getCmdAdd()
 * @model
 * @generated
 */
public interface CmdAdd extends GExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(GExpression)
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getCmdAdd_Left()
   * @model containment="true"
   * @generated
   */
  GExpression getLeft();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.CmdAdd#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(GExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(GExpression)
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getCmdAdd_Right()
   * @model containment="true"
   * @generated
   */
  GExpression getRight();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.CmdAdd#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(GExpression value);

} // CmdAdd
