package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.keyword.engine.keywordengine;

import utill.DriverConnection;

public class keywordframe {
	
	WebDriver driver =null;
	@BeforeClass
	public void setup()
	{
		 driver = DriverConnection.connect("https://app.hubspot.com/login");
	}
	
	
	public class logintest{
		
		public keywordengine keywordengine;
		@Test
		public void logintest() {
			keywordengine = new keywordengine();
			keywordengine.startExcution("login");
		}
	}

}
