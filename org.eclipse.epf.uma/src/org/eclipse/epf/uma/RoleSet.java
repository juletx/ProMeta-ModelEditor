/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Role Set organizes Roles into categories.  It is used to group roles together that have certain commonalities.  For example, the "Analysts" Role Set could group the "Business Process Analyst", "System Analyst", as well as "Requirements Specifier" roles.  All of these work with similar techniques and have overlapping skills, but are required as distinct roles for a method (e.g. the method the IBM Rational Unified Process is based on).
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.RoleSet#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getRoleSet()
 * @model
 * @generated
 */
public interface RoleSet extends ContentCategory {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getRoleSet_Roles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Role> getRoles();

} // RoleSet
