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

import org.eclipse.epf.uma.TaskDescriptor;
import org.eclipse.epf.uma.UmaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.epf.uma.TaskDescriptor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDescriptorItemProvider extends WorkBreakdownElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescriptorItemProvider(AdapterFactory adapterFactory) {
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

			addIsSynchronizedWithSourcePropertyDescriptor(object);
			addGuidanceExcludePropertyDescriptor(object);
			addGuidanceAdditionalPropertyDescriptor(object);
			addTaskPropertyDescriptor(object);
			addAdditionallyPerformedByPropertyDescriptor(object);
			addAssistedByPropertyDescriptor(object);
			addExternalInputPropertyDescriptor(object);
			addMandatoryInputPropertyDescriptor(object);
			addOptionalInputPropertyDescriptor(object);
			addOutputPropertyDescriptor(object);
			addPerformedPrimarilyByPropertyDescriptor(object);
			addSelectedStepsPropertyDescriptor(object);
			addPerformedPrimarilyByExcludedPropertyDescriptor(object);
			addAdditionallyPerformedByExcludePropertyDescriptor(object);
			addMandatoryInputExcludePropertyDescriptor(object);
			addOptionalInputExcludePropertyDescriptor(object);
			addOutputExcludePropertyDescriptor(object);
			addSelectedStepsExcludePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Synchronized With Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSynchronizedWithSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Descriptor_isSynchronizedWithSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Descriptor_isSynchronizedWithSource_feature", "_UI_Descriptor_type"),
				 UmaPackage.eINSTANCE.getDescriptor_IsSynchronizedWithSource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guidance Exclude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuidanceExcludePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Descriptor_guidanceExclude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Descriptor_guidanceExclude_feature", "_UI_Descriptor_type"),
				 UmaPackage.eINSTANCE.getDescriptor_GuidanceExclude(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guidance Additional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuidanceAdditionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Descriptor_guidanceAdditional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Descriptor_guidanceAdditional_feature", "_UI_Descriptor_type"),
				 UmaPackage.eINSTANCE.getDescriptor_GuidanceAdditional(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_Task_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_Task_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_Task(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Additionally Performed By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionallyPerformedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_additionallyPerformedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_additionallyPerformedBy_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_AdditionallyPerformedBy(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assisted By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssistedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_assistedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_assistedBy_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_AssistedBy(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_externalInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_externalInput_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_ExternalInput(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mandatory Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMandatoryInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_mandatoryInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_mandatoryInput_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_MandatoryInput(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optional Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_optionalInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_optionalInput_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_OptionalInput(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_output_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_output_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_Output(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Performed Primarily By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformedPrimarilyByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_performedPrimarilyBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_performedPrimarilyBy_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_PerformedPrimarilyBy(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_selectedSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_selectedSteps_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_SelectedSteps(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Performed Primarily By Excluded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformedPrimarilyByExcludedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_performedPrimarilyByExcluded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_performedPrimarilyByExcluded_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_PerformedPrimarilyByExcluded(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Additionally Performed By Exclude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionallyPerformedByExcludePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_additionallyPerformedByExclude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_additionallyPerformedByExclude_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_AdditionallyPerformedByExclude(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mandatory Input Exclude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMandatoryInputExcludePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_mandatoryInputExclude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_mandatoryInputExclude_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_MandatoryInputExclude(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optional Input Exclude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalInputExcludePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_optionalInputExclude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_optionalInputExclude_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_OptionalInputExclude(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Exclude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputExcludePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_outputExclude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_outputExclude_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_OutputExclude(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Steps Exclude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedStepsExcludePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDescriptor_selectedStepsExclude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDescriptor_selectedStepsExclude_feature", "_UI_TaskDescriptor_type"),
				 UmaPackage.eINSTANCE.getTaskDescriptor_SelectedStepsExclude(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns TaskDescriptor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskDescriptor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskDescriptor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskDescriptor_type") :
			getString("_UI_TaskDescriptor_type") + " " + label;
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

		switch (notification.getFeatureID(TaskDescriptor.class)) {
			case UmaPackage.TASK_DESCRIPTOR__IS_SYNCHRONIZED_WITH_SOURCE:
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
