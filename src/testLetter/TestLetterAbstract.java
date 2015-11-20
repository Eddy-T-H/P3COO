package testLetter;

import org.junit.Test;

import content.*;
import exception.NullOrNegativCostException;
import junit.framework.TestCase;
import letter.*;
import city.*;

public abstract class TestLetterAbstract<T extends Content> extends TestCase{
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
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
		this.city		= null;
		this.b_receiver = null;
		this.b_sender 	= null;
		this.receiver 	= null;
		this.sender		= null;
	}
	
	@Test
	public void testGetTypeContent(){
		assertEquals(this.letter.getContentType(),this.content.getTypeOfContent());
	}
	
	@Test
	public void testGetValueOfContent(){
		assertEquals(this.letter.getContent().toString(),this.content.toString());
	}
	
	@Test
	public void testIsInstanceOf(){
		assertTrue(this.letter instanceof Letter<?>);
		if(content instanceof Text){
			assertTrue(this.letter instanceof SimpleLetter || this.letter instanceof ThanksLetter || this.letter instanceof AoR);
		}else{
			assertTrue(this.letter instanceof PromissoryNote);
		}
	}
	
	@Test
	public void testDebitWhenSend(){
		city.sendLetter(letter);
		assertEquals(sender.getAccountAmount(),100-letter.getCost());
	}
	
	@Test
	public void testPriceHigherThanZero(){
		assertTrue(letter.getCost()>0);
	}
	
	@Test
	public void testAddCostWithPositivAmount(){
		double cost = letter.getCost();
		try {
			letter.addCost(1);
		} catch (NullOrNegativCostException e) {
		}
		assertEquals(letter.getCost(),cost+1);
	}
	
	@Test(expected = NullOrNegativCostException.class)
	public void testAddCostWithNegativAmountToReachACostOfZero(){
		try {
			letter.addCost(-letter.getCost());
		} catch (NullOrNegativCostException e) {
		}
	}
	
	@Test(expected = NullOrNegativCostException.class)
	public void testAddCostWithNegativAmountToReachNegativCost(){
		try {
			letter.addCost(-(letter.getCost()+1));
		} catch (NullOrNegativCostException e) {
		}
	}
	
	@Test
	public void testGetSenderName(){
		assertEquals(letter.getSenderName(),sender.getName());
	}
	
	@Test
	public void testGetReceiverName(){
		assertEquals(letter.getReceiverName(),receiver.getName());
	}
	
	
}
