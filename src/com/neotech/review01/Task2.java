package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Part 4-2 (26:00) /

public class Task2 {
	
	// Go to https://demoqa.com/text-box
	// Fill the form and submit
	// Use xPath or CSS Selector
	
	// How to locate with xPath
	// //input[@id='userName'] (for user name)
	// //input[@id='userEmail'] or input[@type='email'](for e-mail) -> whichever is fine as long as it is unique.
	
	// How to locate with CSS
	// textarea.form-control (We have the two same tags but it will bring the first one automatically)
	// id#userName (Check if it works!)

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Berfin Avci");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("berfin@neotech.com");
		
		// Even though there are 2 elements, we will get the first one in the DOM.
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("United States");
		
		// Find an element by using multiple attributes
		// xpath -> //textarea[@class='form-control' and @id='permanentAddress']
		// css ->  textarea[class='form-control'][id='permanentAddress']
		driver.findElement(By.xpath("//textarea[@class='form-control' and @id='permanentAddress']")).sendKeys("Canada");
		
		Thread.sleep(3000);
		
		// We had a problem while clicking on submit button. We will learn how to scroll down to click.
		driver.findElement(By.id("submit")).click(); // if we find  "id" we do not need to use xPath and CSS.
		// This above is not clickable, run-time error, this is because it is located below something. There is something on the top.
		
		
		Thread.sleep(3000);
		
		driver.quit();	
		
		
		

	}

}
