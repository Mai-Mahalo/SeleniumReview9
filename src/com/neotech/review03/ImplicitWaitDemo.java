package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

// Part 3-1
// https://neotech.vercel.app/waits

public class ImplicitWaitDemo extends BaseClass{
	// https://neotech.vercel.app/waits

	public static void main(String[] args) throws InterruptedException {	
		setUp();
		
		// Implicit wait:
		// Always done right after driver creation
		// Valid throughout the life time of the driver
		// Will be in effect on all web elements
		
		// Wait up to 20 seconds while locating a web element 
		// will through exception if the driver can't find elements up to 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// This code is necessary because "Close" button will be shown up after clicked "START DOWNLOAD".
		// The system does not give up to click "Close" for 20 seconds.
		
		driver.findElement(By.id("btnStartDownload")).click();
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(2000);
			
		tearDown();
		
		
		

	}

}
