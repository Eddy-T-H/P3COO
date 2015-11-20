package testCity;

import org.junit.Test;

import city.BankAccount;
import junit.framework.TestCase;

public class TestBankAccount extends  TestCase {

	protected BankAccount account ;
	
	protected void setUp() throws Exception{
		super.setUp();
		account=new BankAccount(10);
		
	}
	

	protected void tearDown() throws Exception {
		super.tearDown();
		account=null;
	}
	
	@Test
	protected void testgetAmount(){
		assertEquals(account.getAmount(),10);
	}
	
	@Test
	protected void testDebitToHight(){
		assertFalse(account.debit(20));
		assertEquals(account.getAmount(),10);
	}
	@Test
	protected void testDebit(){
		assertTrue(account.debit(5));
		assertEquals(account.getAmount(),5);
	}
	
	@Test
	protected void testCreditNegativ(){
		assertFalse(account.credit(-2));
		assertEquals(account.getAmount(),10);
	}
	@Test
	protected void testCredit(){
		assertTrue(account.credit(5));
		assertEquals(account.getAmount(),15);
	}
	
	public static void main(String[] args){
		TestBankAccount test =new TestBankAccount();
		test.run();
	}
}

