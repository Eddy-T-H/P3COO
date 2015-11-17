package letter;

import city.Inhabitant;
import content.Content;
import content.Text;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class AoR extends Letter<Text>{
	/**
	 * <!-- begin-user-doc -->
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

