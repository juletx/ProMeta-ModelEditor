/**
 */
package org.eclipse.epf.uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.DescriptorDescription#getRefinedDescription <em>Refined Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getDescriptorDescription()
 * @model
 * @generated
 */
public interface DescriptorDescription extends BreakdownElementDescription {
	/**
	 * Returns the value of the '<em><b>Refined Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Descriptor might add refinements to the main description of the Content Element it refers to.  For example, it could provide additional information about a Work Product relevant for the specific point in time in the process this Work Product type is being used.  It could describe additional skills needed for a Role at that particular point in time in a process, etc. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined Description</em>' attribute.
	 * @see #setRefinedDescription(String)
	 * @see org.eclipse.epf.uma.UmaPackage#getDescriptorDescription_RefinedDescription()
	 * @model default="" dataType="org.eclipse.epf.uma.String" ordered="false"
	 * @generated
	 */
	String getRefinedDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.DescriptorDescription#getRefinedDescription <em>Refined Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Description</em>' attribute.
	 * @see #getRefinedDescription()
	 * @generated
	 */
	void setRefinedDescription(String value);

} // DescriptorDescription
