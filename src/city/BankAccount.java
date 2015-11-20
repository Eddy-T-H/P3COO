package city;


/**
 * <!-- begin-user-doc -->
 * BankAccount Class
 * <!--  end-user-doc  -->
 * @generated
 */

public class BankAccount
{
	/**
	 * <!-- begin-user-doc -->
	 * Amount on the account
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private double amount;
	
	/**
	 * <!-- begin-user-doc -->
	 * Builder
	 * @param amount amount of money
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BankAccount(double amount){
		this.amount=amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Tries to take an amount of money on the account
	 * @param amount money to be taken
	 * @return true if successful
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public boolean debit(double amount) {
		if(amount<=this.amount){
			this.amount-=amount;
			return true;
		}else{
			return false;
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Tries to add an amount of money on the account
	 * @param amount money to be added
	 * @return true if successful
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public boolean credit(double amount) {
		if(amount > 0){
			this.amount+=amount;
			return true;
		}else{
			return false;	
		}
	}
	
	/**
	 * Getter for the amount
	 * @return amount
	 */
	public double getAmount(){
		return this.amount;
	}
}

