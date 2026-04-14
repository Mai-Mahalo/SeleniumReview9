package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

// For self-practice
// https://neotech.vercel.app/waits

public class ImplicitWaitDemo_2 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("btnStartDownload")).click();
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(2000);
		
		tearDown();
		
		
	}

}
