package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {
	
	WebDriver driver;
	
	public homepage(WebDriver driver) {
		this.driver = driver;
	}
	
    By pageHeading = By.xpath("//table[@class='layout']/tbody/tr/td/table/tbody/tr[3]/td");
    
    public String getPageHeading()
    {
    	return driver.findElement(pageHeading).getText();
    }
    
    public String getPageTitle()
    {
    	return driver.getTitle();
    }

}
