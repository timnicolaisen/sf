/**
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.myDsl.Program#getClause1 <em>Clause1</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.myDsl.Program#getClause2 <em>Clause2</em>}</li>
 * </ul>
 *
 * @see de.htwdd.sf.beleg.myDsl.MyDslPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Clause1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause1</em>' containment reference.
   * @see #setClause1(Clause)
   * @see de.htwdd.sf.beleg.myDsl.MyDslPackage#getProgram_Clause1()
   * @model containment="true"
   * @generated
   */
  Clause getClause1();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.myDsl.Program#getClause1 <em>Clause1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause1</em>' containment reference.
   * @see #getClause1()
   * @generated
   */
  void setClause1(Clause value);

  /**
   * Returns the value of the '<em><b>Clause2</b></em>' containment reference list.
   * The list contents are of type {@link de.htwdd.sf.beleg.myDsl.Clause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause2</em>' containment reference list.
   * @see de.htwdd.sf.beleg.myDsl.MyDslPackage#getProgram_Clause2()
   * @model containment="true"
   * @generated
   */
  EList<Clause> getClause2();

} // Program
