package com.neotech.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// June 16, 2025, Review 04

public class BaseClass {
	
	public static WebDriver driver; 
	// = animal, need to be "static", "Polymorphism"
	// It's accessible any methods in the class.
	// Need to be "public" because we want to access from "Test2" class from another package. 
	
	// prepare the test
	/**
	 * This method will initialize the browser
	 */
	public static void setUp() { // 1st method
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		// no need to import second time because we import once in the same package
		
		switch (ConfigsReader.getProperty("browser")) {
		case "chrome":
			// Open chrome browser
			driver = new ChromeDriver(); // up-casting // eg: dog, move "public static WebDriver driver" 
			//outside of the method
			break; // without "break" they open chrome, then firefox as well.
		case "firefox":
			// Open firefox browser
			driver = new FirefoxDriver(); // eg: cat
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
	public static void tearDown() { // 2nd method
		if(driver != null) {  // = if it is not null, they will close.
			driver.quit(); 
			// if you only have one statement inside in "if", you can omit "{".
		}
			
	}

}


