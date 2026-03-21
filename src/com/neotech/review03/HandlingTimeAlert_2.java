package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

// for personal practice
// https://neotech.vercel.app/alerts

public class HandlingTimeAlert_2 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
//		driver.findElement(By.id("btnAlert")).click();
//		Thread.sleep(1000);
//		
//		Alert alert = driver.switchTo().alert();
//		System.out.println("The text of alert is " + alert.getText());
//		alert.accept();
//		Thread.sleep(1000);
		
		// Handling the delayed alert
		driver.findElement(By.id("btnDelayedAlert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent())	;
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		
		alert.accept();
		Thread.sleep(1000);
		
		tearDown();
		
	}

}
