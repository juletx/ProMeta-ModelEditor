/**
 */
package org.eclipse.epf.uma;

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
 *   <li>{@link org.eclipse.epf.uma.GraphConnector#getGraphEdge <em>Graph Edge</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.GraphConnector#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getGraphConnector()
 * @model
 * @generated
 */
public interface GraphConnector extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Graph Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.GraphEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.uma.GraphEdge#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Edge</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getGraphConnector_GraphEdge()
	 * @see org.eclipse.epf.uma.GraphEdge#getAnchor
	 * @model opposite="anchor" ordered="false"
	 * @generated
	 */
	EList<GraphEdge> getGraphEdge();

	/**
	 * Returns the value of the '<em><b>Graph Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.uma.GraphElement#getAnchorage <em>Anchorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Element</em>' container reference.
	 * @see #setGraphElement(GraphElement)
	 * @see org.eclipse.epf.uma.UmaPackage#getGraphConnector_GraphElement()
	 * @see org.eclipse.epf.uma.GraphElement#getAnchorage
	 * @model opposite="anchorage" required="true" transient="false" ordered="false"
	 * @generated
	 */
	GraphElement getGraphElement();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.GraphConnector#getGraphElement <em>Graph Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Element</em>' container reference.
	 * @see #getGraphElement()
	 * @generated
	 */
	void setGraphElement(GraphElement value);

} // GraphConnector
