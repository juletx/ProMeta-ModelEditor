/**
 */
package org.eclipse.epf.uma.tests;

import junit.textui.TestRunner;

import org.eclipse.epf.uma.UmaFactory;
import org.eclipse.epf.uma.WorkProductType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductTypeTest extends ContentCategoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductTypeTest.class);
	}

	/**
	 * Constructs a new Work Product Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkProductType getFixture() {
		return (WorkProductType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createWorkProductType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WorkProductTypeTest
