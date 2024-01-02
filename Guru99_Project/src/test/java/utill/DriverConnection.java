package utill;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
	
	public static WebDriver connect(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hinal\\chromer webdriver\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}

}
