package com.ScrollDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownPage {
	
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver","E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe" );  
     
        
         WebDriver driver= new FirefoxDriver();  
       

     // Launch Website  
     driver.get("https://www.facebook.com/");   

     //Scroll down the webpage by 4500 pixels  
     JavascriptExecutor js = (JavascriptExecutor)driver; Thread.sleep(10000); 
     js.executeScript("scrollBy(0, 4500)");  
}
}
