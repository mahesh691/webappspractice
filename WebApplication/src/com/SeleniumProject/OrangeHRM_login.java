package com.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM_login {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("mahesh");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("mahesh_01");
		
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		driver.findElement(By.cssSelector("#welcome")).click();
		
		driver.findElement(By.cssSelector("#welcome-menu > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click();
		
		

		
	}

}
