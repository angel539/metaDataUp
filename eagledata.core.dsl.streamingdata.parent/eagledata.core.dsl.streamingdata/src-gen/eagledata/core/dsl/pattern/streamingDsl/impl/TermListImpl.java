/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.streamingDsl.impl;

import eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage;
import eagledata.core.dsl.pattern.streamingDsl.TermList;
import eagledata.core.dsl.pattern.streamingDsl.WordListProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.impl.TermListImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.impl.TermListImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermListImpl extends ConceptImpl implements TermList
{
  /**
   * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected static final WordListProperty PROPERTY_EDEFAULT = WordListProperty.ALL;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected WordListProperty property = PROPERTY_EDEFAULT;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected EList<String> terms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermListImpl()
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
    return StreamingDslPackage.Literals.TERM_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WordListProperty getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(WordListProperty newProperty)
  {
    WordListProperty oldProperty = property;
    property = newProperty == null ? PROPERTY_EDEFAULT : newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StreamingDslPackage.TERM_LIST__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTerms()
  {
    if (terms == null)
    {
      terms = new EDataTypeEList<String>(String.class, this, StreamingDslPackage.TERM_LIST__TERMS);
    }
    return terms;
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
      case StreamingDslPackage.TERM_LIST__PROPERTY:
        return getProperty();
      case StreamingDslPackage.TERM_LIST__TERMS:
        return getTerms();
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
      case StreamingDslPackage.TERM_LIST__PROPERTY:
        setProperty((WordListProperty)newValue);
        return;
      case StreamingDslPackage.TERM_LIST__TERMS:
        getTerms().clear();
        getTerms().addAll((Collection<? extends String>)newValue);
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
      case StreamingDslPackage.TERM_LIST__PROPERTY:
        setProperty(PROPERTY_EDEFAULT);
        return;
      case StreamingDslPackage.TERM_LIST__TERMS:
        getTerms().clear();
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
      case StreamingDslPackage.TERM_LIST__PROPERTY:
        return property != PROPERTY_EDEFAULT;
      case StreamingDslPackage.TERM_LIST__TERMS:
        return terms != null && !terms.isEmpty();
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
    result.append(" (property: ");
    result.append(property);
    result.append(", terms: ");
    result.append(terms);
    result.append(')');
    return result.toString();
  }

} //TermListImpl