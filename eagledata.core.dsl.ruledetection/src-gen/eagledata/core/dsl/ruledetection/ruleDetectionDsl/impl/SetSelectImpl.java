/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.ruledetection.ruleDetectionDsl.impl;

import eagledata.core.dsl.datadesc.dataDsl.Node;

import eagledata.core.dsl.ruledetection.ruleDetectionDsl.RuleDetectionDslPackage;
import eagledata.core.dsl.ruledetection.ruleDetectionDsl.SetSelect;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.ruledetection.ruleDetectionDsl.impl.SetSelectImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link eagledata.core.dsl.ruledetection.ruleDetectionDsl.impl.SetSelectImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link eagledata.core.dsl.ruledetection.ruleDetectionDsl.impl.SetSelectImpl#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetSelectImpl extends SelectImpl implements SetSelect
{
  /**
   * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelection()
   * @generated
   * @ordered
   */
  protected EList<Node> selection;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected SetSelect select;

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
    return RuleDetectionDslPackage.Literals.SET_SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getSelection()
  {
    if (selection == null)
    {
      selection = new EObjectResolvingEList<Node>(Node.class, this, RuleDetectionDslPackage.SET_SELECT__SELECTION);
    }
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDetectionDslPackage.SET_SELECT__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetSelect getSelect()
  {
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelect(SetSelect newSelect, NotificationChain msgs)
  {
    SetSelect oldSelect = select;
    select = newSelect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDetectionDslPackage.SET_SELECT__SELECT, oldSelect, newSelect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelect(SetSelect newSelect)
  {
    if (newSelect != select)
    {
      NotificationChain msgs = null;
      if (select != null)
        msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDetectionDslPackage.SET_SELECT__SELECT, null, msgs);
      if (newSelect != null)
        msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDetectionDslPackage.SET_SELECT__SELECT, null, msgs);
      msgs = basicSetSelect(newSelect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDetectionDslPackage.SET_SELECT__SELECT, newSelect, newSelect));
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
      case RuleDetectionDslPackage.SET_SELECT__SELECT:
        return basicSetSelect(null, msgs);
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
      case RuleDetectionDslPackage.SET_SELECT__SELECTION:
        return getSelection();
      case RuleDetectionDslPackage.SET_SELECT__OPERATOR:
        return getOperator();
      case RuleDetectionDslPackage.SET_SELECT__SELECT:
        return getSelect();
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
      case RuleDetectionDslPackage.SET_SELECT__SELECTION:
        getSelection().clear();
        getSelection().addAll((Collection<? extends Node>)newValue);
        return;
      case RuleDetectionDslPackage.SET_SELECT__OPERATOR:
        setOperator((String)newValue);
        return;
      case RuleDetectionDslPackage.SET_SELECT__SELECT:
        setSelect((SetSelect)newValue);
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
      case RuleDetectionDslPackage.SET_SELECT__SELECTION:
        getSelection().clear();
        return;
      case RuleDetectionDslPackage.SET_SELECT__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case RuleDetectionDslPackage.SET_SELECT__SELECT:
        setSelect((SetSelect)null);
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
      case RuleDetectionDslPackage.SET_SELECT__SELECTION:
        return selection != null && !selection.isEmpty();
      case RuleDetectionDslPackage.SET_SELECT__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case RuleDetectionDslPackage.SET_SELECT__SELECT:
        return select != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //SetSelectImpl
