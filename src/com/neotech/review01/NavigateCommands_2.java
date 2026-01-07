package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// For self-practice

public class NavigateCommands_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.instagram.com";
		
		// driver.get(url);
		// will wait for the page and the elements to be loaded
		// will NOT keep the history
		
		driver.navigate().to(url);
		// will NOT wait for the page and the elements to be loaded
		// will keep the history
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize(); // Will make full screen
		Thread.sleep(1000);
		
		driver.manage().window().minimize(); // Will minimize the screen
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		driver.navigate().to("http://github.com/");
		Thread.sleep(2000);
		
		driver.navigate().back(); // will bring us back to the second page (selenium)
		Thread.sleep(2000);
		
		driver.navigate().back(); // will bring us back to the first page (instagram)
		Thread.sleep(2000);
		
		driver.navigate().forward(); // will bring us forward to the second page
		Thread.sleep(2000);
		
		driver.navigate().refresh(); // will reload the website
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
