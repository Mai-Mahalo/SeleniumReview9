package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Self-practice

public class LaunchFirfoxBrowser_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		// This code will open the Mozilla Firefox Browswer
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.nytimes.com/games/wordle/";
		
		// It will navigate to a specific website
		driver.get(url);
		
		// Wait for 3 seconds
		Thread.sleep(3000); // 3 seconds
		
		String currentURL = driver.getCurrentUrl();
		
		if (url.equals(currentURL)) {
			System.out.println("URLs are the same");
		} else {
			System.out.println("URLs are different");
		}
		
		System.out.println("1 -> " + url);
		System.out.println("2 -> " + currentURL);
		
		// Get the website Title
		String title = driver.getTitle();
		System.out.println("Title -> " + title);
		
		// Quit (close) the browser
		driver.quit();
		
		
		
	}

}
