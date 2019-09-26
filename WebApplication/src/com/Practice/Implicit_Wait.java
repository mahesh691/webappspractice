package com.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =null;
		String url = "http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get( url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("mahesh");
		driver.findElement(By.id("txtPassword")).sendKeys("mahesh_01");
		driver.findElement(By.id("btnLogin")).click();
	}

}
