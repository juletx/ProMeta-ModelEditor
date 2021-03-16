/**
 */
package org.eclipse.epf.diagram.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.NodeContainer#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.diagram.model.ModelPackage#getNodeContainer()
 * @model abstract="true"
 * @generated
 */
public interface NodeContainer extends Node {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.diagram.model.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getNodeContainer_Nodes()
	 * @model type="org.eclipse.epf.diagram.model.Node" containment="true"
	 * @generated
	 */
	EList getNodes();

} // NodeContainer
