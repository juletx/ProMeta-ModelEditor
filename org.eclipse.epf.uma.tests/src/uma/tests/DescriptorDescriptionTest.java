/**
 */
package uma.tests;

import junit.textui.TestRunner;

import uma.DescriptorDescription;
import uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Descriptor Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptorDescriptionTest extends BreakdownElementDescriptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DescriptorDescriptionTest.class);
	}

	/**
	 * Constructs a new Descriptor Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Descriptor Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DescriptorDescription getFixture() {
		return (DescriptorDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createDescriptorDescription());
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

} //DescriptorDescriptionTest
