/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Milestone describes a significant event in a development project, such as a major decision, completion of a deliverable, or meeting of a major dependency (like completion of a project phase).  Because, Milestone is commonly used to refer to both the event itself and the point in time at which the event is scheduled to happen, it is modeled as a Breakdown Element (i.e. it appears as part of a breakdown structure).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.Milestone#getRequiredResults <em>Required Results</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends WorkBreakdownElement {
	/**
	 * Returns the value of the '<em><b>Required Results</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.WorkProductDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Results</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getMilestone_RequiredResults()
	 * @model ordered="false"
	 * @generated
	 */
	EList<WorkProductDescriptor> getRequiredResults();

} // Milestone
