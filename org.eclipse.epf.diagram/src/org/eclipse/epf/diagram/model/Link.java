/**
 */
package org.eclipse.epf.diagram.model;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.Link#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Link#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Link#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Link#getSourceEndPoint <em>Source End Point</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.Link#getTargetEndPoint <em>Target End Point</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.diagram.model.ModelPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends LinkedObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getLink_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.Link#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.diagram.model.Node#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Node)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getLink_Source()
	 * @see org.eclipse.epf.diagram.model.Node#getOutgoingConnections
	 * @model opposite="outgoingConnections" transient="false"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.Link#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.epf.diagram.model.Node#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getLink_Target()
	 * @see org.eclipse.epf.diagram.model.Node#getIncomingConnections
	 * @model opposite="incomingConnections"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.AbsoluteBendpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getLink_Bendpoints()
	 * @model dataType="org.eclipse.epf.diagram.model.AbsoluteBendpoint" transient="true"
	 * @generated
	 */
	EList getBendpoints();

	/**
	 * Returns the value of the '<em><b>Source End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source End Point</em>' attribute.
	 * @see #setSourceEndPoint(Point)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getLink_SourceEndPoint()
	 * @model dataType="org.eclipse.epf.diagram.model.Point" transient="true"
	 * @generated
	 */
	Point getSourceEndPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.Link#getSourceEndPoint <em>Source End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source End Point</em>' attribute.
	 * @see #getSourceEndPoint()
	 * @generated
	 */
	void setSourceEndPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Target End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target End Point</em>' attribute.
	 * @see #setTargetEndPoint(Point)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getLink_TargetEndPoint()
	 * @model dataType="org.eclipse.epf.diagram.model.Point" transient="true"
	 * @generated
	 */
	Point getTargetEndPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.Link#getTargetEndPoint <em>Target End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target End Point</em>' attribute.
	 * @see #getTargetEndPoint()
	 * @generated
	 */
	void setTargetEndPoint(Point value);

} // Link
