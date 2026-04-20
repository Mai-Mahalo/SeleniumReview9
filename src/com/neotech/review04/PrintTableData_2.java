package com.neotech.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

// for self practice

// Go to https://the-internet.herokuapp.com/tables
// I want you to print all the data from the tbody of the second table
// Create the path dynamically
// Don't print the last column

// This is the task during the Review Class

//       column 1 - column 2 - column 3 - column 4 - column 5 - column 6
// row 1
// row 2
// row 3
// row 4

public class PrintTableData_2 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(1000);
		
		// The number of rows
		int rows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
		System.out.println("Number of row -> " + rows); // 4 -> Only  counted "tr" under "tbody"
		
		// The number of columns
		int cols = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();
		System.out.println("Number of column -> " + cols); // 6 -> Counted "td class" under "td"
		// [1] is index. The index of xpath starts from 1, the index for java starts from 0.
		
		for (int i = 1; i <= rows; i++) {
			// iterating the rows
			
			for (int j = 1; j < cols; j++) { // skipping the last column
				
				WebElement el = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[" + i + "]/td[" + j + "]"));
				// step 1: select any cell then inspect. (Eg: "//table[@id='table2']/tbody/tr[3]/td[2]")
				// step 2: To make it dynamic, change the index number to make it dynamic. (Eg: "[" + i +"])
				System.out.print(el.getText() + " | ");

			}
			System.out.println();
		}
	
		
		tearDown();
		
		
	}
	
	
	

}
