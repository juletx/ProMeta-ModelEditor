/**
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicable Meta Class Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.ApplicableMetaClassInfo#getIsPrimaryExtension <em>Is Primary Extension</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getApplicableMetaClassInfo()
 * @model
 * @generated
 */
public interface ApplicableMetaClassInfo extends Classifier {
	/**
	 * Returns the value of the '<em><b>Is Primary Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Extension</em>' attribute.
	 * @see #setIsPrimaryExtension(Boolean)
	 * @see uma.UmaPackage#getApplicableMetaClassInfo_IsPrimaryExtension()
	 * @model dataType="uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsPrimaryExtension();

	/**
	 * Sets the value of the '{@link uma.ApplicableMetaClassInfo#getIsPrimaryExtension <em>Is Primary Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Extension</em>' attribute.
	 * @see #getIsPrimaryExtension()
	 * @generated
	 */
	void setIsPrimaryExtension(Boolean value);

} // ApplicableMetaClassInfo
