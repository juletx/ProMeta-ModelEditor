/**
 */
package uma.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uma.Diagram;
import uma.GraphElement;
import uma.SemanticModelBridge;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Model Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.SemanticModelBridgeImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link uma.impl.SemanticModelBridgeImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link uma.impl.SemanticModelBridgeImpl#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SemanticModelBridgeImpl extends DiagramElementImpl implements SemanticModelBridge {
	/**
	 * The default value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected String presentation = PRESENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticModelBridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getSemanticModelBridge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(String newPresentation) {
		String oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.SEMANTIC_MODEL_BRIDGE__PRESENTATION, oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		if (eContainerFeatureID() != UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM) return null;
		return (Diagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, UmaPackage.DIAGRAM__NAMESPACE, Diagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement getGraphElement() {
		if (eContainerFeatureID() != UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT) return null;
		return (GraphElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphElement(GraphElement newGraphElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraphElement, UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphElement(GraphElement newGraphElement) {
		if (newGraphElement != eInternalContainer() || (eContainerFeatureID() != UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT && newGraphElement != null)) {
			if (EcoreUtil.isAncestor(this, newGraphElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraphElement != null)
				msgs = ((InternalEObject)newGraphElement).eInverseAdd(this, UmaPackage.GRAPH_ELEMENT__SEMANTIC_MODEL, GraphElement.class, msgs);
			msgs = basicSetGraphElement(newGraphElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT, newGraphElement, newGraphElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((Diagram)otherEnd, msgs);
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT:
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
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT:
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
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, UmaPackage.DIAGRAM__NAMESPACE, Diagram.class, msgs);
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT:
				return eInternalContainer().eInverseRemove(this, UmaPackage.GRAPH_ELEMENT__SEMANTIC_MODEL, GraphElement.class, msgs);
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
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__PRESENTATION:
				return getPresentation();
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM:
				return getDiagram();
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT:
				return getGraphElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__PRESENTATION:
				setPresentation((String)newValue);
				return;
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT:
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
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__PRESENTATION:
				setPresentation(PRESENTATION_EDEFAULT);
				return;
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT:
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
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__PRESENTATION:
				return PRESENTATION_EDEFAULT == null ? presentation != null : !PRESENTATION_EDEFAULT.equals(presentation);
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__DIAGRAM:
				return getDiagram() != null;
			case UmaPackage.SEMANTIC_MODEL_BRIDGE__GRAPH_ELEMENT:
				return getGraphElement() != null;
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
		result.append(" (presentation: ");
		result.append(presentation);
		result.append(')');
		return result.toString();
	}

} //SemanticModelBridgeImpl
