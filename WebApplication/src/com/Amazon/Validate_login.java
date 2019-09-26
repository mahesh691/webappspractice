package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validate_login {

	public static void main(String[] args) {
WebDriver driver=null;
String url="https://www.amazon.in/";
System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
driver=new FirefoxDriver();
driver.get(url);

driver.findElement(By.cssSelector("#nav-link-accountList > span:nth-child(2)")).click();
driver.findElement(By.id("ap_email")).sendKeys("cmahesh91@gmail.com");
driver.findElement(By.id("continue")).click();

driver.findElement(By.id("ap_password")).sendKeys("9550064271");



		
		
		
	}

}
