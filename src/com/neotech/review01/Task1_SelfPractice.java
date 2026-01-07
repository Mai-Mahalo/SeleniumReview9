package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// For self-practice

// Open Chrome browser
// Navigate to https://www.selenium.dev/
// Navigate to https://www.google.com/
// Go back and forth 10 times.
// Use a for loop
// Wait 1 second between each navigation

public class Task1_SelfPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		String url1 = "https://www.selenium.dev/";
		String url2 = "https://www.google.com/";

		for (int i = 0; i < 10; i++) {
			driver.navigate().to(url1);
			Thread.sleep(1000);
			driver.navigate().to(url2);
			Thread.sleep(1000);
			driver.navigate().back();
		}
		driver.quit();

	}
	
	

}
