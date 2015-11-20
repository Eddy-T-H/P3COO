package content;


/**
 * <!-- begin-user-doc -->
 * Text Class
 * <!--  end-user-doc  -->
 * @generated
 */
public class Text extends Content
{
	/**
	 * <!-- begin-user-doc -->
	 * Text of the text Content
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private String text;
	
	/**
	 * <!-- begin-user-doc -->
	 * Builder for text
	 * @param text text
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Text(String text){
		this.text=text;
		super.typeOfContent="a text content ";
	}

	/**
	 * <!-- begin-user-doc -->
	 * toString method
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String toString() {
		return text;	
	}
	
}

