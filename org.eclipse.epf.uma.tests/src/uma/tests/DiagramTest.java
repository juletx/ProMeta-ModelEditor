/**
 */
package uma.tests;

import junit.textui.TestRunner;

import uma.Diagram;
import uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramTest extends GraphNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiagramTest.class);
	}

	/**
	 * Constructs a new Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Diagram getFixture() {
		return (Diagram)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createDiagram());
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

} //DiagramTest
