/**
 * generated by Xtext 2.12.0
 */
package fr.mleduc.fsmwithmethods.fsmWithMethods.util;

import fr.mleduc.fsmwithmethods.fsmWithMethods.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.mleduc.fsmwithmethods.fsmWithMethods.FsmWithMethodsPackage
 * @generated
 */
public class FsmWithMethodsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FsmWithMethodsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FsmWithMethodsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FsmWithMethodsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FsmWithMethodsSwitch<Adapter> modelSwitch =
    new FsmWithMethodsSwitch<Adapter>()
    {
      @Override
      public Adapter caseFsm(Fsm object)
      {
        return createFsmAdapter();
      }
      @Override
      public Adapter caseFExpression(FExpression object)
      {
        return createFExpressionAdapter();
      }
      @Override
      public Adapter caseReferentiable(Referentiable object)
      {
        return createReferentiableAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseMethodCall(MethodCall object)
      {
        return createMethodCallAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.mleduc.fsmwithmethods.fsmWithMethods.Fsm <em>Fsm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mleduc.fsmwithmethods.fsmWithMethods.Fsm
   * @generated
   */
  public Adapter createFsmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mleduc.fsmwithmethods.fsmWithMethods.FExpression <em>FExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mleduc.fsmwithmethods.fsmWithMethods.FExpression
   * @generated
   */
  public Adapter createFExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mleduc.fsmwithmethods.fsmWithMethods.Referentiable <em>Referentiable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mleduc.fsmwithmethods.fsmWithMethods.Referentiable
   * @generated
   */
  public Adapter createReferentiableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mleduc.fsmwithmethods.fsmWithMethods.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mleduc.fsmwithmethods.fsmWithMethods.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mleduc.fsmwithmethods.fsmWithMethods.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mleduc.fsmwithmethods.fsmWithMethods.MethodCall
   * @generated
   */
  public Adapter createMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mleduc.fsmwithmethods.fsmWithMethods.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mleduc.fsmwithmethods.fsmWithMethods.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mleduc.fsmwithmethods.fsmWithMethods.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mleduc.fsmwithmethods.fsmWithMethods.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mleduc.fsmwithmethods.fsmWithMethods.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mleduc.fsmwithmethods.fsmWithMethods.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FsmWithMethodsAdapterFactory
