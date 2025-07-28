package com.neotech.review02;

//part 3-2

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

//part 3-2 (Need to complete the code)

//Go to https://demoqa.com/automation-practice-form
// Check Female
// Select all the Hobbies

public class CheckBoxDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(2000); // milisecond

		// Cannot click on the input, because the label does not allow
		// driver.findElement(By.id("gender-radio-2")).click();

		// We are able to click the label.
		// driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();

		////////////////////////////////////////////////////////////////
		// It will return the first WebElement with that xPath.
		// WebElement element = driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));

		// It will return all the WebElements with that xPath
		// List<WebElement> elements = (List<WebElement>) driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
		
		////////////////////////////////////////////////////////////////
		// findElement() vs findElements()
		// findElement() returns the first WebElement with that xPath
		// findElements() returns all the WebElements with that xPath
        ////////////////////////////////////////////////////////////////
        
		// 1. if xPath is wrong
		// findElement() -> will throw an Exception
		// findElements() -> will return all the WebElements inside a List (size = 0)
		
		// 2. If there are multiple WebElements with that xPath
		// findElement() -> will return the first WebElement
		// findElements() -> will return all the WebElements inside a List (size = 3) // 3 = hobby options
		
		// Locate all the checkboxes
		List<WebElement> checkBoxList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
		// all three labels will be returned.
		
		// Click all checkBoxes one-by-one
		for (WebElement checkBox : checkBoxList) {
			checkBox.click();
			Thread.sleep(1000);
		}

		Thread.sleep(1000);

		tearDown();

	}

}
