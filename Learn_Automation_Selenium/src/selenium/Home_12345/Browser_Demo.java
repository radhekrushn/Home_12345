package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Demo {
	
public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","D:\\Hinal\\Chrome Webdriver\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		
		email.sendKeys("test@gmail.com");
		pass.sendKeys("pass123");
		login.click();
		
		
				

	}

}

	
	

