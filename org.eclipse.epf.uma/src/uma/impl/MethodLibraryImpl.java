/**
 */
package uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.MethodConfiguration;
import uma.MethodLibrary;
import uma.MethodPlugin;
import uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.impl.MethodLibraryImpl#getMethodPlugins <em>Method Plugins</em>}</li>
 *   <li>{@link uma.impl.MethodLibraryImpl#getPredefinedConfigurations <em>Predefined Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodLibraryImpl extends MethodUnitImpl implements MethodLibrary {
	/**
	 * The cached value of the '{@link #getMethodPlugins() <em>Method Plugins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodPlugins()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodPlugin> methodPlugins;

	/**
	 * The cached value of the '{@link #getPredefinedConfigurations() <em>Predefined Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodConfiguration> predefinedConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getMethodLibrary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodPlugin> getMethodPlugins() {
		if (methodPlugins == null) {
			methodPlugins = new EObjectContainmentEList<MethodPlugin>(MethodPlugin.class, this, UmaPackage.METHOD_LIBRARY__METHOD_PLUGINS);
		}
		return methodPlugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodConfiguration> getPredefinedConfigurations() {
		if (predefinedConfigurations == null) {
			predefinedConfigurations = new EObjectContainmentEList<MethodConfiguration>(MethodConfiguration.class, this, UmaPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATIONS);
		}
		return predefinedConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.METHOD_LIBRARY__METHOD_PLUGINS:
				return ((InternalEList<?>)getMethodPlugins()).basicRemove(otherEnd, msgs);
			case UmaPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATIONS:
				return ((InternalEList<?>)getPredefinedConfigurations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.METHOD_LIBRARY__METHOD_PLUGINS:
				return getMethodPlugins();
			case UmaPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATIONS:
				return getPredefinedConfigurations();
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
			case UmaPackage.METHOD_LIBRARY__METHOD_PLUGINS:
				getMethodPlugins().clear();
				getMethodPlugins().addAll((Collection<? extends MethodPlugin>)newValue);
				return;
			case UmaPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATIONS:
				getPredefinedConfigurations().clear();
				getPredefinedConfigurations().addAll((Collection<? extends MethodConfiguration>)newValue);
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
			case UmaPackage.METHOD_LIBRARY__METHOD_PLUGINS:
				getMethodPlugins().clear();
				return;
			case UmaPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATIONS:
				getPredefinedConfigurations().clear();
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
			case UmaPackage.METHOD_LIBRARY__METHOD_PLUGINS:
				return methodPlugins != null && !methodPlugins.isEmpty();
			case UmaPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATIONS:
				return predefinedConfigurations != null && !predefinedConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodLibraryImpl
