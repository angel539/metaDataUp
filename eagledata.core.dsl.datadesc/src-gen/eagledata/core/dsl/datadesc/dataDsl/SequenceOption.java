/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.datadesc.dataDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.SequenceOption#getKey <em>Key</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.SequenceOption#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getSequenceOption()
 * @model
 * @generated
 */
public interface SequenceOption extends Option
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * The literals are from the enumeration {@link eagledata.core.dsl.datadesc.dataDsl.SequenceOptionKey}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see eagledata.core.dsl.datadesc.dataDsl.SequenceOptionKey
   * @see #setKey(SequenceOptionKey)
   * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getSequenceOption_Key()
   * @model
   * @generated
   */
  SequenceOptionKey getKey();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadesc.dataDsl.SequenceOption#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see eagledata.core.dsl.datadesc.dataDsl.SequenceOptionKey
   * @see #getKey()
   * @generated
   */
  void setKey(SequenceOptionKey value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(StringConcept)
   * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getSequenceOption_Value()
   * @model
   * @generated
   */
  StringConcept getValue();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadesc.dataDsl.SequenceOption#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(StringConcept value);

} // SequenceOption
