package com.neotech.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.neotech.utils.BaseClass;

// part 2-1

public class Test2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		// Prepare for the test
		setUp(); // inheritence happened so no need to type "BaseClass."
		
		// Do our test
		Thread.sleep(2000);
		// Locate some elements
		driver.findElement(By.id("email")).sendKeys("sarosh@neotech.com");
		// Click some buttons
		// "driver" can be useable because we set "public" on "BaseClass". 
		// = "public static WebDriver driver; "
		
	
		
		// Clean up everything (= close the browser)
		tearDown();

	}

}
