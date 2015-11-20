package letter;

import city.Inhabitant;
import content.Content;
import content.Text;

/**
 * <!-- begin-user-doc -->
 * AoR Class
 * <!--  end-user-doc  -->
 * @generated
 */

public class AoR extends Letter<Text>{
	/**
	 * <!-- begin-user-doc -->
	 * Builder
	 * @param sender sender of the letter
	 * @param receiver receiver of the letter
	 * @content Content of the letter
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public AoR(Inhabitant sender, Inhabitant receiver, Content content){
		super(content);
		super.cost=0;
		super.sender=sender;
		super.receiver=receiver;
		super.typeLetter="an acknowledgement of receipt ";
	}

	/**
	 * <!-- begin-user-doc -->
	 * Do the action of the letter and prints the details
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void toDo(){
		super.toDo();
		if(!super.inBox){
			inBox=true;
		}
	}
}

