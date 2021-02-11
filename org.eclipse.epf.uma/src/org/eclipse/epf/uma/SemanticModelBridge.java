/**
 */
package org.eclipse.epf.uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Model Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.SemanticModelBridge#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.SemanticModelBridge#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.SemanticModelBridge#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getSemanticModelBridge()
 * @model abstract="true"
 * @generated
 */
public interface SemanticModelBridge extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see #setPresentation(String)
	 * @see org.eclipse.epf.uma.UmaPackage#getSemanticModelBridge_Presentation()
	 * @model default="" dataType="org.eclipse.epf.uma.String" ordered="false"
	 * @generated
	 */
	String getPresentation();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.SemanticModelBridge#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(String value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.uma.Diagram#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(Diagram)
	 * @see org.eclipse.epf.uma.UmaPackage#getSemanticModelBridge_Diagram()
	 * @see org.eclipse.epf.uma.Diagram#getNamespace
	 * @model opposite="namespace" transient="false" ordered="false"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.SemanticModelBridge#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Graph Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.uma.GraphElement#getSemanticModel <em>Semantic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Element</em>' container reference.
	 * @see #setGraphElement(GraphElement)
	 * @see org.eclipse.epf.uma.UmaPackage#getSemanticModelBridge_GraphElement()
	 * @see org.eclipse.epf.uma.GraphElement#getSemanticModel
	 * @model opposite="semanticModel" transient="false" ordered="false"
	 * @generated
	 */
	GraphElement getGraphElement();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.SemanticModelBridge#getGraphElement <em>Graph Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Element</em>' container reference.
	 * @see #getGraphElement()
	 * @generated
	 */
	void setGraphElement(GraphElement value);

} // SemanticModelBridge
