package com.neotech.review05;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

// Part 3-1 (10:00) NEED to complete the code
// Need to update CommonMethods / "element" (Maybe updated)

public class UploadExample extends CommonMethods {

	public static void main(String[] args) {
		// https://neotech.vercel.app/fileUpload
		
		setUp();
		
		// This file can be in your project. 
		String filePath = System.getProperty("user.dir") + "/screenshots/Form.png";
		
		// This file can be anywhere in your computer.
		// String filePath2 = "/Users/Mai/Downloads/AI_Mai.jpg";
		// /Users/Mai/Downloads/ -> access to Downloads folder, "AI_Mai.jpg" -> name of the image.
		
		WebElement fileInput = driver.findElement(By.id("image_file"));
		fileInput.sendKeys(filePath);
		wait(1);
		
		WebElement uploadBtn = driver.findElement(By.xpath("//span[@id='btnUpload']"));
		uploadBtn.click();
		
		waitForVisibility(driver.findElement(By.cssSelector("div.ContactUs")));
		
		String expectedMessage = "File uploaded successfully!";
		String actualMessage = driver.findElement(By.cssSelector("div.ContactUs")).getText();
		
		String destination = "screenshots";
		if (actualMessage.equals(expectedMessage)) {
			// Test passed
			destination += "/passed/image.png";
		} else {
			// Test failed
			destination += "/failed/image.png";
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver.findElement(By.className("content"));
		File src = ts.getScreenshotAs(OutputType.FILE);
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
