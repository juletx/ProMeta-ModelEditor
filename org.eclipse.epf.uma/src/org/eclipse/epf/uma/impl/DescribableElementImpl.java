/**
 */
package org.eclipse.epf.uma.impl;

import java.net.URI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epf.uma.Classifier;
import org.eclipse.epf.uma.ContentDescription;
import org.eclipse.epf.uma.DescribableElement;
import org.eclipse.epf.uma.Type;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Describable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.DescribableElementImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.DescribableElementImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.DescribableElementImpl#getShapeicon <em>Shapeicon</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.DescribableElementImpl#getNodeicon <em>Nodeicon</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DescribableElementImpl extends MethodElementImpl implements DescribableElement {
	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected ContentDescription presentation;

	/**
	 * The default value of the '{@link #getShapeicon() <em>Shapeicon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeicon()
	 * @generated
	 * @ordered
	 */
	protected static final URI SHAPEICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShapeicon() <em>Shapeicon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeicon()
	 * @generated
	 * @ordered
	 */
	protected URI shapeicon = SHAPEICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeicon() <em>Nodeicon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeicon()
	 * @generated
	 * @ordered
	 */
	protected static final URI NODEICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeicon() <em>Nodeicon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeicon()
	 * @generated
	 * @ordered
	 */
	protected URI nodeicon = NODEICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescribableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getDescribableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DESCRIBABLE_ELEMENT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDescription getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentation(ContentDescription newPresentation, NotificationChain msgs) {
		ContentDescription oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION, oldPresentation, newPresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(ContentDescription newPresentation) {
		if (newPresentation != presentation) {
			NotificationChain msgs = null;
			if (presentation != null)
				msgs = ((InternalEObject)presentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION, null, msgs);
			if (newPresentation != null)
				msgs = ((InternalEObject)newPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION, null, msgs);
			msgs = basicSetPresentation(newPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION, newPresentation, newPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getShapeicon() {
		return shapeicon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeicon(URI newShapeicon) {
		URI oldShapeicon = shapeicon;
		shapeicon = newShapeicon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DESCRIBABLE_ELEMENT__SHAPEICON, oldShapeicon, shapeicon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getNodeicon() {
		return nodeicon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeicon(URI newNodeicon) {
		URI oldNodeicon = nodeicon;
		nodeicon = newNodeicon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.DESCRIBABLE_ELEMENT__NODEICON, oldNodeicon, nodeicon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION:
				return basicSetPresentation(null, msgs);
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
			case UmaPackage.DESCRIBABLE_ELEMENT__IS_ABSTRACT:
				return getIsAbstract();
			case UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION:
				return getPresentation();
			case UmaPackage.DESCRIBABLE_ELEMENT__SHAPEICON:
				return getShapeicon();
			case UmaPackage.DESCRIBABLE_ELEMENT__NODEICON:
				return getNodeicon();
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
			case UmaPackage.DESCRIBABLE_ELEMENT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION:
				setPresentation((ContentDescription)newValue);
				return;
			case UmaPackage.DESCRIBABLE_ELEMENT__SHAPEICON:
				setShapeicon((URI)newValue);
				return;
			case UmaPackage.DESCRIBABLE_ELEMENT__NODEICON:
				setNodeicon((URI)newValue);
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
			case UmaPackage.DESCRIBABLE_ELEMENT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION:
				setPresentation((ContentDescription)null);
				return;
			case UmaPackage.DESCRIBABLE_ELEMENT__SHAPEICON:
				setShapeicon(SHAPEICON_EDEFAULT);
				return;
			case UmaPackage.DESCRIBABLE_ELEMENT__NODEICON:
				setNodeicon(NODEICON_EDEFAULT);
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
			case UmaPackage.DESCRIBABLE_ELEMENT__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION:
				return presentation != null;
			case UmaPackage.DESCRIBABLE_ELEMENT__SHAPEICON:
				return SHAPEICON_EDEFAULT == null ? shapeicon != null : !SHAPEICON_EDEFAULT.equals(shapeicon);
			case UmaPackage.DESCRIBABLE_ELEMENT__NODEICON:
				return NODEICON_EDEFAULT == null ? nodeicon != null : !NODEICON_EDEFAULT.equals(nodeicon);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case UmaPackage.DESCRIBABLE_ELEMENT__IS_ABSTRACT: return UmaPackage.CLASSIFIER__IS_ABSTRACT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case UmaPackage.CLASSIFIER__IS_ABSTRACT: return UmaPackage.DESCRIBABLE_ELEMENT__IS_ABSTRACT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", shapeicon: ");
		result.append(shapeicon);
		result.append(", nodeicon: ");
		result.append(nodeicon);
		result.append(')');
		return result.toString();
	}

} //DescribableElementImpl
