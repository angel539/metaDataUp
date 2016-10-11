/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ruleDsl.impl;

import eagledata.core.dsl.datadesc.dataDsl.DataDescription;
import eagledata.core.dsl.datadesc.dataDsl.PrimitiveNode;

import eagledata.core.dsl.rule.ruleDsl.RuleDslPackage;
import eagledata.core.dsl.rule.ruleDsl.SetSelect;
import eagledata.core.dsl.rule.ruleDsl.Where;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.impl.SetSelectImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.impl.SetSelectImpl#getFrom <em>From</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.impl.SetSelectImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetSelectImpl extends SelectImpl implements SetSelect
{
  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected EList<PrimitiveNode> selector;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected EList<DataDescription> from;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected EList<Where> where;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetSelectImpl()
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
    return RuleDslPackage.Literals.SET_SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PrimitiveNode> getSelector()
  {
    if (selector == null)
    {
      selector = new EObjectResolvingEList<PrimitiveNode>(PrimitiveNode.class, this, RuleDslPackage.SET_SELECT__SELECTOR);
    }
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataDescription> getFrom()
  {
    if (from == null)
    {
      from = new EObjectResolvingEList<DataDescription>(DataDescription.class, this, RuleDslPackage.SET_SELECT__FROM);
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Where> getWhere()
  {
    if (where == null)
    {
      where = new EObjectContainmentEList<Where>(Where.class, this, RuleDslPackage.SET_SELECT__WHERE);
    }
    return where;
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
      case RuleDslPackage.SET_SELECT__WHERE:
        return ((InternalEList<?>)getWhere()).basicRemove(otherEnd, msgs);
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
      case RuleDslPackage.SET_SELECT__SELECTOR:
        return getSelector();
      case RuleDslPackage.SET_SELECT__FROM:
        return getFrom();
      case RuleDslPackage.SET_SELECT__WHERE:
        return getWhere();
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
      case RuleDslPackage.SET_SELECT__SELECTOR:
        getSelector().clear();
        getSelector().addAll((Collection<? extends PrimitiveNode>)newValue);
        return;
      case RuleDslPackage.SET_SELECT__FROM:
        getFrom().clear();
        getFrom().addAll((Collection<? extends DataDescription>)newValue);
        return;
      case RuleDslPackage.SET_SELECT__WHERE:
        getWhere().clear();
        getWhere().addAll((Collection<? extends Where>)newValue);
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
      case RuleDslPackage.SET_SELECT__SELECTOR:
        getSelector().clear();
        return;
      case RuleDslPackage.SET_SELECT__FROM:
        getFrom().clear();
        return;
      case RuleDslPackage.SET_SELECT__WHERE:
        getWhere().clear();
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
      case RuleDslPackage.SET_SELECT__SELECTOR:
        return selector != null && !selector.isEmpty();
      case RuleDslPackage.SET_SELECT__FROM:
        return from != null && !from.isEmpty();
      case RuleDslPackage.SET_SELECT__WHERE:
        return where != null && !where.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SetSelectImpl
