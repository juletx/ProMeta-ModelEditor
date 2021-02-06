/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Set Grouping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Role Sets can be categorized into Role Set Groupings.  For example, different methods might define similar Role Sets, which however need to be distinguished from each other on a global scale.  Thus, Role Set Groupings allow distinguishing, for example, Software Services Manager Role Sets from Software Development Organization Manager Role Sets.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.RoleSetGrouping#getRoleSets <em>Role Sets</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getRoleSetGrouping()
 * @model
 * @generated
 */
public interface RoleSetGrouping extends ContentCategory {
	/**
	 * Returns the value of the '<em><b>Role Sets</b></em>' reference list.
	 * The list contents are of type {@link uma.RoleSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Sets</em>' reference list.
	 * @see uma.UmaPackage#getRoleSetGrouping_RoleSets()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoleSet> getRoleSets();

} // RoleSetGrouping
