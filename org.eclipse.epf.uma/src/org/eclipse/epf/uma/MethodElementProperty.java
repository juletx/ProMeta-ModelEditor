/**
 */
package org.eclipse.epf.uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Element Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.MethodElementProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getMethodElementProperty()
 * @model
 * @generated
 */
public interface MethodElementProperty extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.epf.uma.UmaPackage#getMethodElementProperty_Value()
	 * @model default="" dataType="org.eclipse.epf.uma.String" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.MethodElementProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // MethodElementProperty
