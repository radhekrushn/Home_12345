package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utill.DriverConnection;

public class MouseEvent {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/drag_drop.html");
		 
		 WebElement form = driver.findElement(By.xpath("//div[@id = 'products']/div/ul/li[5]"));
		 
		 WebElement to = driver.findElement(By.id("bank"));
		 
		 Actions builder = new Actions(driver);
         builder.dragAndDrop(form, to).build().perform();
		
		
			
	}

}
