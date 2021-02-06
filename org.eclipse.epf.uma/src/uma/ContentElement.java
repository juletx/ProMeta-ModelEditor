/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Content Element is a Describable Element that represents an abstract generalization for all elements that are considered to be and managed as Method Content.
 * Content Elements represents reusable Method Content that is supposed to be managed in Content Packages.  The separation of Content Element from Process Element allows to clearly distinguish between pure method content from content that is represented in processes.
 * 
 * This is the Guidance Types package's extension of Content Element (defined in Content Elements) providing additonal associations.
 * Content Element in the package Method Plugin inherits from Variability Element and not directly from Method Element anymore.  This is achieved using UML 2.0 package merge semantics.  Only if an adopter of this meta-model decides to realize Method Plugins, he would get the variability and extension capabilities for all Content Elements.
 * Content Element inherits the semantics of Variability Element.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.ContentElement#getSupportingMaterials <em>Supporting Materials</em>}</li>
 *   <li>{@link uma.ContentElement#getConceptsAndPapers <em>Concepts And Papers</em>}</li>
 *   <li>{@link uma.ContentElement#getChecklists <em>Checklists</em>}</li>
 *   <li>{@link uma.ContentElement#getGuidelines <em>Guidelines</em>}</li>
 *   <li>{@link uma.ContentElement#getExamples <em>Examples</em>}</li>
 *   <li>{@link uma.ContentElement#getAssets <em>Assets</em>}</li>
 *   <li>{@link uma.ContentElement#getTermdefinition <em>Termdefinition</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getContentElement()
 * @model abstract="true"
 * @generated
 */
public interface ContentElement extends DescribableElement, VariabilityElement {
	/**
	 * Returns the value of the '<em><b>Supporting Materials</b></em>' reference list.
	 * The list contents are of type {@link uma.SupportingMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Materials</em>' reference list.
	 * @see uma.UmaPackage#getContentElement_SupportingMaterials()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SupportingMaterial> getSupportingMaterials();

	/**
	 * Returns the value of the '<em><b>Concepts And Papers</b></em>' reference list.
	 * The list contents are of type {@link uma.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts And Papers</em>' reference list.
	 * @see uma.UmaPackage#getContentElement_ConceptsAndPapers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Concept> getConceptsAndPapers();

	/**
	 * Returns the value of the '<em><b>Checklists</b></em>' reference list.
	 * The list contents are of type {@link uma.Checklist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checklists</em>' reference list.
	 * @see uma.UmaPackage#getContentElement_Checklists()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Checklist> getChecklists();

	/**
	 * Returns the value of the '<em><b>Guidelines</b></em>' reference list.
	 * The list contents are of type {@link uma.Guideline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guidelines</em>' reference list.
	 * @see uma.UmaPackage#getContentElement_Guidelines()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Guideline> getGuidelines();

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' reference list.
	 * The list contents are of type {@link uma.Example}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' reference list.
	 * @see uma.UmaPackage#getContentElement_Examples()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Example> getExamples();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link uma.ReusableAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see uma.UmaPackage#getContentElement_Assets()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ReusableAsset> getAssets();

	/**
	 * Returns the value of the '<em><b>Termdefinition</b></em>' reference list.
	 * The list contents are of type {@link uma.TermDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termdefinition</em>' reference list.
	 * @see uma.UmaPackage#getContentElement_Termdefinition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TermDefinition> getTermdefinition();

} // ContentElement
