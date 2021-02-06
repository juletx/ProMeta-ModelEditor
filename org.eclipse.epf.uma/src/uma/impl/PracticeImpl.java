/**
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.Activity;
import uma.ContentElement;
import uma.Practice;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.PracticeImpl#getSubPractices <em>Sub Practices</em>}</li>
 *   <li>{@link uma.impl.PracticeImpl#getContentReferences <em>Content References</em>}</li>
 *   <li>{@link uma.impl.PracticeImpl#getActivityReferences <em>Activity References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PracticeImpl extends GuidanceImpl implements Practice {
	/**
	 * The cached value of the '{@link #getSubPractices() <em>Sub Practices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPractices()
	 * @generated
	 * @ordered
	 */
	protected EList<Practice> subPractices;

	/**
	 * The cached value of the '{@link #getContentReferences() <em>Content References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentElement> contentReferences;

	/**
	 * The cached value of the '{@link #getActivityReferences() <em>Activity References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activityReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PracticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getPractice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Practice> getSubPractices() {
		if (subPractices == null) {
			subPractices = new EObjectContainmentEList<Practice>(Practice.class, this, UmaPackage.PRACTICE__SUB_PRACTICES);
		}
		return subPractices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentElement> getContentReferences() {
		if (contentReferences == null) {
			contentReferences = new EObjectResolvingEList<ContentElement>(ContentElement.class, this, UmaPackage.PRACTICE__CONTENT_REFERENCES);
		}
		return contentReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivityReferences() {
		if (activityReferences == null) {
			activityReferences = new EObjectResolvingEList<Activity>(Activity.class, this, UmaPackage.PRACTICE__ACTIVITY_REFERENCES);
		}
		return activityReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.PRACTICE__SUB_PRACTICES:
				return ((InternalEList<?>)getSubPractices()).basicRemove(otherEnd, msgs);
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
			case UmaPackage.PRACTICE__SUB_PRACTICES:
				return getSubPractices();
			case UmaPackage.PRACTICE__CONTENT_REFERENCES:
				return getContentReferences();
			case UmaPackage.PRACTICE__ACTIVITY_REFERENCES:
				return getActivityReferences();
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
			case UmaPackage.PRACTICE__SUB_PRACTICES:
				getSubPractices().clear();
				getSubPractices().addAll((Collection<? extends Practice>)newValue);
				return;
			case UmaPackage.PRACTICE__CONTENT_REFERENCES:
				getContentReferences().clear();
				getContentReferences().addAll((Collection<? extends ContentElement>)newValue);
				return;
			case UmaPackage.PRACTICE__ACTIVITY_REFERENCES:
				getActivityReferences().clear();
				getActivityReferences().addAll((Collection<? extends Activity>)newValue);
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
			case UmaPackage.PRACTICE__SUB_PRACTICES:
				getSubPractices().clear();
				return;
			case UmaPackage.PRACTICE__CONTENT_REFERENCES:
				getContentReferences().clear();
				return;
			case UmaPackage.PRACTICE__ACTIVITY_REFERENCES:
				getActivityReferences().clear();
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
			case UmaPackage.PRACTICE__SUB_PRACTICES:
				return subPractices != null && !subPractices.isEmpty();
			case UmaPackage.PRACTICE__CONTENT_REFERENCES:
				return contentReferences != null && !contentReferences.isEmpty();
			case UmaPackage.PRACTICE__ACTIVITY_REFERENCES:
				return activityReferences != null && !activityReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PracticeImpl
