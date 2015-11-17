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
		super(content);
		super.cost=1;
		super.sender=sender;
		super.receiver=receiver;
		super.typeLetter="a simple letter ";
	}

	/**
	 * <!-- begin-user-doc -->
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