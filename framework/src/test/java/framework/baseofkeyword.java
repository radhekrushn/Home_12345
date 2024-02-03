package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseofkeyword {
	
	public WebDriver driver;
	public  Properties prop;
	
	public WebDriver brwoser(String browserName) {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Hinal\\chromer webdriver\\chromedriver-win64\\chromedriver.exe\\");
			if(prop.getProperty("openbrowser").equals("chrome"));
            ChromeOptions options = new ChromeOptions();
			options.addArguments("--openbrowser");
			driver = new ChromeDriver(options);
		}else {
			
			driver = new ChromeDriver();
			
			
		}
		return driver;
	}
	
	public Properties initproperties()  {
		
		prop = new Properties();
	    
		try {
			 FileInputStream fis = new FileInputStream("C:\\selenium\\framework\\src\\test\\java\\framework\\properties");
			 
			 prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		return prop;
		
		
		
	}
   
}
