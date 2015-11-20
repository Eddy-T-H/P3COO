package testCity;

import static org.junit.Assert.*;

import org.junit.Test;

import city.BankAccount;
import city.City;
import city.Inhabitant;
import content.Content;
import content.Text;
import junit.framework.TestCase;
import letter.Letter;
import letter.SimpleLetter;

public class InhabitantTest extends TestCase{
	protected City city;
	protected BankAccount account;
	protected Inhabitant sender;
	
	
		
	protected void setUp() throws Exception {
		super.setUp();
		city=new City();
		account=new BankAccount(100);
		sender= new Inhabitant("sender",account,city);
		city.addInhabitant(sender);
		
		
	}
	protected void tearDown() throws Exception {
		
		city=null;
		account=null;
		sender=null;
	}	
	@Test
	public void testInhabitant() {
		assertEquals(sender.getAccountAmount(),account);
		assertEquals(sender.getCity(),city);
		assertEquals(sender.getName(),"sender");

		
	}

	@Test
	public void testCreditInhabitant() {
		sender.creditInhabitant(50);
		assertEquals(sender.getAccountAmount(),150);
	}

	@Test
	public void testDebitInhabitant() {
		assertFalse(sender.debitInhabitant(150));
		sender.debitInhabitant(50);
		assertEquals(sender.getAccountAmount(),50);
	}

	@Test
	public void testGetAccountAmount() {
		
		assertEquals(sender.getAccountAmount(),100);
	}

	@Test
	public void testGetName() {
		assertEquals(sender.getName(),"sender");
	}

	@Test
	public void testGetCity() {
		assertEquals(sender.getCity(),city);
	}

}
