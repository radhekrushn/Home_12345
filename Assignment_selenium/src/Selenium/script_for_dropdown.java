package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utill.DriverConnection;

public class script_for_dropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/newtours/register.php");
		
		  WebElement countryDropdown = driver.findElement(By.name("country"));


	        Select selectCountry = new Select(countryDropdown);

	        
	        selectCountry.selectByVisibleText("ANTARCTICA");

	       
	        try {
	            Thread.sleep(2000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

		
		
		
		
		
	}

}
