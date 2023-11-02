package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utill.DriverConnection;

public class Techlistics_Demo {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/p/selenium-practice-form.html");
       
		driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("Hinal");
        
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Bhuva");
        
        driver.findElement(By.id("sex-1")).click();
        
        driver.findElement(By.id("exp-5")).click();
         
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("26-10-2023");
        
        driver.findElement(By.id("profession-1")).click();
        
        driver.findElement(By.id("tool-2")).click();
        
        WebElement continent = driver.findElement(By.id("continents"));
        Select continents = new Select(continent);
        continents.selectByVisibleText("Australia");
        
        WebElement SeleniumCommand = driver.findElement(By.id("selenium_commands"));
        Select SeleniumCommands = new Select(SeleniumCommand);
        SeleniumCommands.selectByVisibleText("Wait Commands");
        
        
        
        
        
       
        //driver.findElement(By.id("submit")).click();
         driver.findElement(By.xpath("//*[@id='submit']")).click();		
		
	}
	


}



