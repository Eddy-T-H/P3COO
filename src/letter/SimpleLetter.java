package letter;

import city.Inhabitant;
import content.Content;
import content.Text;

/**
 * <!-- begin-user-doc -->
 * SimpleLetter class
 * <!--  end-user-doc  -->
 * @generated
 */

public class SimpleLetter extends Letter<Text>
{
	/**
	 * <!-- begin-user-doc -->
	 * Builder
	 * @param sender sender of the letter
	 * @param reveiver receiver of the letter
	 * @param Content of the letter (expected Text)
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Content content){
		super(content);
		super.cost=1;
		super.sender=sender;
		super.receiver=receiver;
		super.typeLetter="a simple letter ";
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
		if(!super.inBox)
				super.inBox=true;
	}
	
}