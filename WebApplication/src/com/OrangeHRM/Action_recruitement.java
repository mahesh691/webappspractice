package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_recruitement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =null;
String url = "http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
driver =new FirefoxDriver();
driver.get( url);

driver.findElement(By.id("txtUsername")).sendKeys("mahesh");
//<input name="txtPassword" id="txtPassword" type="password">
driver.findElement(By.id("txtPassword")).sendKeys("mahesh_01");
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
driver.findElement(By.id("btnLogin")).click();

Thread.sleep(1000);
WebElement firstLevelMenu=driver.findElement(By.className("firstLevelMenu"));
System.out.println("found element");
Actions act1 = new Actions(driver);
act1.moveToElement(firstLevelMenu).perform();
Thread.sleep(1000);

WebElement Qualifications=driver.findElement(By.linkText("Qualifications"));
Actions act2 = new Actions(driver);
act2.moveToElement(Qualifications).perform();
System.out.println("performed");
//Thread.sleep(1000);
WebElement education=driver.findElement(By.linkText("Education"));
education.click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("education_name")).sendKeys("mtech");
	driver.findElement(By.id("btnSave")).click();
	
	}

}
