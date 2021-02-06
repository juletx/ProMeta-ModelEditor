/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.DiagramElement#getIsVisible <em>Is Visible</em>}</li>
 *   <li>{@link uma.DiagramElement#getContainer <em>Container</em>}</li>
 *   <li>{@link uma.DiagramElement#getReference <em>Reference</em>}</li>
 *   <li>{@link uma.DiagramElement#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends MethodElement {
	/**
	 * Returns the value of the '<em><b>Is Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Visible</em>' attribute.
	 * @see #setIsVisible(Boolean)
	 * @see uma.UmaPackage#getDiagramElement_IsVisible()
	 * @model default="true" dataType="uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsVisible();

	/**
	 * Sets the value of the '{@link uma.DiagramElement#getIsVisible <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Visible</em>' attribute.
	 * @see #getIsVisible()
	 * @generated
	 */
	void setIsVisible(Boolean value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uma.GraphElement#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(GraphElement)
	 * @see uma.UmaPackage#getDiagramElement_Container()
	 * @see uma.GraphElement#getContained
	 * @model opposite="contained" transient="false" ordered="false"
	 * @generated
	 */
	GraphElement getContainer();

	/**
	 * Sets the value of the '{@link uma.DiagramElement#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(GraphElement value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link uma.Reference}.
	 * It is bidirectional and its opposite is '{@link uma.Reference#getReferenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see uma.UmaPackage#getDiagramElement_Reference()
	 * @see uma.Reference#getReferenced
	 * @model opposite="referenced" ordered="false"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link uma.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see uma.UmaPackage#getDiagramElement_Property()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getProperty();

} // DiagramElement
