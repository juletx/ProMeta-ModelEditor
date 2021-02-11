/**
 */
package org.eclipse.epf.uma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epf.uma.BreakdownElementDescription;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breakdown Element Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.BreakdownElementDescriptionImpl#getUsageGuidance <em>Usage Guidance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakdownElementDescriptionImpl extends ContentDescriptionImpl implements BreakdownElementDescription {
	/**
	 * The default value of the '{@link #getUsageGuidance() <em>Usage Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageGuidance()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_GUIDANCE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUsageGuidance() <em>Usage Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageGuidance()
	 * @generated
	 * @ordered
	 */
	protected String usageGuidance = USAGE_GUIDANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakdownElementDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getBreakdownElementDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageGuidance() {
		return usageGuidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageGuidance(String newUsageGuidance) {
		String oldUsageGuidance = usageGuidance;
		usageGuidance = newUsageGuidance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.BREAKDOWN_ELEMENT_DESCRIPTION__USAGE_GUIDANCE, oldUsageGuidance, usageGuidance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.BREAKDOWN_ELEMENT_DESCRIPTION__USAGE_GUIDANCE:
				return getUsageGuidance();
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
			case UmaPackage.BREAKDOWN_ELEMENT_DESCRIPTION__USAGE_GUIDANCE:
				setUsageGuidance((String)newValue);
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
			case UmaPackage.BREAKDOWN_ELEMENT_DESCRIPTION__USAGE_GUIDANCE:
				setUsageGuidance(USAGE_GUIDANCE_EDEFAULT);
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
			case UmaPackage.BREAKDOWN_ELEMENT_DESCRIPTION__USAGE_GUIDANCE:
				return USAGE_GUIDANCE_EDEFAULT == null ? usageGuidance != null : !USAGE_GUIDANCE_EDEFAULT.equals(usageGuidance);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (usageGuidance: ");
		result.append(usageGuidance);
		result.append(')');
		return result.toString();
	}

} //BreakdownElementDescriptionImpl
