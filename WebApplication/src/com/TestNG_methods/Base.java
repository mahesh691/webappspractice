package com.TestNG_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base{
	WebDriver driver=null;
	@BeforeTest
	public void setType() {
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
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
