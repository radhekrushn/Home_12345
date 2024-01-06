package Selenium;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utill.DriverConnection;

public class facebooklogo_withxpath {
	
	public static void main(String[] args) {
	
	WebDriver driver = DriverConnection.connect("https://www.facebook.com/");
	
    WebElement logoTextElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));

    Actions actions = new Actions(driver);
    actions.moveToElement(logoTextElement).perform();

  
    try {
        Thread.sleep(5000); 
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("successfully highlighted FB logo");

}
}