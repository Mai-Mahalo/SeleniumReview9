package com.neotech.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// June 16, 2025, Review 04

public class BaseClass {
	
	public static WebDriver driver; // animal
	
	// prepare the test
	/**
	 * This method will initialize the browser
	 */
	public static void setUp() {
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		// no need to import second time because we import once in the same package
		
		switch (ConfigsReader.getProperty("browser")) {
		case "chrome":
			driver = new ChromeDriver(); // up-casting // eg: dog
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break; // need "break" otherwise both Chrome and Firefox opened.
		default:
			throw new RuntimeException("Other browsers are NOT supported!!!");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));
			
	}
	
	// close the browser
	
	/**
	 * This method will quit the browser
	 */
	public static void tearDown() {
		if(driver != null) { 
			driver.quit(); 
			// if you only have one method in "if", you can omit "{".
		}
			
	}

}


