package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = null;
		String url="https://www.bing.com/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		TakesScreenshot	ts=(TakesScreenshot)driver;
		File bing_ScreenShot=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(bing_ScreenShot,new File("E:\\JavaProgrammes\\WebApplication\\screenShots\\bing1.png"));
		
		driver.quit();
		}

}
