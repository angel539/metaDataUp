/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.streamingDsl.impl;

import eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage;
import eagledata.core.dsl.pattern.streamingDsl.UTM;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UTM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.impl.UTMImpl#getE <em>E</em>}</li>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.impl.UTMImpl#getN <em>N</em>}</li>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.impl.UTMImpl#getZ <em>Z</em>}</li>
 *   <li>{@link eagledata.core.dsl.pattern.streamingDsl.impl.UTMImpl#getHemi <em>Hemi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UTMImpl extends CoordinateImpl implements UTM
{
  /**
   * The default value of the '{@link #getE() <em>E</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected static final double E_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected double e = E_EDEFAULT;

  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final double N_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected double n = N_EDEFAULT;

  /**
   * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected static final double Z_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected double z = Z_EDEFAULT;

  /**
   * The default value of the '{@link #getHemi() <em>Hemi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHemi()
   * @generated
   * @ordered
   */
  protected static final double HEMI_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getHemi() <em>Hemi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHemi()
   * @generated
   * @ordered
   */
  protected double hemi = HEMI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UTMImpl()
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
    return StreamingDslPackage.Literals.UTM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(double newE)
  {
    double oldE = e;
    e = newE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StreamingDslPackage.UTM__E, oldE, e));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(double newN)
  {
    double oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StreamingDslPackage.UTM__N, oldN, n));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getZ()
  {
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZ(double newZ)
  {
    double oldZ = z;
    z = newZ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StreamingDslPackage.UTM__Z, oldZ, z));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getHemi()
  {
    return hemi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHemi(double newHemi)
  {
    double oldHemi = hemi;
    hemi = newHemi;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StreamingDslPackage.UTM__HEMI, oldHemi, hemi));
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
      case StreamingDslPackage.UTM__E:
        return getE();
      case StreamingDslPackage.UTM__N:
        return getN();
      case StreamingDslPackage.UTM__Z:
        return getZ();
      case StreamingDslPackage.UTM__HEMI:
        return getHemi();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StreamingDslPackage.UTM__E:
        setE((Double)newValue);
        return;
      case StreamingDslPackage.UTM__N:
        setN((Double)newValue);
        return;
      case StreamingDslPackage.UTM__Z:
        setZ((Double)newValue);
        return;
      case StreamingDslPackage.UTM__HEMI:
        setHemi((Double)newValue);
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
      case StreamingDslPackage.UTM__E:
        setE(E_EDEFAULT);
        return;
      case StreamingDslPackage.UTM__N:
        setN(N_EDEFAULT);
        return;
      case StreamingDslPackage.UTM__Z:
        setZ(Z_EDEFAULT);
        return;
      case StreamingDslPackage.UTM__HEMI:
        setHemi(HEMI_EDEFAULT);
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
      case StreamingDslPackage.UTM__E:
        return e != E_EDEFAULT;
      case StreamingDslPackage.UTM__N:
        return n != N_EDEFAULT;
      case StreamingDslPackage.UTM__Z:
        return z != Z_EDEFAULT;
      case StreamingDslPackage.UTM__HEMI:
        return hemi != HEMI_EDEFAULT;
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
    result.append(" (e: ");
    result.append(e);
    result.append(", n: ");
    result.append(n);
    result.append(", z: ");
    result.append(z);
    result.append(", Hemi: ");
    result.append(hemi);
    result.append(')');
    return result.toString();
  }

} //UTMImpl