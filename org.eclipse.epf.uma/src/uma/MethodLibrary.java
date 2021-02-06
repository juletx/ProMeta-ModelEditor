/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Method Library is a physical container for Method Plugins and Method Configuration definitions.  All Method Elements are stored in a Method Library.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.MethodLibrary#getMethodPlugins <em>Method Plugins</em>}</li>
 *   <li>{@link uma.MethodLibrary#getPredefinedConfigurations <em>Predefined Configurations</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getMethodLibrary()
 * @model
 * @generated
 */
public interface MethodLibrary extends MethodUnit, uma.Package {
	/**
	 * Returns the value of the '<em><b>Method Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link uma.MethodPlugin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Plugins</em>' containment reference list.
	 * @see uma.UmaPackage#getMethodLibrary_MethodPlugins()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MethodPlugin> getMethodPlugins();

	/**
	 * Returns the value of the '<em><b>Predefined Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link uma.MethodConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Configurations</em>' containment reference list.
	 * @see uma.UmaPackage#getMethodLibrary_PredefinedConfigurations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MethodConfiguration> getPredefinedConfigurations();

} // MethodLibrary
