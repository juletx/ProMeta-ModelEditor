/**
 */
package org.eclipse.epf.uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Work Order is a Method Element that represents a relationship between two Breakdown Elements in which one Breakdown Elements depends on the start or finish of another Breakdown Elements in order to begin or end.  
 * (Note, Work Order is not modeled as an Association Class to provide a straightforward mapping  to XMI and EMF.)
 * The Work Order class defines predecessor and successor relations amongst Breakdown Elements.  This information is in particular critical for planning applications.  See more details on different types of Work Order relationships at Work Order Type.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.WorkOrder#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.WorkOrder#getPred <em>Pred</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getWorkOrder()
 * @model
 * @generated
 */
public interface WorkOrder extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' attribute.
	 * The default value is <code>"finishToStart"</code>.
	 * The literals are from the enumeration {@link org.eclipse.epf.uma.WorkOrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute expresses the type of the Work Order relationship by assigning a value from the Work Order Type enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Type</em>' attribute.
	 * @see org.eclipse.epf.uma.WorkOrderType
	 * @see #setLinkType(WorkOrderType)
	 * @see org.eclipse.epf.uma.UmaPackage#getWorkOrder_LinkType()
	 * @model default="finishToStart" required="true" ordered="false"
	 * @generated
	 */
	WorkOrderType getLinkType();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.WorkOrder#getLinkType <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' attribute.
	 * @see org.eclipse.epf.uma.WorkOrderType
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(WorkOrderType value);

	/**
	 * Returns the value of the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred</em>' reference.
	 * @see #setPred(WorkBreakdownElement)
	 * @see org.eclipse.epf.uma.UmaPackage#getWorkOrder_Pred()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WorkBreakdownElement getPred();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.WorkOrder#getPred <em>Pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pred</em>' reference.
	 * @see #getPred()
	 * @generated
	 */
	void setPred(WorkBreakdownElement value);

} // WorkOrder
