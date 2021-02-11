/**
 */
package org.eclipse.epf.uma.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.epf.uma.DeliveryProcessDescription;
import org.eclipse.epf.uma.UmaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.epf.uma.DeliveryProcessDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeliveryProcessDescriptionItemProvider extends ProcessDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryProcessDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addScalePropertyDescriptor(object);
			addProjectCharacteristicsPropertyDescriptor(object);
			addRiskLevelPropertyDescriptor(object);
			addEstimatingTechniquePropertyDescriptor(object);
			addProjectMemberExpertisePropertyDescriptor(object);
			addTypeOfContractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcessDescription_scale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcessDescription_scale_feature", "_UI_DeliveryProcessDescription_type"),
				 UmaPackage.eINSTANCE.getDeliveryProcessDescription_Scale(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcessDescription_projectCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcessDescription_projectCharacteristics_feature", "_UI_DeliveryProcessDescription_type"),
				 UmaPackage.eINSTANCE.getDeliveryProcessDescription_ProjectCharacteristics(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Risk Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRiskLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcessDescription_riskLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcessDescription_riskLevel_feature", "_UI_DeliveryProcessDescription_type"),
				 UmaPackage.eINSTANCE.getDeliveryProcessDescription_RiskLevel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estimating Technique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstimatingTechniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcessDescription_estimatingTechnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcessDescription_estimatingTechnique_feature", "_UI_DeliveryProcessDescription_type"),
				 UmaPackage.eINSTANCE.getDeliveryProcessDescription_EstimatingTechnique(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project Member Expertise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectMemberExpertisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcessDescription_projectMemberExpertise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcessDescription_projectMemberExpertise_feature", "_UI_DeliveryProcessDescription_type"),
				 UmaPackage.eINSTANCE.getDeliveryProcessDescription_ProjectMemberExpertise(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Of Contract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeOfContractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeliveryProcessDescription_typeOfContract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeliveryProcessDescription_typeOfContract_feature", "_UI_DeliveryProcessDescription_type"),
				 UmaPackage.eINSTANCE.getDeliveryProcessDescription_TypeOfContract(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DeliveryProcessDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeliveryProcessDescription"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DeliveryProcessDescription)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DeliveryProcessDescription_type") :
			getString("_UI_DeliveryProcessDescription_type") + " " + label;
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

		switch (notification.getFeatureID(DeliveryProcessDescription.class)) {
			case UmaPackage.DELIVERY_PROCESS_DESCRIPTION__SCALE:
			case UmaPackage.DELIVERY_PROCESS_DESCRIPTION__PROJECT_CHARACTERISTICS:
			case UmaPackage.DELIVERY_PROCESS_DESCRIPTION__RISK_LEVEL:
			case UmaPackage.DELIVERY_PROCESS_DESCRIPTION__ESTIMATING_TECHNIQUE:
			case UmaPackage.DELIVERY_PROCESS_DESCRIPTION__PROJECT_MEMBER_EXPERTISE:
			case UmaPackage.DELIVERY_PROCESS_DESCRIPTION__TYPE_OF_CONTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
