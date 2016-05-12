/**
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.myDsl.impl;

import de.htwdd.sf.beleg.myDsl.Exquery;
import de.htwdd.sf.beleg.myDsl.MyDslPackage;
import de.htwdd.sf.beleg.myDsl.Program;
import de.htwdd.sf.beleg.myDsl.Prologdsl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prologdsl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.myDsl.impl.PrologdslImpl#getPrologdsl <em>Prologdsl</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.myDsl.impl.PrologdslImpl#getEx <em>Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrologdslImpl extends MinimalEObjectImpl.Container implements Prologdsl
{
  /**
   * The cached value of the '{@link #getPrologdsl() <em>Prologdsl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrologdsl()
   * @generated
   * @ordered
   */
  protected Program prologdsl;

  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected Exquery ex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrologdslImpl()
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
    return MyDslPackage.Literals.PROLOGDSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program getPrologdsl()
  {
    return prologdsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrologdsl(Program newPrologdsl, NotificationChain msgs)
  {
    Program oldPrologdsl = prologdsl;
    prologdsl = newPrologdsl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROLOGDSL__PROLOGDSL, oldPrologdsl, newPrologdsl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrologdsl(Program newPrologdsl)
  {
    if (newPrologdsl != prologdsl)
    {
      NotificationChain msgs = null;
      if (prologdsl != null)
        msgs = ((InternalEObject)prologdsl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROLOGDSL__PROLOGDSL, null, msgs);
      if (newPrologdsl != null)
        msgs = ((InternalEObject)newPrologdsl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROLOGDSL__PROLOGDSL, null, msgs);
      msgs = basicSetPrologdsl(newPrologdsl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROLOGDSL__PROLOGDSL, newPrologdsl, newPrologdsl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exquery getEx()
  {
    return ex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx(Exquery newEx, NotificationChain msgs)
  {
    Exquery oldEx = ex;
    ex = newEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROLOGDSL__EX, oldEx, newEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx(Exquery newEx)
  {
    if (newEx != ex)
    {
      NotificationChain msgs = null;
      if (ex != null)
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROLOGDSL__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROLOGDSL__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROLOGDSL__EX, newEx, newEx));
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
      case MyDslPackage.PROLOGDSL__PROLOGDSL:
        return basicSetPrologdsl(null, msgs);
      case MyDslPackage.PROLOGDSL__EX:
        return basicSetEx(null, msgs);
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
      case MyDslPackage.PROLOGDSL__PROLOGDSL:
        return getPrologdsl();
      case MyDslPackage.PROLOGDSL__EX:
        return getEx();
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
      case MyDslPackage.PROLOGDSL__PROLOGDSL:
        setPrologdsl((Program)newValue);
        return;
      case MyDslPackage.PROLOGDSL__EX:
        setEx((Exquery)newValue);
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
      case MyDslPackage.PROLOGDSL__PROLOGDSL:
        setPrologdsl((Program)null);
        return;
      case MyDslPackage.PROLOGDSL__EX:
        setEx((Exquery)null);
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
      case MyDslPackage.PROLOGDSL__PROLOGDSL:
        return prologdsl != null;
      case MyDslPackage.PROLOGDSL__EX:
        return ex != null;
    }
    return super.eIsSet(featureID);
  }

} //PrologdslImpl