package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

// for self practice
// https://neotech.vercel.app/waits

public class ExplicitWaitDemo_2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		// Use FluentWait
		driver.findElement(By.id("btnStartDownload")).click();
		
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver); // same as "FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);"
		fluentWait.withTimeout(Duration.ofSeconds(30)); // max time to wait until it gives up
		fluentWait.pollingEvery(Duration.ofSeconds(2)); // try every 2 seconds
		fluentWait.ignoring(NoSuchElementException.class); // while trying ignore these exceptions
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));
		
		// Now, we know that the Close button is clickable
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(3000);
		
		tearDown();
		
		
	}

}
