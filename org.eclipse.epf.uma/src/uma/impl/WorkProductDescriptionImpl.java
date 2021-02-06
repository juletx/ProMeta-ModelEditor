/**
 */
package uma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uma.UmaPackage;
import uma.WorkProductDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.WorkProductDescriptionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link uma.impl.WorkProductDescriptionImpl#getImpactOfNotHaving <em>Impact Of Not Having</em>}</li>
 *   <li>{@link uma.impl.WorkProductDescriptionImpl#getReasonsForNotNeeding <em>Reasons For Not Needing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkProductDescriptionImpl extends ContentDescriptionImpl implements WorkProductDescription {
	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpactOfNotHaving() <em>Impact Of Not Having</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactOfNotHaving()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_OF_NOT_HAVING_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getImpactOfNotHaving() <em>Impact Of Not Having</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactOfNotHaving()
	 * @generated
	 * @ordered
	 */
	protected String impactOfNotHaving = IMPACT_OF_NOT_HAVING_EDEFAULT;

	/**
	 * The default value of the '{@link #getReasonsForNotNeeding() <em>Reasons For Not Needing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonsForNotNeeding()
	 * @generated
	 * @ordered
	 */
	protected static final String REASONS_FOR_NOT_NEEDING_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getReasonsForNotNeeding() <em>Reasons For Not Needing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonsForNotNeeding()
	 * @generated
	 * @ordered
	 */
	protected String reasonsForNotNeeding = REASONS_FOR_NOT_NEEDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getWorkProductDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_DESCRIPTION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpactOfNotHaving() {
		return impactOfNotHaving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactOfNotHaving(String newImpactOfNotHaving) {
		String oldImpactOfNotHaving = impactOfNotHaving;
		impactOfNotHaving = newImpactOfNotHaving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_DESCRIPTION__IMPACT_OF_NOT_HAVING, oldImpactOfNotHaving, impactOfNotHaving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReasonsForNotNeeding() {
		return reasonsForNotNeeding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonsForNotNeeding(String newReasonsForNotNeeding) {
		String oldReasonsForNotNeeding = reasonsForNotNeeding;
		reasonsForNotNeeding = newReasonsForNotNeeding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.WORK_PRODUCT_DESCRIPTION__REASONS_FOR_NOT_NEEDING, oldReasonsForNotNeeding, reasonsForNotNeeding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__PURPOSE:
				return getPurpose();
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__IMPACT_OF_NOT_HAVING:
				return getImpactOfNotHaving();
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__REASONS_FOR_NOT_NEEDING:
				return getReasonsForNotNeeding();
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
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__PURPOSE:
				setPurpose((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__IMPACT_OF_NOT_HAVING:
				setImpactOfNotHaving((String)newValue);
				return;
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__REASONS_FOR_NOT_NEEDING:
				setReasonsForNotNeeding((String)newValue);
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
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__IMPACT_OF_NOT_HAVING:
				setImpactOfNotHaving(IMPACT_OF_NOT_HAVING_EDEFAULT);
				return;
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__REASONS_FOR_NOT_NEEDING:
				setReasonsForNotNeeding(REASONS_FOR_NOT_NEEDING_EDEFAULT);
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
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__IMPACT_OF_NOT_HAVING:
				return IMPACT_OF_NOT_HAVING_EDEFAULT == null ? impactOfNotHaving != null : !IMPACT_OF_NOT_HAVING_EDEFAULT.equals(impactOfNotHaving);
			case UmaPackage.WORK_PRODUCT_DESCRIPTION__REASONS_FOR_NOT_NEEDING:
				return REASONS_FOR_NOT_NEEDING_EDEFAULT == null ? reasonsForNotNeeding != null : !REASONS_FOR_NOT_NEEDING_EDEFAULT.equals(reasonsForNotNeeding);
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
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(", impactOfNotHaving: ");
		result.append(impactOfNotHaving);
		result.append(", reasonsForNotNeeding: ");
		result.append(reasonsForNotNeeding);
		result.append(')');
		return result.toString();
	}

} //WorkProductDescriptionImpl
