/**
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.ActivityDescription#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link uma.ActivityDescription#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link uma.ActivityDescription#getHowtoStaff <em>Howto Staff</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getActivityDescription()
 * @model
 * @generated
 */
public interface ActivityDescription extends BreakdownElementDescription {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Summarizes the main reason for performing this Activity, describes what the activity as a whole is intended to achieve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see uma.UmaPackage#getActivityDescription_Purpose()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link uma.ActivityDescription#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comprises of summaries describing important exceptional and non-standard ways of doing the work of this Activity not covered by the Activity's Tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternatives</em>' attribute.
	 * @see #setAlternatives(String)
	 * @see uma.UmaPackage#getActivityDescription_Alternatives()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getAlternatives();

	/**
	 * Sets the value of the '{@link uma.ActivityDescription#getAlternatives <em>Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternatives</em>' attribute.
	 * @see #getAlternatives()
	 * @generated
	 */
	void setAlternatives(String value);

	/**
	 * Returns the value of the '<em><b>Howto Staff</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides background on who should be involved in this activity what are the required skills, experience,  and perhaps attitudes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Howto Staff</em>' attribute.
	 * @see #setHowtoStaff(String)
	 * @see uma.UmaPackage#getActivityDescription_HowtoStaff()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getHowtoStaff();

	/**
	 * Sets the value of the '{@link uma.ActivityDescription#getHowtoStaff <em>Howto Staff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Howto Staff</em>' attribute.
	 * @see #getHowtoStaff()
	 * @generated
	 */
	void setHowtoStaff(String value);

} // ActivityDescription
