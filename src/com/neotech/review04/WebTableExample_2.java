package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

// self-practice
// https://neotech.vercel.app/tables

public class WebTableExample_2 extends BaseClass {
	
	//[tr] = rows: left to right (Eg: Player, Country) = columns
	//[td] = columns: Top to down
	// cell = (content) (Eg: Pele, Maradona)
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(1000);
		
		// Find the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("The number of rows is -> " + rows.size());
		
		//table/tbody/tr[1]/td[3] = "Team"
		List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("The number of columns is -> " + cols.size());
		
		// Find the number of the all the cells in the table
		List<WebElement> cells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("The number of cells is -> " + cells.size());
		
		System.out.println("---------------------------------------------------");
		
		// If I want to print the first row the table
		
		// 1st way, Static way, locating all the WebElements at once
		List<WebElement> firstRowList = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		for (WebElement el : firstRowList) {
			System.out.println(el.getText() + " | ");
		}
		System.out.println();
		
		System.out.println("-----------------------------------------------");
		
		// 2nd way, Dynamic way, locating the WebElemnets one-by-one
		for (int i =1; i <= cols.size(); i++) {
			String path = "//table/tbody/tr[1]/td[" + i + "]";
			// System.out.println(path);
			
			WebElement el = driver.findElement(By.xpath(path));
			System.out.println(el.getText() + " | ");
			
		}
		
		System.out.println();
		
		System.out.println("------------------------------------");
		System.out.println("Let us print all the cells of all the rows");
		System.out.println("------------------------------------");
		
		for (int row = 1; row <= rows.size(); row++) { // iterating the rows
			
			// to skip the last column we said  -> col < cols.size(); NOT "<=")
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


		
		
			

		
	
	
		
	
		
	
	
	
	


