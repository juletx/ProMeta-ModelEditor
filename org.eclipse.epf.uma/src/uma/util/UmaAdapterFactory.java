/**
 */
package uma.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uma.Activity;
import uma.ActivityDescription;
import uma.ApplicableMetaClassInfo;
import uma.Artifact;
import uma.ArtifactDescription;
import uma.BreakdownElement;
import uma.BreakdownElementDescription;
import uma.CapabilityPattern;
import uma.Checklist;
import uma.Classifier;
import uma.CompositeRole;
import uma.Concept;
import uma.Constraint;
import uma.ContentCategory;
import uma.ContentDescription;
import uma.ContentElement;
import uma.ContentPackage;
import uma.CoreSemanticModelBridge;
import uma.CustomCategory;
import uma.Deliverable;
import uma.DeliverableDescription;
import uma.DeliveryProcess;
import uma.DeliveryProcessDescription;
import uma.DescribableElement;
import uma.Descriptor;
import uma.DescriptorDescription;
import uma.Diagram;
import uma.DiagramElement;
import uma.DiagramLink;
import uma.Dimension;
import uma.Discipline;
import uma.DisciplineGrouping;
import uma.Domain;
import uma.Element;
import uma.Ellipse;
import uma.EstimationConsiderations;
import uma.Example;
import uma.FulfillableElement;
import uma.GraphConnector;
import uma.GraphEdge;
import uma.GraphElement;
import uma.GraphNode;
import uma.GraphicPrimitive;
import uma.Guidance;
import uma.GuidanceDescription;
import uma.Guideline;
import uma.Image;
import uma.Iteration;
import uma.Kind;
import uma.LeafElement;
import uma.MethodConfiguration;
import uma.MethodElement;
import uma.MethodElementProperty;
import uma.MethodLibrary;
import uma.MethodPackage;
import uma.MethodPlugin;
import uma.MethodUnit;
import uma.Milestone;
import uma.NamedElement;
import uma.Namespace;
import uma.Outcome;
import uma.PackageableElement;
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
import uma.ProcessElement;
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
import uma.SemanticModelBridge;
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
import uma.Type;
import uma.UMASemanticModelBridge;
import uma.UmaPackage;
import uma.VariabilityElement;
import uma.Whitepaper;
import uma.WorkBreakdownElement;
import uma.WorkDefinition;
import uma.WorkOrder;
import uma.WorkProduct;
import uma.WorkProductDescription;
import uma.WorkProductDescriptor;
import uma.WorkProductType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uma.UmaPackage
 * @generated
 */
public class UmaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UmaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmaSwitch<Adapter> modelSwitch =
		new UmaSwitch<Adapter>() {
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object) {
				return createPackageableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter casePackage(uma.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseMethodElement(MethodElement object) {
				return createMethodElementAdapter();
			}
			@Override
			public Adapter caseMethodElementProperty(MethodElementProperty object) {
				return createMethodElementPropertyAdapter();
			}
			@Override
			public Adapter caseKind(Kind object) {
				return createKindAdapter();
			}
			@Override
			public Adapter caseContentElement(ContentElement object) {
				return createContentElementAdapter();
			}
			@Override
			public Adapter caseDescribableElement(DescribableElement object) {
				return createDescribableElementAdapter();
			}
			@Override
			public Adapter caseContentDescription(ContentDescription object) {
				return createContentDescriptionAdapter();
			}
			@Override
			public Adapter caseMethodUnit(MethodUnit object) {
				return createMethodUnitAdapter();
			}
			@Override
			public Adapter caseSupportingMaterial(SupportingMaterial object) {
				return createSupportingMaterialAdapter();
			}
			@Override
			public Adapter caseGuidance(Guidance object) {
				return createGuidanceAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseVariabilityElement(VariabilityElement object) {
				return createVariabilityElementAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseChecklist(Checklist object) {
				return createChecklistAdapter();
			}
			@Override
			public Adapter caseGuideline(Guideline object) {
				return createGuidelineAdapter();
			}
			@Override
			public Adapter caseExample(Example object) {
				return createExampleAdapter();
			}
			@Override
			public Adapter caseReusableAsset(ReusableAsset object) {
				return createReusableAssetAdapter();
			}
			@Override
			public Adapter caseTermDefinition(TermDefinition object) {
				return createTermDefinitionAdapter();
			}
			@Override
			public Adapter caseApplicableMetaClassInfo(ApplicableMetaClassInfo object) {
				return createApplicableMetaClassInfoAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseWorkProduct(WorkProduct object) {
				return createWorkProductAdapter();
			}
			@Override
			public Adapter caseFulfillableElement(FulfillableElement object) {
				return createFulfillableElementAdapter();
			}
			@Override
			public Adapter caseReport(Report object) {
				return createReportAdapter();
			}
			@Override
			public Adapter caseTemplate(Template object) {
				return createTemplateAdapter();
			}
			@Override
			public Adapter caseToolMentor(ToolMentor object) {
				return createToolMentorAdapter();
			}
			@Override
			public Adapter caseEstimationConsiderations(EstimationConsiderations object) {
				return createEstimationConsiderationsAdapter();
			}
			@Override
			public Adapter caseDeliverable(Deliverable object) {
				return createDeliverableAdapter();
			}
			@Override
			public Adapter caseOutcome(Outcome object) {
				return createOutcomeAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseWorkDefinition(WorkDefinition object) {
				return createWorkDefinitionAdapter();
			}
			@Override
			public Adapter caseWhitepaper(Whitepaper object) {
				return createWhitepaperAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseArtifactDescription(ArtifactDescription object) {
				return createArtifactDescriptionAdapter();
			}
			@Override
			public Adapter caseWorkProductDescription(WorkProductDescription object) {
				return createWorkProductDescriptionAdapter();
			}
			@Override
			public Adapter caseDeliverableDescription(DeliverableDescription object) {
				return createDeliverableDescriptionAdapter();
			}
			@Override
			public Adapter caseRoleDescription(RoleDescription object) {
				return createRoleDescriptionAdapter();
			}
			@Override
			public Adapter caseTaskDescription(TaskDescription object) {
				return createTaskDescriptionAdapter();
			}
			@Override
			public Adapter caseGuidanceDescription(GuidanceDescription object) {
				return createGuidanceDescriptionAdapter();
			}
			@Override
			public Adapter casePracticeDescription(PracticeDescription object) {
				return createPracticeDescriptionAdapter();
			}
			@Override
			public Adapter caseRoleSet(RoleSet object) {
				return createRoleSetAdapter();
			}
			@Override
			public Adapter caseContentCategory(ContentCategory object) {
				return createContentCategoryAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseWorkProductType(WorkProductType object) {
				return createWorkProductTypeAdapter();
			}
			@Override
			public Adapter caseDisciplineGrouping(DisciplineGrouping object) {
				return createDisciplineGroupingAdapter();
			}
			@Override
			public Adapter caseDiscipline(Discipline object) {
				return createDisciplineAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseWorkBreakdownElement(WorkBreakdownElement object) {
				return createWorkBreakdownElementAdapter();
			}
			@Override
			public Adapter caseBreakdownElement(BreakdownElement object) {
				return createBreakdownElementAdapter();
			}
			@Override
			public Adapter caseProcessElement(ProcessElement object) {
				return createProcessElementAdapter();
			}
			@Override
			public Adapter casePlanningData(PlanningData object) {
				return createPlanningDataAdapter();
			}
			@Override
			public Adapter caseWorkOrder(WorkOrder object) {
				return createWorkOrderAdapter();
			}
			@Override
			public Adapter caseRoadmap(Roadmap object) {
				return createRoadmapAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseRoleSetGrouping(RoleSetGrouping object) {
				return createRoleSetGroupingAdapter();
			}
			@Override
			public Adapter caseCustomCategory(CustomCategory object) {
				return createCustomCategoryAdapter();
			}
			@Override
			public Adapter caseMethodPackage(MethodPackage object) {
				return createMethodPackageAdapter();
			}
			@Override
			public Adapter caseContentPackage(ContentPackage object) {
				return createContentPackageAdapter();
			}
			@Override
			public Adapter caseMilestone(Milestone object) {
				return createMilestoneAdapter();
			}
			@Override
			public Adapter caseWorkProductDescriptor(WorkProductDescriptor object) {
				return createWorkProductDescriptorAdapter();
			}
			@Override
			public Adapter caseDescriptor(Descriptor object) {
				return createDescriptorAdapter();
			}
			@Override
			public Adapter caseIteration(Iteration object) {
				return createIterationAdapter();
			}
			@Override
			public Adapter casePhase(Phase object) {
				return createPhaseAdapter();
			}
			@Override
			public Adapter caseTeamProfile(TeamProfile object) {
				return createTeamProfileAdapter();
			}
			@Override
			public Adapter caseRoleDescriptor(RoleDescriptor object) {
				return createRoleDescriptorAdapter();
			}
			@Override
			public Adapter caseTaskDescriptor(TaskDescriptor object) {
				return createTaskDescriptorAdapter();
			}
			@Override
			public Adapter caseCompositeRole(CompositeRole object) {
				return createCompositeRoleAdapter();
			}
			@Override
			public Adapter caseDeliveryProcess(DeliveryProcess object) {
				return createDeliveryProcessAdapter();
			}
			@Override
			public Adapter caseProcess(uma.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseCapabilityPattern(CapabilityPattern object) {
				return createCapabilityPatternAdapter();
			}
			@Override
			public Adapter caseMethodConfiguration(MethodConfiguration object) {
				return createMethodConfigurationAdapter();
			}
			@Override
			public Adapter caseMethodPlugin(MethodPlugin object) {
				return createMethodPluginAdapter();
			}
			@Override
			public Adapter caseProcessPlanningTemplate(ProcessPlanningTemplate object) {
				return createProcessPlanningTemplateAdapter();
			}
			@Override
			public Adapter casePractice(Practice object) {
				return createPracticeAdapter();
			}
			@Override
			public Adapter caseBreakdownElementDescription(BreakdownElementDescription object) {
				return createBreakdownElementDescriptionAdapter();
			}
			@Override
			public Adapter caseActivityDescription(ActivityDescription object) {
				return createActivityDescriptionAdapter();
			}
			@Override
			public Adapter caseDeliveryProcessDescription(DeliveryProcessDescription object) {
				return createDeliveryProcessDescriptionAdapter();
			}
			@Override
			public Adapter caseProcessDescription(ProcessDescription object) {
				return createProcessDescriptionAdapter();
			}
			@Override
			public Adapter caseDescriptorDescription(DescriptorDescription object) {
				return createDescriptorDescriptionAdapter();
			}
			@Override
			public Adapter caseProcessComponentDescriptor(ProcessComponentDescriptor object) {
				return createProcessComponentDescriptorAdapter();
			}
			@Override
			public Adapter caseProcessComponent(ProcessComponent object) {
				return createProcessComponentAdapter();
			}
			@Override
			public Adapter caseProcessPackage(ProcessPackage object) {
				return createProcessPackageAdapter();
			}
			@Override
			public Adapter caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			@Override
			public Adapter caseGraphNode(GraphNode object) {
				return createGraphNodeAdapter();
			}
			@Override
			public Adapter caseGraphElement(GraphElement object) {
				return createGraphElementAdapter();
			}
			@Override
			public Adapter caseDiagramElement(DiagramElement object) {
				return createDiagramElementAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter caseDiagramLink(DiagramLink object) {
				return createDiagramLinkAdapter();
			}
			@Override
			public Adapter caseGraphConnector(GraphConnector object) {
				return createGraphConnectorAdapter();
			}
			@Override
			public Adapter caseGraphEdge(GraphEdge object) {
				return createGraphEdgeAdapter();
			}
			@Override
			public Adapter caseSemanticModelBridge(SemanticModelBridge object) {
				return createSemanticModelBridgeAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseProcessComponentInterface(ProcessComponentInterface object) {
				return createProcessComponentInterfaceAdapter();
			}
			@Override
			public Adapter caseSimpleSemanticModelElement(SimpleSemanticModelElement object) {
				return createSimpleSemanticModelElementAdapter();
			}
			@Override
			public Adapter caseUMASemanticModelBridge(UMASemanticModelBridge object) {
				return createUMASemanticModelBridgeAdapter();
			}
			@Override
			public Adapter caseCoreSemanticModelBridge(CoreSemanticModelBridge object) {
				return createCoreSemanticModelBridgeAdapter();
			}
			@Override
			public Adapter caseLeafElement(LeafElement object) {
				return createLeafElementAdapter();
			}
			@Override
			public Adapter caseTextElement(TextElement object) {
				return createTextElementAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseGraphicPrimitive(GraphicPrimitive object) {
				return createGraphicPrimitiveAdapter();
			}
			@Override
			public Adapter casePolyline(Polyline object) {
				return createPolylineAdapter();
			}
			@Override
			public Adapter caseEllipse(Ellipse object) {
				return createEllipseAdapter();
			}
			@Override
			public Adapter caseProcessFamily(ProcessFamily object) {
				return createProcessFamilyAdapter();
			}
			@Override
			public Adapter caseMethodLibrary(MethodLibrary object) {
				return createMethodLibraryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uma.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.MethodElement <em>Method Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.MethodElement
	 * @generated
	 */
	public Adapter createMethodElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.MethodElementProperty <em>Method Element Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.MethodElementProperty
	 * @generated
	 */
	public Adapter createMethodElementPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Kind
	 * @generated
	 */
	public Adapter createKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ContentElement
	 * @generated
	 */
	public Adapter createContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.DescribableElement <em>Describable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.DescribableElement
	 * @generated
	 */
	public Adapter createDescribableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ContentDescription <em>Content Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ContentDescription
	 * @generated
	 */
	public Adapter createContentDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.MethodUnit <em>Method Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.MethodUnit
	 * @generated
	 */
	public Adapter createMethodUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.SupportingMaterial <em>Supporting Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.SupportingMaterial
	 * @generated
	 */
	public Adapter createSupportingMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Guidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Guidance
	 * @generated
	 */
	public Adapter createGuidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.VariabilityElement <em>Variability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.VariabilityElement
	 * @generated
	 */
	public Adapter createVariabilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Checklist <em>Checklist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Checklist
	 * @generated
	 */
	public Adapter createChecklistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Guideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Guideline
	 * @generated
	 */
	public Adapter createGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Example
	 * @generated
	 */
	public Adapter createExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ReusableAsset <em>Reusable Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ReusableAsset
	 * @generated
	 */
	public Adapter createReusableAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.TermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.TermDefinition
	 * @generated
	 */
	public Adapter createTermDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ApplicableMetaClassInfo <em>Applicable Meta Class Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ApplicableMetaClassInfo
	 * @generated
	 */
	public Adapter createApplicableMetaClassInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.WorkProduct
	 * @generated
	 */
	public Adapter createWorkProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.FulfillableElement <em>Fulfillable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.FulfillableElement
	 * @generated
	 */
	public Adapter createFulfillableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Report
	 * @generated
	 */
	public Adapter createReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ToolMentor <em>Tool Mentor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ToolMentor
	 * @generated
	 */
	public Adapter createToolMentorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.EstimationConsiderations <em>Estimation Considerations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.EstimationConsiderations
	 * @generated
	 */
	public Adapter createEstimationConsiderationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Deliverable
	 * @generated
	 */
	public Adapter createDeliverableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Outcome
	 * @generated
	 */
	public Adapter createOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.WorkDefinition <em>Work Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.WorkDefinition
	 * @generated
	 */
	public Adapter createWorkDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Whitepaper <em>Whitepaper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Whitepaper
	 * @generated
	 */
	public Adapter createWhitepaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ArtifactDescription <em>Artifact Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ArtifactDescription
	 * @generated
	 */
	public Adapter createArtifactDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.WorkProductDescription <em>Work Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.WorkProductDescription
	 * @generated
	 */
	public Adapter createWorkProductDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.DeliverableDescription <em>Deliverable Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.DeliverableDescription
	 * @generated
	 */
	public Adapter createDeliverableDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.RoleDescription <em>Role Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.RoleDescription
	 * @generated
	 */
	public Adapter createRoleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.TaskDescription <em>Task Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.TaskDescription
	 * @generated
	 */
	public Adapter createTaskDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.GuidanceDescription <em>Guidance Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.GuidanceDescription
	 * @generated
	 */
	public Adapter createGuidanceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.PracticeDescription <em>Practice Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.PracticeDescription
	 * @generated
	 */
	public Adapter createPracticeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.RoleSet <em>Role Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.RoleSet
	 * @generated
	 */
	public Adapter createRoleSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ContentCategory <em>Content Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ContentCategory
	 * @generated
	 */
	public Adapter createContentCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.WorkProductType <em>Work Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.WorkProductType
	 * @generated
	 */
	public Adapter createWorkProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.DisciplineGrouping <em>Discipline Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.DisciplineGrouping
	 * @generated
	 */
	public Adapter createDisciplineGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Discipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Discipline
	 * @generated
	 */
	public Adapter createDisciplineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.WorkBreakdownElement <em>Work Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.WorkBreakdownElement
	 * @generated
	 */
	public Adapter createWorkBreakdownElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.BreakdownElement <em>Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.BreakdownElement
	 * @generated
	 */
	public Adapter createBreakdownElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ProcessElement <em>Process Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ProcessElement
	 * @generated
	 */
	public Adapter createProcessElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.PlanningData <em>Planning Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.PlanningData
	 * @generated
	 */
	public Adapter createPlanningDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.WorkOrder <em>Work Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.WorkOrder
	 * @generated
	 */
	public Adapter createWorkOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Roadmap <em>Roadmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Roadmap
	 * @generated
	 */
	public Adapter createRoadmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.RoleSetGrouping <em>Role Set Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.RoleSetGrouping
	 * @generated
	 */
	public Adapter createRoleSetGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.CustomCategory <em>Custom Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.CustomCategory
	 * @generated
	 */
	public Adapter createCustomCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.MethodPackage <em>Method Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.MethodPackage
	 * @generated
	 */
	public Adapter createMethodPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ContentPackage <em>Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ContentPackage
	 * @generated
	 */
	public Adapter createContentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Milestone
	 * @generated
	 */
	public Adapter createMilestoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.WorkProductDescriptor <em>Work Product Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.WorkProductDescriptor
	 * @generated
	 */
	public Adapter createWorkProductDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Descriptor
	 * @generated
	 */
	public Adapter createDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Iteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Iteration
	 * @generated
	 */
	public Adapter createIterationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Phase
	 * @generated
	 */
	public Adapter createPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.TeamProfile <em>Team Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.TeamProfile
	 * @generated
	 */
	public Adapter createTeamProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.RoleDescriptor <em>Role Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.RoleDescriptor
	 * @generated
	 */
	public Adapter createRoleDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.TaskDescriptor <em>Task Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.TaskDescriptor
	 * @generated
	 */
	public Adapter createTaskDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.CompositeRole <em>Composite Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.CompositeRole
	 * @generated
	 */
	public Adapter createCompositeRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.DeliveryProcess <em>Delivery Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.DeliveryProcess
	 * @generated
	 */
	public Adapter createDeliveryProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.CapabilityPattern <em>Capability Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.CapabilityPattern
	 * @generated
	 */
	public Adapter createCapabilityPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.MethodConfiguration <em>Method Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.MethodConfiguration
	 * @generated
	 */
	public Adapter createMethodConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.MethodPlugin <em>Method Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.MethodPlugin
	 * @generated
	 */
	public Adapter createMethodPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ProcessPlanningTemplate <em>Process Planning Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ProcessPlanningTemplate
	 * @generated
	 */
	public Adapter createProcessPlanningTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Practice <em>Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Practice
	 * @generated
	 */
	public Adapter createPracticeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.BreakdownElementDescription <em>Breakdown Element Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.BreakdownElementDescription
	 * @generated
	 */
	public Adapter createBreakdownElementDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ActivityDescription <em>Activity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ActivityDescription
	 * @generated
	 */
	public Adapter createActivityDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.DeliveryProcessDescription <em>Delivery Process Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.DeliveryProcessDescription
	 * @generated
	 */
	public Adapter createDeliveryProcessDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ProcessDescription <em>Process Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ProcessDescription
	 * @generated
	 */
	public Adapter createProcessDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.DescriptorDescription <em>Descriptor Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.DescriptorDescription
	 * @generated
	 */
	public Adapter createDescriptorDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ProcessComponentDescriptor <em>Process Component Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ProcessComponentDescriptor
	 * @generated
	 */
	public Adapter createProcessComponentDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ProcessComponent <em>Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ProcessComponent
	 * @generated
	 */
	public Adapter createProcessComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ProcessPackage <em>Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ProcessPackage
	 * @generated
	 */
	public Adapter createProcessPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.GraphNode <em>Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.GraphNode
	 * @generated
	 */
	public Adapter createGraphNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.GraphElement
	 * @generated
	 */
	public Adapter createGraphElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.DiagramElement
	 * @generated
	 */
	public Adapter createDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.DiagramLink <em>Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.DiagramLink
	 * @generated
	 */
	public Adapter createDiagramLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.GraphConnector <em>Graph Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.GraphConnector
	 * @generated
	 */
	public Adapter createGraphConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.GraphEdge <em>Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.GraphEdge
	 * @generated
	 */
	public Adapter createGraphEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.SemanticModelBridge <em>Semantic Model Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.SemanticModelBridge
	 * @generated
	 */
	public Adapter createSemanticModelBridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ProcessComponentInterface <em>Process Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ProcessComponentInterface
	 * @generated
	 */
	public Adapter createProcessComponentInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.SimpleSemanticModelElement <em>Simple Semantic Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.SimpleSemanticModelElement
	 * @generated
	 */
	public Adapter createSimpleSemanticModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.UMASemanticModelBridge <em>UMA Semantic Model Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.UMASemanticModelBridge
	 * @generated
	 */
	public Adapter createUMASemanticModelBridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.CoreSemanticModelBridge <em>Core Semantic Model Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.CoreSemanticModelBridge
	 * @generated
	 */
	public Adapter createCoreSemanticModelBridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.LeafElement <em>Leaf Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.LeafElement
	 * @generated
	 */
	public Adapter createLeafElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.TextElement
	 * @generated
	 */
	public Adapter createTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.GraphicPrimitive <em>Graphic Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.GraphicPrimitive
	 * @generated
	 */
	public Adapter createGraphicPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Polyline
	 * @generated
	 */
	public Adapter createPolylineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.Ellipse
	 * @generated
	 */
	public Adapter createEllipseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.ProcessFamily <em>Process Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.ProcessFamily
	 * @generated
	 */
	public Adapter createProcessFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uma.MethodLibrary <em>Method Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uma.MethodLibrary
	 * @generated
	 */
	public Adapter createMethodLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UmaAdapterFactory
