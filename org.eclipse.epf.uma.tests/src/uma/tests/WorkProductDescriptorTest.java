/**
 */
package uma.tests;

import junit.textui.TestRunner;

import uma.UmaFactory;
import uma.WorkProductDescriptor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductDescriptorTest extends DescriptorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductDescriptorTest.class);
	}

	/**
	 * Constructs a new Work Product Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDescriptorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkProductDescriptor getFixture() {
		return (WorkProductDescriptor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createWorkProductDescriptor());
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

} //WorkProductDescriptorTest
