/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.gpfl.gpfl.impl;

import fr.mleduc.gpfl.gpfl.GpflPackage;
import fr.mleduc.gpfl.gpfl.PortLit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Lit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gpfl.gpfl.impl.PortLitImpl#isInSide <em>In Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortLitImpl extends GExpressionImpl implements PortLit
{
  /**
   * The default value of the '{@link #isInSide() <em>In Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInSide()
   * @generated
   * @ordered
   */
  protected static final boolean IN_SIDE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInSide() <em>In Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInSide()
   * @generated
   * @ordered
   */
  protected boolean inSide = IN_SIDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortLitImpl()
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
    return GpflPackage.Literals.PORT_LIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInSide()
  {
    return inSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInSide(boolean newInSide)
  {
    boolean oldInSide = inSide;
    inSide = newInSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GpflPackage.PORT_LIT__IN_SIDE, oldInSide, inSide));
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
      case GpflPackage.PORT_LIT__IN_SIDE:
        return isInSide();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GpflPackage.PORT_LIT__IN_SIDE:
        setInSide((Boolean)newValue);
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
      case GpflPackage.PORT_LIT__IN_SIDE:
        setInSide(IN_SIDE_EDEFAULT);
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
      case GpflPackage.PORT_LIT__IN_SIDE:
        return inSide != IN_SIDE_EDEFAULT;
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
    result.append(" (inSide: ");
    result.append(inSide);
    result.append(')');
    return result.toString();
  }

} //PortLitImpl
