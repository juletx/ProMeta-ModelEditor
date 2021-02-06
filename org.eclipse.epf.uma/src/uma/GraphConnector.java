/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.GraphConnector#getGraphEdge <em>Graph Edge</em>}</li>
 *   <li>{@link uma.GraphConnector#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getGraphConnector()
 * @model
 * @generated
 */
public interface GraphConnector extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Graph Edge</b></em>' reference list.
	 * The list contents are of type {@link uma.GraphEdge}.
	 * It is bidirectional and its opposite is '{@link uma.GraphEdge#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Edge</em>' reference list.
	 * @see uma.UmaPackage#getGraphConnector_GraphEdge()
	 * @see uma.GraphEdge#getAnchor
	 * @model opposite="anchor" ordered="false"
	 * @generated
	 */
	EList<GraphEdge> getGraphEdge();

	/**
	 * Returns the value of the '<em><b>Graph Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uma.GraphElement#getAnchorage <em>Anchorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Element</em>' container reference.
	 * @see #setGraphElement(GraphElement)
	 * @see uma.UmaPackage#getGraphConnector_GraphElement()
	 * @see uma.GraphElement#getAnchorage
	 * @model opposite="anchorage" required="true" transient="false" ordered="false"
	 * @generated
	 */
	GraphElement getGraphElement();

	/**
	 * Sets the value of the '{@link uma.GraphConnector#getGraphElement <em>Graph Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Element</em>' container reference.
	 * @see #getGraphElement()
	 * @generated
	 */
	void setGraphElement(GraphElement value);

} // GraphConnector
