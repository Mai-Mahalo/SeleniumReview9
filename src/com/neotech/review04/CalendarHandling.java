package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class CalendarHandling extends CommonMethods {

// Part 4-1

	// Go to this link: https://jqueryui.com/
	// Click on Datepicker from the left menu
	// Show the Calendar
	// Select 09/25/2026 from the Calendar
	// Verify that you have selected 09/25/2026

	public static void main(String[] args) {
		
		setUp();
		
		WebElement link = driver.findElement(By.linkText("Datepicker"));
		
		// 1st way, using Selenium click() method
		// link.click();
		
		// 2nd way, using CommonMethods click() method
		click(link);
		
		// Switching to the FRAME
		
		// 1st way, using Selenium switchTo()
		// driver.switchTo().frame(0);
		
		// 2nd way, using CommonMethods switchToFrame() method (using the index)
		//switchToFrame(0);
		
		// 3rd way, using CommonMethods switchToFrame() method (using WebElement)
		switchToFrame(driver.findElement(By.tagName("iframe")));
		
		
		WebElement dateTextBox = driver.findElement(By.id("datepicker"));
		dateTextBox.click(); // We can use it later. 
		
		String expectedMonthYear = "September 2026";
		
		// Iterate until "September 2026"
		while(true) {
			WebElement monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title"));
			String monthYearTest = monthYear.getText();
			
			
			if (monthYearTest.equals(expectedMonthYear)) {				
				break;
			}
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();

		}
		
		wait(2);
		
		// Now we need to click on the correct date.
		String expectedDay = "25";
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		// Iterate all the days until I find 25th and then click on it
		for (WebElement day : days) {
			if (day.getText().equals(expectedDay)) {
				// I found the correct day
				day.click();
				break;
			}
		}
		wait(2);
		
		// Let's verify that we selected the correct date -> 09/25/2026
		String expectedDate = "09/25/2026";
		
		String actualText1 = dateTextBox.getAttribute("value");
		String actualText2 = dateTextBox.getDomProperty("value");
		
		if (actualText1.equals(expectedDate)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		
		tearDown();

	}

}
