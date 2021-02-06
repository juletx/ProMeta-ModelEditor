/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breakdown Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Breakdown Element is an abstract generalization for any type of Method Element that is part of a breakdown structure.  It defines a set of properties available to all of its specializations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.BreakdownElement#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link uma.BreakdownElement#getIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link uma.BreakdownElement#getHasMultipleOccurrences <em>Has Multiple Occurrences</em>}</li>
 *   <li>{@link uma.BreakdownElement#getIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link uma.BreakdownElement#getPresentedAfter <em>Presented After</em>}</li>
 *   <li>{@link uma.BreakdownElement#getPresentedBefore <em>Presented Before</em>}</li>
 *   <li>{@link uma.BreakdownElement#getPlanningData <em>Planning Data</em>}</li>
 *   <li>{@link uma.BreakdownElement#getSuperActivities <em>Super Activities</em>}</li>
 *   <li>{@link uma.BreakdownElement#getChecklists <em>Checklists</em>}</li>
 *   <li>{@link uma.BreakdownElement#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link uma.BreakdownElement#getExamples <em>Examples</em>}</li>
 *   <li>{@link uma.BreakdownElement#getGuidelines <em>Guidelines</em>}</li>
 *   <li>{@link uma.BreakdownElement#getReusableAssets <em>Reusable Assets</em>}</li>
 *   <li>{@link uma.BreakdownElement#getSupportingMaterials <em>Supporting Materials</em>}</li>
 *   <li>{@link uma.BreakdownElement#getTemplates <em>Templates</em>}</li>
 *   <li>{@link uma.BreakdownElement#getReports <em>Reports</em>}</li>
 *   <li>{@link uma.BreakdownElement#getEstimationconsiderations <em>Estimationconsiderations</em>}</li>
 *   <li>{@link uma.BreakdownElement#getToolmentor <em>Toolmentor</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getBreakdownElement()
 * @model abstract="true"
 * @generated
 */
public interface BreakdownElement extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix represents an additional label that will be presented as a prefix to any Breakdown Element to indicate a user-defined sub-type for the element.  For example, if the process engineer would like to distinguish his Activities by 'Module' (as done in the IBM Rational Summit Ascendant Method), he can define a different prefix for every model to be used in addition to naming Activities, e.g. "SRA.Establish Requirements" with SRA indicating that this Activity belongs to the "Software Requirements Analysis" module.  Another common application for prefix is to qualify roles in Role Descriptors.  For example, "Customer.Architect" would define a "Customer" prefix for the Role Descriptor "Architect" expressing that this is an architect on the customer side and not the development team side.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see uma.UmaPackage#getBreakdownElement_Prefix()
	 * @model default="" dataType="uma.String" ordered="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link uma.BreakdownElement#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Is Planned</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A key application for Development Processes expressed with Breakdown structures is to generate a project plan from it.  A process as defined in UMA (cf. with Sections XX and 5.2) is a multi-dimensional structure defining what work is being performed at what time by which roles using which input and producing what outputs.  A project plan as it is represented in project planning tools such as IBM Rational Portfolio Manager or Microsoft Project normally does not need all this information and is normally limited to just representing a subset.  For example, a typical MS Project plan only represents the work breakdown consisting of Tasks and Activities (sometimes referred to as summary tasks).  It does not show the input and output Work Products for a Task, but it can show which roles shall be staffed for performing the Task.  However, such role allocation need to be replaced with concrete resources when instantiating the plan for a concrete project.  Sometimes project plans can then again be organized differently by organizing work by deliverables in which Work Products are mapped to the plan's summary tasks and Task that have these work products as output mapped below such as summary task.  Therefore, a process can make recommendations about which elements to include and which to exclude when generating a plan.  When the isPlanned attribute is set to False for an instance of a Breakdown Element, then this element shall not be not included when a concrete project plan is being generated from the breakdown structure that contains this element.
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Planned</em>' attribute.
	 * @see #setIsPlanned(Boolean)
	 * @see uma.UmaPackage#getBreakdownElement_IsPlanned()
	 * @model default="true" dataType="uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsPlanned();

	/**
	 * Sets the value of the '{@link uma.BreakdownElement#getIsPlanned <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Planned</em>' attribute.
	 * @see #getIsPlanned()
	 * @generated
	 */
	void setIsPlanned(Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Just as the isPlanned attribute the hasMultipleOccurrences attribute has an impact on generating plans from a Process.  When this attribute is set to True for a Breakdown Element then it will typically occur multiple times within the same Activity.  For example, a Task such as "Detail Use Case" would be performed for every use case identified for a particular Iteration or Activity.  Generating a plan would list one Task instance per use case.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Multiple Occurrences</em>' attribute.
	 * @see #setHasMultipleOccurrences(Boolean)
	 * @see uma.UmaPackage#getBreakdownElement_HasMultipleOccurrences()
	 * @model default="false" dataType="uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getHasMultipleOccurrences();

	/**
	 * Sets the value of the '{@link uma.BreakdownElement#getHasMultipleOccurrences <em>Has Multiple Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Multiple Occurrences</em>' attribute.
	 * @see #getHasMultipleOccurrences()
	 * @generated
	 */
	void setHasMultipleOccurrences(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The isOptional attribute indicates that the Breakdown Element describes work, a work result, or even work resources, which inclusion is not mandatory when performing a project that is planned based on a process containing this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(Boolean)
	 * @see uma.UmaPackage#getBreakdownElement_IsOptional()
	 * @model default="false" dataType="uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsOptional();

	/**
	 * Sets the value of the '{@link uma.BreakdownElement#getIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #getIsOptional()
	 * @generated
	 */
	void setIsOptional(Boolean value);

	/**
	 * Returns the value of the '<em><b>Presented After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presented After</em>' reference.
	 * @see #setPresentedAfter(BreakdownElement)
	 * @see uma.UmaPackage#getBreakdownElement_PresentedAfter()
	 * @model ordered="false"
	 * @generated
	 */
	BreakdownElement getPresentedAfter();

	/**
	 * Sets the value of the '{@link uma.BreakdownElement#getPresentedAfter <em>Presented After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presented After</em>' reference.
	 * @see #getPresentedAfter()
	 * @generated
	 */
	void setPresentedAfter(BreakdownElement value);

	/**
	 * Returns the value of the '<em><b>Presented Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presented Before</em>' reference.
	 * @see #setPresentedBefore(BreakdownElement)
	 * @see uma.UmaPackage#getBreakdownElement_PresentedBefore()
	 * @model ordered="false"
	 * @generated
	 */
	BreakdownElement getPresentedBefore();

	/**
	 * Sets the value of the '{@link uma.BreakdownElement#getPresentedBefore <em>Presented Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presented Before</em>' reference.
	 * @see #getPresentedBefore()
	 * @generated
	 */
	void setPresentedBefore(BreakdownElement value);

	/**
	 * Returns the value of the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Data</em>' containment reference.
	 * @see #setPlanningData(PlanningData)
	 * @see uma.UmaPackage#getBreakdownElement_PlanningData()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PlanningData getPlanningData();

	/**
	 * Sets the value of the '{@link uma.BreakdownElement#getPlanningData <em>Planning Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Data</em>' containment reference.
	 * @see #getPlanningData()
	 * @generated
	 */
	void setPlanningData(PlanningData value);

	/**
	 * Returns the value of the '<em><b>Super Activities</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uma.Activity#getBreakdownElements <em>Breakdown Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Activities</em>' reference.
	 * @see #setSuperActivities(Activity)
	 * @see uma.UmaPackage#getBreakdownElement_SuperActivities()
	 * @see uma.Activity#getBreakdownElements
	 * @model opposite="breakdownElements" required="true" ordered="false"
	 * @generated
	 */
	Activity getSuperActivities();

	/**
	 * Sets the value of the '{@link uma.BreakdownElement#getSuperActivities <em>Super Activities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Activities</em>' reference.
	 * @see #getSuperActivities()
	 * @generated
	 */
	void setSuperActivities(Activity value);

	/**
	 * Returns the value of the '<em><b>Checklists</b></em>' reference list.
	 * The list contents are of type {@link uma.Checklist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checklists</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_Checklists()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Checklist> getChecklists();

	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' reference list.
	 * The list contents are of type {@link uma.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_Concepts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Concept> getConcepts();

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' reference list.
	 * The list contents are of type {@link uma.Example}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_Examples()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Example> getExamples();

	/**
	 * Returns the value of the '<em><b>Guidelines</b></em>' reference list.
	 * The list contents are of type {@link uma.Guideline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guidelines</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_Guidelines()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Guideline> getGuidelines();

	/**
	 * Returns the value of the '<em><b>Reusable Assets</b></em>' reference list.
	 * The list contents are of type {@link uma.ReusableAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reusable Assets</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_ReusableAssets()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ReusableAsset> getReusableAssets();

	/**
	 * Returns the value of the '<em><b>Supporting Materials</b></em>' reference list.
	 * The list contents are of type {@link uma.SupportingMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Materials</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_SupportingMaterials()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SupportingMaterial> getSupportingMaterials();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' reference list.
	 * The list contents are of type {@link uma.Template}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_Templates()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Template> getTemplates();

	/**
	 * Returns the value of the '<em><b>Reports</b></em>' reference list.
	 * The list contents are of type {@link uma.Report}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reports</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_Reports()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Report> getReports();

	/**
	 * Returns the value of the '<em><b>Estimationconsiderations</b></em>' reference list.
	 * The list contents are of type {@link uma.EstimationConsiderations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimationconsiderations</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_Estimationconsiderations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EstimationConsiderations> getEstimationconsiderations();

	/**
	 * Returns the value of the '<em><b>Toolmentor</b></em>' reference list.
	 * The list contents are of type {@link uma.ToolMentor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolmentor</em>' reference list.
	 * @see uma.UmaPackage#getBreakdownElement_Toolmentor()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ToolMentor> getToolmentor();

} // BreakdownElement
