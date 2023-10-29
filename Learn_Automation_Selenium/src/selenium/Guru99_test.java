package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utill.DriverConnection;

public class Guru99_test {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/delete_customer.php");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); 
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		Alert alert1 = driver.switchTo().alert();
		alert.accept();	
		
		
	}
	
	
	
	
	
	
	

}
