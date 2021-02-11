/**
 */
package org.eclipse.epf.uma.tests;

import junit.textui.TestRunner;

import org.eclipse.epf.uma.ContentDescription;
import org.eclipse.epf.uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Content Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentDescriptionTest extends MethodUnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContentDescriptionTest.class);
	}

	/**
	 * Constructs a new Content Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Content Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContentDescription getFixture() {
		return (ContentDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createContentDescription());
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

} //ContentDescriptionTest
