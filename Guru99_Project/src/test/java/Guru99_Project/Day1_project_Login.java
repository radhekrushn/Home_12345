package Guru99_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class Day1_project_Login {
	
	@Test
	public void logintest()
	
	
	{
		
		System.setProperty("WebDriver.gecko.Driver", "C:\\Hinal\\geckowebdriver fol ff\\geckodriver.exe\\");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/");
		
		
		
		//WebDriver driver = new DriverConnection().connect("https://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr546164");
		driver.findElement(By.name("password")).sendKeys("sydadas");
		driver.findElement(By.name("btnLogin")).click();
	}
	

		
		
		

}
