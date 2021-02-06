//------------------------------------------------------------------------------
// Copyright (c) 2005, 2006 IBM Corporation and others.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// Contributors:
// IBM Corporation - initial implementation
//------------------------------------------------------------------------------
package org.eclipse.epf.uma.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.epf.uma.ProcessPackage;
import org.eclipse.epf.uma.UmaFactory;
import org.eclipse.epf.uma.UmaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.epf.uma.ProcessPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessPackageItemProvider extends MethodPackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS);
			childrenFeatures.add(UmaPackage.Literals.PROCESS_PACKAGE__DIAGRAMS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ProcessPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessPackage")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProcessPackage) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ProcessPackage_type") : //$NON-NLS-1$
				getString("_UI_ProcessPackage_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ProcessPackage.class)) {
		case UmaPackage.PROCESS_PACKAGE__PROCESS_ELEMENTS:
		case UmaPackage.PROCESS_PACKAGE__DIAGRAMS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createPlanningData()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createWorkOrder()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createMilestone()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createWorkProductDescriptor()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createIteration()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createPhase()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createTeamProfile()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createRoleDescriptor()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createTaskDescriptor()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createCompositeRole()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createDeliveryProcess()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createCapabilityPattern()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createProcessPlanningTemplate()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createProcessComponentDescriptor()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__PROCESS_ELEMENTS,
				UmaFactory.eINSTANCE.createProcessComponentInterface()));

		newChildDescriptors.add(createChildParameter(UmaPackage.Literals.PROCESS_PACKAGE__DIAGRAMS,
				UmaFactory.eINSTANCE.createDiagram()));
	}

}
