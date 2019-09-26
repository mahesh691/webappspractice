package com.SeleniumProject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		String facebook_title=driver.getTitle();
		System.out.println("facebook title:"+facebook_title);
		
		driver.quit();	
	}

}
