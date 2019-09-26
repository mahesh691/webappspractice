package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_Links_LoggedPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		
//	<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("mahesh");
//		<input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("mahesh_01");
//		<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		System.out.println("number of links on the current login page of Orage HRM :"+linksCount );
		
		for(int i=0;i<linksCount; i++) {
			if(links.get(i).isDisplayed()) {
			String linkname=links.get(i).getText();
			System.out.println(i+"-"+"link name :" + linkname);
			}
		}
	}
}
