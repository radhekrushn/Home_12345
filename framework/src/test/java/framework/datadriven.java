package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class datadriven {
	


	WebDriver driver =null;
	@BeforeClass
	public void setup()
	{
		 driver = DriverConnection.connect("https://secure1.inmotionhosting.com/index/login");
	}
	
	@Test(dataProvider = "dp")
	public void login(String uname, String pass) {
		
		WebElement username = driver.findElement(By.id("username"));
	    username.clear();
		username.sendKeys(uname);
		WebElement password =  driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
		
		//driver.findElement(By.name("submit")).click();
	}

	@DataProvider(name = "dp")
	public Object[][] getData() {

		ExcellReader rd = new ExcellReader("C:\\mydata\\login.xlsx\\", "login");
		int rows = rd.rowCount();
		int cols = rd.colCount();
		System.out.println(rows+" "+cols);
		Object[][] obj = new Object[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				String data = rd.getData(i, j);
				obj[i][j] = data;
			}
		}

		return obj;

	}
}