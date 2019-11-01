package com.PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	WebDriver driver=null;
	@BeforeMethod
	public void browserLounch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\git\\repository\\myrepository\\WebApplication\\DriverFiles\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
}
