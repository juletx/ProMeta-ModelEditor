/**
 */
package uma.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>uma</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmaTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new UmaTests("uma Tests");
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(RoleTest.class);
		suite.addTestSuite(RoleDescriptorTest.class);
		suite.addTestSuite(CompositeRoleTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaTests(String name) {
		super(name);
	}

} //UmaTests
