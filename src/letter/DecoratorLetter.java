package letter;

import city.Inhabitant;
import exception.NullOrNegativCostException;

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
		this.sender = letter.sender;
		this.receiver = letter.receiver;
		this.typeContent = letter.typeContent;
		this.typeLetter = letter.typeLetter;
	}
	
	public String getSenderName(){
		return this.letter.getSenderName();
	}
	
	public String getReceiverName(){
		return this.letter.getReceiverName();
	}
	
	public void setTypeLetter(String str){
		this.letter.typeLetter=str;
	}
	
	public String getTypeLetter(){
		return this.typeLetter;
	}
	
	public void addCost(double bitsch) throws NullOrNegativCostException{
		this.letter.addCost(bitsch);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Do the action of the letter and prints the details
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void toDo(){
		letter.toDo();
	}
	
	
}

