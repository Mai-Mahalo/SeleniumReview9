package com.neotech.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

// Part 2-2 (15:00)

// iframe is old school and technology.

public class HandlingFrames extends BaseClass {
	// https://neotech.vercel.app/iframe

	public static void main(String[] args) throws InterruptedException {

		setUp();
		// How can I switch into the iframe?
		// 1st way:
		// driver.switchTo().frame(0); // It works properly if there is not iframe is added in the future.

		// 2nd way:
		// driver.switchTo().frame("age-frame"); // safer than the 1st way

		// 3rd way:
		WebElement iFrameElement = driver.findElement(By.xpath("//iframe[@id='age-frame']"));
		driver.switchTo().frame(iFrameElement);

		// After switching into the iframe, we have full acccess to its web elements
		WebElement ageBox = driver.findElement(By.id("age"));
		ageBox.sendKeys("25");
		Thread.sleep(1000);
		// ageBox.sendKeys("80"); -> dont do this if you are trying to change the box
		// text
		ageBox.clear();
		Thread.sleep(1000);
		ageBox.sendKeys("80");
		Thread.sleep(1000);

		// This will throw an exception NoSuchElementException without "driver.switchTo().defaultContent();"
		// because the focus is still on iframe
		// We need to swtich back to the main content
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Nested iframes")).click();
		Thread.sleep(2000);

		// HW:
		// Go to https://the-internet.herokuapp.com/nested_frames
		// Go to the frame with name frameset-middle
		// Go to the frame with index 1
		// Verify the that text of the body is MIDDLE

		tearDown();

	}

}
