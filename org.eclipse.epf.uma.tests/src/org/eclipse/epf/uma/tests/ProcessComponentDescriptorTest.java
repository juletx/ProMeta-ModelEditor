/**
 */
package org.eclipse.epf.uma.tests;

import junit.textui.TestRunner;

import org.eclipse.epf.uma.ProcessComponentDescriptor;
import org.eclipse.epf.uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Component Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessComponentDescriptorTest extends DescriptorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessComponentDescriptorTest.class);
	}

	/**
	 * Constructs a new Process Component Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponentDescriptorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Component Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessComponentDescriptor getFixture() {
		return (ProcessComponentDescriptor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createProcessComponentDescriptor());
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

} //ProcessComponentDescriptorTest
