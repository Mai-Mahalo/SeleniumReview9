package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearchCSS_2 {
	
	// For self-practice

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		// Using co.jp to avoid additional security window for amazon.com
		String url = "https://www.amazon.co.jp/"; 
		driver.get(url);
		
		Thread.sleep(2000);
		
		WebElement searchText = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchText.sendKeys("Ice Cream");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("span#nav-search-submit-text>input")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
