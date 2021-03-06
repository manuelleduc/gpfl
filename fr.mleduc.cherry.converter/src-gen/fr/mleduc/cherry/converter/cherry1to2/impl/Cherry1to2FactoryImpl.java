/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.cherry.converter.cherry1to2.impl;

import fr.mleduc.cherry.converter.cherry1to2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cherry1to2FactoryImpl extends EFactoryImpl implements Cherry1to2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Cherry1to2Factory init()
  {
    try
    {
      Cherry1to2Factory theCherry1to2Factory = (Cherry1to2Factory)EPackage.Registry.INSTANCE.getEFactory(Cherry1to2Package.eNS_URI);
      if (theCherry1to2Factory != null)
      {
        return theCherry1to2Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Cherry1to2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cherry1to2FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Cherry1to2Package.MODEL: return createModel();
      case Cherry1to2Package.GREETING: return createGreeting();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cherry1to2Package getCherry1to2Package()
  {
    return (Cherry1to2Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Cherry1to2Package getPackage()
  {
    return Cherry1to2Package.eINSTANCE;
  }

} //Cherry1to2FactoryImpl
