/**
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.myDsl.Query#getQuery <em>Query</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.myDsl.Query#getPred <em>Pred</em>}</li>
 * </ul>
 *
 * @see de.htwdd.sf.beleg.myDsl.MyDslPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(Predicate)
   * @see de.htwdd.sf.beleg.myDsl.MyDslPackage#getQuery_Query()
   * @model containment="true"
   * @generated
   */
  Predicate getQuery();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.myDsl.Query#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Predicate value);

  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference list.
   * The list contents are of type {@link de.htwdd.sf.beleg.myDsl.Predicate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference list.
   * @see de.htwdd.sf.beleg.myDsl.MyDslPackage#getQuery_Pred()
   * @model containment="true"
   * @generated
   */
  EList<Predicate> getPred();

} // Query
