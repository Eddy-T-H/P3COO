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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void toDo(){
		
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

