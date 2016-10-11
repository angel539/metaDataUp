/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.streamingDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UTM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.UTM#getE <em>E</em>}</li>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.UTM#getN <em>N</em>}</li>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.UTM#getZ <em>Z</em>}</li>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.UTM#getHemi <em>Hemi</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage#getUTM()
 * @model
 * @generated
 */
public interface UTM extends Coordinate
{
  /**
   * Returns the value of the '<em><b>E</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' attribute.
   * @see #setE(double)
   * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage#getUTM_E()
   * @model
   * @generated
   */
  double getE();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.pattern.streamingDsl.UTM#getE <em>E</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' attribute.
   * @see #getE()
   * @generated
   */
  void setE(double value);

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(double)
   * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage#getUTM_N()
   * @model
   * @generated
   */
  double getN();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.pattern.streamingDsl.UTM#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(double value);

  /**
   * Returns the value of the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Z</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Z</em>' attribute.
   * @see #setZ(double)
   * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage#getUTM_Z()
   * @model
   * @generated
   */
  double getZ();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.pattern.streamingDsl.UTM#getZ <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Z</em>' attribute.
   * @see #getZ()
   * @generated
   */
  void setZ(double value);

  /**
   * Returns the value of the '<em><b>Hemi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hemi</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hemi</em>' attribute.
   * @see #setHemi(double)
   * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage#getUTM_Hemi()
   * @model
   * @generated
   */
  double getHemi();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.pattern.streamingDsl.UTM#getHemi <em>Hemi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hemi</em>' attribute.
   * @see #getHemi()
   * @generated
   */
  void setHemi(double value);

} // UTM
