package Guru99_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;
import org.testng.annotations.ObjectFactory;


public class pageObjectModel {
	
	WebDriver driver;
	
	public pageObjectModel(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement login;
	
	
	public void enterEmail(String userEmail)
	{
		email.sendKeys(userEmail);
	}
	
	public void enterPass(String userPass)
	{
		pass.sendKeys(userPass);
	}

	public void clickLogin()
	{
		login.click();
	}

}
