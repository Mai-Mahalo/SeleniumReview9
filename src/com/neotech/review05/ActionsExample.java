package com.neotech.review05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

// Part 1-1 (37:00)

public class ActionsExample extends CommonMethods{

	public static void main(String[] args) {
		// http://webdriveruniversity.com/Actions/index.html
		
		setUp();
		
		wait(1);
		
		Actions act = new Actions(driver);
		
////////////////////////////////////////////////////////////////////////////////
		// Drag and Drop
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		// act.dragAndDrop(draggable, droppable).perform();
		// Don't forget the perform() at the end. The way above is OK!
		
		// Another way below. Method chaining
		act.clickAndHold(draggable).moveToElement(droppable).pause(1000).release().perform();		
////////////////////////////////////////////////////////////////////////////////		
		// Double Click
		
		WebElement dblClickButton = driver.findElement(By.id("double-click"));
		
		// Does clicking 2 times work? -> NO
//		dblClickButton.click();
//		dblClickButton.click();
		
		act.doubleClick(dblClickButton).perform();
////////////////////////////////////////////////////////////////////////////////
        // Mouse Hover
		List<WebElement> hoverButtons = driver.findElements(By.cssSelector("button.dropbtn"));
		
		for (WebElement btn : hoverButtons) {
			act.moveToElement(btn).pause(500).perform();	
		}
////////////////////////////////////////////////////////////////////////////////
		
		WebElement div = driver.findElement(By.id("click-box"));
		
		act.clickAndHold(div).pause(2000).release().pause(1000).clickAndHold(div).pause(2000).release().perform();

		wait(1);
		
		tearDown();		
		
		

	}

}
