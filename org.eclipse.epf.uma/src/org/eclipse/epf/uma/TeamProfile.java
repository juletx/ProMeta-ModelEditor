/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Team Profile is a Breakdown Element that groups Role Descriptors or Resource Definitions defining a nested hierarchy of teams and team members.
 * Work assignments and Work Product responsibilities can be different from Activity to Activity in a development project. Different phases require different staffing profiles, i.e. different skills and resources doing different types of work.  Therefore, a process needs to define such different profiles in a flexible manner.  Whereas Core Method Content defines standard responsibilities and assignments, a process express by a breakdown structures needs to be able refine and redefine these throughout its definition.  Role Descriptors, Resource Definitions, as well as Team Profiles provide the data structure necessary to achieve this flexibility and to provide a process user with the capability to define different teams and role relationships for every Activity (including Activities on any nesting-level as well as Iterations or Phases).
 * Hence, in addition to the work breakdown and work product breakdown structures defined so far, Team Profiles are used to define a third type of breakdown structure: team breakdown structures.  These are created as an Activity specific hierarchy of Team Profiles comprising of Role Descriptors and Resource Definitions.  These structures can be presented as well-known Org-Charts.  Just as with any other Breakdown Element and Descriptors, Team Profiles can be defined within the scope of any Activity in a breakdown structure.  In other words every Activity can define its own Team Profiles consisting of Activity specific Role Descriptors and Resource Definitions.  Typically, Team Profiles are defined on the level of Iterations or Phases or other higher-level Activity.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.TeamProfile#getTeamRoles <em>Team Roles</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.TeamProfile#getSuperTeam <em>Super Team</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.TeamProfile#getSubTeam <em>Sub Team</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getTeamProfile()
 * @model
 * @generated
 */
public interface TeamProfile extends BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Team Roles</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.RoleDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Roles</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getTeamProfile_TeamRoles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoleDescriptor> getTeamRoles();

	/**
	 * Returns the value of the '<em><b>Super Team</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.uma.TeamProfile#getSubTeam <em>Sub Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Team</em>' reference.
	 * @see #setSuperTeam(TeamProfile)
	 * @see org.eclipse.epf.uma.UmaPackage#getTeamProfile_SuperTeam()
	 * @see org.eclipse.epf.uma.TeamProfile#getSubTeam
	 * @model opposite="subTeam" required="true" ordered="false"
	 * @generated
	 */
	TeamProfile getSuperTeam();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.TeamProfile#getSuperTeam <em>Super Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Team</em>' reference.
	 * @see #getSuperTeam()
	 * @generated
	 */
	void setSuperTeam(TeamProfile value);

	/**
	 * Returns the value of the '<em><b>Sub Team</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.TeamProfile}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.uma.TeamProfile#getSuperTeam <em>Super Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Team</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getTeamProfile_SubTeam()
	 * @see org.eclipse.epf.uma.TeamProfile#getSuperTeam
	 * @model opposite="superTeam" ordered="false"
	 * @generated
	 */
	EList<TeamProfile> getSubTeam();

} // TeamProfile
