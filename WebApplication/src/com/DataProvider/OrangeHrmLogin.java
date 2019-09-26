package com.DataProvider;
//grid operation
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHrmLogin {
@DataProvider
public Object[][] getdata(){
	Object[][] data= new Object[2][3];
	data[0][0]="tutorial";
	data[0][1]="tutorial";
	data[0][2]="firefox";
	
	data[1][0]="mahesh";
	data[1][1]="mahesh_01";
	data[1][2]="edge";
	
	return data;
}

@Test(dataProvider = "getdata")
public void logintest(String username,String password,String browser) throws MalformedURLException {
	System.out.println(browser);
	
	DesiredCapabilities cap=null;
	if(browser.equals("firefox")) {
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
	}else 
		if(browser.equals("edge")) {
			cap=DesiredCapabilities.edge();
			cap.setBrowserName("edge");
			cap.setPlatform(Platform.WINDOWS);
			
		}
	
	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.109:4444/wd/hub"),cap);
	
	driver.get("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	
driver.close();
}
}
