package com.Action_Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewtoursKeywordBase {
WebDriver driver=null;

public void launchBrowser() {
	System.setProperty("webdriver.gecko.driver", ".\\DriverFiles\\geckodriver.exe");
	driver =new FirefoxDriver();
	}

public void navigate() {
	driver.get("http://newtours.demoaut.com/");
	
}

public void enterusername() {
	driver.findElement(By.name("userName")).sendKeys("maheshindia");
}

public void enterpassword() {
	driver.findElement(By.name("password")).sendKeys("mahesh123");
}

public void clicklogin() {
	driver.findElement(By.name("login")).click();
}
	
	
}
