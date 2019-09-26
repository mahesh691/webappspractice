package com.WebTable;

import java.io.FileOutputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_employeeDetails {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =null;
		String url = "http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("mahesh");
		driver.findElement(By.id("txtPassword")).sendKeys("mahesh_01");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(10000);

		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions act1=new Actions(driver);
		act1.moveToElement(pim).perform();
		
		Thread.sleep(10000);
		WebElement employList=driver.findElement(By.linkText("Employee List"));
		employList.click();
		
		WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> subtable=table.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody"));
		WebElement rows=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]"));
		
		System.out.println(subtable.get(0).getText());
		
		
		
		
		driver.close();
		
	}

}

