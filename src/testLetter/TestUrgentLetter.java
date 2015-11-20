package testLetter;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.NullOrNegativCostException;
import exception.UrgentLetterException;
import letter.SimpleLetter;
import letter.UrgentLetter;

public class TestUrgentLetter extends TestDecoratorLetter{
	
	protected void setUp() throws Exception{
		super.setUp();
	
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();

	}
	@Test
	public void testPriceRise(){
		UrgentLetter<SimpleLetter> urgent;
		try {
			urgent = new UrgentLetter<>(letter);
			assertEquals(urgent.getCost(),2.);
		} catch (NullOrNegativCostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UrgentLetterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	@Test(expected =UrgentLetterException.class)
	public void testCantUrgent(){
		try {
			new UrgentLetter<>(new UrgentLetter<>(letter));
		} catch (NullOrNegativCostException e) {
			// TODO Auto-generated catch block
			
		} catch (UrgentLetterException e) {
			// TODO Auto-generated catch block
			
		}
	}
	

}
