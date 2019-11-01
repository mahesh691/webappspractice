package com.ScrollDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownPage {
	
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver","E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe" );  
     
        
         WebDriver driver= new FirefoxDriver();  
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       

     // Launch Website  
//     driver.get("https://www.facebook.com/");   
try {
	

     //Scroll down the webpage by 4500 pixels  
     JavascriptExecutor js = (JavascriptExecutor)driver; Thread.sleep(5000); 
//     js.executeScript("scrollBy(0, 500)");  
     
     driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

     WebElement Element = driver.findElement(By.linkText("VBScript"));

     //This will scroll the page Horizontally till the element is found		
//     js.executeScript("arguments[0].scrollIntoView();", Element);
     
     js.executeScript("", Element);
     
     
     
     Element.click();
}catch(Exception e) {
	
}

Thread.sleep(2000);
driver.close();
}
}
