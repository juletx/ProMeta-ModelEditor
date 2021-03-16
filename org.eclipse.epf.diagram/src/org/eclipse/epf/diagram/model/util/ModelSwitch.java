/**
 */
package org.eclipse.epf.diagram.model.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.epf.diagram.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.epf.diagram.model.ModelPackage
 * @generated
 */
public class ModelSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				Object result = caseDiagram(diagram);
				if (result == null) result = caseNodeContainer(diagram);
				if (result == null) result = caseNode(diagram);
				if (result == null) result = caseLinkedObject(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINK: {
				Link link = (Link)theEObject;
				Object result = caseLink(link);
				if (result == null) result = caseLinkedObject(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINKED_OBJECT: {
				LinkedObject linkedObject = (LinkedObject)theEObject;
				Object result = caseLinkedObject(linkedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NAMED_NODE: {
				NamedNode namedNode = (NamedNode)theEObject;
				Object result = caseNamedNode(namedNode);
				if (result == null) result = caseNode(namedNode);
				if (result == null) result = caseLinkedObject(namedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NODE: {
				Node node = (Node)theEObject;
				Object result = caseNode(node);
				if (result == null) result = caseLinkedObject(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACTIVITY_DIAGRAM: {
				ActivityDiagram activityDiagram = (ActivityDiagram)theEObject;
				Object result = caseActivityDiagram(activityDiagram);
				if (result == null) result = caseDiagram(activityDiagram);
				if (result == null) result = caseNodeContainer(activityDiagram);
				if (result == null) result = caseNode(activityDiagram);
				if (result == null) result = caseLinkedObject(activityDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TYPED_NODE: {
				TypedNode typedNode = (TypedNode)theEObject;
				Object result = caseTypedNode(typedNode);
				if (result == null) result = caseNode(typedNode);
				if (result == null) result = caseLinkedObject(typedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WORK_PRODUCT_DEPENDENCY_DIAGRAM: {
				WorkProductDependencyDiagram workProductDependencyDiagram = (WorkProductDependencyDiagram)theEObject;
				Object result = caseWorkProductDependencyDiagram(workProductDependencyDiagram);
				if (result == null) result = caseDiagram(workProductDependencyDiagram);
				if (result == null) result = caseNodeContainer(workProductDependencyDiagram);
				if (result == null) result = caseNode(workProductDependencyDiagram);
				if (result == null) result = caseLinkedObject(workProductDependencyDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WORK_PRODUCT_NODE: {
				WorkProductNode workProductNode = (WorkProductNode)theEObject;
				Object result = caseWorkProductNode(workProductNode);
				if (result == null) result = caseNamedNode(workProductNode);
				if (result == null) result = caseNode(workProductNode);
				if (result == null) result = caseLinkedObject(workProductNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACTIVITY_DETAIL_DIAGRAM: {
				ActivityDetailDiagram activityDetailDiagram = (ActivityDetailDiagram)theEObject;
				Object result = caseActivityDetailDiagram(activityDetailDiagram);
				if (result == null) result = caseDiagram(activityDetailDiagram);
				if (result == null) result = caseNodeContainer(activityDetailDiagram);
				if (result == null) result = caseNode(activityDetailDiagram);
				if (result == null) result = caseLinkedObject(activityDetailDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NODE_CONTAINER: {
				NodeContainer nodeContainer = (NodeContainer)theEObject;
				Object result = caseNodeContainer(nodeContainer);
				if (result == null) result = caseNode(nodeContainer);
				if (result == null) result = caseLinkedObject(nodeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROLE_NODE: {
				RoleNode roleNode = (RoleNode)theEObject;
				Object result = caseRoleNode(roleNode);
				if (result == null) result = caseNamedNode(roleNode);
				if (result == null) result = caseNode(roleNode);
				if (result == null) result = caseLinkedObject(roleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROLE_TASK_COMPOSITE: {
				RoleTaskComposite roleTaskComposite = (RoleTaskComposite)theEObject;
				Object result = caseRoleTaskComposite(roleTaskComposite);
				if (result == null) result = caseNodeContainer(roleTaskComposite);
				if (result == null) result = caseNode(roleTaskComposite);
				if (result == null) result = caseLinkedObject(roleTaskComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TASK_NODE: {
				TaskNode taskNode = (TaskNode)theEObject;
				Object result = caseTaskNode(taskNode);
				if (result == null) result = caseNamedNode(taskNode);
				if (result == null) result = caseNode(taskNode);
				if (result == null) result = caseLinkedObject(taskNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WORK_PRODUCT_DESCRIPTOR_NODE: {
				WorkProductDescriptorNode workProductDescriptorNode = (WorkProductDescriptorNode)theEObject;
				Object result = caseWorkProductDescriptorNode(workProductDescriptorNode);
				if (result == null) result = caseNamedNode(workProductDescriptorNode);
				if (result == null) result = caseNode(workProductDescriptorNode);
				if (result == null) result = caseLinkedObject(workProductDescriptorNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WORK_BREAKDOWN_ELEMENT_NODE: {
				WorkBreakdownElementNode workBreakdownElementNode = (WorkBreakdownElementNode)theEObject;
				Object result = caseWorkBreakdownElementNode(workBreakdownElementNode);
				if (result == null) result = caseNamedNode(workBreakdownElementNode);
				if (result == null) result = caseNode(workBreakdownElementNode);
				if (result == null) result = caseLinkedObject(workBreakdownElementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WORK_PRODUCT_COMPOSITE: {
				WorkProductComposite workProductComposite = (WorkProductComposite)theEObject;
				Object result = caseWorkProductComposite(workProductComposite);
				if (result == null) result = caseNodeContainer(workProductComposite);
				if (result == null) result = caseNode(workProductComposite);
				if (result == null) result = caseLinkedObject(workProductComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linked Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linked Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkedObject(LinkedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedNode(NamedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityDiagram(ActivityDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypedNode(TypedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Dependency Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Dependency Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkProductDependencyDiagram(WorkProductDependencyDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkProductNode(WorkProductNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Detail Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Detail Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityDetailDiagram(ActivityDetailDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNodeContainer(NodeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoleNode(RoleNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Task Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Task Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoleTaskComposite(RoleTaskComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTaskNode(TaskNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Descriptor Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Descriptor Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkProductDescriptorNode(WorkProductDescriptorNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Breakdown Element Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Breakdown Element Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkBreakdownElementNode(WorkBreakdownElementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkProductComposite(WorkProductComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
