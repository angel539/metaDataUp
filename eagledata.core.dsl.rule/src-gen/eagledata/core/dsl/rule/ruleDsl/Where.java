/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ruleDsl;

import eagledata.core.dsl.datadesc.dataDsl.PrimitiveNode;

import eagledata.core.dsl.pattern.streamingDsl.Feature;

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
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Where#getRight <em>Right</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Where#getRightStreaming <em>Right Streaming</em>}</li>
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
   * @see #setLeft(PrimitiveNode)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhere_Left()
   * @model
   * @generated
   */
  PrimitiveNode getLeft();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Where#getLeft <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PrimitiveNode value);

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
   * Returns the value of the '<em><b>Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' reference.
   * @see #setRight(PrimitiveNode)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhere_Right()
   * @model
   * @generated
   */
  PrimitiveNode getRight();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Where#getRight <em>Right</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PrimitiveNode value);

  /**
   * Returns the value of the '<em><b>Right Streaming</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Streaming</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Streaming</em>' reference.
   * @see #setRightStreaming(Feature)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getWhere_RightStreaming()
   * @model
   * @generated
   */
  Feature getRightStreaming();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Where#getRightStreaming <em>Right Streaming</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Streaming</em>' reference.
   * @see #getRightStreaming()
   * @generated
   */
  void setRightStreaming(Feature value);

} // Where
