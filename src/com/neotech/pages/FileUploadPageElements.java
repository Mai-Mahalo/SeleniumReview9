package com.neotech.pages;

//Part 4-1 (3:00)

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class FileUploadPageElements extends BaseClass {
	
	// Without Page Factory
	// WebElement fileInput = driver.findElement(By.id("image_file"));
	
	// With Page Factory
	@FindBy (id = "image_file")
	public WebElement fileInput;

	@FindBy (xpath = "//span[@id='btnUpload']")
	public WebElement uploadBtn;
	
	@FindBy(css = "div.ContactUs")
	public WebElement contactDiv;
	
	@FindBy(className = "content")
	public WebElement screenshotDiv;

	
	// Constructor
	public FileUploadPageElements() {
		PageFactory.initElements(driver, this);
		
	}
	

}
