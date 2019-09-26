package com.SeleniumProject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BingApplicationOpen {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		
		String actual_BingTitle=driver.getTitle();
		System.out.println("the actual title of bing home page:"+actual_BingTitle);
		
		String expected_BingTitle="Bing";
		System.out.println("the expected title of bing home page:"+expected_BingTitle);
		
		if(actual_BingTitle.equals(expected_BingTitle)) {
			System.out.println("the title matched : PASS");
		}else {
			System.out.println("the title not matched : FAIL");
		}
		driver.close();
	}

}
