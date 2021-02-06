/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.Diagram#getDiagramLink <em>Diagram Link</em>}</li>
 *   <li>{@link uma.Diagram#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link uma.Diagram#getZoom <em>Zoom</em>}</li>
 *   <li>{@link uma.Diagram#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends GraphNode {
	/**
	 * Returns the value of the '<em><b>Diagram Link</b></em>' reference list.
	 * The list contents are of type {@link uma.DiagramLink}.
	 * It is bidirectional and its opposite is '{@link uma.DiagramLink#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Link</em>' reference list.
	 * @see uma.UmaPackage#getDiagram_DiagramLink()
	 * @see uma.DiagramLink#getDiagram
	 * @model opposite="diagram" ordered="false"
	 * @generated
	 */
	EList<DiagramLink> getDiagramLink();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uma.SemanticModelBridge#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' containment reference.
	 * @see #setNamespace(SemanticModelBridge)
	 * @see uma.UmaPackage#getDiagram_Namespace()
	 * @see uma.SemanticModelBridge#getDiagram
	 * @model opposite="diagram" containment="true" required="true" ordered="false"
	 * @generated
	 */
	SemanticModelBridge getNamespace();

	/**
	 * Sets the value of the '{@link uma.Diagram#getNamespace <em>Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' containment reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(SemanticModelBridge value);

	/**
	 * Returns the value of the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoom</em>' attribute.
	 * @see #setZoom(Double)
	 * @see uma.UmaPackage#getDiagram_Zoom()
	 * @model dataType="uma.Double" ordered="false"
	 * @generated
	 */
	Double getZoom();

	/**
	 * Sets the value of the '{@link uma.Diagram#getZoom <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom</em>' attribute.
	 * @see #getZoom()
	 * @generated
	 */
	void setZoom(Double value);

	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint</em>' reference.
	 * @see #setViewpoint(Point)
	 * @see uma.UmaPackage#getDiagram_Viewpoint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Point getViewpoint();

	/**
	 * Sets the value of the '{@link uma.Diagram#getViewpoint <em>Viewpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint</em>' reference.
	 * @see #getViewpoint()
	 * @generated
	 */
	void setViewpoint(Point value);

} // Diagram
