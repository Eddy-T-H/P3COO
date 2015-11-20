package letter;


/**
 * <!-- begin-user-doc -->
 * DecoratorLetter class
 * Decorator Pattern
 * Used to define a letter as urgent or registered
 * <!--  end-user-doc  -->
 * @generated
 */

@SuppressWarnings("rawtypes")
public abstract class DecoratorLetter extends Letter
{
	
	/**
	 * <!-- begin-user-doc -->
	 * Letter that is registered and/or marked as urgent
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected Letter<?> letter;

	/**
	 * <!-- begin-user-doc -->
	 * Builder
	 * @param letter that will be decorated
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public DecoratorLetter(Letter<?> letter){
		super(letter.content);
		this.letter = letter;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Do the action of the letter and prints the details
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public abstract void toDo();	
	
	
}

