/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Process Package is a special Method Package that contains Process Elements, only.
 * A key separation of concerns in UMA is the distinction between Method Content and Process.  This separation is enforced by special package types, which do not allow the mixing of method content with processes.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.ProcessPackage#getProcessElements <em>Process Elements</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.ProcessPackage#getDiagrams <em>Diagrams</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getProcessPackage()
 * @model
 * @generated
 */
public interface ProcessPackage extends MethodPackage {
	/**
	 * Returns the value of the '<em><b>Process Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.ProcessElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Elements</em>' containment reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getProcessPackage_ProcessElements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ProcessElement> getProcessElements();

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.Diagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getProcessPackage_Diagrams()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Diagram> getDiagrams();

} // ProcessPackage
