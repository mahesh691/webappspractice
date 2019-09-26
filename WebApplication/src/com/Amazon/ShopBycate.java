package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopBycate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		String url="https://www.amazon.in/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
//		nav-line-2
		WebElement shop=driver.findElement(By.id("nav-link-shopall"));
		Actions act1=new Actions(driver);
		act1.moveToElement(shop).perform();
		System.out.println("performed");
		
		Thread.sleep(5000);
		shop.click();
		System.out.println("performed clickk");
		driver.findElement(By.linkText("Home Entertainment Systems")).click();
		
//		WebElement home=driver.findElement(By.id("nav-text"));
//		System.out.println("performed eccho");

//		Thread.sleep(5000);
//		Actions act2=new Actions(driver);
//		Thread.sleep(5000);
//		act2.moveToElement(home).perform();
		
		
		
	}

}
