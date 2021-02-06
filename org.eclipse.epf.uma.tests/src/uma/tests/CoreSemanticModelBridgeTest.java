/**
 */
package uma.tests;

import junit.textui.TestRunner;

import uma.CoreSemanticModelBridge;
import uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Core Semantic Model Bridge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreSemanticModelBridgeTest extends SemanticModelBridgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CoreSemanticModelBridgeTest.class);
	}

	/**
	 * Constructs a new Core Semantic Model Bridge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSemanticModelBridgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Core Semantic Model Bridge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CoreSemanticModelBridge getFixture() {
		return (CoreSemanticModelBridge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createCoreSemanticModelBridge());
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

} //CoreSemanticModelBridgeTest
