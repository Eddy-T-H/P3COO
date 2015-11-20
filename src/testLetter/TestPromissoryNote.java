package testLetter;

import org.junit.Test;

import content.Money;
import letter.PromissoryNote;

public class TestPromissoryNote extends TestLetterAbstract<Money> {
	protected void setUp() throws Exception{
		super.setUp();
		super.content = new Money(10);
		super.letter = new PromissoryNote(sender,receiver,this.content);
	}
	protected void tearDown() throws Exception{
		super.tearDown();
		letter=null;
	}
	
	@Test
	public void testDebitSender(){
		double amount = sender.getAccountAmount();
		city.sendLetter(letter);
		amount -= letter.getCost();
		assertEquals(sender.getAccountAmount(),amount);
		city.distributeLetters();
		amount -= ((Money)letter.getContent()).getValue();
		assertEquals(sender.getAccountAmount(),amount);
	}
	
	@Test
	public void testCreditReceiver(){
		double costOfThanksLetter = 1;
		city.sendLetter(letter);
		city.distributeLetters();
		assertEquals(receiver.getAccountAmount(),100+((Money)letter.getContent()).getValue()-costOfThanksLetter);
	}
	
	public static void main (String[] args ){
		TestLetterAbstract<Money> promissoryNoteLetterTest = new TestPromissoryNote();
		promissoryNoteLetterTest.run();
	}
}
