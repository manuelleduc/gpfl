/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang.simLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.simlang.simLang.Program#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.simlang.simLang.Program#getAutomatas <em>Automatas</em>}</li>
 *   <li>{@link fr.mleduc.simlang.simLang.Program#getInit <em>Init</em>}</li>
 *   <li>{@link fr.mleduc.simlang.simLang.Program#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.simlang.simLang.SimLangPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
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
   * @see fr.mleduc.simlang.simLang.SimLangPackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.mleduc.simlang.simLang.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Automatas</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.simlang.simLang.AutomataDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Automatas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Automatas</em>' containment reference list.
   * @see fr.mleduc.simlang.simLang.SimLangPackage#getProgram_Automatas()
   * @model containment="true"
   * @generated
   */
  EList<AutomataDef> getAutomatas();

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(XBlockExpression)
   * @see fr.mleduc.simlang.simLang.SimLangPackage#getProgram_Init()
   * @model containment="true"
   * @generated
   */
  XBlockExpression getInit();

  /**
   * Sets the value of the '{@link fr.mleduc.simlang.simLang.Program#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(XBlockExpression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XBlockExpression)
   * @see fr.mleduc.simlang.simLang.SimLangPackage#getProgram_Body()
   * @model containment="true"
   * @generated
   */
  XBlockExpression getBody();

  /**
   * Sets the value of the '{@link fr.mleduc.simlang.simLang.Program#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XBlockExpression value);

} // Program