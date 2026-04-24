package com.neotech.review05;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

// for self-practice
public class ScreenshotExample_2 extends CommonMethods {
	// "https://www.facebook.com/"
	
	public static void main(String[] args) {
		
		setUp();
		
		wait(1);
		
		// Taking the screenshot of the whole page
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenshots/FacebookLogin_2.png");
		
		try {
			Files.copy(source, destination);
		} catch (IOException e) {
			System.out.println("Couldn't save the screenshot!");
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------");
		
		// Taking the screenshot of a WebElement (form), UI has changed so xpath changed from the class one
		WebElement form = driver.findElement(By.id("login_form"));
		
		TakesScreenshot ts2 = (TakesScreenshot) form;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("screenshots/Form_2.png");
		
		try {
			Files.copy(source2, destination2);
			System.out.println("Successfully saved!");
		} catch (IOException e) {
			System.out.println("Couldn't save the screenshot!");
			e.printStackTrace();
		}
		
		tearDown();
		
		
	}

}
