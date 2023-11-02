package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utill.DriverConnection;

public class demoqa_automation_practiceform {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Hinal");
		driver.findElement(By.id("lastName")).sendKeys("Bhuva");
		driver.findElement(By.id("userEmail")).sendKeys("hinalbhuva22@gmai.com");
			
		driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[2]/label")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("9968587486");
		
		// dob
		 driver.findElement(By.id("dateOfBirthInput")).click();
		 
		 driver.findElement(By.xpath("//*[@id='dateOfBirthInput']")).click();
		
		driver.findElement(By.xpath("//*[@id='subjectsContainer']/div/div[1]")).sendKeys("Testing");
	
		
		driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[3]/label")).click();
		
		// picture
		
		driver.findElement(By.id("currentAddress")).sendKeys("16 - Shubhvilla Row-house, near umra, velenja");
		
		WebElement statecity = driver.findElement(By.id("stateCity-wrapper"));
        Select StateandCity = new Select(statecity);
        StateandCity.selectByVisibleText("NCR");
        
        WebElement statecity1 = driver.findElement(By.id("stateCity-wrapper"));
        Select StateandCity1 = new Select(statecity1);
        StateandCity1.selectByVisibleText("Delhi");
        
        driver.findElement(By.id("submit")).click();
		
		
		
		
	}

}
