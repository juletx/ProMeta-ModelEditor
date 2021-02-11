/**
 */
package org.eclipse.epf.uma.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.epf.uma.DescribableElement;
import org.eclipse.epf.uma.UmaFactory;
import org.eclipse.epf.uma.UmaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.epf.uma.DescribableElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DescribableElementItemProvider extends MethodElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribableElementItemProvider(AdapterFactory adapterFactory) {
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

			addIsAbstractPropertyDescriptor(object);
			addShapeiconPropertyDescriptor(object);
			addNodeiconPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_isAbstract_feature", "_UI_Classifier_type"),
				 UmaPackage.eINSTANCE.getClassifier_IsAbstract(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shapeicon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShapeiconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_shapeicon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_shapeicon_feature", "_UI_DescribableElement_type"),
				 UmaPackage.eINSTANCE.getDescribableElement_Shapeicon(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nodeicon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeiconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescribableElement_nodeicon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescribableElement_nodeicon_feature", "_UI_DescribableElement_type"),
				 UmaPackage.eINSTANCE.getDescribableElement_Nodeicon(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(UmaPackage.eINSTANCE.getDescribableElement_Presentation());
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DescribableElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DescribableElement_type") :
			getString("_UI_DescribableElement_type") + " " + label;
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

		switch (notification.getFeatureID(DescribableElement.class)) {
			case UmaPackage.DESCRIBABLE_ELEMENT__IS_ABSTRACT:
			case UmaPackage.DESCRIBABLE_ELEMENT__SHAPEICON:
			case UmaPackage.DESCRIBABLE_ELEMENT__NODEICON:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UmaPackage.DESCRIBABLE_ELEMENT__PRESENTATION:
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

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createContentDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createWorkProductDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createArtifactDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createDeliverableDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createRoleDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createTaskDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createGuidanceDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createPracticeDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createBreakdownElementDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createActivityDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createProcessDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createDeliveryProcessDescription()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getDescribableElement_Presentation(),
				 UmaFactory.eINSTANCE.createDescriptorDescription()));
	}

}
