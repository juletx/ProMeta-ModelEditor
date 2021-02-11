/**
 */
package org.eclipse.epf.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.epf.uma.FulfillableElement;
import org.eclipse.epf.uma.Role;
import org.eclipse.epf.uma.UmaPackage;
import org.eclipse.epf.uma.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.RoleImpl#getFulfills <em>Fulfills</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.RoleImpl#getModifies <em>Modifies</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.RoleImpl#getResponsibleFor <em>Responsible For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends ContentElementImpl implements Role {
	/**
	 * The cached value of the '{@link #getFulfills() <em>Fulfills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfills()
	 * @generated
	 * @ordered
	 */
	protected EList<FulfillableElement> fulfills;

	/**
	 * The cached value of the '{@link #getResponsibleFor() <em>Responsible For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleFor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> responsibleFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FulfillableElement> getFulfills() {
		if (fulfills == null) {
			fulfills = new EObjectResolvingEList<FulfillableElement>(FulfillableElement.class, this, UmaPackage.ROLE__FULFILLS);
		}
		return fulfills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getModifies() {
		// TODO: implement this method to return the 'Modifies' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getResponsibleFor() {
		if (responsibleFor == null) {
			responsibleFor = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this, UmaPackage.ROLE__RESPONSIBLE_FOR);
		}
		return responsibleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.ROLE__FULFILLS:
				return getFulfills();
			case UmaPackage.ROLE__MODIFIES:
				return getModifies();
			case UmaPackage.ROLE__RESPONSIBLE_FOR:
				return getResponsibleFor();
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
			case UmaPackage.ROLE__FULFILLS:
				getFulfills().clear();
				getFulfills().addAll((Collection<? extends FulfillableElement>)newValue);
				return;
			case UmaPackage.ROLE__MODIFIES:
				getModifies().clear();
				getModifies().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case UmaPackage.ROLE__RESPONSIBLE_FOR:
				getResponsibleFor().clear();
				getResponsibleFor().addAll((Collection<? extends WorkProduct>)newValue);
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
			case UmaPackage.ROLE__FULFILLS:
				getFulfills().clear();
				return;
			case UmaPackage.ROLE__MODIFIES:
				getModifies().clear();
				return;
			case UmaPackage.ROLE__RESPONSIBLE_FOR:
				getResponsibleFor().clear();
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
			case UmaPackage.ROLE__FULFILLS:
				return fulfills != null && !fulfills.isEmpty();
			case UmaPackage.ROLE__MODIFIES:
				return !getModifies().isEmpty();
			case UmaPackage.ROLE__RESPONSIBLE_FOR:
				return responsibleFor != null && !responsibleFor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FulfillableElement.class) {
			switch (derivedFeatureID) {
				case UmaPackage.ROLE__FULFILLS: return UmaPackage.FULFILLABLE_ELEMENT__FULFILLS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FulfillableElement.class) {
			switch (baseFeatureID) {
				case UmaPackage.FULFILLABLE_ELEMENT__FULFILLS: return UmaPackage.ROLE__FULFILLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RoleImpl
