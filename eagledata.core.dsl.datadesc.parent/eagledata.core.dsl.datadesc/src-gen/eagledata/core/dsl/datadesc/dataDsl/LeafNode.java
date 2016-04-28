/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.dataDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.LeafNode#getUniqueness <em>Uniqueness</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.LeafNode#getType <em>Type</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.LeafNode#getTypeCall <em>Type Call</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.LeafNode#isKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getLeafNode()
 * @model
 * @generated
 */
public interface LeafNode extends Node
{
  /**
   * Returns the value of the '<em><b>Uniqueness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uniqueness</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uniqueness</em>' attribute.
   * @see #setUniqueness(String)
   * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getLeafNode_Uniqueness()
   * @model
   * @generated
   */
  String getUniqueness();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadesc.dataDsl.LeafNode#getUniqueness <em>Uniqueness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uniqueness</em>' attribute.
   * @see #getUniqueness()
   * @generated
   */
  void setUniqueness(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link eagledata.core.dsl.datadesc.dataDsl.BasicType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see eagledata.core.dsl.datadesc.dataDsl.BasicType
   * @see #setType(BasicType)
   * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getLeafNode_Type()
   * @model
   * @generated
   */
  BasicType getType();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadesc.dataDsl.LeafNode#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see eagledata.core.dsl.datadesc.dataDsl.BasicType
   * @see #getType()
   * @generated
   */
  void setType(BasicType value);

  /**
   * Returns the value of the '<em><b>Type Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Call</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Call</em>' reference.
   * @see #setTypeCall(TypeSpecification)
   * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getLeafNode_TypeCall()
   * @model
   * @generated
   */
  TypeSpecification getTypeCall();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadesc.dataDsl.LeafNode#getTypeCall <em>Type Call</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Call</em>' reference.
   * @see #getTypeCall()
   * @generated
   */
  void setTypeCall(TypeSpecification value);

  /**
   * Returns the value of the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyword</em>' attribute.
   * @see #setKeyword(boolean)
   * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getLeafNode_Keyword()
   * @model
   * @generated
   */
  boolean isKeyword();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadesc.dataDsl.LeafNode#isKeyword <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyword</em>' attribute.
   * @see #isKeyword()
   * @generated
   */
  void setKeyword(boolean value);

} // LeafNode
