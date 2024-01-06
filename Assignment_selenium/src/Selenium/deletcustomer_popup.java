package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.DriverConnection;

public class deletcustomer_popup {
	
	public static void main(String[] args) {
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/delete_customer.php");
		
		 driver.findElement(By.name("submit")).click();

	
	        Alert alert = driver.switchTo().alert();

	  
	        String alertText = alert.getText();
	        System.out.println("Alert Text: " + alertText);

	   
	        alert.accept();
	}

}
