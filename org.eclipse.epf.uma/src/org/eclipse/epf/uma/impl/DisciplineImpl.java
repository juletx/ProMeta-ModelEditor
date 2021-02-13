/**
 */
package org.eclipse.epf.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epf.uma.Activity;
import org.eclipse.epf.uma.Discipline;
import org.eclipse.epf.uma.Task;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discipline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.DisciplineImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.DisciplineImpl#getSubdiscipline <em>Subdiscipline</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.DisciplineImpl#getReferenceWorkflows <em>Reference Workflows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisciplineImpl extends ContentCategoryImpl implements Discipline {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getSubdiscipline() <em>Subdiscipline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdiscipline()
	 * @generated
	 * @ordered
	 */
	protected EList<Discipline> subdiscipline;

	/**
	 * The cached value of the '{@link #getReferenceWorkflows() <em>Reference Workflows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceWorkflows()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> referenceWorkflows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisciplineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getDiscipline();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, UmaPackage.DISCIPLINE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discipline> getSubdiscipline() {
		if (subdiscipline == null) {
			subdiscipline = new EObjectContainmentEList.Resolving<Discipline>(Discipline.class, this, UmaPackage.DISCIPLINE__SUBDISCIPLINE);
		}
		return subdiscipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getReferenceWorkflows() {
		if (referenceWorkflows == null) {
			referenceWorkflows = new EObjectResolvingEList<Activity>(Activity.class, this, UmaPackage.DISCIPLINE__REFERENCE_WORKFLOWS);
		}
		return referenceWorkflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.DISCIPLINE__SUBDISCIPLINE:
				return ((InternalEList<?>)getSubdiscipline()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DISCIPLINE__TASKS:
				return getTasks();
			case UmaPackage.DISCIPLINE__SUBDISCIPLINE:
				return getSubdiscipline();
			case UmaPackage.DISCIPLINE__REFERENCE_WORKFLOWS:
				return getReferenceWorkflows();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmaPackage.DISCIPLINE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case UmaPackage.DISCIPLINE__SUBDISCIPLINE:
				getSubdiscipline().clear();
				getSubdiscipline().addAll((Collection<? extends Discipline>)newValue);
				return;
			case UmaPackage.DISCIPLINE__REFERENCE_WORKFLOWS:
				getReferenceWorkflows().clear();
				getReferenceWorkflows().addAll((Collection<? extends Activity>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case UmaPackage.DISCIPLINE__TASKS:
				getTasks().clear();
				return;
			case UmaPackage.DISCIPLINE__SUBDISCIPLINE:
				getSubdiscipline().clear();
				return;
			case UmaPackage.DISCIPLINE__REFERENCE_WORKFLOWS:
				getReferenceWorkflows().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UmaPackage.DISCIPLINE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case UmaPackage.DISCIPLINE__SUBDISCIPLINE:
				return subdiscipline != null && !subdiscipline.isEmpty();
			case UmaPackage.DISCIPLINE__REFERENCE_WORKFLOWS:
				return referenceWorkflows != null && !referenceWorkflows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DisciplineImpl
