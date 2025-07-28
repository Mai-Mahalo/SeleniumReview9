package com.neotech.review01;

//Part 3-1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	// Task until 12:50
	// Open Chrome browser
	// Navigate to https://www.selenium.dev/
	// Navigate to https://www.google.com/
	// Go back and forth 10 times.
	// Use a for loop
	// Wait 1 second between each navigation

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String url1 = "https://www.selenium.dev/";
		String url2 = "https://www.google.com/";
		
		driver.navigate().to(url1);
		driver.navigate().to(url2);
		
		for (int i = 1; i <= 10; i++) {
			driver.navigate().back();
			Thread.sleep(500);
			
			driver.navigate().forward();
			Thread.sleep(500);
			
		}
		
		driver.quit();	

	}

}
