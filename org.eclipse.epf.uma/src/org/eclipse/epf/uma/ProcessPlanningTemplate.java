/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Planning Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Process Planning Template is a special Process that is prepared for instantiation by a project planning tool.  Typically, it is created based on a Process such as a Delivery Process as a whole (e.g. in case of a waterfall-based development approach) or in parts (e.g. in case of an iterative development approach).
 * A Process Planning Template represents a partially finished plan for a concrete project.  It uses the same information structures as all other Process Types to represent templates for project plans.  However, certain planning decisions have already been applied to the template as well as information has been removed and/or reformatted to be ready for export to a specific planning tool.  Examples for such decisions are: a template has been created to represent a plan for a particular Iteration in an iterative development project, which fr example distinguishes early from late iterations in the Elaboration phase of a project; if the targeted planning tool cannot represent input and output of Task, then these have been removed from the structure; certain repetitions have been already applied, e.g. stating that a cycle of specific Task grouped in an Activity have to be repeated n-times; etc.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.ProcessPlanningTemplate#getBasedOnProcesses <em>Based On Processes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getProcessPlanningTemplate()
 * @model
 * @generated
 */
public interface ProcessPlanningTemplate extends org.eclipse.epf.uma.Process {
	/**
	 * Returns the value of the '<em><b>Based On Processes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On Processes</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getProcessPlanningTemplate_BasedOnProcesses()
	 * @model ordered="false"
	 * @generated
	 */
	EList<org.eclipse.epf.uma.Process> getBasedOnProcesses();

} // ProcessPlanningTemplate
