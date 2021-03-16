/**
 */
package org.eclipse.epf.diagram.model.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epf.diagram.model.Link;
import org.eclipse.epf.diagram.model.ModelPackage;
import org.eclipse.epf.diagram.model.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.NodeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.NodeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.NodeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.NodeImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.NodeImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.NodeImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends LinkedObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final Point LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Point location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingConnections() <em>Incoming Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnections()
	 * @generated
	 * @ordered
	 */
	protected EList incomingConnections;

	/**
	 * The cached value of the '{@link #getOutgoingConnections() <em>Outgoing Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnections()
	 * @generated
	 * @ordered
	 */
	protected EList outgoingConnections;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Point newLocation) {
		Point oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncomingConnections() {
		if (incomingConnections == null) {
			incomingConnections = new EObjectWithInverseResolvingEList(Link.class, this, ModelPackage.NODE__INCOMING_CONNECTIONS, ModelPackage.LINK__TARGET);
		}
		return incomingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutgoingConnections() {
		if (outgoingConnections == null) {
			outgoingConnections = new EObjectContainmentWithInverseEList(Link.class, this, ModelPackage.NODE__OUTGOING_CONNECTIONS, ModelPackage.LINK__SOURCE);
		}
		return outgoingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NODE__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.NODE__INCOMING_CONNECTIONS:
				return ((InternalEList)getIncomingConnections()).basicAdd(otherEnd, msgs);
			case ModelPackage.NODE__OUTGOING_CONNECTIONS:
				return ((InternalEList)getOutgoingConnections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.NODE__INCOMING_CONNECTIONS:
				return ((InternalEList)getIncomingConnections()).basicRemove(otherEnd, msgs);
			case ModelPackage.NODE__OUTGOING_CONNECTIONS:
				return ((InternalEList)getOutgoingConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.NODE__LOCATION:
				return getLocation();
			case ModelPackage.NODE__WIDTH:
				return new Integer(getWidth());
			case ModelPackage.NODE__HEIGHT:
				return new Integer(getHeight());
			case ModelPackage.NODE__INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case ModelPackage.NODE__OUTGOING_CONNECTIONS:
				return getOutgoingConnections();
			case ModelPackage.NODE__READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.NODE__LOCATION:
				setLocation((Point)newValue);
				return;
			case ModelPackage.NODE__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case ModelPackage.NODE__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case ModelPackage.NODE__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection)newValue);
				return;
			case ModelPackage.NODE__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				getOutgoingConnections().addAll((Collection)newValue);
				return;
			case ModelPackage.NODE__READ_ONLY:
				setReadOnly(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.NODE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ModelPackage.NODE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ModelPackage.NODE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ModelPackage.NODE__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				return;
			case ModelPackage.NODE__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				return;
			case ModelPackage.NODE__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.NODE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ModelPackage.NODE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ModelPackage.NODE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ModelPackage.NODE__INCOMING_CONNECTIONS:
				return incomingConnections != null && !incomingConnections.isEmpty();
			case ModelPackage.NODE__OUTGOING_CONNECTIONS:
				return outgoingConnections != null && !outgoingConnections.isEmpty();
			case ModelPackage.NODE__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
