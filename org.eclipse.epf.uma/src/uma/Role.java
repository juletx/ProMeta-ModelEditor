/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Role is a content element that defines a set of related skills, competencies, and responsibilities.  Roles are used by Tasks to define who performs them as well as define a set of work products they are responsible for.  
 * A Role defines a set of related skills, competencies, and responsibilities of an individual or a set of individuals.  Roles are not individuals or resources.  Individual members of the development organization will wear different hats, or perform different roles. The mapping from individual to role, performed by the project manager when planning and staffing for a project, allows different individuals to act as several different roles, and for a role to be played by several individuals.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.Role#getModifies <em>Modifies</em>}</li>
 *   <li>{@link uma.Role#getResponsibleFor <em>Responsible For</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends ContentElement, FulfillableElement {
	/**
	 * Returns the value of the '<em><b>Modifies</b></em>' reference list.
	 * The list contents are of type {@link uma.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifies</em>' reference list.
	 * @see uma.UmaPackage#getRole_Modifies()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getModifies();

	/**
	 * Returns the value of the '<em><b>Responsible For</b></em>' reference list.
	 * The list contents are of type {@link uma.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible For</em>' reference list.
	 * @see uma.UmaPackage#getRole_ResponsibleFor()
	 * @model ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getResponsibleFor();

} // Role
