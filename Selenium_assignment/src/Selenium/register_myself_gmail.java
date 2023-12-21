package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utill.DriverConnection;

public class register_myself_gmail {
	
	
	public static void main() {
		
		WebDriver driver = DriverConnection.connect("http://mail.google.com");
		
		
		
		driver.findElement(By.id("identifierId")).sendKeys("eferf");
	   driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
	 
	   driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[2]")).click();
	
      driver.findElement(By.id("firstName")).sendKeys("hinal");
      driver.findElement(By.id("lastName")).sendKeys("krushn");
      
      driver.findElement(By.id("collectNameNext")).click();
      
        WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select months = new Select(month);
	    months.selectByVisibleText("July");       
	    
	    driver.findElement(By.id("day")).sendKeys("22");
	    driver.findElement(By.id("year")).sendKeys("2001");
	    
	    WebElement gender = driver.findElement(By.id("gender"));
	    Select genders = new Select(gender);
	    genders.deselectByVisibleText("Female");
	    
	    driver.findElement(By.xpath("//button[@jsname = 'LgbsSe")).click();
	    
	    
	    
	    
	    
	    
	    
      
  }

}
