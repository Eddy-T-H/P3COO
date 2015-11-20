package content;


/**
 * <!-- begin-user-doc -->
 * Content class
 * <!--  end-user-doc  -->
 * @generated
 */
public abstract class Content
{
	/**
	 * String describing the type of the content. Money/Text
	 */
	protected String typeOfContent;

	/**
	 * <!-- begin-user-doc -->
	 * toString method
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public abstract String toString() ;

	/**
	 * Getter for typeOfContent
	 * @return typeOfContent
	 */
	public String getTypeOfContent() {
		return typeOfContent;
	}
}

