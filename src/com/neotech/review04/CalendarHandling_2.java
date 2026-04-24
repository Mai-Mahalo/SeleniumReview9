package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

// for self-practice

// Go to this link: https://jqueryui.com/
// Click on Datepicker from the left menu
// Show the Calendar
// Select 02/07/2027 from the Calendar
// Verify that you have selected 02/07/2027

public class CalendarHandling_2 extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		WebElement link = driver.findElement(By.linkText("Datepicker"));
		
		// 1st way, using Selenium click() method
		// link.click();
		
		// 2nd way, using CommonMethod click() method
		click(link);
		
		// Switching to the FRAME
		
		// 1st way, using Selenium swithTo().frame() method
		// driver.switchTo().frame(0);
		
		// 2nd way, using CommonMethods swithToFrame() method (using the index)
		// switchToFrame(0);
		
		// 3rd way, using CommonMethods swithToFrame() method (using WebElement)
		switchToFrame(driver.findElement(By.tagName("iframe")));
		
		WebElement dateTextBox = driver.findElement(By.id("datepicker"));
		dateTextBox.click();
		
		String expectedMonthYear = "February 2027";
		
		// Iterate until "February 2027"
		while (true) {
			WebElement monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title"));
			String monthYearText = monthYear.getText();
			
			if (monthYearText.equals(expectedMonthYear)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		wait(2);
		
		// Now we need to click on the correct date
		String expectedDay = "7";
		List <WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		// Iterate all the days until I find 7th and then click on it
		for (WebElement day : days){
			if(day.getText().equals(expectedDay)) {
				// I found the correct day
				day.click();
				break;
			}
		}
		wait(2);
		
		// Let's verify that we selected the correct date -> 02/07/2027
		String expectedDate = "02/07/2027"; // coz the website shows that way of format.
		
		String actualText1 = dateTextBox.getAttribute("value");
		String actualText2 = dateTextBox.getDomProperty("value");
		
		// System.out.println(actualText1);
		// System.out.println(actualText2);
		
		if(actualText1.equals(expectedDate)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
			
		tearDown();
		
		
	}

}
