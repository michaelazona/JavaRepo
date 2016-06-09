package JUnitTest;

import junit.framework.TestCase;
import Code.Customer;

public class UnitTest extends TestCase
{
	public void testGetCustomerName() 
	{
		Customer customer1 = new Customer();
		customer1.setFirstName("Bob");
		customer1.setLastName("Man");
		assertEquals("Bob Man", customer1.getCustomerName());
		
		Customer customer2 = new Customer();
		customer2.setFirstName("Bob");
		assertEquals("Bob N/A", customer2.getCustomerName());
		
		Customer customer3 = new Customer();
		customer3.setLastName("Man");
		assertEquals("N/A Man", customer3.getCustomerName());
		
		Customer customer4 = new Customer();
		assertEquals("N/A N/A", customer4.getCustomerName());
	}

}
