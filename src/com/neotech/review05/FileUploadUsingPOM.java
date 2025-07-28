package com.neotech.review05;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.pages.FileUploadPageElements;
import com.neotech.utils.CommonMethods;

// Part 4-1 (3:00)

public class FileUploadUsingPOM extends CommonMethods {

	public static void main(String[] args) {
		// https://neotech.vercel.app/fileUpload
		
		setUp();
		
		FileUploadPageElements fileUp = new FileUploadPageElements();
		
		String filePath = System.getProperty("user.dir") + "/screenshots/Form.png";
		
		fileUp.fileInput.sendKeys(filePath);
		// sendText(fileUp.fileInput, filePath);
		wait(1);
		
		fileUp.uploadBtn.click();
		// click(fileUp.uploadBtn);
		
		waitForVisibility(fileUp.contactDiv);
		
		String expectedMessage = "File uploaded successfully!";
		String actualMessage = fileUp.contactDiv.getText();
		
		String destination = "screenshots";
		if (actualMessage.equals(expectedMessage)) {
			// Test passed
			destination += "/passed/image.png";
		} else {
			// Test failed
			destination += "/failed/image/png";
		}
		
		TakesScreenshot ts = (TakesScreenshot) fileUp.screenshotDiv;
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
