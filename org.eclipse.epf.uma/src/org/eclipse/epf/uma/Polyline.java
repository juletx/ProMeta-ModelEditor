/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.Polyline#getClosed <em>Closed</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.Polyline#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getPolyline()
 * @model
 * @generated
 */
public interface Polyline extends GraphicPrimitive {
	/**
	 * Returns the value of the '<em><b>Closed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed</em>' attribute.
	 * @see #setClosed(Boolean)
	 * @see org.eclipse.epf.uma.UmaPackage#getPolyline_Closed()
	 * @model default="true" dataType="org.eclipse.epf.uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getClosed();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.Polyline#getClosed <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed</em>' attribute.
	 * @see #getClosed()
	 * @generated
	 */
	void setClosed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Waypoints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoints</em>' containment reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getPolyline_Waypoints()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<Point> getWaypoints();

} // Polyline
