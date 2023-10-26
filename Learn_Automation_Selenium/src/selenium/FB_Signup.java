package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utill.DriverConnection;

public class FB_Signup {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https:www.fb.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.name("reg_email__")).sendKeys("4634645666");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test2123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("22");
	
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
	    months.selectByVisibleText("Jul");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
	    years.selectByVisibleText("2001");
	    
	    List<WebElement> gender =driver.findElements(By.name("sex"));
	    System.out.println(gender.size());
	    gender.get(1).click();
			
			
		
		
	}

}
