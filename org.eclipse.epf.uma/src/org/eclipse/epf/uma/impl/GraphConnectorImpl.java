/**
 */
package org.eclipse.epf.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epf.uma.GraphConnector;
import org.eclipse.epf.uma.GraphEdge;
import org.eclipse.epf.uma.GraphElement;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.GraphConnectorImpl#getGraphEdge <em>Graph Edge</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.GraphConnectorImpl#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphConnectorImpl extends GraphElementImpl implements GraphConnector {
	/**
	 * The cached value of the '{@link #getGraphEdge() <em>Graph Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphEdge> graphEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getGraphConnector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphEdge> getGraphEdge() {
		if (graphEdge == null) {
			graphEdge = new EObjectWithInverseResolvingEList.ManyInverse<GraphEdge>(GraphEdge.class, this, UmaPackage.GRAPH_CONNECTOR__GRAPH_EDGE, UmaPackage.GRAPH_EDGE__ANCHOR);
		}
		return graphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement getGraphElement() {
		if (eContainerFeatureID() != UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT) return null;
		return (GraphElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphElement(GraphElement newGraphElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraphElement, UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphElement(GraphElement newGraphElement) {
		if (newGraphElement != eInternalContainer() || (eContainerFeatureID() != UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT && newGraphElement != null)) {
			if (EcoreUtil.isAncestor(this, newGraphElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraphElement != null)
				msgs = ((InternalEObject)newGraphElement).eInverseAdd(this, UmaPackage.GRAPH_ELEMENT__ANCHORAGE, GraphElement.class, msgs);
			msgs = basicSetGraphElement(newGraphElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT, newGraphElement, newGraphElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGraphEdge()).basicAdd(otherEnd, msgs);
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraphElement((GraphElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_EDGE:
				return ((InternalEList<?>)getGraphEdge()).basicRemove(otherEnd, msgs);
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT:
				return basicSetGraphElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT:
				return eInternalContainer().eInverseRemove(this, UmaPackage.GRAPH_ELEMENT__ANCHORAGE, GraphElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_EDGE:
				return getGraphEdge();
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT:
				return getGraphElement();
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
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_EDGE:
				getGraphEdge().clear();
				getGraphEdge().addAll((Collection<? extends GraphEdge>)newValue);
				return;
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT:
				setGraphElement((GraphElement)newValue);
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
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_EDGE:
				getGraphEdge().clear();
				return;
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT:
				setGraphElement((GraphElement)null);
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
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_EDGE:
				return graphEdge != null && !graphEdge.isEmpty();
			case UmaPackage.GRAPH_CONNECTOR__GRAPH_ELEMENT:
				return getGraphElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //GraphConnectorImpl
