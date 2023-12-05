package com;


import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.DriverConnection;

public class mytest {
	
	static WebDriver driver = null;
	@BeforeClass
	public static void setup()
	{
		 driver = DriverConnection.connect("https://demo.guru99.com/test/newtours/index.php");
		
	}
	
	@Test
	public void home()
	{
		driver.findElement(By.linkText("Home")).click();
	}

	@Test
	public void flights()
	{
		driver.findElement(By.linkText("Flights")).click();
	}
	
	

	@Test
	public void hotel()
	{
		driver.findElement(By.linkText("Hotels")).click();
	}

	@After
	public void afterTest()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}


}
