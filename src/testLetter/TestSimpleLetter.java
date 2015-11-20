package testLetter;

import content.Text;
import letter.SimpleLetter;

public class TestSimpleLetter extends TestLetterAbstract<Text>{
	protected void setUp() throws Exception{
		super.setUp();
		super.content = new Text("Hello world");
		letter = new SimpleLetter(sender,receiver,this.content);
	}
	protected void tearDown() throws Exception{
		super.tearDown();
		super.letter=null;
	}

	public static void main (String[] args ){
		TestLetterAbstract<Text> simpleLetterTest = new TestSimpleLetter();
		simpleLetterTest.run();
	}
}
