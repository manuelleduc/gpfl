/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.gpfl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GExpression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.GExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gpfl.gpfl.GpflPackage#getGExpression()
 * @model
 * @generated
 */
public interface GExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(GExpression)
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getGExpression_Expression()
   * @model containment="true"
   * @generated
   */
  GExpression getExpression();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.GExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(GExpression value);

} // GExpression