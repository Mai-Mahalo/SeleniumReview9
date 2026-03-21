package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

// Part 1-1

public final class HandlingTimeAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/alerts
		
		setUp();
		
//		driver.findElement(By.id("btnAlert")).click();
//		Thread.sleep(1000);
//		
//		// Lets handle the Alert
//		Alert alert = driver.switchTo().alert();
//		System.out.println("The text of the alert is: " + alert.getText());
//		alert.accept();
//		Thread.sleep(1000);
		
		// Handling the delayed Alert
		driver.findElement(By.id("btnDelayedAlert")).click();
		
		// Alert alert = driver.switchTo().alert();
		// Exception: NoAlertPresentException
		// Alert is not present yet
		// One way to handle this is: Thread.sleep()
		// This wait is too long and I dont want to wait that long
		// Thread.sleep(10000);
		// Alert alert = driver.switchTo().alert();
		
		// I want to wait for the Alert to be present in page
		// Lets create a wait object for this
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent()); 
		
		// If the alert is present after 3 seconds, wait will only wait 3 seconds
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000); // I want to see the alert for one second.
		
		alert.accept();
		Thread.sleep(1000); // I want to see the alert for one second.
				
		tearDown();

	}

}
