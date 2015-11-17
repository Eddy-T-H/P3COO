package letter;

import city.Inhabitant;
import content.Content;
import exception.NullOrNegativCostException;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class Letter<T extends Content>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected Inhabitant sender;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected String typeLetter;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected String typeContent;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public static int id=0;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected Inhabitant receiver;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected double cost;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected T content;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	boolean inBox;
	
	@SuppressWarnings("unchecked")
	Letter(Content content){
		id++;
		this.content=(T)content;
		this.typeContent=this.content.getTypeOfContent();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void toDo(){
		if(this.inBox){
			System.out.println(	"<- " + getReceiverName() + " receives " + this.typeLetter + "whose content is " + this.typeContent + "("  + this.getContent().toString() +")" + " from " + getSenderName());
		}else{
			System.out.println(	"-> " + getSenderName() + " mails " + this.typeLetter + "whose content is " + this.typeContent + "(" + this.getContent().toString() + ") from " + getSenderName()+ " for a cost of "+ this.cost + " euros");
			this.sender.debitInhabitant(this.cost);
			System.out.println("  -" + this.cost + " euro is debitted from " + getSenderName() + " account whose balance is now " + this.sender.getAccountAmount());
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public double getCost() {
		return this.cost;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @throws NullOrNegativCostException 
	 * @generated
	 * @ordered
	 */
	public void addCost(double cost) throws NullOrNegativCostException {
		this.cost+=cost;
		if (this.cost<= 0)
			throw new NullOrNegativCostException();
	}
	
	public String getSenderName(){
		return this.sender.getName();
	}
	
	public String getReceiverName(){
		return this.receiver.getName();
	}
	
	public Content getContent(){
		return this.content;
	}
}

