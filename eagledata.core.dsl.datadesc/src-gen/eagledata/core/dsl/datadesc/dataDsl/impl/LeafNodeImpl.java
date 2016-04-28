/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.datadesc.dataDsl.impl;

import eagledata.core.dsl.datadesc.dataDsl.BasicType;
import eagledata.core.dsl.datadesc.dataDsl.DataDslPackage;
import eagledata.core.dsl.datadesc.dataDsl.LeafNode;
import eagledata.core.dsl.datadesc.dataDsl.Option;
import eagledata.core.dsl.datadesc.dataDsl.TypeSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaf Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.impl.LeafNodeImpl#isKey <em>Key</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.impl.LeafNodeImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.impl.LeafNodeImpl#isList <em>List</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.impl.LeafNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.impl.LeafNodeImpl#getTypeCall <em>Type Call</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.impl.LeafNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadesc.dataDsl.impl.LeafNodeImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeafNodeImpl extends MinimalEObjectImpl.Container implements LeafNode
{
  /**
   * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKey()
   * @generated
   * @ordered
   */
  protected static final boolean KEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKey()
   * @generated
   * @ordered
   */
  protected boolean key = KEY_EDEFAULT;

  /**
   * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected static final boolean UNIQUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected boolean unique = UNIQUE_EDEFAULT;

  /**
   * The default value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected static final boolean LIST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected boolean list = LIST_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final BasicType TYPE_EDEFAULT = BasicType.STRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected BasicType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeCall() <em>Type Call</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeCall()
   * @generated
   * @ordered
   */
  protected TypeSpecification typeCall;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<Option> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeafNodeImpl()
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
    return DataDslPackage.Literals.LEAF_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(boolean newKey)
  {
    boolean oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataDslPackage.LEAF_NODE__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnique()
  {
    return unique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnique(boolean newUnique)
  {
    boolean oldUnique = unique;
    unique = newUnique;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataDslPackage.LEAF_NODE__UNIQUE, oldUnique, unique));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(boolean newList)
  {
    boolean oldList = list;
    list = newList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataDslPackage.LEAF_NODE__LIST, oldList, list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(BasicType newType)
  {
    BasicType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataDslPackage.LEAF_NODE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecification getTypeCall()
  {
    if (typeCall != null && typeCall.eIsProxy())
    {
      InternalEObject oldTypeCall = (InternalEObject)typeCall;
      typeCall = (TypeSpecification)eResolveProxy(oldTypeCall);
      if (typeCall != oldTypeCall)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataDslPackage.LEAF_NODE__TYPE_CALL, oldTypeCall, typeCall));
      }
    }
    return typeCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecification basicGetTypeCall()
  {
    return typeCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeCall(TypeSpecification newTypeCall)
  {
    TypeSpecification oldTypeCall = typeCall;
    typeCall = newTypeCall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataDslPackage.LEAF_NODE__TYPE_CALL, oldTypeCall, typeCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataDslPackage.LEAF_NODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Option> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<Option>(Option.class, this, DataDslPackage.LEAF_NODE__OPTIONS);
    }
    return options;
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
      case DataDslPackage.LEAF_NODE__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
      case DataDslPackage.LEAF_NODE__KEY:
        return isKey();
      case DataDslPackage.LEAF_NODE__UNIQUE:
        return isUnique();
      case DataDslPackage.LEAF_NODE__LIST:
        return isList();
      case DataDslPackage.LEAF_NODE__TYPE:
        return getType();
      case DataDslPackage.LEAF_NODE__TYPE_CALL:
        if (resolve) return getTypeCall();
        return basicGetTypeCall();
      case DataDslPackage.LEAF_NODE__NAME:
        return getName();
      case DataDslPackage.LEAF_NODE__OPTIONS:
        return getOptions();
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
      case DataDslPackage.LEAF_NODE__KEY:
        setKey((Boolean)newValue);
        return;
      case DataDslPackage.LEAF_NODE__UNIQUE:
        setUnique((Boolean)newValue);
        return;
      case DataDslPackage.LEAF_NODE__LIST:
        setList((Boolean)newValue);
        return;
      case DataDslPackage.LEAF_NODE__TYPE:
        setType((BasicType)newValue);
        return;
      case DataDslPackage.LEAF_NODE__TYPE_CALL:
        setTypeCall((TypeSpecification)newValue);
        return;
      case DataDslPackage.LEAF_NODE__NAME:
        setName((String)newValue);
        return;
      case DataDslPackage.LEAF_NODE__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends Option>)newValue);
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
      case DataDslPackage.LEAF_NODE__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case DataDslPackage.LEAF_NODE__UNIQUE:
        setUnique(UNIQUE_EDEFAULT);
        return;
      case DataDslPackage.LEAF_NODE__LIST:
        setList(LIST_EDEFAULT);
        return;
      case DataDslPackage.LEAF_NODE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DataDslPackage.LEAF_NODE__TYPE_CALL:
        setTypeCall((TypeSpecification)null);
        return;
      case DataDslPackage.LEAF_NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataDslPackage.LEAF_NODE__OPTIONS:
        getOptions().clear();
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
      case DataDslPackage.LEAF_NODE__KEY:
        return key != KEY_EDEFAULT;
      case DataDslPackage.LEAF_NODE__UNIQUE:
        return unique != UNIQUE_EDEFAULT;
      case DataDslPackage.LEAF_NODE__LIST:
        return list != LIST_EDEFAULT;
      case DataDslPackage.LEAF_NODE__TYPE:
        return type != TYPE_EDEFAULT;
      case DataDslPackage.LEAF_NODE__TYPE_CALL:
        return typeCall != null;
      case DataDslPackage.LEAF_NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataDslPackage.LEAF_NODE__OPTIONS:
        return options != null && !options.isEmpty();
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
    result.append(" (key: ");
    result.append(key);
    result.append(", unique: ");
    result.append(unique);
    result.append(", list: ");
    result.append(list);
    result.append(", type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LeafNodeImpl
