package letter;

import exception.NullOrNegativCostException;
import exception.UrgentLetterException;

/**
 * <!-- begin-user-doc -->
 * UrgentLetter class
 * <!--  end-user-doc  -->
 * @generated
 */

public class UrgentLetter<T extends Letter<?>> extends DecoratorLetter
{
	/**
	 * <!-- begin-user-doc -->
	 * Builder
	 * @param letter letter that will be marked as urgent
	 * <!--  end-user-doc  -->
	 * @throws NullOrNegativCostException 
	 * @throws UrgentLetterException 
	 * @generated
	 */

	public UrgentLetter(Letter<?> letter) throws NullOrNegativCostException, UrgentLetterException{
		super(letter);
		Letter<?> letterTest=letter;
		while(letterTest instanceof DecoratorLetter){
			if(letterTest instanceof UrgentLetter){
				throw new UrgentLetterException();
			}
			else{
				letterTest=((DecoratorLetter)letterTest).letter;
			}
		}
		super.cost=letter.cost;
		super.addCost(super.letter.getCost());
		super.typeLetter= "an urgent letter whose content is " + super.letter.typeLetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Do the action of the letter and prints the details
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void toDo() {
		super.letter.toDo();
	}
	
}

