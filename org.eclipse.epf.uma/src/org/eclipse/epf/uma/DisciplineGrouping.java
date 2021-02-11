/**
 */
package org.eclipse.epf.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discipline Grouping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Discipline Groupings are used to group Disciplines.  For example, the Discipline Grouping "Software Disciplines" would be the group of all disciplines related to developing software such as "Requirements Management" or "Testing"; "IT Infrastructure Management" would be a Disciplines Grouping for disciplines such as "IT Operational Services", "IT Customer Relationships", or "IT Enabling Services".  Disciplines can be associated to more than one Discipline Grouping.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epf.uma.DisciplineGrouping#getDisciplines <em>Disciplines</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epf.uma.UmaPackage#getDisciplineGrouping()
 * @model
 * @generated
 */
public interface DisciplineGrouping extends ContentCategory {
	/**
	 * Returns the value of the '<em><b>Disciplines</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epf.uma.Discipline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disciplines</em>' reference list.
	 * @see org.eclipse.epf.uma.UmaPackage#getDisciplineGrouping_Disciplines()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Discipline> getDisciplines();

} // DisciplineGrouping
