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

import org.eclipse.epf.uma.BreakdownElement;
import org.eclipse.epf.uma.UmaFactory;
import org.eclipse.epf.uma.UmaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.epf.uma.BreakdownElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BreakdownElementItemProvider extends ProcessElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakdownElementItemProvider(AdapterFactory adapterFactory) {
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

			addPrefixPropertyDescriptor(object);
			addIsPlannedPropertyDescriptor(object);
			addHasMultipleOccurrencesPropertyDescriptor(object);
			addIsOptionalPropertyDescriptor(object);
			addPresentedAfterPropertyDescriptor(object);
			addPresentedBeforePropertyDescriptor(object);
			addSuperActivitiesPropertyDescriptor(object);
			addChecklistsPropertyDescriptor(object);
			addConceptsPropertyDescriptor(object);
			addExamplesPropertyDescriptor(object);
			addGuidelinesPropertyDescriptor(object);
			addReusableAssetsPropertyDescriptor(object);
			addSupportingMaterialsPropertyDescriptor(object);
			addTemplatesPropertyDescriptor(object);
			addReportsPropertyDescriptor(object);
			addEstimationconsiderationsPropertyDescriptor(object);
			addToolmentorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_prefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_prefix_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_Prefix(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Planned feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPlannedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_isPlanned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_isPlanned_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_IsPlanned(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Multiple Occurrences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMultipleOccurrencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_hasMultipleOccurrences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_hasMultipleOccurrences_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_isOptional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_isOptional_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_IsOptional(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Presented After feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPresentedAfterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_presentedAfter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_presentedAfter_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_PresentedAfter(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Presented Before feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPresentedBeforePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_presentedBefore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_presentedBefore_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_PresentedBefore(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Activities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperActivitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_superActivities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_superActivities_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_SuperActivities(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Checklists feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChecklistsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_checklists_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_checklists_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_Checklists(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concepts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConceptsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_concepts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_concepts_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_Concepts(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Examples feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExamplesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_examples_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_examples_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_Examples(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guidelines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuidelinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_guidelines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_guidelines_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_Guidelines(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reusable Assets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReusableAssetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_reusableAssets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_reusableAssets_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_ReusableAssets(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supporting Materials feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportingMaterialsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_supportingMaterials_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_supportingMaterials_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_SupportingMaterials(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Templates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_templates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_templates_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_Templates(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReportsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_reports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_reports_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_Reports(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estimationconsiderations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstimationconsiderationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_estimationconsiderations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_estimationconsiderations_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_Estimationconsiderations(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Toolmentor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolmentorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BreakdownElement_toolmentor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BreakdownElement_toolmentor_feature", "_UI_BreakdownElement_type"),
				 UmaPackage.eINSTANCE.getBreakdownElement_Toolmentor(),
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(UmaPackage.eINSTANCE.getBreakdownElement_PlanningData());
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
		String label = ((BreakdownElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BreakdownElement_type") :
			getString("_UI_BreakdownElement_type") + " " + label;
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

		switch (notification.getFeatureID(BreakdownElement.class)) {
			case UmaPackage.BREAKDOWN_ELEMENT__PREFIX:
			case UmaPackage.BREAKDOWN_ELEMENT__IS_PLANNED:
			case UmaPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES:
			case UmaPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UmaPackage.BREAKDOWN_ELEMENT__PLANNING_DATA:
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
				(UmaPackage.eINSTANCE.getBreakdownElement_PlanningData(),
				 UmaFactory.eINSTANCE.createPlanningData()));
	}

}
