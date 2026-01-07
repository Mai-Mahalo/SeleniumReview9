package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_2_CSS {
	
	// for self-practice
	
	// Go to https://demoqa.com/text-box
	// Fill the form and submit
	// Use xPath or CSS Selector

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/text-box";
		
		driver.get(url);
		
		WebElement inputFullName = driver.findElement(By.cssSelector("input#userName"));
		inputFullName.sendKeys("Mai.Y Malanog");
		
		WebElement userEmail = driver.findElement(By.cssSelector("input#userEmail"));
		userEmail.sendKeys("mai@neotech.com");
		
		WebElement currentAddress = driver.findElement(By.cssSelector("textarea#currentAddress"));
		currentAddress.sendKeys("Osaka, Japan");
		
		WebElement permanentAddress = driver.findElement(By.cssSelector("textarea#permanentAddress"));
		permanentAddress.sendKeys("TX, USA");
		
		WebElement submit = driver.findElement(By.cssSelector("button#submit"));
		submit.click();
		
		driver.quit();
		
		
		
		

	}

}
