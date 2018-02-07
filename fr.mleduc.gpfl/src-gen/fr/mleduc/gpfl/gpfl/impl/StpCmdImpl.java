/**
 * generated by Xtext 2.13.0
 */
package fr.mleduc.gpfl.gpfl.impl;

import fr.mleduc.gpfl.gpfl.AutomatonCmd;
import fr.mleduc.gpfl.gpfl.GpflPackage;
import fr.mleduc.gpfl.gpfl.StpCmd;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stp Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.impl.StpCmdImpl#getAutomaton <em>Automaton</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.impl.StpCmdImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.mleduc.gpfl.gpfl.impl.StpCmdImpl#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StpCmdImpl extends XExpressionImpl implements StpCmd
{
  /**
   * The cached value of the '{@link #getAutomaton() <em>Automaton</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutomaton()
   * @generated
   * @ordered
   */
  protected AutomatonCmd automaton;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected XExpression event;

  /**
   * The cached value of the '{@link #getErrors() <em>Errors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrors()
   * @generated
   * @ordered
   */
  protected EList<XExpression> errors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StpCmdImpl()
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
    return GpflPackage.Literals.STP_CMD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutomatonCmd getAutomaton()
  {
    if (automaton != null && automaton.eIsProxy())
    {
      InternalEObject oldAutomaton = (InternalEObject)automaton;
      automaton = (AutomatonCmd)eResolveProxy(oldAutomaton);
      if (automaton != oldAutomaton)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GpflPackage.STP_CMD__AUTOMATON, oldAutomaton, automaton));
      }
    }
    return automaton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutomatonCmd basicGetAutomaton()
  {
    return automaton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutomaton(AutomatonCmd newAutomaton)
  {
    AutomatonCmd oldAutomaton = automaton;
    automaton = newAutomaton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GpflPackage.STP_CMD__AUTOMATON, oldAutomaton, automaton));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvent(XExpression newEvent, NotificationChain msgs)
  {
    XExpression oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GpflPackage.STP_CMD__EVENT, oldEvent, newEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(XExpression newEvent)
  {
    if (newEvent != event)
    {
      NotificationChain msgs = null;
      if (event != null)
        msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GpflPackage.STP_CMD__EVENT, null, msgs);
      if (newEvent != null)
        msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GpflPackage.STP_CMD__EVENT, null, msgs);
      msgs = basicSetEvent(newEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GpflPackage.STP_CMD__EVENT, newEvent, newEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getErrors()
  {
    if (errors == null)
    {
      errors = new EObjectContainmentEList<XExpression>(XExpression.class, this, GpflPackage.STP_CMD__ERRORS);
    }
    return errors;
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
      case GpflPackage.STP_CMD__EVENT:
        return basicSetEvent(null, msgs);
      case GpflPackage.STP_CMD__ERRORS:
        return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
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
      case GpflPackage.STP_CMD__AUTOMATON:
        if (resolve) return getAutomaton();
        return basicGetAutomaton();
      case GpflPackage.STP_CMD__EVENT:
        return getEvent();
      case GpflPackage.STP_CMD__ERRORS:
        return getErrors();
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
      case GpflPackage.STP_CMD__AUTOMATON:
        setAutomaton((AutomatonCmd)newValue);
        return;
      case GpflPackage.STP_CMD__EVENT:
        setEvent((XExpression)newValue);
        return;
      case GpflPackage.STP_CMD__ERRORS:
        getErrors().clear();
        getErrors().addAll((Collection<? extends XExpression>)newValue);
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
      case GpflPackage.STP_CMD__AUTOMATON:
        setAutomaton((AutomatonCmd)null);
        return;
      case GpflPackage.STP_CMD__EVENT:
        setEvent((XExpression)null);
        return;
      case GpflPackage.STP_CMD__ERRORS:
        getErrors().clear();
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
      case GpflPackage.STP_CMD__AUTOMATON:
        return automaton != null;
      case GpflPackage.STP_CMD__EVENT:
        return event != null;
      case GpflPackage.STP_CMD__ERRORS:
        return errors != null && !errors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StpCmdImpl