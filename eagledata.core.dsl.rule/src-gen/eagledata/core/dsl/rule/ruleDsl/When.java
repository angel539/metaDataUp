/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ruleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.When#getLeft <em>Left</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.When#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.When#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhen()
 * @model
 * @generated
 */
public interface When extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhen_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.When#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

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
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhen_LogicalOperator()
   * @model
   * @generated
   */
  String getLogicalOperator();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.When#getLogicalOperator <em>Logical Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical Operator</em>' attribute.
   * @see #getLogicalOperator()
   * @generated
   */
  void setLogicalOperator(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhen_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.When#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // When