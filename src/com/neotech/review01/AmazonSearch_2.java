package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearch_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.amazon.co.jp/"; // This is just to send the URL, not going to load the website.
		driver.get(url); // This is to the browser show the page mentioned above.
		
		// Changed to Amazon.jp because of cookie issue for the US site. Locating Japan now.
		
		Thread.sleep(2000);
		
		// There are 8 locators to find elements in the DOM
		// id, name, className, tagName, linkText, partialLinkText, xPath, cssSelector 
		
		WebElement searchText = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchText.sendKeys("Lamb chop");
		Thread.sleep(2000);
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchButton.click();
		
		Thread.sleep(5000);
		driver.quit();
		
	
		
	}
}
