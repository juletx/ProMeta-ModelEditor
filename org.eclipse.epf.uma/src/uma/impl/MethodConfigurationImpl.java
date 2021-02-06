/**
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uma.ContentCategory;
import uma.MethodConfiguration;
import uma.MethodPackage;
import uma.MethodPlugin;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.MethodConfigurationImpl#getMethodPluginSelection <em>Method Plugin Selection</em>}</li>
 *   <li>{@link uma.impl.MethodConfigurationImpl#getMethodPackageSelection <em>Method Package Selection</em>}</li>
 *   <li>{@link uma.impl.MethodConfigurationImpl#getProcessViews <em>Process Views</em>}</li>
 *   <li>{@link uma.impl.MethodConfigurationImpl#getDefaultView <em>Default View</em>}</li>
 *   <li>{@link uma.impl.MethodConfigurationImpl#getBaseConfigurations <em>Base Configurations</em>}</li>
 *   <li>{@link uma.impl.MethodConfigurationImpl#getSubtractedCategory <em>Subtracted Category</em>}</li>
 *   <li>{@link uma.impl.MethodConfigurationImpl#getAddedCategory <em>Added Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodConfigurationImpl extends MethodUnitImpl implements MethodConfiguration {
	/**
	 * The cached value of the '{@link #getMethodPluginSelection() <em>Method Plugin Selection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodPluginSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodPlugin> methodPluginSelection;

	/**
	 * The cached value of the '{@link #getMethodPackageSelection() <em>Method Package Selection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodPackageSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodPackage> methodPackageSelection;

	/**
	 * The cached value of the '{@link #getProcessViews() <em>Process Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessViews()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentCategory> processViews;

	/**
	 * The cached value of the '{@link #getDefaultView() <em>Default View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultView()
	 * @generated
	 * @ordered
	 */
	protected ContentCategory defaultView;

	/**
	 * The cached value of the '{@link #getBaseConfigurations() <em>Base Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodConfiguration> baseConfigurations;

	/**
	 * The cached value of the '{@link #getSubtractedCategory() <em>Subtracted Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtractedCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentCategory> subtractedCategory;

	/**
	 * The cached value of the '{@link #getAddedCategory() <em>Added Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddedCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentCategory> addedCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getMethodConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodPlugin> getMethodPluginSelection() {
		if (methodPluginSelection == null) {
			methodPluginSelection = new EObjectResolvingEList<MethodPlugin>(MethodPlugin.class, this, UmaPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION);
		}
		return methodPluginSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodPackage> getMethodPackageSelection() {
		if (methodPackageSelection == null) {
			methodPackageSelection = new EObjectResolvingEList<MethodPackage>(MethodPackage.class, this, UmaPackage.METHOD_CONFIGURATION__METHOD_PACKAGE_SELECTION);
		}
		return methodPackageSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentCategory> getProcessViews() {
		if (processViews == null) {
			processViews = new EObjectResolvingEList<ContentCategory>(ContentCategory.class, this, UmaPackage.METHOD_CONFIGURATION__PROCESS_VIEWS);
		}
		return processViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentCategory getDefaultView() {
		if (defaultView != null && defaultView.eIsProxy()) {
			InternalEObject oldDefaultView = (InternalEObject)defaultView;
			defaultView = (ContentCategory)eResolveProxy(oldDefaultView);
			if (defaultView != oldDefaultView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmaPackage.METHOD_CONFIGURATION__DEFAULT_VIEW, oldDefaultView, defaultView));
			}
		}
		return defaultView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentCategory basicGetDefaultView() {
		return defaultView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultView(ContentCategory newDefaultView) {
		ContentCategory oldDefaultView = defaultView;
		defaultView = newDefaultView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.METHOD_CONFIGURATION__DEFAULT_VIEW, oldDefaultView, defaultView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodConfiguration> getBaseConfigurations() {
		if (baseConfigurations == null) {
			baseConfigurations = new EObjectResolvingEList<MethodConfiguration>(MethodConfiguration.class, this, UmaPackage.METHOD_CONFIGURATION__BASE_CONFIGURATIONS);
		}
		return baseConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentCategory> getSubtractedCategory() {
		if (subtractedCategory == null) {
			subtractedCategory = new EObjectResolvingEList<ContentCategory>(ContentCategory.class, this, UmaPackage.METHOD_CONFIGURATION__SUBTRACTED_CATEGORY);
		}
		return subtractedCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentCategory> getAddedCategory() {
		if (addedCategory == null) {
			addedCategory = new EObjectResolvingEList<ContentCategory>(ContentCategory.class, this, UmaPackage.METHOD_CONFIGURATION__ADDED_CATEGORY);
		}
		return addedCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION:
				return getMethodPluginSelection();
			case UmaPackage.METHOD_CONFIGURATION__METHOD_PACKAGE_SELECTION:
				return getMethodPackageSelection();
			case UmaPackage.METHOD_CONFIGURATION__PROCESS_VIEWS:
				return getProcessViews();
			case UmaPackage.METHOD_CONFIGURATION__DEFAULT_VIEW:
				if (resolve) return getDefaultView();
				return basicGetDefaultView();
			case UmaPackage.METHOD_CONFIGURATION__BASE_CONFIGURATIONS:
				return getBaseConfigurations();
			case UmaPackage.METHOD_CONFIGURATION__SUBTRACTED_CATEGORY:
				return getSubtractedCategory();
			case UmaPackage.METHOD_CONFIGURATION__ADDED_CATEGORY:
				return getAddedCategory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmaPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION:
				getMethodPluginSelection().clear();
				getMethodPluginSelection().addAll((Collection<? extends MethodPlugin>)newValue);
				return;
			case UmaPackage.METHOD_CONFIGURATION__METHOD_PACKAGE_SELECTION:
				getMethodPackageSelection().clear();
				getMethodPackageSelection().addAll((Collection<? extends MethodPackage>)newValue);
				return;
			case UmaPackage.METHOD_CONFIGURATION__PROCESS_VIEWS:
				getProcessViews().clear();
				getProcessViews().addAll((Collection<? extends ContentCategory>)newValue);
				return;
			case UmaPackage.METHOD_CONFIGURATION__DEFAULT_VIEW:
				setDefaultView((ContentCategory)newValue);
				return;
			case UmaPackage.METHOD_CONFIGURATION__BASE_CONFIGURATIONS:
				getBaseConfigurations().clear();
				getBaseConfigurations().addAll((Collection<? extends MethodConfiguration>)newValue);
				return;
			case UmaPackage.METHOD_CONFIGURATION__SUBTRACTED_CATEGORY:
				getSubtractedCategory().clear();
				getSubtractedCategory().addAll((Collection<? extends ContentCategory>)newValue);
				return;
			case UmaPackage.METHOD_CONFIGURATION__ADDED_CATEGORY:
				getAddedCategory().clear();
				getAddedCategory().addAll((Collection<? extends ContentCategory>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UmaPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION:
				getMethodPluginSelection().clear();
				return;
			case UmaPackage.METHOD_CONFIGURATION__METHOD_PACKAGE_SELECTION:
				getMethodPackageSelection().clear();
				return;
			case UmaPackage.METHOD_CONFIGURATION__PROCESS_VIEWS:
				getProcessViews().clear();
				return;
			case UmaPackage.METHOD_CONFIGURATION__DEFAULT_VIEW:
				setDefaultView((ContentCategory)null);
				return;
			case UmaPackage.METHOD_CONFIGURATION__BASE_CONFIGURATIONS:
				getBaseConfigurations().clear();
				return;
			case UmaPackage.METHOD_CONFIGURATION__SUBTRACTED_CATEGORY:
				getSubtractedCategory().clear();
				return;
			case UmaPackage.METHOD_CONFIGURATION__ADDED_CATEGORY:
				getAddedCategory().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UmaPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION:
				return methodPluginSelection != null && !methodPluginSelection.isEmpty();
			case UmaPackage.METHOD_CONFIGURATION__METHOD_PACKAGE_SELECTION:
				return methodPackageSelection != null && !methodPackageSelection.isEmpty();
			case UmaPackage.METHOD_CONFIGURATION__PROCESS_VIEWS:
				return processViews != null && !processViews.isEmpty();
			case UmaPackage.METHOD_CONFIGURATION__DEFAULT_VIEW:
				return defaultView != null;
			case UmaPackage.METHOD_CONFIGURATION__BASE_CONFIGURATIONS:
				return baseConfigurations != null && !baseConfigurations.isEmpty();
			case UmaPackage.METHOD_CONFIGURATION__SUBTRACTED_CATEGORY:
				return subtractedCategory != null && !subtractedCategory.isEmpty();
			case UmaPackage.METHOD_CONFIGURATION__ADDED_CATEGORY:
				return addedCategory != null && !addedCategory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodConfigurationImpl
