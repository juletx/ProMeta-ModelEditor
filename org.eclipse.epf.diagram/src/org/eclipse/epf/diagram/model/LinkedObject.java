/**
 */
package org.eclipse.epf.diagram.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.epf.uma.MethodElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.diagram.model.LinkedObject#getLinkedElement <em>Linked Element</em>}</li>
 *   <li>{@link org.eclipse.epf.diagram.model.LinkedObject#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.diagram.model.ModelPackage#getLinkedObject()
 * @model abstract="true"
 * @generated
 */
public interface LinkedObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Linked Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Element</em>' reference.
	 * @see #setLinkedElement(MethodElement)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getLinkedObject_LinkedElement()
	 * @model
	 * @generated
	 */
	MethodElement getLinkedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.LinkedObject#getLinkedElement <em>Linked Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Element</em>' reference.
	 * @see #getLinkedElement()
	 * @generated
	 */
	void setLinkedElement(MethodElement value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(Object)
	 * @see org.eclipse.epf.diagram.model.ModelPackage#getLinkedObject_Object()
	 * @model transient="true"
	 * @generated
	 */
	Object getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.epf.diagram.model.LinkedObject#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Object value);

} // LinkedObject
