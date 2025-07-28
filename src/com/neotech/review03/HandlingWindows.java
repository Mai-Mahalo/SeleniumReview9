package com.neotech.review03;
//Part 1-2 (35:00) 

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingWindows extends BaseClass {

	// https://neotech.vercel.app/windows
	public static void main(String[] args) throws InterruptedException {

		setUp();

		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		// chrome: B81D9F156C0FC0F20D68B97DF0571E67
		// Firefox: 5faf6a75-d026-4de4-8ca5-6cd5bf363d30

		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);

		// I can NOT locate the element the new page because the focus in still on the
		// first page
		// driver.findElement(By.name("q")).sendKeys("NeoTech");

		// How can I move focus to the new page?
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowId : allWindows) {
			System.out.println(windowId);

			// if the windowId is not window1, then it should be the new window
			if (!windowId.equals(mainWindow)) {
				driver.switchTo().window(windowId);
				break;
			}
		}

		// Now I can locate the textbox inside the new window
		driver.findElement(By.name("q")).sendKeys("NeoTech");
		Thread.sleep(3000);

		// HW: Use Iterator object instead of the adv. for loop

		tearDown();
	}

}
