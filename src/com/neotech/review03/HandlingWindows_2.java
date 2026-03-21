package com.neotech.review03;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

// For self practice

public class HandlingWindows_2 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		// https://neotech.vercel.app/windows
		 
		setUp();
		
		String mainWindow = driver.getWindowHandle(); // To create an object of the current window
		System.out.println(mainWindow);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		// Need to move focus to the new page
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String windowId : allWindows) {
			System.out.println(windowId);
			
			// if the windowId is not mainWindow, then it should be the new window
			if (!windowId.equals(mainWindow)) {
				driver.switchTo().window(windowId);
				break;
			}
		}
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("NeoTech");
		Thread.sleep(3000);
		// Better to use "name" rather than "id" because it is more stable. 
		// If you see random characters in "id", we better avoid using it.
		
		tearDown();
		
	}

}
