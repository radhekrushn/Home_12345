package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utill.DriverConnection;

public class makemytrip_date_month_year_set {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.makemytrip.com/");
		
		driver.findElement(By.className("commonModal__close")).click();
		
		WebElement fromcity = driver.findElement(By.xpath("//*[@id = 'fromCity']"));
        Actions builder = new Actions(driver);
        builder.click()
        .sendKeys("New Delhi")
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
        System.out.println("Done");
        WebElement tocity = driver.findElement(By.xpath("//*[@id = 'toCity']"));
        Actions builder1 = new Actions(driver);
        builder1.click()
        .sendKeys("Pune")
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
        System.out.println("good");
        
        WebElement departureDate = driver.findElement(By.id("departure"));
        departureDate.click();
        
        
        System.out.println("y");

        
        
        
        
               
        
        WebElement travelers = driver.findElement(By.id("travellers"));
        travelers.click();
        
        WebElement 	adult = driver.findElement(By.id("adults"));
        Select adults = new Select(adult);
        adults.selectByValue("2");
        
        
		System.out.println("i");
		
		
		
		
        
        
	}

}
