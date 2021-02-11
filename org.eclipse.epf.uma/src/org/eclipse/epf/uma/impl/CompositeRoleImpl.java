/**
 */
package org.eclipse.epf.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.epf.uma.CompositeRole;
import org.eclipse.epf.uma.Role;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.CompositeRoleImpl#getAggregatedRoles <em>Aggregated Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeRoleImpl extends RoleDescriptorImpl implements CompositeRole {
	/**
	 * The cached value of the '{@link #getAggregatedRoles() <em>Aggregated Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> aggregatedRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getCompositeRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getAggregatedRoles() {
		if (aggregatedRoles == null) {
			aggregatedRoles = new EObjectResolvingEList<Role>(Role.class, this, UmaPackage.COMPOSITE_ROLE__AGGREGATED_ROLES);
		}
		return aggregatedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.COMPOSITE_ROLE__AGGREGATED_ROLES:
				return getAggregatedRoles();
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
			case UmaPackage.COMPOSITE_ROLE__AGGREGATED_ROLES:
				getAggregatedRoles().clear();
				getAggregatedRoles().addAll((Collection<? extends Role>)newValue);
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
			case UmaPackage.COMPOSITE_ROLE__AGGREGATED_ROLES:
				getAggregatedRoles().clear();
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
			case UmaPackage.COMPOSITE_ROLE__AGGREGATED_ROLES:
				return aggregatedRoles != null && !aggregatedRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeRoleImpl
