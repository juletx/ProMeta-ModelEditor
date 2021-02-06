/**
 */
package uma.tests;

import junit.textui.TestRunner;

import uma.RoleSetGrouping;
import uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Set Grouping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleSetGroupingTest extends ContentCategoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleSetGroupingTest.class);
	}

	/**
	 * Constructs a new Role Set Grouping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSetGroupingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Set Grouping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoleSetGrouping getFixture() {
		return (RoleSetGrouping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createRoleSetGrouping());
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

} //RoleSetGroupingTest
