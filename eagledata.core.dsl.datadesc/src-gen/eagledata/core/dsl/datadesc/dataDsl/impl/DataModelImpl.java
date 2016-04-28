/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.datadesc.dataDsl.impl;

import eagledata.core.dsl.datadesc.dataDsl.DataDslPackage;
import eagledata.core.dsl.datadesc.dataDsl.DataModel;
import eagledata.core.dsl.datadesc.dataDsl.DataModelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.impl.DataModelImpl#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataModelImpl extends MinimalEObjectImpl.Container implements DataModel
{
  /**
   * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptions()
   * @generated
   * @ordered
   */
  protected EList<DataModelElement> descriptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DataDslPackage.Literals.DATA_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataModelElement> getDescriptions()
  {
    if (descriptions == null)
    {
      descriptions = new EObjectContainmentEList<DataModelElement>(DataModelElement.class, this, DataDslPackage.DATA_MODEL__DESCRIPTIONS);
    }
    return descriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DataDslPackage.DATA_MODEL__DESCRIPTIONS:
        return ((InternalEList<?>)getDescriptions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DataDslPackage.DATA_MODEL__DESCRIPTIONS:
        return getDescriptions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DataDslPackage.DATA_MODEL__DESCRIPTIONS:
        getDescriptions().clear();
        getDescriptions().addAll((Collection<? extends DataModelElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DataDslPackage.DATA_MODEL__DESCRIPTIONS:
        getDescriptions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DataDslPackage.DATA_MODEL__DESCRIPTIONS:
        return descriptions != null && !descriptions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DataModelImpl
