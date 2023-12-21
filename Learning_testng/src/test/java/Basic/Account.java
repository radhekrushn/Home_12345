package Basic;

import org.testng.annotations.Test;

public class Account {
	

	@Test
	public void savingAccount()
	{
		System.out.println("Running saving account");
	}
	
	@Test(groups = "sanity")
	public void currentAccout()
	{
		System.out.println("Runing cuyrrent account");
	}
	
	@Test(groups = "smoke")
	public void loanAccount()
	{
		System.out.println("Runinng loan account");
	}


}
