package selenium;


import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Locale.Builder;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import Utill.DriverConnection;

public class demoqa_automation_practiceform {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
		String mydate = "22";
		String myyear = "2001";
		String mymonth = "July";
		
		
		
		
		
		driver.findElement(By.id("firstName")).sendKeys("Hinal");
		driver.findElement(By.id("lastName")).sendKeys("Bhuva");
		driver.findElement(By.id("userEmail")).sendKeys("hinalbhuva22@gmai.com");
        driver.findElement(By.xpath("//label[@for = 'gender-radio-2']"));		
        driver.findElement(By.id("userNumber")).sendKeys("9866564534");
        driver.findElement(By.id("dateOfBirthInput")).click();
        
        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
        Select months = new Select(month);
        months.selectByVisibleText(mymonth);
        
        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
        Select years = new Select(year);
        years.selectByVisibleText(myyear);
        
        List<WebElement> dates = driver.findElements(By.xpath("//div[@class = 'react-datepicker__week']/div"));       
        for(WebElement date : dates)
        {
        	if(date.getText().equals(mydate))
        	{
        		if(date.getAttribute("aria-label").contains(mymonth))
        		{
        			date.click();
        			break;
        		}
        	}
        }
        
        WebElement subject = driver.findElement(By.id("subjectsContainer"));
        Actions builder = new Actions(driver);
        builder.click(subject)
        .sendKeys("Physics")
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
                  
                           
        driver.findElement(By.xpath("//label[@for = 'hobbies-checkbox-3']"));
        
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures");
        
        driver.findElement(By.id("currentAddress")).sendKeys("surat,gujarat.");
          
      
     
		
	}

}
