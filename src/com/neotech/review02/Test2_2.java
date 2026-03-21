package com.neotech.review02;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass_2;

public class Test2_2 extends BaseClass_2 {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("mai@neotech.com");
		
		tearDown();
	}
}
