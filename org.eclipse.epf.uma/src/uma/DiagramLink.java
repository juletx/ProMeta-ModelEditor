/**
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.DiagramLink#getZoom <em>Zoom</em>}</li>
 *   <li>{@link uma.DiagramLink#getViewport <em>Viewport</em>}</li>
 *   <li>{@link uma.DiagramLink#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link uma.DiagramLink#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getDiagramLink()
 * @model
 * @generated
 */
public interface DiagramLink extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoom</em>' attribute.
	 * @see #setZoom(Double)
	 * @see uma.UmaPackage#getDiagramLink_Zoom()
	 * @model dataType="uma.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getZoom();

	/**
	 * Sets the value of the '{@link uma.DiagramLink#getZoom <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom</em>' attribute.
	 * @see #getZoom()
	 * @generated
	 */
	void setZoom(Double value);

	/**
	 * Returns the value of the '<em><b>Viewport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewport</em>' reference.
	 * @see #setViewport(Point)
	 * @see uma.UmaPackage#getDiagramLink_Viewport()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Point getViewport();

	/**
	 * Sets the value of the '{@link uma.DiagramLink#getViewport <em>Viewport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewport</em>' reference.
	 * @see #getViewport()
	 * @generated
	 */
	void setViewport(Point value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uma.Diagram#getDiagramLink <em>Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' reference.
	 * @see #setDiagram(Diagram)
	 * @see uma.UmaPackage#getDiagramLink_Diagram()
	 * @see uma.Diagram#getDiagramLink
	 * @model opposite="diagramLink" required="true" ordered="false"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link uma.DiagramLink#getDiagram <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Graph Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uma.GraphElement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Element</em>' container reference.
	 * @see #setGraphElement(GraphElement)
	 * @see uma.UmaPackage#getDiagramLink_GraphElement()
	 * @see uma.GraphElement#getLink
	 * @model opposite="link" required="true" transient="false" ordered="false"
	 * @generated
	 */
	GraphElement getGraphElement();

	/**
	 * Sets the value of the '{@link uma.DiagramLink#getGraphElement <em>Graph Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Element</em>' container reference.
	 * @see #getGraphElement()
	 * @generated
	 */
	void setGraphElement(GraphElement value);

} // DiagramLink
