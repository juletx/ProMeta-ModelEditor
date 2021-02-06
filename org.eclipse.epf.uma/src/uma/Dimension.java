/**
 */
package uma;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.Dimension#getWidth <em>Width</em>}</li>
 *   <li>{@link uma.Dimension#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Double)
	 * @see uma.UmaPackage#getDimension_Width()
	 * @model dataType="uma.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getWidth();

	/**
	 * Sets the value of the '{@link uma.Dimension#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Double)
	 * @see uma.UmaPackage#getDimension_Height()
	 * @model dataType="uma.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getHeight();

	/**
	 * Sets the value of the '{@link uma.Dimension#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Double value);

} // Dimension
