package com.qa.keyword.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.baseofkeyword;

public class keywordengine {
	
	public WebDriver driver;
	public Properties prop;
	
	public static Workbook book;
	public static Sheet sheet;
	
	public baseofkeyword base;
	public WebElement element;
	
	
	public final String SCENARIO_SHEET_PATH = "C:\\selenium\\framework\\src\\test\\java\\com\\keyword\\scenarioes\\data.XLSX";
    
	
	public void startExcution(String sheetname) {
		
		
		FileInputStream file = null;
		
		try {
			file = new FileInputStream(SCENARIO_SHEET_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetname);
		int k = 0;
		
		for(int i=0; i<sheet.getLastRowNum(); i++) {
			try {
			
			
			String locatorType = sheet.getRow(i+1).getCell(k+1).toString().trim();//id = username k+1 = second colum
			
			String locatorValue =  sheet.getRow(i+1).getCell(k+2).toString().trim(); // k+2 = third colum
				String action =  sheet.getRow(i+1).getCell(k+3).toString().trim(); // k+3 = forth colum
				String value = sheet.getRow(i+1).getCell(k+4).toString().trim();
				switch (action) {
				case "open browser":
					base = new baseofkeyword ();
					prop = base.initproperties();
					   if(value.isEmpty() || value.equals("NA")) {
						  driver = base.brwoser(prop.getProperty("browser"));
					   }else {
						   driver = base.brwoser(value);
					   
					   }
					
					break;
					
				case "enter url" :
					if(value.isEmpty() || value.equals("NA")) {
						driver.get(prop.getProperty("url"));
					}else {
						driver.get(value);
					}
					break;
				
				case "quit" :
					driver.quit();
					break;
				
				default:
					break;
				}	// case :2
				
				switch  (locatorType) {
				case "id":
					WebElement element = driver.findElement(By.id(locatorValue));
					 if(action.equalsIgnoreCase("sendkeys")) {
						 element.clear();
						 element.sendKeys(value);
					 }else if(action.equalsIgnoreCase("click")) {
						 element.click();
					 }else if (action.equalsIgnoreCase("isDispayed")) {
						 element.isDisplayed();
					 }else if (action.equalsIgnoreCase("getText")) {
						 String elementText = element.getText();
						 System.out.println("text from element : "+ elementText);
					 }
					locatorType = null;
					break;
				}	
				switch (locatorType) {
				case "id" :
					element = driver.findElement(By.id(locatorValue));
					if (action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if (action.equalsIgnoreCase("click")) {
						element.click();
					}else if (action.equalsIgnoreCase("displayed")) {
						element.isDisplayed();
					}
					locatorType = null;
					break;
					
				case "name":
					element = driver.findElement(By.name(locatorValue));
					if (action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if  (action.equalsIgnoreCase("click")) {
						element.click();
					}else if (action.equalsIgnoreCase("isDisplyed")) {
						element.isDisplayed();
					}else if (action.equalsIgnoreCase("getText")) {
						String elementText = element.getText();
						System.out.println("text from element : " + elementText);
					}
					locatorType = null;
					break;
					
					
					
					
					
					
				case "xpath" :
					element = driver.findElement(By.id(locatorValue));
					if (action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if (action.equalsIgnoreCase("click")) {
						element.click();
					}else if (action.equalsIgnoreCase("displayed")) {
						element.isDisplayed();
					}else if (action.equalsIgnoreCase("getText")) {
						String elementText = element.getText();
						System.out.println("text from element : " + elementText);
					}
					
					locatorType = null;
					break;
					
				case "cssSelector":
					element = driver.findElement(By.cssSelector(locatorValue));
					if (action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if (action.equalsIgnoreCase("click")) {
						element.click();
					}else if (action.equalsIgnoreCase("displayed")) {
						element.isDisplayed();
					}else if (action.equalsIgnoreCase("getText")) {
						String elementText = element.getText();
						System.out.println("text from element : " + elementText);
					}
					
					locatorType = null;
					break;
					
				case "className":
					element = driver.findElement(By.className(locatorValue));
					if (action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if (action.equalsIgnoreCase("click")) {
						element.click();
					}else if (action.equalsIgnoreCase("displayed")) {
						element.isDisplayed();
					}else if (action.equalsIgnoreCase("getText")) {
						String elementText = element.getText();
						System.out.println("text from element : " + elementText);
					}
					
					locatorType = null;
					break;
					
				case "linkText":
					element = driver.findElement(By.linkText(locatorValue));
					element.click();
					locatorType = null;
					break;
					
				case "partiallinkText":
					element = driver.findElement(By.partialLinkText(locatorValue));
					element.click();
					locatorType = null;
					break;
					
				default:
					break;
					
				}
				
				} catch (Exception e) {
				
				}
		}
	}
				
			
}				
			
			
			
			  
	
	
		
		

	

