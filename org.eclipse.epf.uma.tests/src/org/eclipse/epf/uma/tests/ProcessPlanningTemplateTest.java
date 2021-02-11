/**
 */
package org.eclipse.epf.uma.tests;

import junit.textui.TestRunner;

import org.eclipse.epf.uma.ProcessPlanningTemplate;
import org.eclipse.epf.uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Planning Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessPlanningTemplateTest extends ProcessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessPlanningTemplateTest.class);
	}

	/**
	 * Constructs a new Process Planning Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPlanningTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Planning Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessPlanningTemplate getFixture() {
		return (ProcessPlanningTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createProcessPlanningTemplate());
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

} //ProcessPlanningTemplateTest
