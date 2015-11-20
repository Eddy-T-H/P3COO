package letter;

import city.Inhabitant;
import content.Content;
import content.Money;
import content.Text;

/**
 * <!-- begin-user-doc -->
 * PromissoryNote class
 * <!--  end-user-doc  -->
 * @generated
 */

public class PromissoryNote extends Letter<Money>
{
	/**
	 * <!-- begin-user-doc -->
	 * Builder
	 * @param sender sender of the letter
	 * @param reveiver receiver of the letter
	 * @param Content of the letter (expected Money)
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
	 * Do the action of the letter and prints the details
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
			//adding a thanksletter in the box
			ThanksLetter aor = new ThanksLetter(super.sender, super.receiver, super.content);
			String str = "thanks for " + super.typeLetter + "whose content is " + super.typeContent + "(" + super.content.toString() + ")";
			aor.content = new Text(str);
			super.receiver.getCity().sendAoR(aor);
		}else
			inBox=true;
	}	
}

