package com.neotech.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// for self-practice

public class BaseClass_2 {
	
	public static WebDriver driver;
	
	/**
	 * This method will initialize the browser
	 */
	
	public static void setUp() { // 1st method
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch(ConfigsReader.getProperty("browser")) {
		case "chrome":
			driver = new ChromeDriver(); // need to import Chrome Driver
			break;		
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException ("Other browsers are NOT supported!!!");	
		
		}
		
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));
		
	}
	/**
	 * This method will quit the browser.
	 */
	public static void tearDown() { // 2nd method
		if (driver != null) {
			driver.quit();
		}
		
	}

}
