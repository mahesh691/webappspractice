package com.Newtour.deoaut;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TsrtcALLElements_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =null;
		String url="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(url);
//		
	WebElement	headerBlockElement=driver.findElement(By.className("menu-wrap"));

List<WebElement> headerBlockElementLinks=headerBlockElement.findElements(By.tagName("a"));
int headerBlockElementLinksCount=headerBlockElementLinks.size();
System.out.println("total number links in the header block of tsrtc application :"+headerBlockElementLinksCount);
	
	for(int m=0;m<headerBlockElementLinksCount;m++) {
		String headerBlockElementLinkNames=headerBlockElementLinks.get(m).getText();
		System.out.println(m+"-"+"header Block  Element Link Text :"+ headerBlockElementLinkNames);
//		headerBlockElementLinks.get(m).click();
//		String currentPageTitle=driver.getTitle();
//		String currentUrl=driver.getCurrentUrl();
//		System.out.println("current Page Title :"+currentPageTitle);
//		System.out.println("current Url :"+currentUrl);
////		driver.navigate().back();
//		headerBlockElement=driver.findElement(By.className("menu-wrap"));
//		headerBlockElementLinks=headerBlockElement.findElements(By.tagName("a"));
		
	
	}

	}

}
