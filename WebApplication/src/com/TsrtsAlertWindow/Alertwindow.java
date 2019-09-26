package com.TsrtsAlertWindow;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class Alertwindow {

Logger logger= Logger.getLogger("Alertwindow");
WebDriver driver=null;
String url="https://www.tsrtconline.in/oprs-web/";

@BeforeTest
public void setup() {
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get(url);
}
@Test
public void get() throws InterruptedException {
	PropertyConfigurator.configure("log4j.properties");
	logger.info("successfull opened tsrtc applicaton ");
	
	driver.findElement(By.id("searchBtn")).click();
	logger.info("clicked on searchbutton ");

	Alert alert=driver.switchTo().alert();
	logger.info("alert window opened ");
Thread.sleep(5000);
	String alerttext=alert.getText();
	logger.info("found alert text");
	
	logger.info(alerttext);
	
	alert.accept();
//	alert.dismiss();
//	alert.sendKeys("mahesh");
	


}
@AfterTest
public void tearDown() {
	
	driver.close();
}

}
