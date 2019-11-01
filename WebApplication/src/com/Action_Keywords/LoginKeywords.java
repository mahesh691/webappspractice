package com.Action_Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginKeywords {
	
	WebDriver driver=null;
	
public void launchBrowser() {
	System.setProperty("webdriver.gecko.driver", ".\\DriverFiles\\geckodriver.exe");
	driver =new FirefoxDriver();
	}

public void navigate() {
	driver.get("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login");
	
}

public void enterusername() {
	driver.findElement(By.id("txtUsername")).sendKeys("mahesh");
	System.out.println("entered username ");
}

public void enterpassword() {
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("mahesh_01");
	System.out.println("Entered password");
}

public void clicklogin() {
	driver.findElement(By.cssSelector("#btnLogin")).click();
}
}
