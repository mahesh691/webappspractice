package com.Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 extends Test2{
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	WebDriver driver=null;
	
void lanuchBrowser() {
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	driver = new FirefoxDriver();
}

void orangeHRM_app() {
	driver.get(url);

}




}
