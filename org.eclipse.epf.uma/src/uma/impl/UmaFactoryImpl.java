/**
 */
package uma.impl;

import java.net.URI;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uma.Activity;
import uma.ActivityDescription;
import uma.ApplicableMetaClassInfo;
import uma.Artifact;
import uma.ArtifactDescription;
import uma.BreakdownElementDescription;
import uma.CapabilityPattern;
import uma.Checklist;
import uma.CompositeRole;
import uma.Concept;
import uma.Constraint;
import uma.ContentDescription;
import uma.ContentPackage;
import uma.CoreSemanticModelBridge;
import uma.CustomCategory;
import uma.Deliverable;
import uma.DeliverableDescription;
import uma.DeliveryProcess;
import uma.DeliveryProcessDescription;
import uma.DescriptorDescription;
import uma.Diagram;
import uma.DiagramLink;
import uma.Dimension;
import uma.Discipline;
import uma.DisciplineGrouping;
import uma.Domain;
import uma.Ellipse;
import uma.EstimationConsiderations;
import uma.Example;
import uma.FulfillableElement;
import uma.GraphConnector;
import uma.GraphEdge;
import uma.GraphNode;
import uma.GuidanceDescription;
import uma.Guideline;
import uma.Image;
import uma.Iteration;
import uma.Kind;
import uma.MethodConfiguration;
import uma.MethodElementProperty;
import uma.MethodLibrary;
import uma.MethodPlugin;
import uma.Milestone;
import uma.Outcome;
import uma.Phase;
import uma.PlanningData;
import uma.Point;
import uma.Polyline;
import uma.Practice;
import uma.PracticeDescription;
import uma.ProcessComponent;
import uma.ProcessComponentDescriptor;
import uma.ProcessComponentInterface;
import uma.ProcessDescription;
import uma.ProcessFamily;
import uma.ProcessPackage;
import uma.ProcessPlanningTemplate;
import uma.Property;
import uma.Reference;
import uma.Report;
import uma.ReusableAsset;
import uma.Roadmap;
import uma.Role;
import uma.RoleDescription;
import uma.RoleDescriptor;
import uma.RoleSet;
import uma.RoleSetGrouping;
import uma.Section;
import uma.SimpleSemanticModelElement;
import uma.Step;
import uma.SupportingMaterial;
import uma.Task;
import uma.TaskDescription;
import uma.TaskDescriptor;
import uma.TeamProfile;
import uma.Template;
import uma.TermDefinition;
import uma.TextElement;
import uma.Tool;
import uma.ToolMentor;
import uma.UMASemanticModelBridge;
import uma.UmaFactory;
import uma.UmaPackage;
import uma.VariabilityType;
import uma.Whitepaper;
import uma.WorkOrder;
import uma.WorkOrderType;
import uma.WorkProduct;
import uma.WorkProductDescription;
import uma.WorkProductDescriptor;
import uma.WorkProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmaFactoryImpl extends EFactoryImpl implements UmaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmaFactory init() {
		try {
			UmaFactory theUmaFactory = (UmaFactory)EPackage.Registry.INSTANCE.getEFactory(UmaPackage.eNS_URI);
			if (theUmaFactory != null) {
				return theUmaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UmaPackage.PACKAGE: return createPackage();
			case UmaPackage.CONSTRAINT: return createConstraint();
			case UmaPackage.METHOD_ELEMENT_PROPERTY: return createMethodElementProperty();
			case UmaPackage.KIND: return createKind();
			case UmaPackage.CONTENT_DESCRIPTION: return createContentDescription();
			case UmaPackage.SUPPORTING_MATERIAL: return createSupportingMaterial();
			case UmaPackage.SECTION: return createSection();
			case UmaPackage.CONCEPT: return createConcept();
			case UmaPackage.CHECKLIST: return createChecklist();
			case UmaPackage.GUIDELINE: return createGuideline();
			case UmaPackage.EXAMPLE: return createExample();
			case UmaPackage.REUSABLE_ASSET: return createReusableAsset();
			case UmaPackage.TERM_DEFINITION: return createTermDefinition();
			case UmaPackage.APPLICABLE_META_CLASS_INFO: return createApplicableMetaClassInfo();
			case UmaPackage.ARTIFACT: return createArtifact();
			case UmaPackage.WORK_PRODUCT: return createWorkProduct();
			case UmaPackage.FULFILLABLE_ELEMENT: return createFulfillableElement();
			case UmaPackage.REPORT: return createReport();
			case UmaPackage.TEMPLATE: return createTemplate();
			case UmaPackage.TOOL_MENTOR: return createToolMentor();
			case UmaPackage.ESTIMATION_CONSIDERATIONS: return createEstimationConsiderations();
			case UmaPackage.DELIVERABLE: return createDeliverable();
			case UmaPackage.OUTCOME: return createOutcome();
			case UmaPackage.STEP: return createStep();
			case UmaPackage.WHITEPAPER: return createWhitepaper();
			case UmaPackage.TASK: return createTask();
			case UmaPackage.ROLE: return createRole();
			case UmaPackage.ARTIFACT_DESCRIPTION: return createArtifactDescription();
			case UmaPackage.WORK_PRODUCT_DESCRIPTION: return createWorkProductDescription();
			case UmaPackage.DELIVERABLE_DESCRIPTION: return createDeliverableDescription();
			case UmaPackage.ROLE_DESCRIPTION: return createRoleDescription();
			case UmaPackage.TASK_DESCRIPTION: return createTaskDescription();
			case UmaPackage.GUIDANCE_DESCRIPTION: return createGuidanceDescription();
			case UmaPackage.PRACTICE_DESCRIPTION: return createPracticeDescription();
			case UmaPackage.ROLE_SET: return createRoleSet();
			case UmaPackage.DOMAIN: return createDomain();
			case UmaPackage.WORK_PRODUCT_TYPE: return createWorkProductType();
			case UmaPackage.DISCIPLINE_GROUPING: return createDisciplineGrouping();
			case UmaPackage.DISCIPLINE: return createDiscipline();
			case UmaPackage.ACTIVITY: return createActivity();
			case UmaPackage.PLANNING_DATA: return createPlanningData();
			case UmaPackage.WORK_ORDER: return createWorkOrder();
			case UmaPackage.ROADMAP: return createRoadmap();
			case UmaPackage.TOOL: return createTool();
			case UmaPackage.ROLE_SET_GROUPING: return createRoleSetGrouping();
			case UmaPackage.CUSTOM_CATEGORY: return createCustomCategory();
			case UmaPackage.CONTENT_PACKAGE: return createContentPackage();
			case UmaPackage.MILESTONE: return createMilestone();
			case UmaPackage.WORK_PRODUCT_DESCRIPTOR: return createWorkProductDescriptor();
			case UmaPackage.ITERATION: return createIteration();
			case UmaPackage.PHASE: return createPhase();
			case UmaPackage.TEAM_PROFILE: return createTeamProfile();
			case UmaPackage.ROLE_DESCRIPTOR: return createRoleDescriptor();
			case UmaPackage.TASK_DESCRIPTOR: return createTaskDescriptor();
			case UmaPackage.COMPOSITE_ROLE: return createCompositeRole();
			case UmaPackage.DELIVERY_PROCESS: return createDeliveryProcess();
			case UmaPackage.CAPABILITY_PATTERN: return createCapabilityPattern();
			case UmaPackage.METHOD_CONFIGURATION: return createMethodConfiguration();
			case UmaPackage.METHOD_PLUGIN: return createMethodPlugin();
			case UmaPackage.PROCESS_PLANNING_TEMPLATE: return createProcessPlanningTemplate();
			case UmaPackage.PRACTICE: return createPractice();
			case UmaPackage.BREAKDOWN_ELEMENT_DESCRIPTION: return createBreakdownElementDescription();
			case UmaPackage.ACTIVITY_DESCRIPTION: return createActivityDescription();
			case UmaPackage.DELIVERY_PROCESS_DESCRIPTION: return createDeliveryProcessDescription();
			case UmaPackage.PROCESS_DESCRIPTION: return createProcessDescription();
			case UmaPackage.DESCRIPTOR_DESCRIPTION: return createDescriptorDescription();
			case UmaPackage.PROCESS_COMPONENT_DESCRIPTOR: return createProcessComponentDescriptor();
			case UmaPackage.PROCESS_COMPONENT: return createProcessComponent();
			case UmaPackage.PROCESS_PACKAGE: return createProcessPackage();
			case UmaPackage.DIAGRAM: return createDiagram();
			case UmaPackage.GRAPH_NODE: return createGraphNode();
			case UmaPackage.REFERENCE: return createReference();
			case UmaPackage.PROPERTY: return createProperty();
			case UmaPackage.POINT: return createPoint();
			case UmaPackage.DIAGRAM_LINK: return createDiagramLink();
			case UmaPackage.GRAPH_CONNECTOR: return createGraphConnector();
			case UmaPackage.GRAPH_EDGE: return createGraphEdge();
			case UmaPackage.DIMENSION: return createDimension();
			case UmaPackage.PROCESS_COMPONENT_INTERFACE: return createProcessComponentInterface();
			case UmaPackage.SIMPLE_SEMANTIC_MODEL_ELEMENT: return createSimpleSemanticModelElement();
			case UmaPackage.UMA_SEMANTIC_MODEL_BRIDGE: return createUMASemanticModelBridge();
			case UmaPackage.CORE_SEMANTIC_MODEL_BRIDGE: return createCoreSemanticModelBridge();
			case UmaPackage.TEXT_ELEMENT: return createTextElement();
			case UmaPackage.IMAGE: return createImage();
			case UmaPackage.POLYLINE: return createPolyline();
			case UmaPackage.ELLIPSE: return createEllipse();
			case UmaPackage.PROCESS_FAMILY: return createProcessFamily();
			case UmaPackage.METHOD_LIBRARY: return createMethodLibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UmaPackage.VARIABILITY_TYPE:
				return createVariabilityTypeFromString(eDataType, initialValue);
			case UmaPackage.WORK_ORDER_TYPE:
				return createWorkOrderTypeFromString(eDataType, initialValue);
			case UmaPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case UmaPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case UmaPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case UmaPackage.URI:
				return createUriFromString(eDataType, initialValue);
			case UmaPackage.SET:
				return createSetFromString(eDataType, initialValue);
			case UmaPackage.SEQUENCE:
				return createSequenceFromString(eDataType, initialValue);
			case UmaPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case UmaPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UmaPackage.VARIABILITY_TYPE:
				return convertVariabilityTypeToString(eDataType, instanceValue);
			case UmaPackage.WORK_ORDER_TYPE:
				return convertWorkOrderTypeToString(eDataType, instanceValue);
			case UmaPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case UmaPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case UmaPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case UmaPackage.URI:
				return convertUriToString(eDataType, instanceValue);
			case UmaPackage.SET:
				return convertSetToString(eDataType, instanceValue);
			case UmaPackage.SEQUENCE:
				return convertSequenceToString(eDataType, instanceValue);
			case UmaPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case UmaPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uma.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodElementProperty createMethodElementProperty() {
		MethodElementPropertyImpl methodElementProperty = new MethodElementPropertyImpl();
		return methodElementProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind createKind() {
		KindImpl kind = new KindImpl();
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDescription createContentDescription() {
		ContentDescriptionImpl contentDescription = new ContentDescriptionImpl();
		return contentDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportingMaterial createSupportingMaterial() {
		SupportingMaterialImpl supportingMaterial = new SupportingMaterialImpl();
		return supportingMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checklist createChecklist() {
		ChecklistImpl checklist = new ChecklistImpl();
		return checklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guideline createGuideline() {
		GuidelineImpl guideline = new GuidelineImpl();
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Example createExample() {
		ExampleImpl example = new ExampleImpl();
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReusableAsset createReusableAsset() {
		ReusableAssetImpl reusableAsset = new ReusableAssetImpl();
		return reusableAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermDefinition createTermDefinition() {
		TermDefinitionImpl termDefinition = new TermDefinitionImpl();
		return termDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableMetaClassInfo createApplicableMetaClassInfo() {
		ApplicableMetaClassInfoImpl applicableMetaClassInfo = new ApplicableMetaClassInfoImpl();
		return applicableMetaClassInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct createWorkProduct() {
		WorkProductImpl workProduct = new WorkProductImpl();
		return workProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillableElement createFulfillableElement() {
		FulfillableElementImpl fulfillableElement = new FulfillableElementImpl();
		return fulfillableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report createReport() {
		ReportImpl report = new ReportImpl();
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolMentor createToolMentor() {
		ToolMentorImpl toolMentor = new ToolMentorImpl();
		return toolMentor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimationConsiderations createEstimationConsiderations() {
		EstimationConsiderationsImpl estimationConsiderations = new EstimationConsiderationsImpl();
		return estimationConsiderations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deliverable createDeliverable() {
		DeliverableImpl deliverable = new DeliverableImpl();
		return deliverable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outcome createOutcome() {
		OutcomeImpl outcome = new OutcomeImpl();
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Whitepaper createWhitepaper() {
		WhitepaperImpl whitepaper = new WhitepaperImpl();
		return whitepaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactDescription createArtifactDescription() {
		ArtifactDescriptionImpl artifactDescription = new ArtifactDescriptionImpl();
		return artifactDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDescription createWorkProductDescription() {
		WorkProductDescriptionImpl workProductDescription = new WorkProductDescriptionImpl();
		return workProductDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableDescription createDeliverableDescription() {
		DeliverableDescriptionImpl deliverableDescription = new DeliverableDescriptionImpl();
		return deliverableDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDescription createRoleDescription() {
		RoleDescriptionImpl roleDescription = new RoleDescriptionImpl();
		return roleDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescription createTaskDescription() {
		TaskDescriptionImpl taskDescription = new TaskDescriptionImpl();
		return taskDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceDescription createGuidanceDescription() {
		GuidanceDescriptionImpl guidanceDescription = new GuidanceDescriptionImpl();
		return guidanceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PracticeDescription createPracticeDescription() {
		PracticeDescriptionImpl practiceDescription = new PracticeDescriptionImpl();
		return practiceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSet createRoleSet() {
		RoleSetImpl roleSet = new RoleSetImpl();
		return roleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductType createWorkProductType() {
		WorkProductTypeImpl workProductType = new WorkProductTypeImpl();
		return workProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplineGrouping createDisciplineGrouping() {
		DisciplineGroupingImpl disciplineGrouping = new DisciplineGroupingImpl();
		return disciplineGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discipline createDiscipline() {
		DisciplineImpl discipline = new DisciplineImpl();
		return discipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningData createPlanningData() {
		PlanningDataImpl planningData = new PlanningDataImpl();
		return planningData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkOrder createWorkOrder() {
		WorkOrderImpl workOrder = new WorkOrderImpl();
		return workOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roadmap createRoadmap() {
		RoadmapImpl roadmap = new RoadmapImpl();
		return roadmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSetGrouping createRoleSetGrouping() {
		RoleSetGroupingImpl roleSetGrouping = new RoleSetGroupingImpl();
		return roleSetGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomCategory createCustomCategory() {
		CustomCategoryImpl customCategory = new CustomCategoryImpl();
		return customCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPackage createContentPackage() {
		ContentPackageImpl contentPackage = new ContentPackageImpl();
		return contentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone createMilestone() {
		MilestoneImpl milestone = new MilestoneImpl();
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDescriptor createWorkProductDescriptor() {
		WorkProductDescriptorImpl workProductDescriptor = new WorkProductDescriptorImpl();
		return workProductDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iteration createIteration() {
		IterationImpl iteration = new IterationImpl();
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase createPhase() {
		PhaseImpl phase = new PhaseImpl();
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamProfile createTeamProfile() {
		TeamProfileImpl teamProfile = new TeamProfileImpl();
		return teamProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDescriptor createRoleDescriptor() {
		RoleDescriptorImpl roleDescriptor = new RoleDescriptorImpl();
		return roleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescriptor createTaskDescriptor() {
		TaskDescriptorImpl taskDescriptor = new TaskDescriptorImpl();
		return taskDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeRole createCompositeRole() {
		CompositeRoleImpl compositeRole = new CompositeRoleImpl();
		return compositeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryProcess createDeliveryProcess() {
		DeliveryProcessImpl deliveryProcess = new DeliveryProcessImpl();
		return deliveryProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPattern createCapabilityPattern() {
		CapabilityPatternImpl capabilityPattern = new CapabilityPatternImpl();
		return capabilityPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodConfiguration createMethodConfiguration() {
		MethodConfigurationImpl methodConfiguration = new MethodConfigurationImpl();
		return methodConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPlugin createMethodPlugin() {
		MethodPluginImpl methodPlugin = new MethodPluginImpl();
		return methodPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPlanningTemplate createProcessPlanningTemplate() {
		ProcessPlanningTemplateImpl processPlanningTemplate = new ProcessPlanningTemplateImpl();
		return processPlanningTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practice createPractice() {
		PracticeImpl practice = new PracticeImpl();
		return practice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakdownElementDescription createBreakdownElementDescription() {
		BreakdownElementDescriptionImpl breakdownElementDescription = new BreakdownElementDescriptionImpl();
		return breakdownElementDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDescription createActivityDescription() {
		ActivityDescriptionImpl activityDescription = new ActivityDescriptionImpl();
		return activityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryProcessDescription createDeliveryProcessDescription() {
		DeliveryProcessDescriptionImpl deliveryProcessDescription = new DeliveryProcessDescriptionImpl();
		return deliveryProcessDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDescription createProcessDescription() {
		ProcessDescriptionImpl processDescription = new ProcessDescriptionImpl();
		return processDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorDescription createDescriptorDescription() {
		DescriptorDescriptionImpl descriptorDescription = new DescriptorDescriptionImpl();
		return descriptorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponentDescriptor createProcessComponentDescriptor() {
		ProcessComponentDescriptorImpl processComponentDescriptor = new ProcessComponentDescriptorImpl();
		return processComponentDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponent createProcessComponent() {
		ProcessComponentImpl processComponent = new ProcessComponentImpl();
		return processComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackage createProcessPackage() {
		ProcessPackageImpl processPackage = new ProcessPackageImpl();
		return processPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphNode createGraphNode() {
		GraphNodeImpl graphNode = new GraphNodeImpl();
		return graphNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramLink createDiagramLink() {
		DiagramLinkImpl diagramLink = new DiagramLinkImpl();
		return diagramLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphConnector createGraphConnector() {
		GraphConnectorImpl graphConnector = new GraphConnectorImpl();
		return graphConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdge createGraphEdge() {
		GraphEdgeImpl graphEdge = new GraphEdgeImpl();
		return graphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponentInterface createProcessComponentInterface() {
		ProcessComponentInterfaceImpl processComponentInterface = new ProcessComponentInterfaceImpl();
		return processComponentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSemanticModelElement createSimpleSemanticModelElement() {
		SimpleSemanticModelElementImpl simpleSemanticModelElement = new SimpleSemanticModelElementImpl();
		return simpleSemanticModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMASemanticModelBridge createUMASemanticModelBridge() {
		UMASemanticModelBridgeImpl umaSemanticModelBridge = new UMASemanticModelBridgeImpl();
		return umaSemanticModelBridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSemanticModelBridge createCoreSemanticModelBridge() {
		CoreSemanticModelBridgeImpl coreSemanticModelBridge = new CoreSemanticModelBridgeImpl();
		return coreSemanticModelBridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextElement createTextElement() {
		TextElementImpl textElement = new TextElementImpl();
		return textElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polyline createPolyline() {
		PolylineImpl polyline = new PolylineImpl();
		return polyline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ellipse createEllipse() {
		EllipseImpl ellipse = new EllipseImpl();
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFamily createProcessFamily() {
		ProcessFamilyImpl processFamily = new ProcessFamilyImpl();
		return processFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodLibrary createMethodLibrary() {
		MethodLibraryImpl methodLibrary = new MethodLibraryImpl();
		return methodLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType createVariabilityTypeFromString(EDataType eDataType, String initialValue) {
		VariabilityType result = VariabilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkOrderType createWorkOrderTypeFromString(EDataType eDataType, String initialValue) {
		WorkOrderType result = WorkOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createUriFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSetFromString(EDataType eDataType, String initialValue) {
		return (Set)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createSequenceFromString(EDataType eDataType, String initialValue) {
		return (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaPackage getUmaPackage() {
		return (UmaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UmaPackage getPackage() {
		return UmaPackage.eINSTANCE;
	}

} //UmaFactoryImpl
