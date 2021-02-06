/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.GraphElement#getContained <em>Contained</em>}</li>
 *   <li>{@link uma.GraphElement#getPosition <em>Position</em>}</li>
 *   <li>{@link uma.GraphElement#getLink <em>Link</em>}</li>
 *   <li>{@link uma.GraphElement#getAnchorage <em>Anchorage</em>}</li>
 *   <li>{@link uma.GraphElement#getSemanticModel <em>Semantic Model</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getGraphElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphElement extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Contained</b></em>' containment reference list.
	 * The list contents are of type {@link uma.DiagramElement}.
	 * It is bidirectional and its opposite is '{@link uma.DiagramElement#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' containment reference list.
	 * @see uma.UmaPackage#getGraphElement_Contained()
	 * @see uma.DiagramElement#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<DiagramElement> getContained();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Point)
	 * @see uma.UmaPackage#getGraphElement_Position()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link uma.GraphElement#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link uma.DiagramLink}.
	 * It is bidirectional and its opposite is '{@link uma.DiagramLink#getGraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see uma.UmaPackage#getGraphElement_Link()
	 * @see uma.DiagramLink#getGraphElement
	 * @model opposite="graphElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<DiagramLink> getLink();

	/**
	 * Returns the value of the '<em><b>Anchorage</b></em>' containment reference list.
	 * The list contents are of type {@link uma.GraphConnector}.
	 * It is bidirectional and its opposite is '{@link uma.GraphConnector#getGraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchorage</em>' containment reference list.
	 * @see uma.UmaPackage#getGraphElement_Anchorage()
	 * @see uma.GraphConnector#getGraphElement
	 * @model opposite="graphElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<GraphConnector> getAnchorage();

	/**
	 * Returns the value of the '<em><b>Semantic Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uma.SemanticModelBridge#getGraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Model</em>' containment reference.
	 * @see #setSemanticModel(SemanticModelBridge)
	 * @see uma.UmaPackage#getGraphElement_SemanticModel()
	 * @see uma.SemanticModelBridge#getGraphElement
	 * @model opposite="graphElement" containment="true" required="true" ordered="false"
	 * @generated
	 */
	SemanticModelBridge getSemanticModel();

	/**
	 * Sets the value of the '{@link uma.GraphElement#getSemanticModel <em>Semantic Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Model</em>' containment reference.
	 * @see #getSemanticModel()
	 * @generated
	 */
	void setSemanticModel(SemanticModelBridge value);

} // GraphElement
