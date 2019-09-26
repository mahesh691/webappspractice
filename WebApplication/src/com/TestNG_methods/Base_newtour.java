package com.TestNG_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base_newtour {
	WebDriver driver=null;
	@BeforeTest
	public void setType() {
	String url="http://newtours.demoaut.com/";
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	}
	
	
	@AfterTest
	public void tearDrop() {
		driver.close();
	}
}
