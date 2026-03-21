package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

// for personal practice

public class CheckBoxDemo_2 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(1000);
		
		// driver.findElement(By.xpath("gender-radio-2")).click(); // to click female, we can't use "id".
		
		driver.findElement(By.xpath("//label[@for='gender-radio-3']")).click(); // to click "Other"
		
		// Locate all the checkboxes
		List<WebElement> checkBoxList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
		
		// Click all the checkboxes
		for (WebElement checkbox: checkBoxList) {
			checkbox.click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(1000);
		
		tearDown();
		
	}
	

}
