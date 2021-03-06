/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.gpfl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stp Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.StpCmd#getAutomaton <em>Automaton</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.StpCmd#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.StpCmd#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gpfl.gpfl.GpflPackage#getStpCmd()
 * @model
 * @generated
 */
public interface StpCmd extends GExpression
{
  /**
   * Returns the value of the '<em><b>Automaton</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Automaton</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Automaton</em>' reference.
   * @see #setAutomaton(AutomatonCmd)
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getStpCmd_Automaton()
   * @model
   * @generated
   */
  AutomatonCmd getAutomaton();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.StpCmd#getAutomaton <em>Automaton</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Automaton</em>' reference.
   * @see #getAutomaton()
   * @generated
   */
  void setAutomaton(AutomatonCmd value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(GExpression)
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getStpCmd_Event()
   * @model containment="true"
   * @generated
   */
  GExpression getEvent();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.StpCmd#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(GExpression value);

  /**
   * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.gpfl.gpfl.GExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Errors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Errors</em>' containment reference list.
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getStpCmd_Errors()
   * @model containment="true"
   * @generated
   */
  EList<GExpression> getErrors();

} // StpCmd
