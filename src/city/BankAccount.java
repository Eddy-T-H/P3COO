package city;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class BankAccount
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private double amount;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BankAccount(double amount){
		this.amount=amount;
	}

	/**
	 * <!-- begin-user-doc -->
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
	
	public double getAmount(){
		return this.amount;
	}
}

