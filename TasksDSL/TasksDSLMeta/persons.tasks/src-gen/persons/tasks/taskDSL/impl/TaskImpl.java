/**
 * generated by Xtext 2.12.0
 */
package persons.tasks.taskDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import persons.tasks.taskDSL.Action;
import persons.tasks.taskDSL.Duration;
import persons.tasks.taskDSL.Person;
import persons.tasks.taskDSL.Project;
import persons.tasks.taskDSL.ProjectUse;
import persons.tasks.taskDSL.Task;
import persons.tasks.taskDSL.TaskDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.impl.TaskImpl#getAction <em>Action</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.impl.TaskImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.impl.TaskImpl#getPrio <em>Prio</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.impl.TaskImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.impl.TaskImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.impl.TaskImpl#getUse <em>Use</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.impl.TaskImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task
{
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
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getPersons() <em>Persons</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersons()
   * @generated
   * @ordered
   */
  protected EList<Person> persons;

  /**
   * The default value of the '{@link #getPrio() <em>Prio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrio()
   * @generated
   * @ordered
   */
  protected static final int PRIO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrio() <em>Prio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrio()
   * @generated
   * @ordered
   */
  protected int prio = PRIO_EDEFAULT;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected Duration duration;

  /**
   * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjects()
   * @generated
   * @ordered
   */
  protected EList<Project> projects;

  /**
   * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUse()
   * @generated
   * @ordered
   */
  protected EList<ProjectUse> use;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected Task extends_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
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
    return TaskDSLPackage.Literals.TASK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TaskDSLPackage.TASK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskDSLPackage.TASK__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskDSLPackage.TASK__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskDSLPackage.TASK__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskDSLPackage.TASK__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getPersons()
  {
    if (persons == null)
    {
      persons = new EObjectResolvingEList<Person>(Person.class, this, TaskDSLPackage.TASK__PERSONS);
    }
    return persons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPrio()
  {
    return prio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrio(int newPrio)
  {
    int oldPrio = prio;
    prio = newPrio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskDSLPackage.TASK__PRIO, oldPrio, prio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDuration(Duration newDuration, NotificationChain msgs)
  {
    Duration oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskDSLPackage.TASK__DURATION, oldDuration, newDuration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(Duration newDuration)
  {
    if (newDuration != duration)
    {
      NotificationChain msgs = null;
      if (duration != null)
        msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskDSLPackage.TASK__DURATION, null, msgs);
      if (newDuration != null)
        msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskDSLPackage.TASK__DURATION, null, msgs);
      msgs = basicSetDuration(newDuration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskDSLPackage.TASK__DURATION, newDuration, newDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Project> getProjects()
  {
    if (projects == null)
    {
      projects = new EObjectContainmentEList<Project>(Project.class, this, TaskDSLPackage.TASK__PROJECTS);
    }
    return projects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProjectUse> getUse()
  {
    if (use == null)
    {
      use = new EObjectContainmentEList<ProjectUse>(ProjectUse.class, this, TaskDSLPackage.TASK__USE);
    }
    return use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getExtends()
  {
    if (extends_ != null && extends_.eIsProxy())
    {
      InternalEObject oldExtends = (InternalEObject)extends_;
      extends_ = (Task)eResolveProxy(oldExtends);
      if (extends_ != oldExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskDSLPackage.TASK__EXTENDS, oldExtends, extends_));
      }
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task basicGetExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(Task newExtends)
  {
    Task oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskDSLPackage.TASK__EXTENDS, oldExtends, extends_));
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
      case TaskDSLPackage.TASK__ACTION:
        return basicSetAction(null, msgs);
      case TaskDSLPackage.TASK__DURATION:
        return basicSetDuration(null, msgs);
      case TaskDSLPackage.TASK__PROJECTS:
        return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
      case TaskDSLPackage.TASK__USE:
        return ((InternalEList<?>)getUse()).basicRemove(otherEnd, msgs);
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
      case TaskDSLPackage.TASK__NAME:
        return getName();
      case TaskDSLPackage.TASK__ACTION:
        return getAction();
      case TaskDSLPackage.TASK__PERSONS:
        return getPersons();
      case TaskDSLPackage.TASK__PRIO:
        return getPrio();
      case TaskDSLPackage.TASK__DURATION:
        return getDuration();
      case TaskDSLPackage.TASK__PROJECTS:
        return getProjects();
      case TaskDSLPackage.TASK__USE:
        return getUse();
      case TaskDSLPackage.TASK__EXTENDS:
        if (resolve) return getExtends();
        return basicGetExtends();
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
      case TaskDSLPackage.TASK__NAME:
        setName((String)newValue);
        return;
      case TaskDSLPackage.TASK__ACTION:
        setAction((Action)newValue);
        return;
      case TaskDSLPackage.TASK__PERSONS:
        getPersons().clear();
        getPersons().addAll((Collection<? extends Person>)newValue);
        return;
      case TaskDSLPackage.TASK__PRIO:
        setPrio((Integer)newValue);
        return;
      case TaskDSLPackage.TASK__DURATION:
        setDuration((Duration)newValue);
        return;
      case TaskDSLPackage.TASK__PROJECTS:
        getProjects().clear();
        getProjects().addAll((Collection<? extends Project>)newValue);
        return;
      case TaskDSLPackage.TASK__USE:
        getUse().clear();
        getUse().addAll((Collection<? extends ProjectUse>)newValue);
        return;
      case TaskDSLPackage.TASK__EXTENDS:
        setExtends((Task)newValue);
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
      case TaskDSLPackage.TASK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TaskDSLPackage.TASK__ACTION:
        setAction((Action)null);
        return;
      case TaskDSLPackage.TASK__PERSONS:
        getPersons().clear();
        return;
      case TaskDSLPackage.TASK__PRIO:
        setPrio(PRIO_EDEFAULT);
        return;
      case TaskDSLPackage.TASK__DURATION:
        setDuration((Duration)null);
        return;
      case TaskDSLPackage.TASK__PROJECTS:
        getProjects().clear();
        return;
      case TaskDSLPackage.TASK__USE:
        getUse().clear();
        return;
      case TaskDSLPackage.TASK__EXTENDS:
        setExtends((Task)null);
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
      case TaskDSLPackage.TASK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TaskDSLPackage.TASK__ACTION:
        return action != null;
      case TaskDSLPackage.TASK__PERSONS:
        return persons != null && !persons.isEmpty();
      case TaskDSLPackage.TASK__PRIO:
        return prio != PRIO_EDEFAULT;
      case TaskDSLPackage.TASK__DURATION:
        return duration != null;
      case TaskDSLPackage.TASK__PROJECTS:
        return projects != null && !projects.isEmpty();
      case TaskDSLPackage.TASK__USE:
        return use != null && !use.isEmpty();
      case TaskDSLPackage.TASK__EXTENDS:
        return extends_ != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", prio: ");
    result.append(prio);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
