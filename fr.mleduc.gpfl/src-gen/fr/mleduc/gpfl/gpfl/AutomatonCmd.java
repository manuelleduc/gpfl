/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.gpfl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automaton Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.AutomatonCmd#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.AutomatonCmd#getAutomaton <em>Automaton</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gpfl.gpfl.GpflPackage#getAutomatonCmd()
 * @model
 * @generated
 */
public interface AutomatonCmd extends GExpression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getAutomatonCmd_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.AutomatonCmd#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Automaton</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Automaton</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Automaton</em>' reference.
   * @see #setAutomaton(AutomataDef)
   * @see fr.mleduc.gpfl.gpfl.GpflPackage#getAutomatonCmd_Automaton()
   * @model
   * @generated
   */
  AutomataDef getAutomaton();

  /**
   * Sets the value of the '{@link fr.mleduc.gpfl.gpfl.AutomatonCmd#getAutomaton <em>Automaton</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Automaton</em>' reference.
   * @see #getAutomaton()
   * @generated
   */
  void setAutomaton(AutomataDef value);

} // AutomatonCmd
