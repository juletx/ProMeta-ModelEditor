/**
 */
package uma;

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
 *   <li>{@link uma.Polyline#getClosed <em>Closed</em>}</li>
 *   <li>{@link uma.Polyline#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getPolyline()
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
	 * @see uma.UmaPackage#getPolyline_Closed()
	 * @model default="true" dataType="uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getClosed();

	/**
	 * Sets the value of the '{@link uma.Polyline#getClosed <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed</em>' attribute.
	 * @see #getClosed()
	 * @generated
	 */
	void setClosed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Waypoints</b></em>' containment reference list.
	 * The list contents are of type {@link uma.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoints</em>' containment reference list.
	 * @see uma.UmaPackage#getPolyline_Waypoints()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<Point> getWaypoints();

} // Polyline
