/**
 */
package ecarules;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.Action#getCalls <em>Calls</em>}</li>
 *   <li>{@link ecarules.Action#getActionParams <em>Action Params</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getAction()
 * @model abstract="true"
 * @extends PersistentEObject
 * @generated
 */
public interface Action extends PersistentEObject {

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' reference.
	 * @see #setCalls(ActionExecutableExtension)
	 * @see ecarules.EcarulesPackage#getAction_Calls()
	 * @model required="true"
	 * @generated
	 */
	ActionExecutableExtension getCalls();

	/**
	 * Sets the value of the '{@link ecarules.Action#getCalls <em>Calls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls</em>' reference.
	 * @see #getCalls()
	 * @generated
	 */
	void setCalls(ActionExecutableExtension value);

	/**
	 * Returns the value of the '<em><b>Action Params</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.ActionParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Params</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getAction_ActionParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionParam> getActionParams();

} // Action
