/**
 * generated by Xtext 2.12.0
 */
package persons.tasks.taskDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import persons.tasks.taskDSL.Duration;
import persons.tasks.taskDSL.TaskDSLPackage;
import persons.tasks.taskDSL.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.impl.DurationImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.impl.DurationImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationImpl extends MinimalEObjectImpl.Container implements Duration
{
  /**
   * The default value of the '{@link #getDl() <em>Dl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDl()
   * @generated
   * @ordered
   */
  protected static final int DL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDl() <em>Dl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDl()
   * @generated
   * @ordered
   */
  protected int dl = DL_EDEFAULT;

  /**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.MINUTE;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected TimeUnit unit = UNIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DurationImpl()
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
    return TaskDSLPackage.Literals.DURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDl()
  {
    return dl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDl(int newDl)
  {
    int oldDl = dl;
    dl = newDl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskDSLPackage.DURATION__DL, oldDl, dl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnit getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(TimeUnit newUnit)
  {
    TimeUnit oldUnit = unit;
    unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskDSLPackage.DURATION__UNIT, oldUnit, unit));
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
      case TaskDSLPackage.DURATION__DL:
        return getDl();
      case TaskDSLPackage.DURATION__UNIT:
        return getUnit();
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
      case TaskDSLPackage.DURATION__DL:
        setDl((Integer)newValue);
        return;
      case TaskDSLPackage.DURATION__UNIT:
        setUnit((TimeUnit)newValue);
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
      case TaskDSLPackage.DURATION__DL:
        setDl(DL_EDEFAULT);
        return;
      case TaskDSLPackage.DURATION__UNIT:
        setUnit(UNIT_EDEFAULT);
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
      case TaskDSLPackage.DURATION__DL:
        return dl != DL_EDEFAULT;
      case TaskDSLPackage.DURATION__UNIT:
        return unit != UNIT_EDEFAULT;
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
    result.append(" (dl: ");
    result.append(dl);
    result.append(", unit: ");
    result.append(unit);
    result.append(')');
    return result.toString();
  }

} //DurationImpl
