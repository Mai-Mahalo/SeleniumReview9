package com.neotech.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

// Self-practice

public class HandlingFrames_2 extends BaseClass {
	// https://neotech.vercel.app/iframe
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement iFrameElement = driver.findElement(By.xpath("//iframe[@id='age-frame']"));
		driver.switchTo().frame(iFrameElement);
		
		WebElement ageBox = driver.findElement(By.id("age"));
		ageBox.sendKeys("27");
		Thread.sleep(1000);
		
		ageBox.clear();
		ageBox.sendKeys("75");
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		
		tearDown();
	}
	
	
	

}
