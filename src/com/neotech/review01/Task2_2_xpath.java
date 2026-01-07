package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_2_xpath {
	
	// Self-practice
	
	// Go to https://demoqa.com/text-box
	// Fill the form and submit
	// Use xPath or CSS Selector

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/text-box";
		
		driver.get(url);
		
		WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
		fullName.sendKeys("Mai.Y Malanog");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("mai@neotech.com");
		
		WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentAddress.sendKeys("Osaka, Japan");
		
		WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanentAddress.sendKeys("TX USA");
		
		WebElement submit= driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		
		driver.quit();
		

	}

}
