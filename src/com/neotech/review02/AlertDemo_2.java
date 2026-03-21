package com.neotech.review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo_2 extends BaseClass{
	// https://neotech.vercel.app/alerts
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(1000);
		
		// When alert is open, you cannot interact with the main page
		// driver.findElement(By.id("btnConfirm"));
		
		// We need to take care of the Alert (JavaScript Pop-up)
		Alert alert = driver.switchTo().alert();
		
		System.out.println("The text of the alert is -> " + alert.getText());
		
		alert.accept(); // Clicking on the OK!
		Thread.sleep(1000);
		
		// After accept/dis,iss the alert, we can interact with the main page
		driver.findElement(By.id("btnPrompt")).click();
		Thread.sleep(1000);
		
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(1000);
		
		// There are 4 methods that we can use
		// getText(); Gets the text from the Alert
		// sendKeys(); Sends text to the Alert
		// accept(); Clicking on OK
		// dismiss(); Clicking on Cancel
		
		prompt.sendKeys("Mai");
		prompt.accept();
		
		Thread.sleep(3000);
		
		tearDown();
		
	}

}
