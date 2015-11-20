package city;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import content.*;
import exception.NullOrNegativCostException;
import exception.UrgentLetterException;
import letter.*;

/**
 * <!-- begin-user-doc -->
 * City class
 * <!--  end-user-doc  -->
 * @generated
 */
public class City
{
	/**
	 * <!-- begin-user-doc -->
	 * Name of the city
	 * Unused but required in the instructions
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private String name;
	
	/**
	 * <!-- begin-user-doc -->
	 * Inhabitants of the city
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private List<Inhabitant> inhabs;
	
	/**
	 * <!-- begin-user-doc -->
	 * Amount of days of the simulation
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int days;
	
	/**
	 * <!-- begin-user-doc -->
	 * Box where the letters are placed and will be sent.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private Set<Letter<?>> postBox;
	
	/**
	 * <!-- begin-user-doc -->
	 * Box for the letters that are send as a response (aor, thanksletter)
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private Set<Letter<?>> aorBox;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * Builder for city
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public City(){
		this.inhabs = new ArrayList<>();
		this.postBox= new HashSet<>();
		this.aorBox = new HashSet<>();
	}
	
	/**
	 * Adds an inhabitant
	 * @param inhab inhabitant to be added
	 * @return true if successful
	 */
	public boolean addInhabitant(Inhabitant inhab){
		return this.inhabs.add(inhab);
	}
	
	/**
	 * Adds several inhabitants
	 * @param inhabs list of inhabitants to be added
	 * @return true if successful
	 */
	public boolean addInhabitants(List<Inhabitant> inhabs){
		return this.inhabs.addAll(inhabs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Distribute all the letters of the postBox, then clear it and do the same for the aorBox
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void distributeLetters() {
		for(Letter<?> letter : postBox){
			letter.toDo();
		}
		postBox.clear();
		for(Letter<?> letter : aorBox){
			letter.toDo();
		}
		aorBox.clear();
	}
	

	
	/**
	 * <!-- begin-user-doc -->
	 * Sends a letter (= adds it to the postBox)
	 * @param letter letter to be send
	 * @return true if successful
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public boolean sendLetter(Letter<?> letter) {
		letter.toDo();
		return this.postBox.add(letter);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Send an aor or a thanksletter
	 * @param letter letter to be send
	 * @return true if successful
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public boolean sendAoR(Letter<?> letter) {
		letter.toDo();
		return this.aorBox.add(letter);
	}
	
	
	/**
	 * Getter for days
	 * @return days of the simulation
	 */
	public int getDays(){
		return this.days;
	}
	
	/**
	 * Setter for days
	 * @param days days of the simulation
	 */
	public void setDays(int days){
		this.days=days;
	}
	
	/**
	 * Gets an inhabitant by id
	 * @param id id of the inhabitant
	 * @return inhabitant asked for
	 */
	public Inhabitant getInhabitant(int id){
		return this.inhabs.get(id);
	}
	
	/**
	 * MAIN
	 * 
	 * Launches the simulation
	 * 
	 * @param args
	 * @throws NullOrNegativCostException
	 * @throws UrgentLetterException
	 */
	public static void main(String[] args) throws NullOrNegativCostException, UrgentLetterException{
		City city = new City();
		city.setDays(7);
		Random rand = new Random();
		for(int i=0;i<100;i++){
			city.addInhabitant(new Inhabitant("inhab" + i, new BankAccount(rand.nextInt(1000)), city)); 
		}
		for(int i=1;i<city.getDays();i++){
			System.out.println("***********************************");
			System.out.println("Day " + i);
			city.distributeLetters();
			
			int numberOfLetter = rand.nextInt(9)+1;
			for(int j=0;j<numberOfLetter;j++){
				int sender;
				int receiver;
				int type;
				sender = rand.nextInt(100);
				receiver = rand.nextInt(100);
				type = rand.nextInt(7);
				switch(type){
				case 0 :
					city.sendLetter(new UrgentLetter<>(new RegisteredLetter(new PromissoryNote(city.getInhabitant(sender), city.getInhabitant(receiver), new Money(rand.nextInt(100))))));
					break;
				case 1 :
					city.sendLetter(new RegisteredLetter(new UrgentLetter<>(new PromissoryNote(city.getInhabitant(sender), city.getInhabitant(receiver), new Money(rand.nextInt(100))))));
					break;
				case 2 :
					city.sendLetter(new RegisteredLetter(new SimpleLetter(city.getInhabitant(sender), city.getInhabitant(receiver), new Text("Lettre reco no " + Letter.id))));
					break;
				case 3 :
					city.sendLetter(new SimpleLetter(city.getInhabitant(sender), city.getInhabitant(receiver), new Text("Lettre reco no " + Letter.id)));
					break;
				case 4 :
					city.sendLetter(new UrgentLetter<>(new SimpleLetter(city.getInhabitant(sender), city.getInhabitant(receiver), new Text("Lettre no " + Letter.id))));
					break;
				case 5 :
					city.sendLetter(new PromissoryNote(city.getInhabitant(sender), city.getInhabitant(receiver), new Money(rand.nextInt(100))));
					break;
				case 6 :
					city.sendLetter(new SimpleLetter(city.getInhabitant(sender), city.getInhabitant(receiver), new Text("Lettre reco no " + Letter.id)));
					break;

				}
			}
		}
	}
}

