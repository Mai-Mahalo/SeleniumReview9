package com.neotech.review01;

//Part 3-2

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		// If chrome, they may ask for capture that is not avoidable. (better to set longer waiting time with "Thread")
		// Change to Firefox if you want to omit the process.
		
		String url = "https://www.amazon.com/";
		driver.get(url);
		
		Thread.sleep(2000);
		
		// There are 8 locators to find elements in the DOM.
		// id, name, className, tagName, linkText, partialLinkText, xPath, cssSelector
		// If you find "id", this is unique so we can use it.
		
		// input[@id='twotabsearchtextbox'] -> "input" is more specific
		// "type" and more are called "attribute".
		// "WebElement"... is need to storing element.
		
		// Select a area -> Inspect -> right click "Copy" -> "Copy XPath"
		// Cmd + F to show the search box, then copy the XPath.
		// When you input into String in Eclipse, please replace " to ' to avoid Eclipse confused.
		
		
		WebElement searchText = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchText.sendKeys("Lamb Chops");
		Thread.sleep(2000);
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchButton.click();
		
        Thread.sleep(5000);
		driver.quit();
		

	}

}
