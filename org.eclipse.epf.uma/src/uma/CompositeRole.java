/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Composite Role is a special Role Descriptor that relates to more then one Role.  It represents a grouping of Roles with the main purpose of simplification, i.e. reducing the number of roles for a process.
 * A Composite Role is a grouping of Roles that can be used in an Activity or Process to reduce the number of Roles.  A typical application would be a process for a small team in which a standard set of roles from the method content would be all performed by one or more resource.  By using Composite Role the process would suggest a typical clustering of Roles to Resources.  A Composite Role could perform all Tasks defined for the Roles it refers to.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.CompositeRole#getAggregatedRoles <em>Aggregated Roles</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getCompositeRole()
 * @model
 * @generated
 */
public interface CompositeRole extends RoleDescriptor {
	/**
	 * Returns the value of the '<em><b>Aggregated Roles</b></em>' reference list.
	 * The list contents are of type {@link uma.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Roles</em>' reference list.
	 * @see uma.UmaPackage#getCompositeRole_AggregatedRoles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Role> getAggregatedRoles();

} // CompositeRole
