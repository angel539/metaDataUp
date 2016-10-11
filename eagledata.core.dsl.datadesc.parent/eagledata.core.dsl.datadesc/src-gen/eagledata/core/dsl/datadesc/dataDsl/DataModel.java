/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.dataDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.DataModel#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
   * The list contents are of type {@link eagledata.core.dsl.datadesc.dataDsl.DataDescription}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descriptions</em>' containment reference list.
   * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getDataModel_Descriptions()
   * @model containment="true"
   * @generated
   */
  EList<DataDescription> getDescriptions();

} // DataModel
