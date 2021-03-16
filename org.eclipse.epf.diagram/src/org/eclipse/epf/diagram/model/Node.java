/**
 */
package org.eclipse.epf.diagram.model;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.Node#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Node#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Node#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Node#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Node#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Node#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.diagram.model.ModelPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends LinkedObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(Point)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getNode_Location()
	 * @model dataType="org.eclipse.epf.diagram.model.Point" transient="true"
	 * @generated
	 */
	Point getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.Node#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Point value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getNode_Width()
	 * @model default="-1" transient="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.Node#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getNode_Height()
	 * @model default="-1" transient="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.Node#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.diagram.model.Link}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.diagram.model.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getNode_IncomingConnections()
	 * @see org.eclipse.epf.diagram.model.Link#getTarget
	 * @model type="org.eclipse.epf.diagram.model.Link" opposite="target"
	 * @generated
	 */
	EList getIncomingConnections();

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.diagram.model.Link}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.diagram.model.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' containment reference list.
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getNode_OutgoingConnections()
	 * @see org.eclipse.epf.diagram.model.Link#getSource
	 * @model type="org.eclipse.epf.diagram.model.Link" opposite="source" containment="true"
	 * @generated
	 */
	EList getOutgoingConnections();

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getNode_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.Node#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

} // Node
