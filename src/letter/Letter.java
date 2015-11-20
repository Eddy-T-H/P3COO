package letter;

import city.Inhabitant;
import content.Content;
import exception.NullOrNegativCostException;

/**
 * <!-- begin-user-doc -->
 * Letter class
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class Letter<T extends Content>
{
	/**
	 * <!-- begin-user-doc -->
	 * Inhabitant who sent the letter
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected Inhabitant sender;
	
	/**
	 * <!-- begin-user-doc -->
	 * Type of the letter
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected String typeLetter;
	
	/**
	 * <!-- begin-user-doc -->
	 * Type of the content
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected String typeContent;
	
	/**
	 * <!-- begin-user-doc -->
	 * unique id of the letter
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public static int id=0;
	
	/**
	 * <!-- begin-user-doc -->
	 * Inhabitant who receives the letter
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected Inhabitant receiver;
	
	/**
	 * <!-- begin-user-doc -->
	 * Price of the letter
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected double cost;
	
	/**
	 * <!-- begin-user-doc -->
	 * Content of the letter
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected T content;
	
	/**
	 * <!-- begin-user-doc -->
	 * Mark the letter as sent
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	boolean inBox;
	
	/**
	 * Builder
	 * @param content content of the letter
	 */
	@SuppressWarnings("unchecked")
	Letter(Content content){
		id++;
		this.content=(T)content;
		this.typeContent=this.content.getTypeOfContent();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Do the action of the letter and prints the details
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
	 * Getter for cost
	 * @return cost of the letter
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public double getCost() {
		return this.cost;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Adds an amount to the current cost of the letter
	 * @param cost amount to be asses
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
	
	/**
	 * Getter for the name of the sender
	 * @return name of the sender
	 */
	public String getSenderName(){
		return this.sender.getName();
	}
	
	/** 
	 * Getter for the name of the receiver
	 * @return name of the receiver
	 */
	public String getReceiverName(){
		return this.receiver.getName();
	}
	
	/**
	 * Getter for the content
	 * @return Content of the letter
	 */
	public Content getContent(){
		return this.content;
	}
}

