/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.GraphEdge#getWaypoints <em>Waypoints</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.GraphEdge#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getGraphEdge()
 * @model
 * @generated
 */
public interface GraphEdge extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Waypoints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoints</em>' containment reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getGraphEdge_Waypoints()
	 * @model containment="true" resolveProxies="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<Point> getWaypoints();

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.GraphConnector}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.uma.GraphConnector#getGraphEdge <em>Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getGraphEdge_Anchor()
	 * @see org.eclipse.epf.uma.GraphConnector#getGraphEdge
	 * @model opposite="graphEdge" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<GraphConnector> getAnchor();

} // GraphEdge
