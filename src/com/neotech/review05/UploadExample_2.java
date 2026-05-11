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

public class UploadExample_2 extends CommonMethods {
	
	public static void main(String[] args) {
		// https://neotech.vercel.app/fileUpload
		
		setUp();
		
		// The file can be in your project
		String filePath = System.getProperty("user.dir")+ "/SeleniumReview9/screenshots/Form.png";
		// = "/Users/Mai/eclipse-workspace/SeleniumReview9/screenshots/Form.png";
		// In the class, we chose "Form.png" in "Screenshots" folder because Selenium can't deal
		// with opening the file search wizard
		
		// The file can be anywhere in your computer
		// String filePath2 = "/Users/Mai/Desktop/Mai/Photos/Mai_LinkedIn.jpeg";
		// Choose a file, the right click "Get Info" -> See "Where" to find the filePath
		
		WebElement fileInput = driver.findElement(By.id("image_file"));
		fileInput.sendKeys(filePath);
		wait(1);
		
		WebElement uploadBtn = driver.findElement(By.xpath("//span[@id='btnUpload']"));
		uploadBtn.click();
		
		// Until uploading, we want to wait to see "File uploaded successfully!"
		waitForVisibility(driver.findElement(By.cssSelector("div.ContactUs"))); 
		// We can also use "id" and xpath.
		
		String expectedMessage = "File uploaded successfully!";
		String actualMessage = driver.findElement(By.cssSelector("div.ContactUs")).getText();
		
		String destination = "screenshots";
		if (actualMessage.equals(expectedMessage)) {
			// Test passed
			destination += "/passed/image/png";
			// destination = destination + "/passed/image.png";
		} else {
			destination += "/failed/image/png";
			// Test failed
		}
		// Take screenshots, down-casting
		TakesScreenshot ts = (TakesScreenshot) driver.findElement(By.className("content"));
		File src = ts.getScreenshotAs(OutputType.FILE); // want them to return the screenshot to FILE.  
		File dest = new File(destination);
		
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		wait(2);
		
		tearDown();
		
	}	
	
		
	}


