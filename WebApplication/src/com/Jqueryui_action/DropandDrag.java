package com.Jqueryui_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String url="https://jqueryui.com/droppable/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		
//		<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag=driver.findElement(By.id("draggable"));
		System.out.println("dragger element text :"+drag.getText());
		
		WebElement drop=driver.findElement(By.id("droppable"));
		System.out.println("drop element text :"+drop.getText());
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		System.out.println("dropped");
		
		driver.switchTo().defaultContent();
		WebElement resizable=driver.findElement(By.linkText("Resizable"));
		resizable.click();
		System.out.println("title of resizzable page:"+driver.getTitle());
		

		
		
	}

}
