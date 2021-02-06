/**
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uma.Milestone;
import uma.UmaPackage;
import uma.WorkProductDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.MilestoneImpl#getRequiredResults <em>Required Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MilestoneImpl extends WorkBreakdownElementImpl implements Milestone {
	/**
	 * The cached value of the '{@link #getRequiredResults() <em>Required Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResults()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductDescriptor> requiredResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MilestoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getMilestone();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProductDescriptor> getRequiredResults() {
		if (requiredResults == null) {
			requiredResults = new EObjectResolvingEList<WorkProductDescriptor>(WorkProductDescriptor.class, this, UmaPackage.MILESTONE__REQUIRED_RESULTS);
		}
		return requiredResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.MILESTONE__REQUIRED_RESULTS:
				return getRequiredResults();
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
			case UmaPackage.MILESTONE__REQUIRED_RESULTS:
				getRequiredResults().clear();
				getRequiredResults().addAll((Collection<? extends WorkProductDescriptor>)newValue);
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
			case UmaPackage.MILESTONE__REQUIRED_RESULTS:
				getRequiredResults().clear();
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
			case UmaPackage.MILESTONE__REQUIRED_RESULTS:
				return requiredResults != null && !requiredResults.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MilestoneImpl
