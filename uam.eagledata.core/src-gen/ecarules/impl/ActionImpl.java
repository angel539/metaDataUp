/**
 */
package ecarules.impl;

import ecarules.Action;
import ecarules.ActionExecutableExtension;
import ecarules.ActionParam;
import ecarules.EcarulesPackage;
import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.ActionImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link ecarules.impl.ActionImpl#getActionParams <em>Action Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends DefaultPersistentEObject implements Action {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExecutableExtension getCalls() {
		return (ActionExecutableExtension)eGet(EcarulesPackage.Literals.ACTION__CALLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalls(ActionExecutableExtension newCalls) {
		eSet(EcarulesPackage.Literals.ACTION__CALLS, newCalls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActionParam> getActionParams() {
		return (EList<ActionParam>)eGet(EcarulesPackage.Literals.ACTION__ACTION_PARAMS, true);
	}

} //ActionImpl
