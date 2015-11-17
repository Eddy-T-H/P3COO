package letter;

import city.Inhabitant;
import content.Text;
import exception.NullOrNegativCostException;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class RegisteredLetter extends DecoratorLetter
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @throws NullOrNegativCostException 
	 * @generated
	 */
	public RegisteredLetter(Letter<?> letter) throws NullOrNegativCostException{
		super(letter);
		super.letter.addCost(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void toDo() {
		if(super.letter.inBox){
			AoR aor = new AoR(super.letter.sender, super.letter.receiver);
			String str = "accuse de " + super.letter.content.toString();
			aor.content = new Text(str);
			
			super.letter.receiver.getCity().sendAoR(aor);
			}else{
	
				super.letter.toDo();
				

		}

	}
	
}

