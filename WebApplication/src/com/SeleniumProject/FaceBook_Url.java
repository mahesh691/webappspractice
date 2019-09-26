package com.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver=null;
			String url="http://facebook.com";
			System .setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.get(url);
			 String expected_title="Facebook – log in or sign up";
			 String actual_title=driver.getTitle();
			 
			 String expected_url="facebook.com";
			 String actual_url=driver.getCurrentUrl();
		
		System.out.println("expected title of facebook homepage is :"+ expected_title);
			 System.out.println("actual title of facebook homepage is :"+ actual_title);
			if(actual_title.equals(expected_title)) {
				System.out.println("the title matched - pass");
			}else {
				System.out.println("the title not matched - fail");
			}
			
			System.out.println("the actual current facebook url is :"+actual_url);
			System.out.println("the expected current facebook url is :"+expected_url);
 if(actual_url.contains(expected_url)) {
	 System.out.println("url matched - pass");
 }else {
	 System.out.println("url not matched - fail");
 }
 driver.quit();
 

	}

}
