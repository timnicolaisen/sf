/**
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.myDsl.Clause#getFact <em>Fact</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.myDsl.Clause#getClause1 <em>Clause1</em>}</li>
 * </ul>
 *
 * @see de.htwdd.sf.beleg.myDsl.MyDslPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends EObject
{
  /**
   * Returns the value of the '<em><b>Fact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact</em>' containment reference.
   * @see #setFact(Predicate)
   * @see de.htwdd.sf.beleg.myDsl.MyDslPackage#getClause_Fact()
   * @model containment="true"
   * @generated
   */
  Predicate getFact();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.myDsl.Clause#getFact <em>Fact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact</em>' containment reference.
   * @see #getFact()
   * @generated
   */
  void setFact(Predicate value);

  /**
   * Returns the value of the '<em><b>Clause1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause1</em>' containment reference.
   * @see #setClause1(EObject)
   * @see de.htwdd.sf.beleg.myDsl.MyDslPackage#getClause_Clause1()
   * @model containment="true"
   * @generated
   */
  EObject getClause1();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.myDsl.Clause#getClause1 <em>Clause1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause1</em>' containment reference.
   * @see #getClause1()
   * @generated
   */
  void setClause1(EObject value);

} // Clause