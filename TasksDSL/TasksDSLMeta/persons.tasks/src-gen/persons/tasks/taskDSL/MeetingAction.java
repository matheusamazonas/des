/**
 * generated by Xtext 2.12.0
 */
package persons.tasks.taskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meeting Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.MeetingAction#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see persons.tasks.taskDSL.TaskDSLPackage#getMeetingAction()
 * @model
 * @generated
 */
public interface MeetingAction extends Action
{
  /**
   * Returns the value of the '<em><b>Topic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topic</em>' attribute.
   * @see #setTopic(String)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getMeetingAction_Topic()
   * @model
   * @generated
   */
  String getTopic();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.MeetingAction#getTopic <em>Topic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Topic</em>' attribute.
   * @see #getTopic()
   * @generated
   */
  void setTopic(String value);

} // MeetingAction
