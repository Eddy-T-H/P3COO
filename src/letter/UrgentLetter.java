package letter;

import java.lang.reflect.Type;

import exception.NullOrNegativCostException;
import exception.UrgentLetterException;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class UrgentLetter<T extends Letter<?>> extends DecoratorLetter
{
	/**
	 * <!-- begin-user-doc -->
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
		super.letter.addCost(super.letter.getCost());
		super.letter.typeLetter= "an urgent letter whose content is " + super.letter.typeLetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void toDo() {
		super.letter.toDo();
	}
	
}

