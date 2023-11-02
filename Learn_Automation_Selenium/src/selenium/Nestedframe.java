package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utill.DriverConnection;

public class Nestedframe {
	
	public static void main(String[] args) {
		
		
     WebDriver driver = DriverConnection.connect("https://demoqa.com/nestedframes");		
		
	 //parent frame
     WebElement pf = driver.findElement(By.id("frame1"));
     driver.switchTo().frame(pf);
     
     WebElement pf1 = driver.findElement(By.tagName("body"));
     String datap = pf1.getText();
     System.out.println(datap);
     
     //child frame
     WebElement cf = driver.findElement(By.tagName("iframe"));
     driver.switchTo().frame(cf);	
     
     WebElement cf1 = driver.findElement(By.tagName("html"));
     String datac = cf1.getText();
     System.out.println(datac);
		
		
				
	}

}
