/**
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.GraphNode#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see uma.UmaPackage#getGraphNode()
 * @model
 * @generated
 */
public interface GraphNode extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' reference.
	 * @see #setSize(Dimension)
	 * @see uma.UmaPackage#getGraphNode_Size()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dimension getSize();

	/**
	 * Sets the value of the '{@link uma.GraphNode#getSize <em>Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Dimension value);

} // GraphNode
