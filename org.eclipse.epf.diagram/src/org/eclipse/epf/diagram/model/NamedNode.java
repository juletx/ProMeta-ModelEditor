/**
 */
package org.eclipse.epf.diagram.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.NamedNode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.diagram.model.ModelPackage#getNamedNode()
 * @model
 * @generated
 */
public interface NamedNode extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getNamedNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.NamedNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedNode
