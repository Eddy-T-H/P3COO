package letter;

import city.Inhabitant;
import content.*;

public class ThanksLetter extends Letter<Text> {
	ThanksLetter(Inhabitant sender, Inhabitant receiver, Content content){
		super(content);
		super.cost=1;
		super.sender=sender;
		super.receiver=receiver;
		super.typeLetter="a thanks letter ";
	}
	
	public void toDo(){
		super.toDo();
		if(!super.inBox){
			inBox=true;
		}
	}

}
