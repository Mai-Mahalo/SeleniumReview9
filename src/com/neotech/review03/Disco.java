package com.neotech.review03;
// Part 2-1

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Disco extends BaseClass {

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
			driver.switchTo().window(childWindow);
			Thread.sleep(400);
		}

		driver.close();
		Thread.sleep(3000);

		// HW: Click on all the buttons first
		// Then close all the windows one by one.

		tearDown();

	}

}
