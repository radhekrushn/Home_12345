package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utill.DriverConnection;

public class Guru99_popup_php {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/popup.php");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		String mainwin = driver.getWindowHandle();
		System.out.println("main win"+mainwin);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allwins = driver.getWindowHandles();	
		for(String win : allwins)
		{
			if(!win.equals(mainwin))
			{
				driver.switchTo().window(win);			}
		}
		
		driver.findElement(By.name("emailid")).sendKeys("Hinal@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
		
	
		
	}

}
