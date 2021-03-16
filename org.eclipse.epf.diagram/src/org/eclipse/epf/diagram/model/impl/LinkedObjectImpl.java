/**
 */
package org.eclipse.epf.diagram.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.epf.diagram.model.LinkedObject;
import org.eclipse.epf.diagram.model.ModelPackage;

import org.eclipse.epf.uma.MethodElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linked Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.LinkedObjectImpl#getLinkedElement <em>Linked Element</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.LinkedObjectImpl#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinkedObjectImpl extends EObjectImpl implements LinkedObject {
	/**
	 * The cached value of the '{@link #getLinkedElement() <em>Linked Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedElement()
	 * @generated
	 * @ordered
	 */
	protected MethodElement linkedElement;

	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected Object object = OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LINKED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodElement getLinkedElement() {
		if (linkedElement != null && linkedElement.eIsProxy()) {
			InternalEObject oldLinkedElement = (InternalEObject)linkedElement;
			linkedElement = (MethodElement)eResolveProxy(oldLinkedElement);
			if (linkedElement != oldLinkedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.LINKED_OBJECT__LINKED_ELEMENT, oldLinkedElement, linkedElement));
			}
		}
		return linkedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodElement basicGetLinkedElement() {
		return linkedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedElement(MethodElement newLinkedElement) {
		MethodElement oldLinkedElement = linkedElement;
		linkedElement = newLinkedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LINKED_OBJECT__LINKED_ELEMENT, oldLinkedElement, linkedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(Object newObject) {
		Object oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LINKED_OBJECT__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.LINKED_OBJECT__LINKED_ELEMENT:
				if (resolve) return getLinkedElement();
				return basicGetLinkedElement();
			case ModelPackage.LINKED_OBJECT__OBJECT:
				return getObject();
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
			case ModelPackage.LINKED_OBJECT__LINKED_ELEMENT:
				setLinkedElement((MethodElement)newValue);
				return;
			case ModelPackage.LINKED_OBJECT__OBJECT:
				setObject(newValue);
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
			case ModelPackage.LINKED_OBJECT__LINKED_ELEMENT:
				setLinkedElement((MethodElement)null);
				return;
			case ModelPackage.LINKED_OBJECT__OBJECT:
				setObject(OBJECT_EDEFAULT);
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
			case ModelPackage.LINKED_OBJECT__LINKED_ELEMENT:
				return linkedElement != null;
			case ModelPackage.LINKED_OBJECT__OBJECT:
				return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
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
		result.append(" (object: ");
		result.append(object);
		result.append(')');
		return result.toString();
	}

} //LinkedObjectImpl
