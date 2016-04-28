/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ruleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.SetSelect#getSelection <em>Selection</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.SetSelect#getOperator <em>Operator</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.SetSelect#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getSetSelect()
 * @model
 * @generated
 */
public interface SetSelect extends Select
{
  /**
   * Returns the value of the '<em><b>Selection</b></em>' containment reference list.
   * The list contents are of type {@link eagledata.core.dsl.rule.ruleDsl.Selection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' containment reference list.
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getSetSelect_Selection()
   * @model containment="true"
   * @generated
   */
  EList<Selection> getSelection();

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getSetSelect_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.SetSelect#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' containment reference.
   * @see #setSelect(SetSelect)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getSetSelect_Select()
   * @model containment="true"
   * @generated
   */
  SetSelect getSelect();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.SetSelect#getSelect <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' containment reference.
   * @see #getSelect()
   * @generated
   */
  void setSelect(SetSelect value);

} // SetSelect
