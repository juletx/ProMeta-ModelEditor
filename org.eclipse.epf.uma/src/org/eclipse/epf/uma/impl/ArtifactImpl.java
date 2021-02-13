/**
 */
package org.eclipse.epf.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epf.uma.Artifact;
import org.eclipse.epf.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.impl.ArtifactImpl#getContainerArtifact <em>Container Artifact</em>}</li>
 *   <li>{@link org.eclipse.epf.uma.impl.ArtifactImpl#getContainedArtifacts <em>Contained Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends WorkProductImpl implements Artifact {
	/**
	 * The cached value of the '{@link #getContainedArtifacts() <em>Contained Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> containedArtifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.eINSTANCE.getArtifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getContainerArtifact() {
		if (eContainerFeatureID() != UmaPackage.ARTIFACT__CONTAINER_ARTIFACT) return null;
		return (Artifact)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetContainerArtifact() {
		if (eContainerFeatureID() != UmaPackage.ARTIFACT__CONTAINER_ARTIFACT) return null;
		return (Artifact)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerArtifact(Artifact newContainerArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainerArtifact, UmaPackage.ARTIFACT__CONTAINER_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerArtifact(Artifact newContainerArtifact) {
		if (newContainerArtifact != eInternalContainer() || (eContainerFeatureID() != UmaPackage.ARTIFACT__CONTAINER_ARTIFACT && newContainerArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newContainerArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerArtifact != null)
				msgs = ((InternalEObject)newContainerArtifact).eInverseAdd(this, UmaPackage.ARTIFACT__CONTAINED_ARTIFACTS, Artifact.class, msgs);
			msgs = basicSetContainerArtifact(newContainerArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.ARTIFACT__CONTAINER_ARTIFACT, newContainerArtifact, newContainerArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getContainedArtifacts() {
		if (containedArtifacts == null) {
			containedArtifacts = new EObjectContainmentWithInverseEList.Resolving<Artifact>(Artifact.class, this, UmaPackage.ARTIFACT__CONTAINED_ARTIFACTS, UmaPackage.ARTIFACT__CONTAINER_ARTIFACT);
		}
		return containedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.ARTIFACT__CONTAINER_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainerArtifact((Artifact)otherEnd, msgs);
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedArtifacts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.ARTIFACT__CONTAINER_ARTIFACT:
				return basicSetContainerArtifact(null, msgs);
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACTS:
				return ((InternalEList<?>)getContainedArtifacts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UmaPackage.ARTIFACT__CONTAINER_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, UmaPackage.ARTIFACT__CONTAINED_ARTIFACTS, Artifact.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.ARTIFACT__CONTAINER_ARTIFACT:
				if (resolve) return getContainerArtifact();
				return basicGetContainerArtifact();
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACTS:
				return getContainedArtifacts();
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
			case UmaPackage.ARTIFACT__CONTAINER_ARTIFACT:
				setContainerArtifact((Artifact)newValue);
				return;
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACTS:
				getContainedArtifacts().clear();
				getContainedArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case UmaPackage.ARTIFACT__CONTAINER_ARTIFACT:
				setContainerArtifact((Artifact)null);
				return;
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACTS:
				getContainedArtifacts().clear();
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
			case UmaPackage.ARTIFACT__CONTAINER_ARTIFACT:
				return basicGetContainerArtifact() != null;
			case UmaPackage.ARTIFACT__CONTAINED_ARTIFACTS:
				return containedArtifacts != null && !containedArtifacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
