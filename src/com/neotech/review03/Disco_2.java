package com.neotech.review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

// For self-practice
//https://neotech.vercel.app/windows -> Click "GO TO NEOTECH ACADEMY"

public class Disco_2 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1000);
		
		Set<String> allWindows = driver.getWindowHandles();
		Thread.sleep(1000);
		
		Iterator<String> it = allWindows.iterator();
		String mainWindow = it.next();
		String childWindow = it.next();
		
		for (int i = 1; i <= 10; i++) {
			driver.switchTo().window(mainWindow);
			Thread.sleep(1000);
			driver.switchTo().window(childWindow);
			Thread.sleep(400);	
			
		}
		
		driver.close(); // I can close it withtout this code.
		Thread.sleep(3000);
		
		
		tearDown();
		
	}

}
