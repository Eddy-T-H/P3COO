package city;


/**
 * <!-- begin-user-doc -->
 * Inhabitant class
 * <!--  end-user-doc  -->
 * @generated
 */

public class Inhabitant
{
	/**
	 * <!-- begin-user-doc -->
	 * Name of the inhabitant
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private String name;
	
	/**
	 * <!-- begin-user-doc -->
	 * His BankAccount
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private BankAccount account;

	/**
	 * <!-- begin-user-doc -->
	 * His City
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private City city;
	

	/**
	 * <!-- begin-user-doc -->
	 * Builder for inhabitant
	 * @param name his name
	 * @param account his account
	 * @param town his city
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Inhabitant(String name, BankAccount account, City town){
		this.name=name;
		this.account=account;
		this.city = town;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Credits the inhabitant BankAccount
	 * @param amount amount to be credited
	 * @return true if successful
	 * <!--  end-user-doc  -->
	 * @generated
	 */	
	public boolean creditInhabitant(double amount){
		return this.account.credit(amount);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Debits the inhabitant BankAccount
	 * @param amount amount to be debited
	 * @return true if successful
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public boolean debitInhabitant(double amount){
		return this.account.debit(amount);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Getter for the amound on the BankAccount
	 * @return amount of money
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getAccountAmount(){
		return this.account.getAmount();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Getter for the name of the inhabitant
	 * @return name of the inhabitant
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 *  Getter for the city of the inhabitant
	 * @return city of the inhabitant
	 */
	public City getCity() {
		return city;
	}
	
}

