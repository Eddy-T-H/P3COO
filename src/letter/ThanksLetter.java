package letter;

import city.Inhabitant;
import content.*;

/**
 * ThanksLetter class
 *
 */
public class ThanksLetter extends Letter<Text> {
	
	/**
	 * Builder
	 * @param sender sender of the letter
	 * @param reveiver receiver of the letter
	 * @param Content of the letter (expected Text)
	 */
	public ThanksLetter(Inhabitant sender, Inhabitant receiver, Content content){
		super(content);
		super.cost=1;
		super.sender=sender;
		super.receiver=receiver;
		super.typeLetter="a thanks letter ";
	}
	
	
	/**
	 * Do the action of the letter and prints the details
	 */
	public void toDo(){
		super.toDo();
		if(!super.inBox){
			inBox=true;
		}
	}

}
