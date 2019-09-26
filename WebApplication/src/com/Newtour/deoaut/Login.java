package com.Newtour.deoaut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(url);
//username		<input type="text" name="userName" size="10">
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		System.out.println("entered username:tutorial");
		Thread.sleep(1000);
//password <input type="password" name="password" size="10">
		driver.findElement(By.name("password")).sendKeys("tutorial");
		System.out.println("password entered:tutorial");
		Thread.sleep(1000);
//sub mit :<input type="image" name="login" value="Login" alt="Login" src="/images/forms/submit.gif" width="60" height="23" border="0">
		driver.findElement(By.name("login")).click();
		System.out.println("submitted ");
		Thread.sleep(1000);
		String actual_title=driver.getTitle();
		System.out.println("actual current successfull page is :"+actual_title);
		Thread.sleep(1000);
		String expected_title="Find";
		System.out.println("expected title current successfull login page is :"+expected_title);
		Thread.sleep(1000);
		if(driver.getTitle().contains(expected_title)) {
			System.out.println("title matched : pass");
		}else {
			System.out.println("not matched title : fail");
		}
		
//		driver.close();
		
	}

}
