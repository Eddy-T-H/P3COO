package testCity;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import city.City;
import city.Inhabitant;
import content.Content;
import content.Text;
import junit.framework.TestCase;
import letter.Letter;
import letter.SimpleLetter;

public class CityTest extends TestCase {
	
	protected City city;
	protected Letter<?> letter;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected Content content;
	
		
	protected void setUp() throws Exception {
		super.setUp();
		city=new City();
		content= new Text("whatever");
		sender= new Inhabitant("sender",null,city);
		receiver= new Inhabitant ("receiver",null,city);
		letter = new SimpleLetter(sender,receiver,content);
		
		city.addInhabitant(sender);
		city.addInhabitant(receiver);
		city.setDays(10);
	}
	protected void tearDown() throws Exception {
		super.tearDown();
		city=null;
		letter=null;
		sender=receiver=null;
		content=null;
	}

	@Test
	public void testAddInhabitant() {
		assertTrue(new City().addInhabitant(new Inhabitant("testAddInhabitant", null, new City())));
	}

	@Test
	public void testAddInhabitants() {
	
		List<Inhabitant> inhab = new ArrayList<>();
		inhab.add(new Inhabitant("1", null, city));
		inhab.add(new Inhabitant("2", null, city));
		inhab.add(new Inhabitant("3", null, city));
		assertTrue(city.addInhabitants(inhab));
	
	}



	@Test
	public void testSendLetter() {
		assertTrue(city.sendLetter(letter));
	}

	@Test
	public void testSendAoR() {
		assertTrue(city.sendAoR(letter));	}

	@Test
	public void testGetDays() {
		assertEquals(city.getDays(),10);
	}

	@Test
	public void testSetDays() {
		int d = 11;
		city.setDays(d);
		assertEquals(city.getDays(),d);
	}

	@Test
	public void testGetInhabitant() {
		assertEquals(city.getInhabitant(0),sender);
	}

	

}
