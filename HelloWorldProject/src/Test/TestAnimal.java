package Test;

import junit.framework.TestCase;
import Animal.Animal;

public class TestAnimal extends TestCase {

	public void testSetNameSameAsGetName() 
	{
		String name = "Bobo";
		Animal monkey = new Animal(name);
		
		assertEquals(name, monkey.getName());
	}

}
