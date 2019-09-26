package com.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//automated FireFox Browser
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
		WebDriver fi = new FirefoxDriver();
		
	// automated edge Browser
		
		System.setProperty("webdriver.ie.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\IEDriverServer.exe");
		InternetExplorerDriver obj =new InternetExplorerDriver();

// micro soft Edge
		
		System.setProperty("webdriver.edge.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\MicrosoftWebDriver.exe");
		EdgeDriver mahi = new EdgeDriver();		
				
		
	}

}
