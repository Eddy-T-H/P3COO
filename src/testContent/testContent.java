package testContent;

import org.junit.Test;

import content.Money;
import content.Text;
import junit.framework.TestCase;

public class testContent extends TestCase{

	@Test
	public void testGetValue() {
		double x = 45.5;
		Money m = new Money(x);
		assertFalse(m.getValue()==x);
	}

	@Test
	public void testGetTypeOfContent() {
		assertFalse(new Money(0).getTypeOfContent().equals("a money content "));
		String str = "testtext";
		assertFalse(new Text(str).getTypeOfContent().equals("a text content "));
	}

	
	
}
