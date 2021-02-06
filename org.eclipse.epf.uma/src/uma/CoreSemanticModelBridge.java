/**
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core Semantic Model Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.CoreSemanticModelBridge#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getCoreSemanticModelBridge()
 * @model
 * @generated
 */
public interface CoreSemanticModelBridge extends SemanticModelBridge {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Element)
	 * @see uma.UmaPackage#getCoreSemanticModelBridge_Element()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link uma.CoreSemanticModelBridge#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

} // CoreSemanticModelBridge
