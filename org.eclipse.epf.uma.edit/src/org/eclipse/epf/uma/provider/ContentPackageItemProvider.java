/**
 */
package org.eclipse.epf.uma.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.epf.uma.ContentPackage;
import org.eclipse.epf.uma.UmaFactory;
import org.eclipse.epf.uma.UmaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.epf.uma.ContentPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentPackageItemProvider extends MethodPackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(UmaPackage.eINSTANCE.getContentPackage_ContentElements());
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
	 * This returns ContentPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContentPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContentPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContentPackage_type") :
			getString("_UI_ContentPackage_type") + " " + label;
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

		switch (notification.getFeatureID(ContentPackage.class)) {
			case UmaPackage.CONTENT_PACKAGE__CONTENT_ELEMENTS:
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
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createKind()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createSupportingMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createChecklist()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createGuideline()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createExample()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createReusableAsset()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createTermDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createWorkProduct()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createReport()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createToolMentor()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createEstimationConsiderations()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createDeliverable()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createWhitepaper()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createRoleSet()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createWorkProductType()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createDisciplineGrouping()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createDiscipline()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createRoadmap()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createRoleSetGrouping()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createCustomCategory()));

		newChildDescriptors.add
			(createChildParameter
				(UmaPackage.eINSTANCE.getContentPackage_ContentElements(),
				 UmaFactory.eINSTANCE.createPractice()));
	}

}
