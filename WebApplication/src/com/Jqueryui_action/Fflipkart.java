package com.Jqueryui_action;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fflipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String url="https://www.flipkart.com/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		
//		driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		
		
	}

}
