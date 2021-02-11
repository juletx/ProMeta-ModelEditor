/**
 */
package org.eclipse.epf.uma;

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
 *   <li>{@link org.eclipse.epf.uma.Image#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.Image#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getImage()
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
	 * @see org.eclipse.epf.uma.UmaPackage#getImage_Uri()
	 * @model dataType="org.eclipse.epf.uma.Uri" ordered="false"
	 * @generated
	 */
	URI getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.Image#getUri <em>Uri</em>}' attribute.
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
	 * @see org.eclipse.epf.uma.UmaPackage#getImage_MimeType()
	 * @model default="" dataType="org.eclipse.epf.uma.String" ordered="false"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.Image#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

} // Image
