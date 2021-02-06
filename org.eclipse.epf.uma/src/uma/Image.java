/**
 */
package uma;

import java.net.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.Image#getUri <em>Uri</em>}</li>
 *   <li>{@link uma.Image#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends LeafElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(URI)
	 * @see uma.UmaPackage#getImage_Uri()
	 * @model dataType="uma.Uri" ordered="false"
	 * @generated
	 */
	URI getUri();

	/**
	 * Sets the value of the '{@link uma.Image#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(URI value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see uma.UmaPackage#getImage_MimeType()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link uma.Image#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

} // Image
