/**
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Process is a special Activity that describes a structure for particular types of development projects.  To perform such a development project a Processes would be 'instantiated' and adapted for the specific situation.  Process is an abstract class and this meta-model defines different special types of Processes for different process management applications and different situations of process reuse.  Every Process comprises of and is the top-level element of an n-level breakdown structure using the Nesting association defined on Activity.
 * Core Method Content provides step-by-step explanations, describing how very specific development goals are achieved independent of the placement of these steps within a development lifecycle.  Processes take these method elements and relate them into semi-ordered sequences that are customized to specific types of projects.  Thus, a process is a set of partially ordered work descriptions intended to reach a higher development goal, such as the release of a specific software system.  A process and the process meta-model structure defined in this specification focuses on the lifecycle and the sequencing of work in breakdown structures.  To achieve this it uses the Descriptor concept referencing method content and allowing defining time-specific customizations of the referenced content (e.g. defining a focus on different steps of the same Task and providing input Work Products in different states within the different Phases of a process lifecycle in which the same Task is performed).
 * 
 * Process in the package Library Configuration extends the class Process with association relating a Process to one default and many optional valid Configurations.
 * These configurations describe valid contexts for the Process within a Method Library indicating under which Configurations a Process is well defined.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.Process#getIncludesPatterns <em>Includes Patterns</em>}</li>
 *   <li>{@link uma.Process#getDefaultContext <em>Default Context</em>}</li>
 *   <li>{@link uma.Process#getValidContext <em>Valid Context</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getProcess()
 * @model abstract="true"
 * @generated
 */
public interface Process extends Activity {
	/**
	 * Returns the value of the '<em><b>Includes Patterns</b></em>' reference list.
	 * The list contents are of type {@link uma.CapabilityPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Patterns</em>' reference list.
	 * @see uma.UmaPackage#getProcess_IncludesPatterns()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CapabilityPattern> getIncludesPatterns();

	/**
	 * Returns the value of the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Context</em>' reference.
	 * @see #setDefaultContext(MethodConfiguration)
	 * @see uma.UmaPackage#getProcess_DefaultContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MethodConfiguration getDefaultContext();

	/**
	 * Sets the value of the '{@link uma.Process#getDefaultContext <em>Default Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Context</em>' reference.
	 * @see #getDefaultContext()
	 * @generated
	 */
	void setDefaultContext(MethodConfiguration value);

	/**
	 * Returns the value of the '<em><b>Valid Context</b></em>' reference list.
	 * The list contents are of type {@link uma.MethodConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Context</em>' reference list.
	 * @see uma.UmaPackage#getProcess_ValidContext()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodConfiguration> getValidContext();

} // Process
