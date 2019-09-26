package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
@Test
public class LoginValidation {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		
//	<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("mahesh");
//		<input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("mahesh_01");
//		<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		String expwelcome_text="Welcome";
		System.out.println("expected welcome element text is :"+ expwelcome_text);
		Thread.sleep(2000);
		WebElement welcome=driver.findElement(By.linkText("Welcome Admin"));
		String actwelcome_text=welcome.getText();
		
		System.out.println("actual welcome element text is :"+ actwelcome_text);
		
		if(actwelcome_text.contains(expwelcome_text))
		{
			System.out.println("Loggedin to OrangeHRM _ pass");
		}else {
			System.out.println("Error message dispaly to login_fail");
		}
		welcome.click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}

}
