package com;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageobject.homepage;
import pageobject.loginpage;

public class Day1_2 extends base {
	
	@Test
	public void logincheck()
	{
		driver = driverSetUp();
		loginpage log = new loginpage(driver);
		log.username("mngr546164");
		log.password("sydadas");
		log.loginBtn();
		
		
		homepage home = new homepage(driver);
		String actualTitle = home.getPageTitle();
		String expectedTitle = "Guru99 Bank Manager HomePage";
		assertEquals(actualTitle,expectedTitle);		
		
		
	}

}
