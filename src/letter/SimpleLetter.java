package letter;

import city.Inhabitant;
import content.Content;
import content.Text;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class SimpleLetter extends Letter<Text>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Content content){
		super.cost=1;
		super.sender=sender;
		super.receiver=receiver;
		super.content=(Text) content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void toDo() {
		if(super.inBox){
			System.out.println(	"<- " + getReceiverName() + " receives a simple letter whose content is a text content (" + this.getContent().toString() +")" + " from " + getSenderName());
		}else{
			System.out.println(	"-> " + getSenderName() + " mails a simple letter whose content is a text content (" + this.getContent().toString() +")" + " to " + getReceiverName() + " for a cost of "+ super.cost);
			this.sender.debitInhabitant(this.cost);
			System.out.println("  -" + super.cost + " euro is debitted from " + getSenderName() + " account who balance is now " + this.sender.getAccountAmount());
			inBox=true;
		}
	}
	
}

