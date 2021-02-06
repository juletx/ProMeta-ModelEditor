/**
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.Point;
import uma.Polyline;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.PolylineImpl#getClosed <em>Closed</em>}</li>
 *   <li>{@link uma.impl.PolylineImpl#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolylineImpl extends GraphicPrimitiveImpl implements Polyline {
	/**
	 * The default value of the '{@link #getClosed() <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CLOSED_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getClosed() <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosed()
	 * @generated
	 * @ordered
	 */
	protected Boolean closed = CLOSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWaypoints() <em>Waypoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaypoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> waypoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolylineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getPolyline();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getClosed() {
		return closed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosed(Boolean newClosed) {
		Boolean oldClosed = closed;
		closed = newClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.POLYLINE__CLOSED, oldClosed, closed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getWaypoints() {
		if (waypoints == null) {
			waypoints = new EObjectContainmentEList<Point>(Point.class, this, UmaPackage.POLYLINE__WAYPOINTS);
		}
		return waypoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.POLYLINE__WAYPOINTS:
				return ((InternalEList<?>)getWaypoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.POLYLINE__CLOSED:
				return getClosed();
			case UmaPackage.POLYLINE__WAYPOINTS:
				return getWaypoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmaPackage.POLYLINE__CLOSED:
				setClosed((Boolean)newValue);
				return;
			case UmaPackage.POLYLINE__WAYPOINTS:
				getWaypoints().clear();
				getWaypoints().addAll((Collection<? extends Point>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UmaPackage.POLYLINE__CLOSED:
				setClosed(CLOSED_EDEFAULT);
				return;
			case UmaPackage.POLYLINE__WAYPOINTS:
				getWaypoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UmaPackage.POLYLINE__CLOSED:
				return CLOSED_EDEFAULT == null ? closed != null : !CLOSED_EDEFAULT.equals(closed);
			case UmaPackage.POLYLINE__WAYPOINTS:
				return waypoints != null && !waypoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (closed: ");
		result.append(closed);
		result.append(')');
		return result.toString();
	}

} //PolylineImpl
