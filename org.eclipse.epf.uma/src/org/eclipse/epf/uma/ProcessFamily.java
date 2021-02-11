/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Delivery Model Family is a convenient grouping of Delivery Processes and Capability Patterns of interest to some specific user community.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.ProcessFamily#getDeliveryProcesses <em>Delivery Processes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getProcessFamily()
 * @model
 * @generated
 */
public interface ProcessFamily extends MethodConfiguration {
	/**
	 * Returns the value of the '<em><b>Delivery Processes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.DeliveryProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Processes</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getProcessFamily_DeliveryProcesses()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DeliveryProcess> getDeliveryProcesses();

} // ProcessFamily
