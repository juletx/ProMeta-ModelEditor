/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Domain is a refineable hierarchy grouping related work products.  In other words, Domains can be further divided into sub-domains, with work product elements to be categorized only at the leaf-level of this hierarchy.
 * Domain is a logical grouping of work products that have an affinity to each other based on resources, timing, or relationship.  A Domain may be divided into subdomains.  For example, GS Method uses six predefined Domains for Work Products: Application, Architecture, Business, Engagement, Operations and Organization.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.Domain#getWorkProducts <em>Work Products</em>}</li>
 *   <li>{@link uma.Domain#getSubdomains <em>Subdomains</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends ContentCategory {
	/**
	 * Returns the value of the '<em><b>Work Products</b></em>' reference list.
	 * The list contents are of type {@link uma.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Products</em>' reference list.
	 * @see uma.UmaPackage#getDomain_WorkProducts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getWorkProducts();

	/**
	 * Returns the value of the '<em><b>Subdomains</b></em>' containment reference list.
	 * The list contents are of type {@link uma.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdomains</em>' containment reference list.
	 * @see uma.UmaPackage#getDomain_Subdomains()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Domain> getSubdomains();

} // Domain
