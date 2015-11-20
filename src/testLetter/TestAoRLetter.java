package testLetter;

import org.junit.Test;

import content.Text;
import letter.AoR;

public class TestAoRLetter extends TestLetterAbstract<Text>{
	protected void setUp() throws Exception{
		super.setUp();
		super.content = new Text("Hello world");
		letter = new AoR(sender,receiver,this.content);
	}
	protected void tearDown() throws Exception{
		super.tearDown();
		super.letter=null;
	}
	
	@Test
	@Override
	public void testPriceHigherThanZero(){
		assertEquals(0.,letter.getCost());
	}

	public static void main (String[] args ){
		TestLetterAbstract<Text> aorLetterTest = new TestAoRLetter();
		aorLetterTest.run();
	}
}
