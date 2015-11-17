package letter;

import city.Inhabitant;
import content.Text;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class AoR extends Letter<Text>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public AoR(Inhabitant sender, Inhabitant receiver){
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
		if(super.inBox){
			System.out.println(	"<- " + getReceiverName() + " receives an AOR whose content is a text content (" + this.getContent().toString() +")" + " from " + getSenderName());
		}else{
			System.out.println(	"-> " + getSenderName() + " mails an AOR whose content is a text content (" + this.getContent().toString() +")" + " to " + getReceiverName() + " for a cost of "+ super.cost);
			inBox=true;
		}
	}
	
}

