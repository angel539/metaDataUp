/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ruleDsl;

import eagledata.core.dsl.pattern.streamingDsl.Concept;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Where#getLeft <em>Left</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Where#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Where#getRightVariable <em>Right Variable</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Where#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhere()
 * @model
 * @generated
 */
public interface Where extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' reference.
   * @see #setLeft(Concept)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhere_Left()
   * @model
   * @generated
   */
  Concept getLeft();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Where#getLeft <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Concept value);

  /**
   * Returns the value of the '<em><b>Logical Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical Operator</em>' attribute.
   * @see #setLogicalOperator(String)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhere_LogicalOperator()
   * @model
   * @generated
   */
  String getLogicalOperator();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Where#getLogicalOperator <em>Logical Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical Operator</em>' attribute.
   * @see #getLogicalOperator()
   * @generated
   */
  void setLogicalOperator(String value);

  /**
   * Returns the value of the '<em><b>Right Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Variable</em>' reference.
   * @see #setRightVariable(Concept)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhere_RightVariable()
   * @model
   * @generated
   */
  Concept getRightVariable();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Where#getRightVariable <em>Right Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Variable</em>' reference.
   * @see #getRightVariable()
   * @generated
   */
  void setRightVariable(Concept value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(int)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhere_Right()
   * @model
   * @generated
   */
  int getRight();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Where#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(int value);

} // Where
