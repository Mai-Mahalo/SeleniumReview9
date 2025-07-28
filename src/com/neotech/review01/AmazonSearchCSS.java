package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Part 4-1

public class AmazonSearchCSS {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.amazon.com/";
		driver.get(url);

		Thread.sleep(2000);

		// # (hashtag) means id

		// input#twotabsearchtextbox -> any input with id = twotabsearchtextbox
		// #twotabsearchtextbox -> any element with id = twotabsearchtextbox

		// . (period) means class
		// input.nav-input -> any input with class
		// .nav-input -> any element with class = nav-input

		WebElement searchText = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchText.sendKeys("Ice Cream");
		Thread.sleep(2000);

		// span#nav-search-submit-text>input
		// Locate the span with id = nav-search-submit-text
		// Locate the direct-child input

		// How to find elements
		// If you can't find id, you can look the parent starting with "span".
		// Do right click, copy -> "copy selector" -> paste it in a search bar ->
		// Add typing "span#" in the beginning to locate the parent
		// Add typing ">input" in the end to access to the child.
		
		// Method chaining: locating the WebElement and clicking on its
		driver.findElement(By.cssSelector("span#nav-search-submit-text>input")).click();
		
		
		Thread.sleep(5000);
		driver.quit();

		// difference between xpath vs CSS
		// Do the same things
		// css makes shorter ways than xPath.

	}

}
