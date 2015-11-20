package content;


/**
 * <!-- begin-user-doc -->
 * Money class
 * <!--  end-user-doc  -->
 * @generated
 */

public class Money extends Content
{
	/**
	 * <!-- begin-user-doc -->
	 * amount of money
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private double money;
	
	/**
	 * <!-- begin-user-doc -->
	 * Builder for money
	 * @param amount of money
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Money(double money){
		this.money=money;
		super.typeOfContent="a money content ";
	}

	/**
	 * <!-- begin-user-doc -->
	 * toString method, prints the amount as String
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String toString() {
		return String.valueOf(money);	
	}
	
	/**
	 * Getter for the amount of money
	 * @return amount of money
	 */
	public double getValue(){
		return this.money;
	}
}

