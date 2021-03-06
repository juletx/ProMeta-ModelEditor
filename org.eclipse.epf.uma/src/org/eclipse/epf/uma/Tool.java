/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Tool is a container/aggregate for ToolMentors.  It can also provide general descriptions of the tool and its general capabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.Tool#getToolMentors <em>Tool Mentors</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends ContentCategory {
	/**
	 * Returns the value of the '<em><b>Tool Mentors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.ToolMentor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Mentors</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getTool_ToolMentors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ToolMentor> getToolMentors();

} // Tool
