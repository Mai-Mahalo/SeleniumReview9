package com.neotech.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

//part 3-1 (need to complete the code but the code can be different from the sample)

//Login to SIS Web Application
// https://sis.neotechacademy.com/ or https://neotech.vercel.app/sis-login (for me)
// username -> Admin
// password -> Neotech$123

// NOTE: The username and password do not work for https://neotech.vercel.app/sis-login

public class LoginSIS extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		// We are performing our test
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("tbxUsername"));
		username.sendKeys(ConfigsReader.getProperty("username")); // Admin
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(ConfigsReader.getProperty("password")); // Neotech$123
		Thread.sleep(1000);
		
		

	}

}
