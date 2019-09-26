package com.AutoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangehrmAddEmployee {
WebDriver driver = null;
String Url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(Url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void addemployee() throws InterruptedException, IOException
	{
		driver.findElement(By.id("txtUsername")).sendKeys("mahesh");
		driver.findElement(By.id("txtPassword")).sendKeys("mahesh_01");
		driver.findElement(By.id("btnLogin")).click();
		
//		Thread.sleep(10000);

		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions act=new Actions(driver);
		act.moveToElement(pim).perform();
		
		WebElement adde=	driver.findElement(By.id("menu_pim_addEmployee"));
		adde.click();
		
		driver.findElement(By.id("firstName")).sendKeys("vinayaka");
		driver.findElement(By.id("lastName")).sendKeys("chavithi");
		
//		Thread.sleep(10000);
//		input tag only sendkeys work
		WebElement image=driver.findElement(By.id("photofile"));
//		image.click();
//		image.sendKeys("C:\\Users\\user\\Desktop\\index.jpg");
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\image.exe");
		
		driver.findElement(By.id("btnSave")).click();

	}
//@AfterTest
//	public void tearDown() {
//		driver.close();
//	}
}
