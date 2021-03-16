/**
 */
package org.eclipse.epf.diagram.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.epf.diagram.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.epf.diagram.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected ModelSwitch modelSwitch =
		new ModelSwitch() {
			public Object caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			public Object caseLink(Link object) {
				return createLinkAdapter();
			}
			public Object caseLinkedObject(LinkedObject object) {
				return createLinkedObjectAdapter();
			}
			public Object caseNamedNode(NamedNode object) {
				return createNamedNodeAdapter();
			}
			public Object caseNode(Node object) {
				return createNodeAdapter();
			}
			public Object caseActivityDiagram(ActivityDiagram object) {
				return createActivityDiagramAdapter();
			}
			public Object caseTypedNode(TypedNode object) {
				return createTypedNodeAdapter();
			}
			public Object caseWorkProductDependencyDiagram(WorkProductDependencyDiagram object) {
				return createWorkProductDependencyDiagramAdapter();
			}
			public Object caseWorkProductNode(WorkProductNode object) {
				return createWorkProductNodeAdapter();
			}
			public Object caseActivityDetailDiagram(ActivityDetailDiagram object) {
				return createActivityDetailDiagramAdapter();
			}
			public Object caseNodeContainer(NodeContainer object) {
				return createNodeContainerAdapter();
			}
			public Object caseRoleNode(RoleNode object) {
				return createRoleNodeAdapter();
			}
			public Object caseRoleTaskComposite(RoleTaskComposite object) {
				return createRoleTaskCompositeAdapter();
			}
			public Object caseTaskNode(TaskNode object) {
				return createTaskNodeAdapter();
			}
			public Object caseWorkProductDescriptorNode(WorkProductDescriptorNode object) {
				return createWorkProductDescriptorNodeAdapter();
			}
			public Object caseWorkBreakdownElementNode(WorkBreakdownElementNode object) {
				return createWorkBreakdownElementNodeAdapter();
			}
			public Object caseWorkProductComposite(WorkProductComposite object) {
				return createWorkProductCompositeAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.LinkedObject <em>Linked Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.LinkedObject
	 * @generated
	 */
	public Adapter createLinkedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.NamedNode <em>Named Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.NamedNode
	 * @generated
	 */
	public Adapter createNamedNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.ActivityDiagram
	 * @generated
	 */
	public Adapter createActivityDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.TypedNode <em>Typed Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.TypedNode
	 * @generated
	 */
	public Adapter createTypedNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.WorkProductDependencyDiagram <em>Work Product Dependency Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.WorkProductDependencyDiagram
	 * @generated
	 */
	public Adapter createWorkProductDependencyDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.WorkProductNode <em>Work Product Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.WorkProductNode
	 * @generated
	 */
	public Adapter createWorkProductNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.ActivityDetailDiagram <em>Activity Detail Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.ActivityDetailDiagram
	 * @generated
	 */
	public Adapter createActivityDetailDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.NodeContainer <em>Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.NodeContainer
	 * @generated
	 */
	public Adapter createNodeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.RoleNode <em>Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.RoleNode
	 * @generated
	 */
	public Adapter createRoleNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.RoleTaskComposite <em>Role Task Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.RoleTaskComposite
	 * @generated
	 */
	public Adapter createRoleTaskCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.TaskNode <em>Task Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.TaskNode
	 * @generated
	 */
	public Adapter createTaskNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.WorkProductDescriptorNode <em>Work Product Descriptor Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.WorkProductDescriptorNode
	 * @generated
	 */
	public Adapter createWorkProductDescriptorNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.WorkBreakdownElementNode <em>Work Breakdown Element Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.WorkBreakdownElementNode
	 * @generated
	 */
	public Adapter createWorkBreakdownElementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epf.diagram.model.WorkProductComposite <em>Work Product Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epf.diagram.model.WorkProductComposite
	 * @generated
	 */
	public Adapter createWorkProductCompositeAdapter() {
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

} //ModelAdapterFactory
