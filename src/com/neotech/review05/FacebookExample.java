package com.neotech.review05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.neotech.utils.CommonMethods;

// Part 2-1 (need to fix the codes, can't click my name on FB)

public class FacebookExample {
	
	final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		// You can specify the version of the Chrome Browser you want to use.
		// options.setBrowserVersion("130");
	
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(1000);
		
		// BE careful when you share the codes!!! (HIDE the log in info)
		driver.findElement(By.id("email")).sendKeys("mai.y.malanog@gmail.com"); 
		driver.findElement(By.id("pass")).sendKeys("Amethyst_12272022");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(20000);
		
		// Using click() method from CommonMethods class
		//CommonMethods.click(driver.findElement(By.xpath("//span[contains(text(),'Mai Yamamura')]")));
		
		// ChatGPT support
		WebElement name = driver.findElement(By.xpath("//span[contains(text(),'Mai Yamamura')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", name);


		Thread.sleep(2000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		
		for (int i = 1; i <= 15; i++) {
			js.executeAsyncScript("window.scrollBy(0, 300)");
			Thread.sleep(500);
		}
		
		Thread.sleep(2000);
				
		driver.quit();
		
		
	
		
 
		

	}

}
