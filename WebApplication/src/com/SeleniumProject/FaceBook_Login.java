package com.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Login {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver=null;
		String url="http://facebook.com";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("#email")).sendKeys("jdfsf@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("kkhyd@3");
//		driver.findElements(By.cssSelector("#loginbutton")).
		driver.findElement(By.cssSelector("#loginbutton")).click();*/
		
		
		
	WebDriver driver=null;
	String url="https://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	driver =new FirefoxDriver();
	driver.get(url);
	Thread.sleep(2000);
//ussername	<input name="txtUsername" id="txtUsername" type="text">
	
	driver.findElement(By.id("txtUsername")).sendKeys("mahesh");
	Thread.sleep(2000);
//	<input name="txtPassword" id="txtPassword" type="password">	
	
	driver.findElement(By.id("txtPassword")).sendKeys("mahesh_01");
//	<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	Thread.sleep(2000);

	WebElement login=driver.findElement(By.xpath("//*[@id=\'btnLogin\']"));
	login.click();
//	System.out.println(login.isDisplayed());
//	System.out.println(login.isEnabled());
//	System.out.println(login.isSelected());
	WebElement welcome=driver.findElement(By.id("welcome"));
	welcome.click();
	
	
	
	

	}

}
