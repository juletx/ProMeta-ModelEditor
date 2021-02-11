/**
 */
package org.eclipse.epf.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.epf.uma.DeliveryProcess;
import org.eclipse.epf.uma.ProcessFamily;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.ProcessFamilyImpl#getDeliveryProcesses <em>Delivery Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessFamilyImpl extends MethodConfigurationImpl implements ProcessFamily {
	/**
	 * The cached value of the '{@link #getDeliveryProcesses() <em>Delivery Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<DeliveryProcess> deliveryProcesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessFamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getProcessFamily();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeliveryProcess> getDeliveryProcesses() {
		if (deliveryProcesses == null) {
			deliveryProcesses = new EObjectResolvingEList<DeliveryProcess>(DeliveryProcess.class, this, UmaPackage.PROCESS_FAMILY__DELIVERY_PROCESSES);
		}
		return deliveryProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.PROCESS_FAMILY__DELIVERY_PROCESSES:
				return getDeliveryProcesses();
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
			case UmaPackage.PROCESS_FAMILY__DELIVERY_PROCESSES:
				getDeliveryProcesses().clear();
				getDeliveryProcesses().addAll((Collection<? extends DeliveryProcess>)newValue);
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
			case UmaPackage.PROCESS_FAMILY__DELIVERY_PROCESSES:
				getDeliveryProcesses().clear();
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
			case UmaPackage.PROCESS_FAMILY__DELIVERY_PROCESSES:
				return deliveryProcesses != null && !deliveryProcesses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessFamilyImpl
