/**
 */
package uma.tests;

import junit.textui.TestRunner;

import uma.SimpleSemanticModelElement;
import uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Semantic Model Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSemanticModelElementTest extends SemanticModelBridgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleSemanticModelElementTest.class);
	}

	/**
	 * Constructs a new Simple Semantic Model Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSemanticModelElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Semantic Model Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleSemanticModelElement getFixture() {
		return (SimpleSemanticModelElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createSimpleSemanticModelElement());
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

} //SimpleSemanticModelElementTest
