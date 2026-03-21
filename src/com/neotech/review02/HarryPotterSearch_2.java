package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

// for self-practice

//Go to https://amazon.com
//select Books from the search drop-down
//Type Harry potter
//And click on Search

public class HarryPotterSearch_2 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(3000);
		
		WebElement selectDDElement = driver.findElement(By.id("searchDropdownBox"));
		Select selectDD = new Select (selectDDElement);
		
		// Print all the options of the drop-down
//		List<WebElement> optionList = selectDD.getOptions();
//		for (WebElement option : optionList) {
//			System.out.println(option.getText());
//		}
		
		// 3. different way to select one drop-down option
		selectDD.selectByIndex(2); // count starting from ZERO for Index!!!
//		selectDD.selectByValue("search-alias=computers-intl-ship");
//		selectDD.selectByVisibleText("Computers");
		
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchTxt.sendKeys("GMC");
		Thread.sleep(1000);
		searchTxt.clear();
		Thread.sleep(1000);
		searchTxt.sendKeys("Toyota");
		Thread.sleep(1000);
		
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.submit();
		
		Thread.sleep(2000);
			
		tearDown();
		
		
		
	}

}
