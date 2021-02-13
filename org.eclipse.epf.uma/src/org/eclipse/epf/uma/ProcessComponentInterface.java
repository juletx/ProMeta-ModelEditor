/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Component Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Process Component Interface comprises of a list of interface specifications (similar to operation declarations) that express inputs and outputs for a process component.  These interface specifications are expressed using Task Descriptors which are not linked to Tasks that are related to Work Product Descriptors as well as optional a Role Descriptor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.ProcessComponentInterface#getInterfaceSpecifications <em>Interface Specifications</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.ProcessComponentInterface#getInterfaceIO <em>Interface IO</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getProcessComponentInterface()
 * @model
 * @generated
 */
public interface ProcessComponentInterface extends BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Interface Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.TaskDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Specifications</em>' containment reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getProcessComponentInterface_InterfaceSpecifications()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<TaskDescriptor> getInterfaceSpecifications();

	/**
	 * Returns the value of the '<em><b>Interface IO</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.WorkProductDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface IO</em>' containment reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getProcessComponentInterface_InterfaceIO()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<WorkProductDescriptor> getInterfaceIO();

} // ProcessComponentInterface
