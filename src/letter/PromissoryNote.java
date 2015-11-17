package letter;

import city.Inhabitant;
import content.Content;
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
	public PromissoryNote(Inhabitant sender, Inhabitant receiver,Content content){
		super.cost=1+0.01*((Money)content).getValue();
		super.sender=sender;
		super.receiver=receiver;
		super.content=(Money)content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void toDo() {
		if(super.inBox){
			System.out.println(	"<- " + getReceiverName() + " receives a promissory letter whose content is a money content (" + super.content.toString() +")" + " from " + getSenderName());
			super.sender.debitInhabitant(super.content.getValue());
			System.out.println("  -" + super.content.getValue() + " euro is debitted from " + getSenderName() + " account who balance is now " + super.sender.getAccountAmount());
			super.receiver.creditInhabitant(super.content.getValue());
			System.out.println("  +" + getReceiverName() + " account is credited with " + super.content.toString() + "; its balance is now " + super.receiver.getAccountAmount());
		}else{
			System.out.println(	"-> " + getSenderName() + " mails a promissory letter whose content is a money content (" + super.content.toString() +")" + " to " + getReceiverName() + " for a cost of "+ super.cost);
			super.sender.debitInhabitant(this.cost);
			System.out.println("  -" + super.cost + " euro is debitted from " + getSenderName() + " account who balance is now " + super.sender.getAccountAmount());
			inBox=true;
		}	
	}
	
}

