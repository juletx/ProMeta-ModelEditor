/**
 */
package org.eclipse.epf.diagram.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.WorkProductNode#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.diagram.model.ModelPackage#getWorkProductNode()
 * @model
 * @generated
 */
public interface WorkProductNode extends NamedNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getWorkProductNode_Type()
	 * @model
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.WorkProductNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

} // WorkProductNode
