/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.streamingDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Latitude Longitude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.LatitudeLongitude#getLat <em>Lat</em>}</li>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.LatitudeLongitude#getLong <em>Long</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage#getLatitudeLongitude()
 * @model
 * @generated
 */
public interface LatitudeLongitude extends Coordinate
{
  /**
   * Returns the value of the '<em><b>Lat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat</em>' attribute.
   * @see #setLat(double)
   * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage#getLatitudeLongitude_Lat()
   * @model
   * @generated
   */
  double getLat();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.pattern.streamingDsl.LatitudeLongitude#getLat <em>Lat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat</em>' attribute.
   * @see #getLat()
   * @generated
   */
  void setLat(double value);

  /**
   * Returns the value of the '<em><b>Long</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long</em>' attribute.
   * @see #setLong(double)
   * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage#getLatitudeLongitude_Long()
   * @model
   * @generated
   */
  double getLong();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.pattern.streamingDsl.LatitudeLongitude#getLong <em>Long</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long</em>' attribute.
   * @see #getLong()
   * @generated
   */
  void setLong(double value);

} // LatitudeLongitude