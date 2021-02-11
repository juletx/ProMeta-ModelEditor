/**
 */
package org.eclipse.epf.uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Component Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Process Component Descriptor represents a Process Component application in a Process, i.e. the breakdown structure defining the Process.  The Process Component Descriptor is used to encapsulate the details of the component in a breakdown structure and to provide its own set of relationships such as it own predecessors and successors.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.ProcessComponentDescriptor#get_processComponent <em>process Component</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getProcessComponentDescriptor()
 * @model
 * @generated
 */
public interface ProcessComponentDescriptor extends Descriptor {
	/**
	 * Returns the value of the '<em><b>process Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>process Component</em>' reference.
	 * @see #set_processComponent(ProcessComponent)
	 * @see org.eclipse.epf.uma.UmaPackage#getProcessComponentDescriptor__processComponent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessComponent get_processComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.ProcessComponentDescriptor#get_processComponent <em>process Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>process Component</em>' reference.
	 * @see #get_processComponent()
	 * @generated
	 */
	void set_processComponent(ProcessComponent value);

} // ProcessComponentDescriptor
