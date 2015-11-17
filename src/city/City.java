package city;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import content.*;
import letter.*;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class City
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private String name;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private List<Inhabitant> inhabs;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int days;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private Set<Letter<?>> postBox;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public City(){
		this.inhabs = new ArrayList<>();
		this.postBox= new HashSet<>();
	}
	
	public boolean addInhabitant(Inhabitant inhab){
		return this.inhabs.add(inhab);
	}
	
	public boolean addInhabitants(List<Inhabitant> inhabs){
		return this.inhabs.addAll(inhabs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void distributeLetters() {
		for(Letter<?> letter : postBox){
			letter.toDo();
		}
		postBox.clear();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public boolean sendLetter(Letter<?> letter) {
		letter.toDo();
		return this.postBox.add(letter);	
	}
	
	public static void main(String[] args){
		BankAccount senderBankAccount = new BankAccount(411.);
		BankAccount receiverBankAccount = new BankAccount(411.);
		Inhabitant sender = new Inhabitant("inhab 1", senderBankAccount);
		Inhabitant receiver = new Inhabitant("inhab 2", receiverBankAccount);
		Content text = new Text("coucou");
		Content money = new Money(20.);
		Letter<Text> letter= new SimpleLetter(sender, receiver,text);
		Letter<Money> letter1= new PromissoryNote(sender, receiver,money);
		City city = new City();
		city.addInhabitant(sender);
		city.addInhabitant(receiver);
		city.sendLetter(letter);
		city.sendLetter(letter1);
		city.distributeLetters();
	}
}

