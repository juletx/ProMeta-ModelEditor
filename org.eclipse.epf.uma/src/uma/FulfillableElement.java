/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfillable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.FulfillableElement#getFulfills <em>Fulfills</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getFulfillableElement()
 * @model
 * @generated
 */
public interface FulfillableElement extends DescribableElement {
	/**
	 * Returns the value of the '<em><b>Fulfills</b></em>' reference list.
	 * The list contents are of type {@link uma.FulfillableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfills</em>' reference list.
	 * @see uma.UmaPackage#getFulfillableElement_Fulfills()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FulfillableElement> getFulfills();

} // FulfillableElement
