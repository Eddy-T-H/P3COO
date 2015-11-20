package testLetter;

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

public abstract class TestDecoratorLetter extends TestCase{
	protected Letter<?> letter;
	protected Content content;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected City city;
	protected BankAccount b_receiver;
	protected BankAccount b_sender;

	
	protected void setUp() throws Exception{
		super.setUp();
		this.city		 = new City();
		this.b_receiver	 = new BankAccount(100);
		this.b_sender	 = new BankAccount(100);
		this.receiver	 = new Inhabitant("receiver",this.b_receiver,this.city);
		this.sender		 = new Inhabitant("sender",this.b_sender,this.city);
		this.content	 = new Text("Hello ");
		this.letter		 = new SimpleLetter(sender, receiver, content);
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
		this.city		= null;
		this.b_receiver = null;
		this.b_sender 	= null;
		this.receiver 	= null;
		this.sender		= null;
		this.letter		= null;
	}
	
}
