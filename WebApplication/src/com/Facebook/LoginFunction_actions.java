package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginFunction_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = null;
String url="https://www.facebook.com/";
System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
driver= new FirefoxDriver();
driver.get(url);

WebElement email=driver.findElement(By.id("email"));
email.sendKeys("abcd@gamil.com");

Actions act=new Actions(driver);

act.sendKeys(Keys.TAB).perform();
act.sendKeys("abcdef").perform();
act.sendKeys(Keys.ENTER).perform();

driver.close();
	}

}
