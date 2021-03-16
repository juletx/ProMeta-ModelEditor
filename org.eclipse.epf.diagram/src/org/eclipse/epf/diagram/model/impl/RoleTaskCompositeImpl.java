/**
 */
package org.eclipse.epf.diagram.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epf.diagram.model.ModelPackage;
import org.eclipse.epf.diagram.model.RoleTaskComposite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Task Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.impl.RoleTaskCompositeImpl#getRowIndex <em>Row Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleTaskCompositeImpl extends NodeContainerImpl implements RoleTaskComposite {
	/**
	 * The default value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected int rowIndex = ROW_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTaskCompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROLE_TASK_COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowIndex() {
		return rowIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowIndex(int newRowIndex) {
		int oldRowIndex = rowIndex;
		rowIndex = newRowIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROLE_TASK_COMPOSITE__ROW_INDEX, oldRowIndex, rowIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ROLE_TASK_COMPOSITE__ROW_INDEX:
				return new Integer(getRowIndex());
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
			case ModelPackage.ROLE_TASK_COMPOSITE__ROW_INDEX:
				setRowIndex(((Integer)newValue).intValue());
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
			case ModelPackage.ROLE_TASK_COMPOSITE__ROW_INDEX:
				setRowIndex(ROW_INDEX_EDEFAULT);
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
			case ModelPackage.ROLE_TASK_COMPOSITE__ROW_INDEX:
				return rowIndex != ROW_INDEX_EDEFAULT;
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
		result.append(" (rowIndex: ");
		result.append(rowIndex);
		result.append(')');
		return result.toString();
	}

} //RoleTaskCompositeImpl
