/**
 */
package org.eclipse.epf.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epf.uma.ApplicableMetaClassInfo;
import org.eclipse.epf.uma.Kind;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.KindImpl#getApplicableMetaClassInfo <em>Applicable Meta Class Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindImpl extends ContentElementImpl implements Kind {
	/**
	 * The cached value of the '{@link #getApplicableMetaClassInfo() <em>Applicable Meta Class Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableMetaClassInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicableMetaClassInfo> applicableMetaClassInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getKind();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicableMetaClassInfo> getApplicableMetaClassInfo() {
		if (applicableMetaClassInfo == null) {
			applicableMetaClassInfo = new EObjectContainmentEList.Resolving<ApplicableMetaClassInfo>(ApplicableMetaClassInfo.class, this, UmaPackage.KIND__APPLICABLE_META_CLASS_INFO);
		}
		return applicableMetaClassInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.KIND__APPLICABLE_META_CLASS_INFO:
				return ((InternalEList<?>)getApplicableMetaClassInfo()).basicRemove(otherEnd, msgs);
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
			case UmaPackage.KIND__APPLICABLE_META_CLASS_INFO:
				return getApplicableMetaClassInfo();
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
			case UmaPackage.KIND__APPLICABLE_META_CLASS_INFO:
				getApplicableMetaClassInfo().clear();
				getApplicableMetaClassInfo().addAll((Collection<? extends ApplicableMetaClassInfo>)newValue);
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
			case UmaPackage.KIND__APPLICABLE_META_CLASS_INFO:
				getApplicableMetaClassInfo().clear();
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
			case UmaPackage.KIND__APPLICABLE_META_CLASS_INFO:
				return applicableMetaClassInfo != null && !applicableMetaClassInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KindImpl
