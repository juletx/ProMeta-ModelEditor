/**
 */
package org.eclipse.epf.uma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epf.uma.ProcessComponent;
import org.eclipse.epf.uma.ProcessComponentDescriptor;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Component Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.ProcessComponentDescriptorImpl#get_processComponent <em>process Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessComponentDescriptorImpl extends DescriptorImpl implements ProcessComponentDescriptor {
	/**
	 * The cached value of the '{@link #get_processComponent() <em>process Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_processComponent()
	 * @generated
	 * @ordered
	 */
	protected ProcessComponent _processComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessComponentDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getProcessComponentDescriptor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponent get_processComponent() {
		if (_processComponent != null && _processComponent.eIsProxy()) {
			InternalEObject old_processComponent = (InternalEObject)_processComponent;
			_processComponent = (ProcessComponent)eResolveProxy(old_processComponent);
			if (_processComponent != old_processComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmaPackage.PROCESS_COMPONENT_DESCRIPTOR__PROCESS_COMPONENT, old_processComponent, _processComponent));
			}
		}
		return _processComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponent basicGet_processComponent() {
		return _processComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_processComponent(ProcessComponent new_processComponent) {
		ProcessComponent old_processComponent = _processComponent;
		_processComponent = new_processComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.PROCESS_COMPONENT_DESCRIPTOR__PROCESS_COMPONENT, old_processComponent, _processComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.PROCESS_COMPONENT_DESCRIPTOR__PROCESS_COMPONENT:
				if (resolve) return get_processComponent();
				return basicGet_processComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmaPackage.PROCESS_COMPONENT_DESCRIPTOR__PROCESS_COMPONENT:
				set_processComponent((ProcessComponent)newValue);
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
			case UmaPackage.PROCESS_COMPONENT_DESCRIPTOR__PROCESS_COMPONENT:
				set_processComponent((ProcessComponent)null);
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
			case UmaPackage.PROCESS_COMPONENT_DESCRIPTOR__PROCESS_COMPONENT:
				return _processComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessComponentDescriptorImpl
