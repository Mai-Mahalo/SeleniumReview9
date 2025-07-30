package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

// Part 1-1 (34:00)
// Watched !!

public class WebTableExample extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/tables
		
		setUp();
		
		Thread.sleep(1000);
		
		// Find the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("The number of row is -> " + rows.size());
		
		//table/tbody/tr[1]/td[3]
		// Find the number of columns in the first row
		List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("The number of columns is -> " + cols.size());
		
	
		// Find the number of the all the cells in the table
		List<WebElement> cells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("The number of cells is -> " + cells.size());
		
		// //table/tbody/tr/td[2]
		
		System.out.println("---------------------------------------------");
		
		// If I want to print the first row the table
		
		// 1st way, Static way, locating all the WebElements at once 
		List<WebElement> firstRowList = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		for (WebElement el : firstRowList) {
			System.out.print(el.getText() + " | ");
			
		}
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		// 2nd way, Dynamic way, locating all the WebElements one-by-one
		for (int i = 1;  i <=cols.size(); i++) {
			String path = "//table/tbody/tr[1]/td[" + i + "]";
			// System.out.println(path);
			
			WebElement el = driver.findElement(By.xpath(path));
			System.out.print(el.getText() + " | ");
		}
		System.out.println();
		
		System.out.println("--------------------------------------------");
		System.out.println("Let us print all the cells of all the rows");
		System.out.println("--------------------------------------------");
		
		for (int row = 1; row <= rows.size(); row++) { // iterating the rows
			
			// to skip the last column we said -> col < cols.size();
			for (int col = 1; col < cols.size(); col++) { // iterating the columns
				// String path = "//table/tbody/tr[" + row + "]/td[" + col + "]";
				// System.out.println(path);
				
				WebElement el = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]"));
				
				System.out.println(el.getText());
				
				
			}
			
			System.out.println();
		}
		
		
		
		tearDown();
		
	}
	



	}


