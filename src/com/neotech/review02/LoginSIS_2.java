package com.neotech.review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

// For self-practice
// https://neotech.vercel.app/sis-login (accessing from outside of North America)

//Login to SIS Web Application
//https://sis.neotechacademy.com/ (can be accessible only from North America)
//For those that the address doesn't work, use this one:
//https://neotech.vercel.app/sis-login
//username -> Admin
//password -> Neotech$123

public class LoginSIS_2 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("tbxUsername"));
		username.sendKeys(ConfigsReader.getProperty("username"));
		
		WebElement password = driver.findElement(By.id("tbxPassword"));
		password.sendKeys(ConfigsReader.getProperty("password"));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		// = method chaining
		
		Thread.sleep(3000);
		
		// Dealing with Alert
		Alert alert = driver.switchTo().alert();
		
		System.out.println("The text of the alert is " + alert.getText());
		
		alert.accept();
		
		Thread.sleep(3000);
		
		tearDown();
		
	}
	

}
