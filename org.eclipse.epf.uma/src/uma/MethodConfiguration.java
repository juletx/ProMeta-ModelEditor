/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Method Configuration is a collection of selected Method Models and MethodPackages. A configuration can be exported into its own standalone library when it includes the full transitive closure of all elements all other elements depend on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.MethodConfiguration#getMethodPluginSelection <em>Method Plugin Selection</em>}</li>
 *   <li>{@link uma.MethodConfiguration#getMethodPackageSelection <em>Method Package Selection</em>}</li>
 *   <li>{@link uma.MethodConfiguration#getProcessViews <em>Process Views</em>}</li>
 *   <li>{@link uma.MethodConfiguration#getDefaultView <em>Default View</em>}</li>
 *   <li>{@link uma.MethodConfiguration#getBaseConfigurations <em>Base Configurations</em>}</li>
 *   <li>{@link uma.MethodConfiguration#getSubtractedCategory <em>Subtracted Category</em>}</li>
 *   <li>{@link uma.MethodConfiguration#getAddedCategory <em>Added Category</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getMethodConfiguration()
 * @model
 * @generated
 */
public interface MethodConfiguration extends MethodUnit {
	/**
	 * Returns the value of the '<em><b>Method Plugin Selection</b></em>' reference list.
	 * The list contents are of type {@link uma.MethodPlugin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Plugin Selection</em>' reference list.
	 * @see uma.UmaPackage#getMethodConfiguration_MethodPluginSelection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<MethodPlugin> getMethodPluginSelection();

	/**
	 * Returns the value of the '<em><b>Method Package Selection</b></em>' reference list.
	 * The list contents are of type {@link uma.MethodPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Package Selection</em>' reference list.
	 * @see uma.UmaPackage#getMethodConfiguration_MethodPackageSelection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<MethodPackage> getMethodPackageSelection();

	/**
	 * Returns the value of the '<em><b>Process Views</b></em>' reference list.
	 * The list contents are of type {@link uma.ContentCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Views</em>' reference list.
	 * @see uma.UmaPackage#getMethodConfiguration_ProcessViews()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ContentCategory> getProcessViews();

	/**
	 * Returns the value of the '<em><b>Default View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default View</em>' reference.
	 * @see #setDefaultView(ContentCategory)
	 * @see uma.UmaPackage#getMethodConfiguration_DefaultView()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ContentCategory getDefaultView();

	/**
	 * Sets the value of the '{@link uma.MethodConfiguration#getDefaultView <em>Default View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default View</em>' reference.
	 * @see #getDefaultView()
	 * @generated
	 */
	void setDefaultView(ContentCategory value);

	/**
	 * Returns the value of the '<em><b>Base Configurations</b></em>' reference list.
	 * The list contents are of type {@link uma.MethodConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Configurations</em>' reference list.
	 * @see uma.UmaPackage#getMethodConfiguration_BaseConfigurations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodConfiguration> getBaseConfigurations();

	/**
	 * Returns the value of the '<em><b>Subtracted Category</b></em>' reference list.
	 * The list contents are of type {@link uma.ContentCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtracted Category</em>' reference list.
	 * @see uma.UmaPackage#getMethodConfiguration_SubtractedCategory()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ContentCategory> getSubtractedCategory();

	/**
	 * Returns the value of the '<em><b>Added Category</b></em>' reference list.
	 * The list contents are of type {@link uma.ContentCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Category</em>' reference list.
	 * @see uma.UmaPackage#getMethodConfiguration_AddedCategory()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ContentCategory> getAddedCategory();

} // MethodConfiguration
