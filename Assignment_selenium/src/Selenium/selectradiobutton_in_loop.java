package Selenium;



import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class selectradiobutton_in_loop {
	
	public static void main(String[] args) {
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/radio.html");
		
	
		  {
		  
              List<WebElement> radioButtons = driver.findElements(By.name("webform"));

		        
		        for (WebElement radioButton : radioButtons) {
		            radioButton.click();

		         
		            try {
		                Thread.sleep(2000);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		    }

		 
		
		
		
	}

}
