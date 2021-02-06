/**
 */
package uma.tests;

import junit.textui.TestRunner;

import uma.DisciplineGrouping;
import uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discipline Grouping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisciplineGroupingTest extends ContentCategoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisciplineGroupingTest.class);
	}

	/**
	 * Constructs a new Discipline Grouping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplineGroupingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discipline Grouping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DisciplineGrouping getFixture() {
		return (DisciplineGrouping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createDisciplineGrouping());
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

} //DisciplineGroupingTest
