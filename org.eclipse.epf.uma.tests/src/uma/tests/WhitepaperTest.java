/**
 */
package uma.tests;

import junit.textui.TestRunner;

import uma.UmaFactory;
import uma.Whitepaper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Whitepaper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhitepaperTest extends ConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhitepaperTest.class);
	}

	/**
	 * Constructs a new Whitepaper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhitepaperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Whitepaper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Whitepaper getFixture() {
		return (Whitepaper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createWhitepaper());
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

} //WhitepaperTest
