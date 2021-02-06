/**
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.MethodPackage;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.MethodPackageImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link uma.impl.MethodPackageImpl#getReusedPackages <em>Reused Packages</em>}</li>
 *   <li>{@link uma.impl.MethodPackageImpl#getChildPackages <em>Child Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MethodPackageImpl extends MethodElementImpl implements MethodPackage {
	/**
	 * The default value of the '{@link #getGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GLOBAL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected Boolean global = GLOBAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReusedPackages() <em>Reused Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReusedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodPackage> reusedPackages;

	/**
	 * The cached value of the '{@link #getChildPackages() <em>Child Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodPackage> childPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getMethodPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobal(Boolean newGlobal) {
		Boolean oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.METHOD_PACKAGE__GLOBAL, oldGlobal, global));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodPackage> getReusedPackages() {
		if (reusedPackages == null) {
			reusedPackages = new EObjectResolvingEList<MethodPackage>(MethodPackage.class, this, UmaPackage.METHOD_PACKAGE__REUSED_PACKAGES);
		}
		return reusedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodPackage> getChildPackages() {
		if (childPackages == null) {
			childPackages = new EObjectContainmentEList<MethodPackage>(MethodPackage.class, this, UmaPackage.METHOD_PACKAGE__CHILD_PACKAGES);
		}
		return childPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.METHOD_PACKAGE__CHILD_PACKAGES:
				return ((InternalEList<?>)getChildPackages()).basicRemove(otherEnd, msgs);
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
			case UmaPackage.METHOD_PACKAGE__GLOBAL:
				return getGlobal();
			case UmaPackage.METHOD_PACKAGE__REUSED_PACKAGES:
				return getReusedPackages();
			case UmaPackage.METHOD_PACKAGE__CHILD_PACKAGES:
				return getChildPackages();
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
			case UmaPackage.METHOD_PACKAGE__GLOBAL:
				setGlobal((Boolean)newValue);
				return;
			case UmaPackage.METHOD_PACKAGE__REUSED_PACKAGES:
				getReusedPackages().clear();
				getReusedPackages().addAll((Collection<? extends MethodPackage>)newValue);
				return;
			case UmaPackage.METHOD_PACKAGE__CHILD_PACKAGES:
				getChildPackages().clear();
				getChildPackages().addAll((Collection<? extends MethodPackage>)newValue);
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
			case UmaPackage.METHOD_PACKAGE__GLOBAL:
				setGlobal(GLOBAL_EDEFAULT);
				return;
			case UmaPackage.METHOD_PACKAGE__REUSED_PACKAGES:
				getReusedPackages().clear();
				return;
			case UmaPackage.METHOD_PACKAGE__CHILD_PACKAGES:
				getChildPackages().clear();
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
			case UmaPackage.METHOD_PACKAGE__GLOBAL:
				return GLOBAL_EDEFAULT == null ? global != null : !GLOBAL_EDEFAULT.equals(global);
			case UmaPackage.METHOD_PACKAGE__REUSED_PACKAGES:
				return reusedPackages != null && !reusedPackages.isEmpty();
			case UmaPackage.METHOD_PACKAGE__CHILD_PACKAGES:
				return childPackages != null && !childPackages.isEmpty();
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
		result.append(" (global: ");
		result.append(global);
		result.append(')');
		return result.toString();
	}

} //MethodPackageImpl
