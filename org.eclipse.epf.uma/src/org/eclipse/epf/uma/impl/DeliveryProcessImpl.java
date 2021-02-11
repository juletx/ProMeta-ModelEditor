/**
 */
package org.eclipse.epf.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.epf.uma.DeliveryProcess;
import org.eclipse.epf.uma.SupportingMaterial;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.DeliveryProcessImpl#getEducationMaterials <em>Education Materials</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.DeliveryProcessImpl#getCommunicationsMaterials <em>Communications Materials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryProcessImpl extends ProcessImpl implements DeliveryProcess {
	/**
	 * The cached value of the '{@link #getEducationMaterials() <em>Education Materials</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportingMaterial> educationMaterials;

	/**
	 * The cached value of the '{@link #getCommunicationsMaterials() <em>Communications Materials</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationsMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportingMaterial> communicationsMaterials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getDeliveryProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportingMaterial> getEducationMaterials() {
		if (educationMaterials == null) {
			educationMaterials = new EObjectResolvingEList<SupportingMaterial>(SupportingMaterial.class, this, UmaPackage.DELIVERY_PROCESS__EDUCATION_MATERIALS);
		}
		return educationMaterials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportingMaterial> getCommunicationsMaterials() {
		if (communicationsMaterials == null) {
			communicationsMaterials = new EObjectResolvingEList<SupportingMaterial>(SupportingMaterial.class, this, UmaPackage.DELIVERY_PROCESS__COMMUNICATIONS_MATERIALS);
		}
		return communicationsMaterials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__EDUCATION_MATERIALS:
				return getEducationMaterials();
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATIONS_MATERIALS:
				return getCommunicationsMaterials();
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
			case UmaPackage.DELIVERY_PROCESS__EDUCATION_MATERIALS:
				getEducationMaterials().clear();
				getEducationMaterials().addAll((Collection<? extends SupportingMaterial>)newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATIONS_MATERIALS:
				getCommunicationsMaterials().clear();
				getCommunicationsMaterials().addAll((Collection<? extends SupportingMaterial>)newValue);
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
			case UmaPackage.DELIVERY_PROCESS__EDUCATION_MATERIALS:
				getEducationMaterials().clear();
				return;
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATIONS_MATERIALS:
				getCommunicationsMaterials().clear();
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
			case UmaPackage.DELIVERY_PROCESS__EDUCATION_MATERIALS:
				return educationMaterials != null && !educationMaterials.isEmpty();
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATIONS_MATERIALS:
				return communicationsMaterials != null && !communicationsMaterials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeliveryProcessImpl
