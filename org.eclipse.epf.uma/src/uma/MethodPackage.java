/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Method Package is an abstract class for packaging Method Elements.  All Method Elements shall be located in exactly one of Method Package's concrete specializations (e.g. Content Package).   Method Package defines common properties for all of its specializations. Elements are organized in Method Packages to structure large scale of method content and processes as well as to define a mechanism for reuse.  Method Elements from one package can reuse element from other packages by defining a reusedPackages link.  For example, a work product defined in one package can be used as an input for Tasks defined in other packages.  By reusing it from one common place (i.e. the package in which it has been defined) ensures that no redundant definitions of the same elements are required.  Also maintenance of method content is greatly improved as changes can be performed in only one place.  Note, that other packages will introduce more specializations of Method Package, e.g. Process Package and Process Component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.MethodPackage#getGlobal <em>Global</em>}</li>
 *   <li>{@link uma.MethodPackage#getReusedPackages <em>Reused Packages</em>}</li>
 *   <li>{@link uma.MethodPackage#getChildPackages <em>Child Packages</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getMethodPackage()
 * @model abstract="true"
 * @generated
 */
public interface MethodPackage extends MethodElement, uma.Package {
	/**
	 * Returns the value of the '<em><b>Global</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method Packages can have a global scope.  This means that every element of every other Method Package can see the global package's contents.  Global Method Packages are primarily used to store commonly used category definitions such as for Disciplines or Domains, which are used by many Task and Work Products respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global</em>' attribute.
	 * @see #setGlobal(Boolean)
	 * @see uma.UmaPackage#getMethodPackage_Global()
	 * @model default="false" dataType="uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getGlobal();

	/**
	 * Sets the value of the '{@link uma.MethodPackage#getGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #getGlobal()
	 * @generated
	 */
	void setGlobal(Boolean value);

	/**
	 * Returns the value of the '<em><b>Reused Packages</b></em>' reference list.
	 * The list contents are of type {@link uma.MethodPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reused Packages</em>' reference list.
	 * @see uma.UmaPackage#getMethodPackage_ReusedPackages()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodPackage> getReusedPackages();

	/**
	 * Returns the value of the '<em><b>Child Packages</b></em>' containment reference list.
	 * The list contents are of type {@link uma.MethodPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Packages</em>' containment reference list.
	 * @see uma.UmaPackage#getMethodPackage_ChildPackages()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MethodPackage> getChildPackages();

} // MethodPackage
