/**
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.TextElement#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getTextElement()
 * @model
 * @generated
 */
public interface TextElement extends LeafElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see uma.UmaPackage#getTextElement_Text()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link uma.TextElement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // TextElement
