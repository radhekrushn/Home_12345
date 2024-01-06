package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class total_phperlink_of_webpage {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/web-table-element.php");
		  List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	     
	        System.out.println("Total Number of Hyperlinks: " + allLinks.size());

	        for (WebElement link : allLinks) {
	            System.out.println("Text: " + link.getText() + ", Href: " + link.getAttribute("href"));
	        }

	}

}
