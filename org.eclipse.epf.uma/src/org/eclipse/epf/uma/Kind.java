/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.Kind#getApplicableMetaClassInfo <em>Applicable Meta Class Info</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getKind()
 * @model
 * @generated
 */
public interface Kind extends ContentElement {
	/**
	 * Returns the value of the '<em><b>Applicable Meta Class Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.ApplicableMetaClassInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Meta Class Info</em>' containment reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getKind_ApplicableMetaClassInfo()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ApplicableMetaClassInfo> getApplicableMetaClassInfo();

} // Kind
