/**
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uma.EstimationConsiderations;
import uma.FulfillableElement;
import uma.Report;
import uma.Template;
import uma.ToolMentor;
import uma.UmaPackage;
import uma.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.WorkProductImpl#getFulfills <em>Fulfills</em>}</li>
 *   <li>{@link uma.impl.WorkProductImpl#getReports <em>Reports</em>}</li>
 *   <li>{@link uma.impl.WorkProductImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link uma.impl.WorkProductImpl#getToolMentors <em>Tool Mentors</em>}</li>
 *   <li>{@link uma.impl.WorkProductImpl#getEstimationConsiderations <em>Estimation Considerations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkProductImpl extends ContentElementImpl implements WorkProduct {
	/**
	 * The cached value of the '{@link #getFulfills() <em>Fulfills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfills()
	 * @generated
	 * @ordered
	 */
	protected EList<FulfillableElement> fulfills;

	/**
	 * The cached value of the '{@link #getReports() <em>Reports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReports()
	 * @generated
	 * @ordered
	 */
	protected EList<Report> reports;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<Template> templates;

	/**
	 * The cached value of the '{@link #getToolMentors() <em>Tool Mentors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolMentors()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolMentor> toolMentors;

	/**
	 * The cached value of the '{@link #getEstimationConsiderations() <em>Estimation Considerations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimationConsiderations()
	 * @generated
	 * @ordered
	 */
	protected EList<EstimationConsiderations> estimationConsiderations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getWorkProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FulfillableElement> getFulfills() {
		if (fulfills == null) {
			fulfills = new EObjectResolvingEList<FulfillableElement>(FulfillableElement.class, this, UmaPackage.WORK_PRODUCT__FULFILLS);
		}
		return fulfills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Report> getReports() {
		if (reports == null) {
			reports = new EObjectResolvingEList<Report>(Report.class, this, UmaPackage.WORK_PRODUCT__REPORTS);
		}
		return reports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Template> getTemplates() {
		if (templates == null) {
			templates = new EObjectResolvingEList<Template>(Template.class, this, UmaPackage.WORK_PRODUCT__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToolMentor> getToolMentors() {
		if (toolMentors == null) {
			toolMentors = new EObjectResolvingEList<ToolMentor>(ToolMentor.class, this, UmaPackage.WORK_PRODUCT__TOOL_MENTORS);
		}
		return toolMentors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EstimationConsiderations> getEstimationConsiderations() {
		if (estimationConsiderations == null) {
			estimationConsiderations = new EObjectResolvingEList<EstimationConsiderations>(EstimationConsiderations.class, this, UmaPackage.WORK_PRODUCT__ESTIMATION_CONSIDERATIONS);
		}
		return estimationConsiderations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.WORK_PRODUCT__FULFILLS:
				return getFulfills();
			case UmaPackage.WORK_PRODUCT__REPORTS:
				return getReports();
			case UmaPackage.WORK_PRODUCT__TEMPLATES:
				return getTemplates();
			case UmaPackage.WORK_PRODUCT__TOOL_MENTORS:
				return getToolMentors();
			case UmaPackage.WORK_PRODUCT__ESTIMATION_CONSIDERATIONS:
				return getEstimationConsiderations();
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
			case UmaPackage.WORK_PRODUCT__FULFILLS:
				getFulfills().clear();
				getFulfills().addAll((Collection<? extends FulfillableElement>)newValue);
				return;
			case UmaPackage.WORK_PRODUCT__REPORTS:
				getReports().clear();
				getReports().addAll((Collection<? extends Report>)newValue);
				return;
			case UmaPackage.WORK_PRODUCT__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends Template>)newValue);
				return;
			case UmaPackage.WORK_PRODUCT__TOOL_MENTORS:
				getToolMentors().clear();
				getToolMentors().addAll((Collection<? extends ToolMentor>)newValue);
				return;
			case UmaPackage.WORK_PRODUCT__ESTIMATION_CONSIDERATIONS:
				getEstimationConsiderations().clear();
				getEstimationConsiderations().addAll((Collection<? extends EstimationConsiderations>)newValue);
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
			case UmaPackage.WORK_PRODUCT__FULFILLS:
				getFulfills().clear();
				return;
			case UmaPackage.WORK_PRODUCT__REPORTS:
				getReports().clear();
				return;
			case UmaPackage.WORK_PRODUCT__TEMPLATES:
				getTemplates().clear();
				return;
			case UmaPackage.WORK_PRODUCT__TOOL_MENTORS:
				getToolMentors().clear();
				return;
			case UmaPackage.WORK_PRODUCT__ESTIMATION_CONSIDERATIONS:
				getEstimationConsiderations().clear();
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
			case UmaPackage.WORK_PRODUCT__FULFILLS:
				return fulfills != null && !fulfills.isEmpty();
			case UmaPackage.WORK_PRODUCT__REPORTS:
				return reports != null && !reports.isEmpty();
			case UmaPackage.WORK_PRODUCT__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case UmaPackage.WORK_PRODUCT__TOOL_MENTORS:
				return toolMentors != null && !toolMentors.isEmpty();
			case UmaPackage.WORK_PRODUCT__ESTIMATION_CONSIDERATIONS:
				return estimationConsiderations != null && !estimationConsiderations.isEmpty();
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
		if (baseClass == FulfillableElement.class) {
			switch (derivedFeatureID) {
				case UmaPackage.WORK_PRODUCT__FULFILLS: return UmaPackage.FULFILLABLE_ELEMENT__FULFILLS;
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
		if (baseClass == FulfillableElement.class) {
			switch (baseFeatureID) {
				case UmaPackage.FULFILLABLE_ELEMENT__FULFILLS: return UmaPackage.WORK_PRODUCT__FULFILLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WorkProductImpl
