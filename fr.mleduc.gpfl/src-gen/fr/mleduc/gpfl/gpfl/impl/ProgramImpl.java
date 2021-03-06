/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.gpfl.impl;

import fr.mleduc.gpfl.gpfl.AutomataDef;
import fr.mleduc.gpfl.gpfl.GExpression;
import fr.mleduc.gpfl.gpfl.GpflPackage;
import fr.mleduc.gpfl.gpfl.Program;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.impl.ProgramImpl#getAutomatas <em>Automatas</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.impl.ProgramImpl#getInitStmts <em>Init Stmts</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.impl.ProgramImpl#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAutomatas() <em>Automatas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutomatas()
   * @generated
   * @ordered
   */
  protected EList<AutomataDef> automatas;

  /**
   * The cached value of the '{@link #getInitStmts() <em>Init Stmts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitStmts()
   * @generated
   * @ordered
   */
  protected EList<GExpression> initStmts;

  /**
   * The cached value of the '{@link #getStmts() <em>Stmts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmts()
   * @generated
   * @ordered
   */
  protected EList<GExpression> stmts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GpflPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GpflPackage.PROGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AutomataDef> getAutomatas()
  {
    if (automatas == null)
    {
      automatas = new EObjectContainmentEList<AutomataDef>(AutomataDef.class, this, GpflPackage.PROGRAM__AUTOMATAS);
    }
    return automatas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GExpression> getInitStmts()
  {
    if (initStmts == null)
    {
      initStmts = new EObjectContainmentEList<GExpression>(GExpression.class, this, GpflPackage.PROGRAM__INIT_STMTS);
    }
    return initStmts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GExpression> getStmts()
  {
    if (stmts == null)
    {
      stmts = new EObjectContainmentEList<GExpression>(GExpression.class, this, GpflPackage.PROGRAM__STMTS);
    }
    return stmts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GpflPackage.PROGRAM__AUTOMATAS:
        return ((InternalEList<?>)getAutomatas()).basicRemove(otherEnd, msgs);
      case GpflPackage.PROGRAM__INIT_STMTS:
        return ((InternalEList<?>)getInitStmts()).basicRemove(otherEnd, msgs);
      case GpflPackage.PROGRAM__STMTS:
        return ((InternalEList<?>)getStmts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GpflPackage.PROGRAM__NAME:
        return getName();
      case GpflPackage.PROGRAM__AUTOMATAS:
        return getAutomatas();
      case GpflPackage.PROGRAM__INIT_STMTS:
        return getInitStmts();
      case GpflPackage.PROGRAM__STMTS:
        return getStmts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GpflPackage.PROGRAM__NAME:
        setName((String)newValue);
        return;
      case GpflPackage.PROGRAM__AUTOMATAS:
        getAutomatas().clear();
        getAutomatas().addAll((Collection<? extends AutomataDef>)newValue);
        return;
      case GpflPackage.PROGRAM__INIT_STMTS:
        getInitStmts().clear();
        getInitStmts().addAll((Collection<? extends GExpression>)newValue);
        return;
      case GpflPackage.PROGRAM__STMTS:
        getStmts().clear();
        getStmts().addAll((Collection<? extends GExpression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GpflPackage.PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GpflPackage.PROGRAM__AUTOMATAS:
        getAutomatas().clear();
        return;
      case GpflPackage.PROGRAM__INIT_STMTS:
        getInitStmts().clear();
        return;
      case GpflPackage.PROGRAM__STMTS:
        getStmts().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GpflPackage.PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GpflPackage.PROGRAM__AUTOMATAS:
        return automatas != null && !automatas.isEmpty();
      case GpflPackage.PROGRAM__INIT_STMTS:
        return initStmts != null && !initStmts.isEmpty();
      case GpflPackage.PROGRAM__STMTS:
        return stmts != null && !stmts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
