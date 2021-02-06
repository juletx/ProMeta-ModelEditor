/**
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uma.Descriptor;
import uma.Guidance;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.DescriptorImpl#getIsSynchronizedWithSource <em>Is Synchronized With Source</em>}</li>
 *   <li>{@link uma.impl.DescriptorImpl#getGuidanceExclude <em>Guidance Exclude</em>}</li>
 *   <li>{@link uma.impl.DescriptorImpl#getGuidanceAdditional <em>Guidance Additional</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DescriptorImpl extends BreakdownElementImpl implements Descriptor {
	/**
	 * The default value of the '{@link #getIsSynchronizedWithSource() <em>Is Synchronized With Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynchronizedWithSource()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SYNCHRONIZED_WITH_SOURCE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsSynchronizedWithSource() <em>Is Synchronized With Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynchronizedWithSource()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSynchronizedWithSource = IS_SYNCHRONIZED_WITH_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuidanceExclude() <em>Guidance Exclude</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidanceExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Guidance> guidanceExclude;

	/**
	 * The cached value of the '{@link #getGuidanceAdditional() <em>Guidance Additional</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidanceAdditional()
	 * @generated
	 * @ordered
	 */
	protected EList<Guidance> guidanceAdditional;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getDescriptor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSynchronizedWithSource() {
		return isSynchronizedWithSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronizedWithSource(Boolean newIsSynchronizedWithSource) {
		Boolean oldIsSynchronizedWithSource = isSynchronizedWithSource;
		isSynchronizedWithSource = newIsSynchronizedWithSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DESCRIPTOR__IS_SYNCHRONIZED_WITH_SOURCE, oldIsSynchronizedWithSource, isSynchronizedWithSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guidance> getGuidanceExclude() {
		if (guidanceExclude == null) {
			guidanceExclude = new EObjectResolvingEList<Guidance>(Guidance.class, this, UmaPackage.DESCRIPTOR__GUIDANCE_EXCLUDE);
		}
		return guidanceExclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guidance> getGuidanceAdditional() {
		if (guidanceAdditional == null) {
			guidanceAdditional = new EObjectResolvingEList<Guidance>(Guidance.class, this, UmaPackage.DESCRIPTOR__GUIDANCE_ADDITIONAL);
		}
		return guidanceAdditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DESCRIPTOR__IS_SYNCHRONIZED_WITH_SOURCE:
				return getIsSynchronizedWithSource();
			case UmaPackage.DESCRIPTOR__GUIDANCE_EXCLUDE:
				return getGuidanceExclude();
			case UmaPackage.DESCRIPTOR__GUIDANCE_ADDITIONAL:
				return getGuidanceAdditional();
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
			case UmaPackage.DESCRIPTOR__IS_SYNCHRONIZED_WITH_SOURCE:
				setIsSynchronizedWithSource((Boolean)newValue);
				return;
			case UmaPackage.DESCRIPTOR__GUIDANCE_EXCLUDE:
				getGuidanceExclude().clear();
				getGuidanceExclude().addAll((Collection<? extends Guidance>)newValue);
				return;
			case UmaPackage.DESCRIPTOR__GUIDANCE_ADDITIONAL:
				getGuidanceAdditional().clear();
				getGuidanceAdditional().addAll((Collection<? extends Guidance>)newValue);
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
			case UmaPackage.DESCRIPTOR__IS_SYNCHRONIZED_WITH_SOURCE:
				setIsSynchronizedWithSource(IS_SYNCHRONIZED_WITH_SOURCE_EDEFAULT);
				return;
			case UmaPackage.DESCRIPTOR__GUIDANCE_EXCLUDE:
				getGuidanceExclude().clear();
				return;
			case UmaPackage.DESCRIPTOR__GUIDANCE_ADDITIONAL:
				getGuidanceAdditional().clear();
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
			case UmaPackage.DESCRIPTOR__IS_SYNCHRONIZED_WITH_SOURCE:
				return IS_SYNCHRONIZED_WITH_SOURCE_EDEFAULT == null ? isSynchronizedWithSource != null : !IS_SYNCHRONIZED_WITH_SOURCE_EDEFAULT.equals(isSynchronizedWithSource);
			case UmaPackage.DESCRIPTOR__GUIDANCE_EXCLUDE:
				return guidanceExclude != null && !guidanceExclude.isEmpty();
			case UmaPackage.DESCRIPTOR__GUIDANCE_ADDITIONAL:
				return guidanceAdditional != null && !guidanceAdditional.isEmpty();
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
		result.append(" (isSynchronizedWithSource: ");
		result.append(isSynchronizedWithSource);
		result.append(')');
		return result.toString();
	}

} //DescriptorImpl
