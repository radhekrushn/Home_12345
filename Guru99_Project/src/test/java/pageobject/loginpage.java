package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	By uname = By.name("uid");
	By pass = By.name("password");
	By login = By.name("btnLogin");
	
      public void username(String myuser)
      {
    	  driver.findElement(uname).sendKeys(myuser);
      }
      
      public void password(String mypass)
      {
    	  driver.findElement(pass).sendKeys(mypass);
      }
      
      public void loginBtn()
      {
    	  driver.findElement(login).click();
      }
	
	

	
	
}
