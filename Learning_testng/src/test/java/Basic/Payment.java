package Basic;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Payment {
	
	@Test(groups = "smoke")
	public void creditCard()
	{
		System.out.println("Credit cardayment");
	}
	
	@Test(groups = {"sanity"})
	public void debitCard()
	{
		System.out.println("Debit card payment");
		assertTrue(false);
	}
	
	
	@Test
	public void cod()
	{
		System.out.println("cod payment");
	}

}
