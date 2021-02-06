/**
 */
package uma.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import uma.UmaFactory;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmaPackageImpl extends EPackageImpl implements UmaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "uma.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodElementPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportingMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variabilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checklistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicableMetaClassInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfillableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolMentorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estimationConsiderationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whitepaperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidanceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practiceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplineGroupingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workBreakdownElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakdownElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planningDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSetGroupingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass milestoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodPluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPlanningTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakdownElementDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryProcessDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processComponentDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticModelBridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processComponentInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSemanticModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umaSemanticModelBridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreSemanticModelBridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variabilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workOrderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sequenceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uma.UmaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UmaPackageImpl() {
		super(eNS_URI, UmaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UmaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static UmaPackage init() {
		if (isInited) return (UmaPackage)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUmaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UmaPackageImpl theUmaPackage = registeredUmaPackage instanceof UmaPackageImpl ? (UmaPackageImpl)registeredUmaPackage : new UmaPackageImpl();

		isInited = true;

		// Load packages
		theUmaPackage.loadPackage();

		// Fix loaded packages
		theUmaPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theUmaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmaPackage.eNS_URI, theUmaPackage);
		return theUmaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		if (classifierEClass == null) {
			classifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(0);
		}
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsAbstract() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (typeEClass == null) {
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(1);
		}
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElement() {
		if (packageableElementEClass == null) {
			packageableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(2);
		}
		return packageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		if (namedElementEClass == null) {
			namedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(3);
		}
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		if (elementEClass == null) {
			elementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(4);
		}
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		if (packageEClass == null) {
			packageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(7);
		}
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		if (namespaceEClass == null) {
			namespaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(8);
		}
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		if (constraintEClass == null) {
			constraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(15);
		}
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Body() {
        return (EAttribute)getConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodElement() {
		if (methodElementEClass == null) {
			methodElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(16);
		}
		return methodElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodElement_Guid() {
        return (EAttribute)getMethodElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodElement_PresentationName() {
        return (EAttribute)getMethodElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodElement_BriefDescription() {
        return (EAttribute)getMethodElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodElement_OwnedRules() {
        return (EReference)getMethodElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodElement_MethodElementProperty() {
        return (EReference)getMethodElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodElement_Kind() {
        return (EReference)getMethodElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodElement_Suppressed() {
        return (EAttribute)getMethodElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodElement_OrderingGuide() {
        return (EAttribute)getMethodElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodElementProperty() {
		if (methodElementPropertyEClass == null) {
			methodElementPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(17);
		}
		return methodElementPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodElementProperty_Value() {
        return (EAttribute)getMethodElementProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKind() {
		if (kindEClass == null) {
			kindEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(18);
		}
		return kindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKind_ApplicableMetaClassInfo() {
        return (EReference)getKind().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentElement() {
		if (contentElementEClass == null) {
			contentElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(19);
		}
		return contentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentElement_SupportingMaterials() {
        return (EReference)getContentElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentElement_ConceptsAndPapers() {
        return (EReference)getContentElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentElement_Checklists() {
        return (EReference)getContentElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentElement_Guidelines() {
        return (EReference)getContentElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentElement_Examples() {
        return (EReference)getContentElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentElement_Assets() {
        return (EReference)getContentElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentElement_Termdefinition() {
        return (EReference)getContentElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribableElement() {
		if (describableElementEClass == null) {
			describableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(20);
		}
		return describableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescribableElement_Presentation() {
        return (EReference)getDescribableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_Shapeicon() {
        return (EAttribute)getDescribableElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribableElement_Nodeicon() {
        return (EAttribute)getDescribableElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentDescription() {
		if (contentDescriptionEClass == null) {
			contentDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(21);
		}
		return contentDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentDescription_MainDescription() {
        return (EAttribute)getContentDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDescription_Sections() {
        return (EReference)getContentDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentDescription_ExternalId() {
        return (EAttribute)getContentDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentDescription_KeyConsiderations() {
        return (EAttribute)getContentDescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentDescription_LongPresentationName() {
        return (EAttribute)getContentDescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodUnit() {
		if (methodUnitEClass == null) {
			methodUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(22);
		}
		return methodUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodUnit_Authors() {
        return (EAttribute)getMethodUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodUnit_ChangeDate() {
        return (EAttribute)getMethodUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodUnit_ChangeDescription() {
        return (EAttribute)getMethodUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodUnit_Version() {
        return (EAttribute)getMethodUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodUnit_CopyrightStatement() {
        return (EReference)getMethodUnit().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportingMaterial() {
		if (supportingMaterialEClass == null) {
			supportingMaterialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(23);
		}
		return supportingMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuidance() {
		if (guidanceEClass == null) {
			guidanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(24);
		}
		return guidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		if (sectionEClass == null) {
			sectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(25);
		}
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_SectionName() {
        return (EAttribute)getSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_SectionDescription() {
        return (EAttribute)getSection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_SubSections() {
        return (EReference)getSection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Predecessor() {
        return (EReference)getSection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariabilityElement() {
		if (variabilityElementEClass == null) {
			variabilityElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(26);
		}
		return variabilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariabilityElement_VariabilityType() {
        return (EAttribute)getVariabilityElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariabilityElement_VariabilityBasedOnElement() {
        return (EReference)getVariabilityElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		if (conceptEClass == null) {
			conceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(28);
		}
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChecklist() {
		if (checklistEClass == null) {
			checklistEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(29);
		}
		return checklistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuideline() {
		if (guidelineEClass == null) {
			guidelineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(30);
		}
		return guidelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExample() {
		if (exampleEClass == null) {
			exampleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(31);
		}
		return exampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReusableAsset() {
		if (reusableAssetEClass == null) {
			reusableAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(32);
		}
		return reusableAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermDefinition() {
		if (termDefinitionEClass == null) {
			termDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(33);
		}
		return termDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicableMetaClassInfo() {
		if (applicableMetaClassInfoEClass == null) {
			applicableMetaClassInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(34);
		}
		return applicableMetaClassInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicableMetaClassInfo_IsPrimaryExtension() {
        return (EAttribute)getApplicableMetaClassInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		if (artifactEClass == null) {
			artifactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(35);
		}
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_ContainerArtifact() {
        return (EReference)getArtifact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_ContainedArtifacts() {
        return (EReference)getArtifact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProduct() {
		if (workProductEClass == null) {
			workProductEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(36);
		}
		return workProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProduct_Reports() {
        return (EReference)getWorkProduct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProduct_Templates() {
        return (EReference)getWorkProduct().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProduct_ToolMentors() {
        return (EReference)getWorkProduct().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProduct_EstimationConsiderations() {
        return (EReference)getWorkProduct().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfillableElement() {
		if (fulfillableElementEClass == null) {
			fulfillableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(37);
		}
		return fulfillableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillableElement_Fulfills() {
        return (EReference)getFulfillableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReport() {
		if (reportEClass == null) {
			reportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(38);
		}
		return reportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplate() {
		if (templateEClass == null) {
			templateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(39);
		}
		return templateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolMentor() {
		if (toolMentorEClass == null) {
			toolMentorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(40);
		}
		return toolMentorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstimationConsiderations() {
		if (estimationConsiderationsEClass == null) {
			estimationConsiderationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(41);
		}
		return estimationConsiderationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliverable() {
		if (deliverableEClass == null) {
			deliverableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(42);
		}
		return deliverableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliverable_DeliveredWorkProducts() {
        return (EReference)getDeliverable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutcome() {
		if (outcomeEClass == null) {
			outcomeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(43);
		}
		return outcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		if (stepEClass == null) {
			stepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(44);
		}
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkDefinition() {
		if (workDefinitionEClass == null) {
			workDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(45);
		}
		return workDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDefinition_Precondition() {
        return (EReference)getWorkDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDefinition_Postcondition() {
        return (EReference)getWorkDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhitepaper() {
		if (whitepaperEClass == null) {
			whitepaperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(46);
		}
		return whitepaperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		if (taskEClass == null) {
			taskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(47);
		}
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_PerformedBy() {
        return (EReference)getTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_MandatoryInput() {
        return (EReference)getTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Output() {
        return (EReference)getTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_AdditionallyPerformedBy() {
        return (EReference)getTask().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_OptionalInput() {
        return (EReference)getTask().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Steps() {
        return (EReference)getTask().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ToolMentors() {
        return (EReference)getTask().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_EstimationConsiderations() {
        return (EReference)getTask().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		if (roleEClass == null) {
			roleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(48);
		}
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Modifies() {
        return (EReference)getRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ResponsibleFor() {
        return (EReference)getRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactDescription() {
		if (artifactDescriptionEClass == null) {
			artifactDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(49);
		}
		return artifactDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDescription_BriefOutline() {
        return (EAttribute)getArtifactDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDescription_RepresentationOptions() {
        return (EAttribute)getArtifactDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDescription_Representation() {
        return (EAttribute)getArtifactDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDescription_Notation() {
        return (EAttribute)getArtifactDescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductDescription() {
		if (workProductDescriptionEClass == null) {
			workProductDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(50);
		}
		return workProductDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductDescription_Purpose() {
        return (EAttribute)getWorkProductDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductDescription_ImpactOfNotHaving() {
        return (EAttribute)getWorkProductDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductDescription_ReasonsForNotNeeding() {
        return (EAttribute)getWorkProductDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliverableDescription() {
		if (deliverableDescriptionEClass == null) {
			deliverableDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(51);
		}
		return deliverableDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliverableDescription_ExternalDescription() {
        return (EAttribute)getDeliverableDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliverableDescription_PackagingGuidance() {
        return (EAttribute)getDeliverableDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleDescription() {
		if (roleDescriptionEClass == null) {
			roleDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(52);
		}
		return roleDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleDescription_Skills() {
        return (EAttribute)getRoleDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleDescription_AssignmentApproaches() {
        return (EAttribute)getRoleDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleDescription_Synonyms() {
        return (EAttribute)getRoleDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskDescription() {
		if (taskDescriptionEClass == null) {
			taskDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(53);
		}
		return taskDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskDescription_Purpose() {
        return (EAttribute)getTaskDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskDescription_Alternatives() {
        return (EAttribute)getTaskDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuidanceDescription() {
		if (guidanceDescriptionEClass == null) {
			guidanceDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(54);
		}
		return guidanceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuidanceDescription_Attachments() {
        return (EAttribute)getGuidanceDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPracticeDescription() {
		if (practiceDescriptionEClass == null) {
			practiceDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(55);
		}
		return practiceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPracticeDescription_AdditionalInfo() {
        return (EAttribute)getPracticeDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPracticeDescription_Problem() {
        return (EAttribute)getPracticeDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPracticeDescription_Background() {
        return (EAttribute)getPracticeDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPracticeDescription_Goals() {
        return (EAttribute)getPracticeDescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPracticeDescription_Application() {
        return (EAttribute)getPracticeDescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPracticeDescription_LevelsOfAdoption() {
        return (EAttribute)getPracticeDescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSet() {
		if (roleSetEClass == null) {
			roleSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(56);
		}
		return roleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSet_Roles() {
        return (EReference)getRoleSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentCategory() {
		if (contentCategoryEClass == null) {
			contentCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(57);
		}
		return contentCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		if (domainEClass == null) {
			domainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(58);
		}
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_WorkProducts() {
        return (EReference)getDomain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Subdomains() {
        return (EReference)getDomain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductType() {
		if (workProductTypeEClass == null) {
			workProductTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(59);
		}
		return workProductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductType_WorkProducts() {
        return (EReference)getWorkProductType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplineGrouping() {
		if (disciplineGroupingEClass == null) {
			disciplineGroupingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(60);
		}
		return disciplineGroupingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplineGrouping_Disciplines() {
        return (EReference)getDisciplineGrouping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscipline() {
		if (disciplineEClass == null) {
			disciplineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(61);
		}
		return disciplineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscipline_Tasks() {
        return (EReference)getDiscipline().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscipline_Subdiscipline() {
        return (EReference)getDiscipline().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscipline_ReferenceWorkflows() {
        return (EReference)getDiscipline().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		if (activityEClass == null) {
			activityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(62);
		}
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_BreakdownElements() {
        return (EReference)getActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Roadmaps() {
        return (EReference)getActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkBreakdownElement() {
		if (workBreakdownElementEClass == null) {
			workBreakdownElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(63);
		}
		return workBreakdownElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkBreakdownElement_IsRepeatable() {
        return (EAttribute)getWorkBreakdownElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkBreakdownElement_IsOngoing() {
        return (EAttribute)getWorkBreakdownElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkBreakdownElement_IsEventDriven() {
        return (EAttribute)getWorkBreakdownElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkBreakdownElement_LinkToPredecessor() {
        return (EReference)getWorkBreakdownElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakdownElement() {
		if (breakdownElementEClass == null) {
			breakdownElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(64);
		}
		return breakdownElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakdownElement_Prefix() {
        return (EAttribute)getBreakdownElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakdownElement_IsPlanned() {
        return (EAttribute)getBreakdownElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakdownElement_HasMultipleOccurrences() {
        return (EAttribute)getBreakdownElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakdownElement_IsOptional() {
        return (EAttribute)getBreakdownElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_PresentedAfter() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_PresentedBefore() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_PlanningData() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_SuperActivities() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_Checklists() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_Concepts() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_Examples() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_Guidelines() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_ReusableAssets() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_SupportingMaterials() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_Templates() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_Reports() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_Estimationconsiderations() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakdownElement_Toolmentor() {
        return (EReference)getBreakdownElement().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessElement() {
		if (processElementEClass == null) {
			processElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(65);
		}
		return processElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanningData() {
		if (planningDataEClass == null) {
			planningDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(66);
		}
		return planningDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningData_StartDate() {
        return (EAttribute)getPlanningData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningData_FinishDate() {
        return (EAttribute)getPlanningData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningData_Rank() {
        return (EAttribute)getPlanningData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkOrder() {
		if (workOrderEClass == null) {
			workOrderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(67);
		}
		return workOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkOrder_LinkType() {
        return (EAttribute)getWorkOrder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkOrder_Pred() {
        return (EReference)getWorkOrder().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoadmap() {
		if (roadmapEClass == null) {
			roadmapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(69);
		}
		return roadmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		if (toolEClass == null) {
			toolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(70);
		}
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_ToolMentors() {
        return (EReference)getTool().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSetGrouping() {
		if (roleSetGroupingEClass == null) {
			roleSetGroupingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(71);
		}
		return roleSetGroupingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSetGrouping_RoleSets() {
        return (EReference)getRoleSetGrouping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomCategory() {
		if (customCategoryEClass == null) {
			customCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(72);
		}
		return customCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomCategory_CategorizedElements() {
        return (EReference)getCustomCategory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomCategory_SubCategories() {
        return (EReference)getCustomCategory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodPackage() {
		if (methodPackageEClass == null) {
			methodPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(73);
		}
		return methodPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodPackage_Global() {
        return (EAttribute)getMethodPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPackage_ReusedPackages() {
        return (EReference)getMethodPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPackage_ChildPackages() {
        return (EReference)getMethodPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentPackage() {
		if (contentPackageEClass == null) {
			contentPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(74);
		}
		return contentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentPackage_ContentElements() {
        return (EReference)getContentPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMilestone() {
		if (milestoneEClass == null) {
			milestoneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(75);
		}
		return milestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_RequiredResults() {
        return (EReference)getMilestone().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductDescriptor() {
		if (workProductDescriptorEClass == null) {
			workProductDescriptorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(76);
		}
		return workProductDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductDescriptor_ActivityEntryState() {
        return (EAttribute)getWorkProductDescriptor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductDescriptor_ActivityExitState() {
        return (EAttribute)getWorkProductDescriptor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDescriptor_WorkProduct() {
        return (EReference)getWorkProductDescriptor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDescriptor_ImpactedBy() {
        return (EReference)getWorkProductDescriptor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDescriptor_Impacts() {
        return (EReference)getWorkProductDescriptor().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDescriptor_DeliverableParts() {
        return (EReference)getWorkProductDescriptor().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDescriptor_DeliverablePartsExclude() {
        return (EReference)getWorkProductDescriptor().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptor() {
		if (descriptorEClass == null) {
			descriptorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(77);
		}
		return descriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptor_IsSynchronizedWithSource() {
        return (EAttribute)getDescriptor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptor_GuidanceExclude() {
        return (EReference)getDescriptor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptor_GuidanceAdditional() {
        return (EReference)getDescriptor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteration() {
		if (iterationEClass == null) {
			iterationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(78);
		}
		return iterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhase() {
		if (phaseEClass == null) {
			phaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(79);
		}
		return phaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamProfile() {
		if (teamProfileEClass == null) {
			teamProfileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(80);
		}
		return teamProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamProfile_TeamRoles() {
        return (EReference)getTeamProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamProfile_SuperTeam() {
        return (EReference)getTeamProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamProfile_SubTeam() {
        return (EReference)getTeamProfile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleDescriptor() {
		if (roleDescriptorEClass == null) {
			roleDescriptorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(81);
		}
		return roleDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleDescriptor_Role() {
        return (EReference)getRoleDescriptor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleDescriptor_Modifies() {
        return (EReference)getRoleDescriptor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleDescriptor_ResponsibleFor() {
        return (EReference)getRoleDescriptor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleDescriptor_ResponsibleForExclude() {
        return (EReference)getRoleDescriptor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskDescriptor() {
		if (taskDescriptorEClass == null) {
			taskDescriptorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(82);
		}
		return taskDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_Task() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_AdditionallyPerformedBy() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_AssistedBy() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_ExternalInput() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_MandatoryInput() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_OptionalInput() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_Output() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_PerformedPrimarilyBy() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_SelectedSteps() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_PerformedPrimarilyByExcluded() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_AdditionallyPerformedByExclude() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_MandatoryInputExclude() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_OptionalInputExclude() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_OutputExclude() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDescriptor_SelectedStepsExclude() {
        return (EReference)getTaskDescriptor().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeRole() {
		if (compositeRoleEClass == null) {
			compositeRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(83);
		}
		return compositeRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRole_AggregatedRoles() {
        return (EReference)getCompositeRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliveryProcess() {
		if (deliveryProcessEClass == null) {
			deliveryProcessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(84);
		}
		return deliveryProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliveryProcess_EducationMaterials() {
        return (EReference)getDeliveryProcess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliveryProcess_CommunicationsMaterials() {
        return (EReference)getDeliveryProcess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		if (processEClass == null) {
			processEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(85);
		}
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_IncludesPatterns() {
        return (EReference)getProcess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_DefaultContext() {
        return (EReference)getProcess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_ValidContext() {
        return (EReference)getProcess().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityPattern() {
		if (capabilityPatternEClass == null) {
			capabilityPatternEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(86);
		}
		return capabilityPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodConfiguration() {
		if (methodConfigurationEClass == null) {
			methodConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(87);
		}
		return methodConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_MethodPluginSelection() {
        return (EReference)getMethodConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_MethodPackageSelection() {
        return (EReference)getMethodConfiguration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_ProcessViews() {
        return (EReference)getMethodConfiguration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_DefaultView() {
        return (EReference)getMethodConfiguration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_BaseConfigurations() {
        return (EReference)getMethodConfiguration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_SubtractedCategory() {
        return (EReference)getMethodConfiguration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodConfiguration_AddedCategory() {
        return (EReference)getMethodConfiguration().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodPlugin() {
		if (methodPluginEClass == null) {
			methodPluginEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(88);
		}
		return methodPluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodPlugin_UserChangeable() {
        return (EAttribute)getMethodPlugin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPlugin_MethodPackages() {
        return (EReference)getMethodPlugin().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPlugin_Bases() {
        return (EReference)getMethodPlugin().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodPlugin_Supporting() {
        return (EAttribute)getMethodPlugin().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPlanningTemplate() {
		if (processPlanningTemplateEClass == null) {
			processPlanningTemplateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(89);
		}
		return processPlanningTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPlanningTemplate_BasedOnProcesses() {
        return (EReference)getProcessPlanningTemplate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractice() {
		if (practiceEClass == null) {
			practiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(90);
		}
		return practiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractice_SubPractices() {
        return (EReference)getPractice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractice_ContentReferences() {
        return (EReference)getPractice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractice_ActivityReferences() {
        return (EReference)getPractice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakdownElementDescription() {
		if (breakdownElementDescriptionEClass == null) {
			breakdownElementDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(91);
		}
		return breakdownElementDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakdownElementDescription_UsageGuidance() {
        return (EAttribute)getBreakdownElementDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDescription() {
		if (activityDescriptionEClass == null) {
			activityDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(92);
		}
		return activityDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDescription_Purpose() {
        return (EAttribute)getActivityDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDescription_Alternatives() {
        return (EAttribute)getActivityDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDescription_HowtoStaff() {
        return (EAttribute)getActivityDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliveryProcessDescription() {
		if (deliveryProcessDescriptionEClass == null) {
			deliveryProcessDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(93);
		}
		return deliveryProcessDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcessDescription_Scale() {
        return (EAttribute)getDeliveryProcessDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcessDescription_ProjectCharacteristics() {
        return (EAttribute)getDeliveryProcessDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcessDescription_RiskLevel() {
        return (EAttribute)getDeliveryProcessDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcessDescription_EstimatingTechnique() {
        return (EAttribute)getDeliveryProcessDescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcessDescription_ProjectMemberExpertise() {
        return (EAttribute)getDeliveryProcessDescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryProcessDescription_TypeOfContract() {
        return (EAttribute)getDeliveryProcessDescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessDescription() {
		if (processDescriptionEClass == null) {
			processDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(94);
		}
		return processDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessDescription_Scope() {
        return (EAttribute)getProcessDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessDescription_UsageNotes() {
        return (EAttribute)getProcessDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptorDescription() {
		if (descriptorDescriptionEClass == null) {
			descriptorDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(95);
		}
		return descriptorDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorDescription_RefinedDescription() {
        return (EAttribute)getDescriptorDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessComponentDescriptor() {
		if (processComponentDescriptorEClass == null) {
			processComponentDescriptorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(96);
		}
		return processComponentDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponentDescriptor__processComponent() {
        return (EReference)getProcessComponentDescriptor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessComponent() {
		if (processComponentEClass == null) {
			processComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(97);
		}
		return processComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponent_Interfaces() {
        return (EReference)getProcessComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponent_Process() {
        return (EReference)getProcessComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPackage() {
		if (processPackageEClass == null) {
			processPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(98);
		}
		return processPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPackage_ProcessElements() {
        return (EReference)getProcessPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPackage_Diagrams() {
        return (EReference)getProcessPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		if (diagramEClass == null) {
			diagramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(99);
		}
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_DiagramLink() {
        return (EReference)getDiagram().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_Namespace() {
        return (EReference)getDiagram().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Zoom() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_Viewpoint() {
        return (EReference)getDiagram().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphNode() {
		if (graphNodeEClass == null) {
			graphNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(100);
		}
		return graphNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphNode_Size() {
        return (EReference)getGraphNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphElement() {
		if (graphElementEClass == null) {
			graphElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(101);
		}
		return graphElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphElement_Contained() {
        return (EReference)getGraphElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphElement_Position() {
        return (EReference)getGraphElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphElement_Link() {
        return (EReference)getGraphElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphElement_Anchorage() {
        return (EReference)getGraphElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphElement_SemanticModel() {
        return (EReference)getGraphElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramElement() {
		if (diagramElementEClass == null) {
			diagramElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(102);
		}
		return diagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramElement_IsVisible() {
        return (EAttribute)getDiagramElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElement_Container() {
        return (EReference)getDiagramElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElement_Reference() {
        return (EReference)getDiagramElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElement_Property() {
        return (EReference)getDiagramElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		if (referenceEClass == null) {
			referenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(103);
		}
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_IsIndividualRepresentation() {
        return (EAttribute)getReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Referenced() {
        return (EReference)getReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		if (propertyEClass == null) {
			propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(104);
		}
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Key() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		if (pointEClass == null) {
			pointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(105);
		}
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
        return (EAttribute)getPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
        return (EAttribute)getPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramLink() {
		if (diagramLinkEClass == null) {
			diagramLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(106);
		}
		return diagramLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_Zoom() {
        return (EAttribute)getDiagramLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramLink_Viewport() {
        return (EReference)getDiagramLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramLink_Diagram() {
        return (EReference)getDiagramLink().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramLink_GraphElement() {
        return (EReference)getDiagramLink().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphConnector() {
		if (graphConnectorEClass == null) {
			graphConnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(107);
		}
		return graphConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphConnector_GraphEdge() {
        return (EReference)getGraphConnector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphConnector_GraphElement() {
        return (EReference)getGraphConnector().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphEdge() {
		if (graphEdgeEClass == null) {
			graphEdgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(108);
		}
		return graphEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEdge_Waypoints() {
        return (EReference)getGraphEdge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEdge_Anchor() {
        return (EReference)getGraphEdge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticModelBridge() {
		if (semanticModelBridgeEClass == null) {
			semanticModelBridgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(109);
		}
		return semanticModelBridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticModelBridge_Presentation() {
        return (EAttribute)getSemanticModelBridge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticModelBridge_Diagram() {
        return (EReference)getSemanticModelBridge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticModelBridge_GraphElement() {
        return (EReference)getSemanticModelBridge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		if (dimensionEClass == null) {
			dimensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(110);
		}
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Width() {
        return (EAttribute)getDimension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Height() {
        return (EAttribute)getDimension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessComponentInterface() {
		if (processComponentInterfaceEClass == null) {
			processComponentInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(111);
		}
		return processComponentInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponentInterface_InterfaceSpecifications() {
        return (EReference)getProcessComponentInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponentInterface_InterfaceIO() {
        return (EReference)getProcessComponentInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSemanticModelElement() {
		if (simpleSemanticModelElementEClass == null) {
			simpleSemanticModelElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(112);
		}
		return simpleSemanticModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleSemanticModelElement_TypeInfo() {
        return (EAttribute)getSimpleSemanticModelElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMASemanticModelBridge() {
		if (umaSemanticModelBridgeEClass == null) {
			umaSemanticModelBridgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(113);
		}
		return umaSemanticModelBridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMASemanticModelBridge_Element() {
        return (EReference)getUMASemanticModelBridge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreSemanticModelBridge() {
		if (coreSemanticModelBridgeEClass == null) {
			coreSemanticModelBridgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(114);
		}
		return coreSemanticModelBridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoreSemanticModelBridge_Element() {
        return (EReference)getCoreSemanticModelBridge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeafElement() {
		if (leafElementEClass == null) {
			leafElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(115);
		}
		return leafElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextElement() {
		if (textElementEClass == null) {
			textElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(116);
		}
		return textElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextElement_Text() {
        return (EAttribute)getTextElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		if (imageEClass == null) {
			imageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(117);
		}
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Uri() {
        return (EAttribute)getImage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_MimeType() {
        return (EAttribute)getImage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicPrimitive() {
		if (graphicPrimitiveEClass == null) {
			graphicPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(118);
		}
		return graphicPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyline() {
		if (polylineEClass == null) {
			polylineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(119);
		}
		return polylineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolyline_Closed() {
        return (EAttribute)getPolyline().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolyline_Waypoints() {
        return (EReference)getPolyline().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipse() {
		if (ellipseEClass == null) {
			ellipseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(120);
		}
		return ellipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Center() {
        return (EReference)getEllipse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_RadiusX() {
        return (EAttribute)getEllipse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_RadiusY() {
        return (EAttribute)getEllipse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Rotation() {
        return (EAttribute)getEllipse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_StartAngle() {
        return (EAttribute)getEllipse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_EndAngle() {
        return (EAttribute)getEllipse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessFamily() {
		if (processFamilyEClass == null) {
			processFamilyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(121);
		}
		return processFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessFamily_DeliveryProcesses() {
        return (EReference)getProcessFamily().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodLibrary() {
		if (methodLibraryEClass == null) {
			methodLibraryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(122);
		}
		return methodLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodLibrary_MethodPlugins() {
        return (EReference)getMethodLibrary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodLibrary_PredefinedConfigurations() {
        return (EReference)getMethodLibrary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariabilityType() {
		if (variabilityTypeEEnum == null) {
			variabilityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(27);
		}
		return variabilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkOrderType() {
		if (workOrderTypeEEnum == null) {
			workOrderTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(68);
		}
		return workOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		if (stringEDataType == null) {
			stringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(5);
		}
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		if (booleanEDataType == null) {
			booleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(6);
		}
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		if (dateEDataType == null) {
			dateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(9);
		}
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUri() {
		if (uriEDataType == null) {
			uriEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(10);
		}
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSet() {
		if (setEDataType == null) {
			setEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(11);
		}
		return setEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSequence() {
		if (sequenceEDataType == null) {
			sequenceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(12);
		}
		return sequenceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		if (integerEDataType == null) {
			integerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(13);
		}
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		if (doubleEDataType == null) {
			doubleEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI).getEClassifiers().get(14);
		}
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaFactory getUmaFactory() {
		return (UmaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("uma." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //UmaPackageImpl
