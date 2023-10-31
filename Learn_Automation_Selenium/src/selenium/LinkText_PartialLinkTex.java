package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utill.DriverConnection;

public class LinkText_PartialLinkTex {
	
	public static void main(String[] args) {
		
         WebDriver driver =  DriverConnection.connect("https://www.fb.com");
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		for(WebElement link :links)
		{
			System.out.println(link.getText());
		}
		links.get(2).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
