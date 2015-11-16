package letter;

import city.Inhabitant;
import content.Money;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class PromissoryNote extends Letter<Money>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public PromissoryNote(Inhabitant sender, Inhabitant receiver,Money content){
		super.cost=0;
		super.sender=sender;
		super.receiver=receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void toDo() {
		// TODO implement me	
	}
	
}

