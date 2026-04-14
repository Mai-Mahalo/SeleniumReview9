package com.neotech.review03;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

// Part 3-2 (27:00)
// https://neotech.vercel.app/waits

public class ExplicitWaitDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		// WebDriverWait:
//		driver.findElement(By.id("btnStart")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));
//		
//		// by calling wait.until with this condition, we are instructing the wait object to wait until the web element is visible.
//		
//		WebElement helloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
//		System.out.println("The label says: " + helloWorld.getText());
//		
		
		// FluentWait: (= object)
		driver.findElement(By.id("btnStartDownload")).click();
		
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(30)); // max time to wait until it gives up
		fluentWait.pollingEvery(Duration.ofSeconds(2)); // try every 2 seconds
		fluentWait.ignoring(NoSuchElementException.class); // while trying ignore these exception
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));
		
		// Now we know that the Close button is clickable
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(3000);
		
		tearDown();
		
		

	}

}
