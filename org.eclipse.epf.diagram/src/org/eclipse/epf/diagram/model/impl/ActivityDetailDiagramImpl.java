/**
 */
package org.eclipse.epf.diagram.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epf.diagram.model.ActivityDetailDiagram;
import org.eclipse.epf.diagram.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Detail Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.ActivityDetailDiagramImpl#isAutoLayout <em>Auto Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDetailDiagramImpl extends DiagramImpl implements ActivityDetailDiagram {
	/**
	 * The default value of the '{@link #isAutoLayout() <em>Auto Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoLayout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_LAYOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoLayout() <em>Auto Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoLayout()
	 * @generated
	 * @ordered
	 */
	protected boolean autoLayout = AUTO_LAYOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDetailDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTIVITY_DETAIL_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoLayout() {
		return autoLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoLayout(boolean newAutoLayout) {
		boolean oldAutoLayout = autoLayout;
		autoLayout = newAutoLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTIVITY_DETAIL_DIAGRAM__AUTO_LAYOUT, oldAutoLayout, autoLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ACTIVITY_DETAIL_DIAGRAM__AUTO_LAYOUT:
				return isAutoLayout() ? Boolean.TRUE : Boolean.FALSE;
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
			case ModelPackage.ACTIVITY_DETAIL_DIAGRAM__AUTO_LAYOUT:
				setAutoLayout(((Boolean)newValue).booleanValue());
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
			case ModelPackage.ACTIVITY_DETAIL_DIAGRAM__AUTO_LAYOUT:
				setAutoLayout(AUTO_LAYOUT_EDEFAULT);
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
			case ModelPackage.ACTIVITY_DETAIL_DIAGRAM__AUTO_LAYOUT:
				return autoLayout != AUTO_LAYOUT_EDEFAULT;
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
		result.append(" (autoLayout: ");
		result.append(autoLayout);
		result.append(')');
		return result.toString();
	}

} //ActivityDetailDiagramImpl
