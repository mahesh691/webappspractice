package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.rewrite.RewriteAppender;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Firefox {
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
cap.setBrowserName("firefox");
cap.setPlatform(Platform.WINDOWS);

String huburl="http://192.168.1.11:4444/wd/hub";


RemoteWebDriver driver= new RemoteWebDriver(new URL(huburl),cap);
	driver.get("https://www.facebook.com");
	
	}

	
	
	
}
