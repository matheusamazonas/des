/**
 * generated by Xtext 2.12.0
 */
package persons.tasks.taskDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.Duration#getDl <em>Dl</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.Duration#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see persons.tasks.taskDSL.TaskDSLPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends EObject
{
  /**
   * Returns the value of the '<em><b>Dl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dl</em>' attribute.
   * @see #setDl(int)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getDuration_Dl()
   * @model
   * @generated
   */
  int getDl();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.Duration#getDl <em>Dl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dl</em>' attribute.
   * @see #getDl()
   * @generated
   */
  void setDl(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link persons.tasks.taskDSL.TimeUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see persons.tasks.taskDSL.TimeUnit
   * @see #setUnit(TimeUnit)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getDuration_Unit()
   * @model
   * @generated
   */
  TimeUnit getUnit();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.Duration#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see persons.tasks.taskDSL.TimeUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(TimeUnit value);

} // Duration
