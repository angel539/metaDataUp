/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ruleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Query#getSelect <em>Select</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Query#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends RuleElement
{
  /**
   * Returns the value of the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' containment reference.
   * @see #setSelect(Select)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getQuery_Select()
   * @model containment="true"
   * @generated
   */
  Select getSelect();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Query#getSelect <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' containment reference.
   * @see #getSelect()
   * @generated
   */
  void setSelect(Select value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(Where)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getQuery_Where()
   * @model containment="true"
   * @generated
   */
  Where getWhere();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Query#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(Where value);

} // Query