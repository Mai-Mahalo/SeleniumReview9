package com.neotech.review04;

// Part 2-1
// Watched!

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class PrintTableData extends BaseClass {

	// Go to https://the-internet.herokuapp.com/tables
	// I want you to print all the data from the tbody of the second table
	// Create the path dynamically
	// Don't print the last column

	public static void main(String[] args) throws InterruptedException {

		setUp();

		Thread.sleep(3000);

		// The number of rows
		int rows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
		// The number of columns
		int cols = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();

		for (int i = 1; i <= rows; i++) {
			// iterating the row

			for (int j = 1; j < cols; j++) { // skipping the last column
				// iterating the columns

				WebElement el = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(el.getText() + " | ");

				// table[@id='table2']/tbody/tr[1]/td[3]
			}
			
			System.out.println();
		}

		tearDown();

	}

}
