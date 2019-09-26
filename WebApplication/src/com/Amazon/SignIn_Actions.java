package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SignIn_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="https://www.amazon.in/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("browseropened");

		driver.get(url);
		System.out.println("amazon application opened");
//		id=nav-link-accountList " hello sign in
		WebElement hellosignin=driver.findElement(By.id("nav-link-accountList"));
		System.out.println("found element");

		Actions act=new Actions(driver);
		
		act.moveToElement(hellosignin).perform();
		System.out.println("cursor move on to the hello signin");
		Thread.sleep(3000);
		WebElement yourwishlist=driver.findElement(By.linkText("Your Wish List"));
		yourwishlist.click();
		System.out.println("selected your wish list");
driver.close();
	}

}
