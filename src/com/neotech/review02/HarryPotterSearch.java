package com.neotech.review02;

// Part 4-1

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

// Go to https://amazon.com
// select Books from the search drop-down
// Type Harry potter
// And click on Search

public class HarryPotterSearch extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
	setUp();
	
	Thread.sleep(3000);
	
	WebElement selectDDElement = driver.findElement(By.id("searchDropdownBox"));
	Select selectDD = new Select(selectDDElement);
	
	
//	// Print all the options of the drop-down
//	List <WebElement> optionList = selectDD.getOptions();
//	// get option is object, return all options
//	
//	for (WebElement option : optionList) {
//		System.out.println(option.getText());
//	}
	
	// 3 different ways to select one drop-down options
	// selectDD.selectByIndex(4);
	// selectDD.selectByValue("search-alias=automotive-intl-ship");
	selectDD.selectByVisibleText("Books");
	
	Thread.sleep(1000);
	
	WebElement searchTxt =driver.findElement(By.id("twotabsearchtextbox"));
	
	searchTxt.sendKeys("James Bond");
	Thread.sleep(1000);
	searchTxt.clear();
	Thread.sleep(1000);
	searchTxt.sendKeys("Harry Potter");
	Thread.sleep(1000);
	
	WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
	searchBtn.submit();
	
	Thread.sleep(2000);
	
	tearDown();
	
	}
	
	
	
	

}
