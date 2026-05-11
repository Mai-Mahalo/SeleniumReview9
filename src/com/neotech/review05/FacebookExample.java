package com.neotech.review05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.neotech.utils.CommonMethods;

// Part 2-1 (need to fix the codes, can't go to my personal page)

public class FacebookExample {
	
	final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		// You can specify the version of the Chrome Browser you want to use.
		// options.setBrowserVersion("130");
	
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(5000); // make it longer than the example code
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(1000);
		
		// BE careful when you share the codes!!! (HIDE the log in info)
		driver.findElement(By.name("email")).sendKeys("mai.y.malanog@gmail.com"); 
		// "id" keeps changing each time so choose "name" for this case.
		driver.findElement(By.name("pass")).sendKeys("Amethyst_12272022");
		
		driver.findElement(By.xpath("//div[@aria-label='Log In']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//span[text()='Mai Yamamura Malanog']")).click();	
		driver.quit();
		
		
	
		
 
		
 
	}

}
