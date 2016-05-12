/**
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.myDsl.impl;

import de.htwdd.sf.beleg.myDsl.Clause;
import de.htwdd.sf.beleg.myDsl.MyDslPackage;
import de.htwdd.sf.beleg.myDsl.Program;

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
 *   <li>{@link de.htwdd.sf.beleg.myDsl.impl.ProgramImpl#getClause1 <em>Clause1</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.myDsl.impl.ProgramImpl#getClause2 <em>Clause2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getClause1() <em>Clause1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClause1()
   * @generated
   * @ordered
   */
  protected Clause clause1;

  /**
   * The cached value of the '{@link #getClause2() <em>Clause2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClause2()
   * @generated
   * @ordered
   */
  protected EList<Clause> clause2;

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
    return MyDslPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clause getClause1()
  {
    return clause1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClause1(Clause newClause1, NotificationChain msgs)
  {
    Clause oldClause1 = clause1;
    clause1 = newClause1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__CLAUSE1, oldClause1, newClause1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClause1(Clause newClause1)
  {
    if (newClause1 != clause1)
    {
      NotificationChain msgs = null;
      if (clause1 != null)
        msgs = ((InternalEObject)clause1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__CLAUSE1, null, msgs);
      if (newClause1 != null)
        msgs = ((InternalEObject)newClause1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__CLAUSE1, null, msgs);
      msgs = basicSetClause1(newClause1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__CLAUSE1, newClause1, newClause1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Clause> getClause2()
  {
    if (clause2 == null)
    {
      clause2 = new EObjectContainmentEList<Clause>(Clause.class, this, MyDslPackage.PROGRAM__CLAUSE2);
    }
    return clause2;
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
      case MyDslPackage.PROGRAM__CLAUSE1:
        return basicSetClause1(null, msgs);
      case MyDslPackage.PROGRAM__CLAUSE2:
        return ((InternalEList<?>)getClause2()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PROGRAM__CLAUSE1:
        return getClause1();
      case MyDslPackage.PROGRAM__CLAUSE2:
        return getClause2();
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
      case MyDslPackage.PROGRAM__CLAUSE1:
        setClause1((Clause)newValue);
        return;
      case MyDslPackage.PROGRAM__CLAUSE2:
        getClause2().clear();
        getClause2().addAll((Collection<? extends Clause>)newValue);
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
      case MyDslPackage.PROGRAM__CLAUSE1:
        setClause1((Clause)null);
        return;
      case MyDslPackage.PROGRAM__CLAUSE2:
        getClause2().clear();
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
      case MyDslPackage.PROGRAM__CLAUSE1:
        return clause1 != null;
      case MyDslPackage.PROGRAM__CLAUSE2:
        return clause2 != null && !clause2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl