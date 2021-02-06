/**
 */
package uma.tests;

import junit.textui.TestRunner;

import uma.UmaFactory;
import uma.WorkProductDescription;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductDescriptionTest extends ContentDescriptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductDescriptionTest.class);
	}

	/**
	 * Constructs a new Work Product Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkProductDescription getFixture() {
		return (WorkProductDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createWorkProductDescription());
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

} //WorkProductDescriptionTest
