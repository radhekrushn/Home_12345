package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	WebDriver driver;
	public WebDriver driverSetUp() 
	{
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\selenium\\Guru99_Project\\src\\test\\java\\com\\data.properties");
			prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Hinal\\chromer webdriver\\chromedriver-win64\\chromedriver.exe\\");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "\"C:\\Hinal\\geckowebdriver fol ff\\geckodriver.exe\\");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
		
		
	

		
	}
}