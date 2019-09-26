package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		List<WebElement> links=driver.findElements(By.tagName("a"));//multiple element of anchor tags link names
		int linkscount=links.size();//size storing in linkscount
		System.out.println("the no.of links in the current homepage : "+linkscount);
		
		for(int i=0; i<linkscount;i++) {
			String link_TextName=links.get(i).getText();
			System.out.println(i+" - the text of register element is :"+ link_TextName);	
			links.get(i).click();
			System.out.println("the current page title :"+ driver.getTitle());
			System.out.println("the current page url is :"+ driver.getCurrentUrl());
			
//			Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			TakesScreenshot st=(TakesScreenshot)driver;
			File file=st.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File("E:\\JavaProgrammes\\WebApplication\\screenShots\\"+link_TextName+"."+"png"));
		
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
		}
		driver.quit();
	}
}
