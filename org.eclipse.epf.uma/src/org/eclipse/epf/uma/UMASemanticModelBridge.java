/**
 */
package org.eclipse.epf.uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UMA Semantic Model Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.UMASemanticModelBridge#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getUMASemanticModelBridge()
 * @model
 * @generated
 */
public interface UMASemanticModelBridge extends SemanticModelBridge {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(MethodElement)
	 * @see org.eclipse.epf.uma.UmaPackage#getUMASemanticModelBridge_Element()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MethodElement getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.UMASemanticModelBridge#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(MethodElement value);

} // UMASemanticModelBridge
