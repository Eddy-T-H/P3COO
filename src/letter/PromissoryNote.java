package letter;

import city.Inhabitant;
import content.Content;
import content.Money;
import content.Text;

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
		super(content);
		super.cost=1+0.01*((Money)content).getValue();
		super.sender=sender;
		super.receiver=receiver;
		super.typeLetter="a promissory note letter ";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void toDo() {
		super.toDo();
		if(super.inBox){
			super.sender.debitInhabitant(super.content.getValue());
			System.out.println("  -" + super.content.getValue() + " euro is debitted from " + getSenderName() + " account who balance is now " + super.sender.getAccountAmount());
			super.receiver.creditInhabitant(super.content.getValue());
			System.out.println("  +" + getReceiverName() + " account is credited with " + super.content.toString() + "; its balance is now " + super.receiver.getAccountAmount());
			//ajout d'une thanks letter dans l'inbox
			ThanksLetter aor = new ThanksLetter(super.receiver, super.sender, super.content);
			String str = "thanks for " + super.typeLetter + "whose content is " + super.typeContent + "(" + super.content.toString() + ")";
			aor.content = new Text(str);
			super.receiver.getCity().sendAoR(aor);
		}else
			inBox=true;
	}	
}

