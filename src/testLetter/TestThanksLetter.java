package testLetter;

import content.Text;
import letter.ThanksLetter;

public class TestThanksLetter extends TestLetterAbstract<Text>{
	protected void setUp() throws Exception{
		super.setUp();
		super.content = new Text("Hello world");
		letter = new ThanksLetter(sender,receiver,this.content);
	}
	protected void tearDown() throws Exception{
		super.tearDown();
		super.letter=null;
	}

	public static void main (String[] args ){
		TestLetterAbstract<Text> thanksLetterTest = new TestThanksLetter();
		thanksLetterTest.run();
	}
}
