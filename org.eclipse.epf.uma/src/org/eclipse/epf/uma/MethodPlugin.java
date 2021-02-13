/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Method Plugin is a Method Element that represents a physical container for Method Packages.  It defines a granularity level for the modularization and organization of method content and processes.  A Method Plugin can extend many other Method Plugins and it can be extended by many Method Plugins.  It can also be used stand-alone, i.e. with no Extension relationship to other plug-ins.
 * Method Plugin conceptually represents a unit for configuration, modularization, extension, packaging, and deployment of method content and processes.  A Process Engineer shall design his Plugins and allocate his content to these Plugins with requirements for extensibility, modularity, reuse, and maintainability in mind.
 * Special extensibility mechanisms defined for the meta-classes Variability Element and Process Contribution allow Plugin content to directly contribute new content, replace existing content, or to cross-reference to any Content Element or Process within another Plugin that it extends.  Similar to UML 2.0's 'package merge' mechanism transformation interpretations, interpreting these Method Plugin mechanisms results into new extended Method Content and Processes.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.MethodPlugin#getUserChangeable <em>User Changeable</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.MethodPlugin#getMethodPackages <em>Method Packages</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.MethodPlugin#getBases <em>Bases</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.MethodPlugin#isSupporting <em>Supporting</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getMethodPlugin()
 * @model
 * @generated
 */
public interface MethodPlugin extends MethodUnit, org.eclipse.epf.uma.Package {
	/**
	 * Returns the value of the '<em><b>User Changeable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Changeable</em>' attribute.
	 * @see #setUserChangeable(Boolean)
	 * @see org.eclipse.epf.uma.UmaPackage#getMethodPlugin_UserChangeable()
	 * @model default="true" dataType="org.eclipse.epf.uma.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getUserChangeable();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.MethodPlugin#getUserChangeable <em>User Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Changeable</em>' attribute.
	 * @see #getUserChangeable()
	 * @generated
	 */
	void setUserChangeable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Method Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.MethodPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Packages</em>' containment reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getMethodPlugin_MethodPackages()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	EList<MethodPackage> getMethodPackages();

	/**
	 * Returns the value of the '<em><b>Bases</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.MethodPlugin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bases</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getMethodPlugin_Bases()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodPlugin> getBases();

	/**
	 * Returns the value of the '<em><b>Supporting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A supporting method plug-in is a plug-in that contains supporting and optional method elements. Only the elements that are referenced from non-supporting plug-in are to be considered for inclusion into a method configuration. In other words, if a supporting method plug-in is selected for a configuration only its elements referenced from outside of this plug-in will be considered for the configuration.  All other unreferenced elements will not be.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting</em>' attribute.
	 * @see #setSupporting(boolean)
	 * @see org.eclipse.epf.uma.UmaPackage#getMethodPlugin_Supporting()
	 * @model
	 * @generated
	 */
	boolean isSupporting();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.uma.MethodPlugin#isSupporting <em>Supporting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting</em>' attribute.
	 * @see #isSupporting()
	 * @generated
	 */
	void setSupporting(boolean value);

} // MethodPlugin
