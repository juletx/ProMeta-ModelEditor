/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Work Product is an abstract class which provides a generalization for the content element types Artifact, Outcome, and Deliverable.  The meta-model class Work Product actually represents work product types, i.e. an instance of Work Product is a description of a specific type of work product and not an individual work product instance.  However, for simplicity reasons and because of low risk of misinterpretation we did not append the word 'type' to every meta-class.
 * A work product is an abstraction for descriptions of content elements that are used to define anything used, produced, or modified by a task.
 * 
 * This is the Guidance Types package's extension of Work Product (defined in Content Elements) providing additonal associations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.WorkProduct#getReports <em>Reports</em>}</li>
 *   <li>{@link uma.WorkProduct#getTemplates <em>Templates</em>}</li>
 *   <li>{@link uma.WorkProduct#getToolMentors <em>Tool Mentors</em>}</li>
 *   <li>{@link uma.WorkProduct#getEstimationConsiderations <em>Estimation Considerations</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getWorkProduct()
 * @model
 * @generated
 */
public interface WorkProduct extends ContentElement, FulfillableElement {
	/**
	 * Returns the value of the '<em><b>Reports</b></em>' reference list.
	 * The list contents are of type {@link uma.Report}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reports</em>' reference list.
	 * @see uma.UmaPackage#getWorkProduct_Reports()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Report> getReports();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' reference list.
	 * The list contents are of type {@link uma.Template}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' reference list.
	 * @see uma.UmaPackage#getWorkProduct_Templates()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Template> getTemplates();

	/**
	 * Returns the value of the '<em><b>Tool Mentors</b></em>' reference list.
	 * The list contents are of type {@link uma.ToolMentor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Mentors</em>' reference list.
	 * @see uma.UmaPackage#getWorkProduct_ToolMentors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ToolMentor> getToolMentors();

	/**
	 * Returns the value of the '<em><b>Estimation Considerations</b></em>' reference list.
	 * The list contents are of type {@link uma.EstimationConsiderations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimation Considerations</em>' reference list.
	 * @see uma.UmaPackage#getWorkProduct_EstimationConsiderations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EstimationConsiderations> getEstimationConsiderations();

} // WorkProduct
