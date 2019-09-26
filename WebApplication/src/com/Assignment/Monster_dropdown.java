package com.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(url);
		
		WebElement location= driver.findElement(By.className("border_grey1"));
		List<WebElement> locationList=location.findElements(By.tagName("option"));
		int locationListCount=locationList.size();
		System.out.println(locationListCount);
		for(int i=0;i<locationListCount;i++) {
		locationList.get(i).getText();
		System.out.println(i+"  "+locationList.get(i).getText());
		}
	
	Select selections=new Select(location);
	selections.selectByValue("3");
	selections.selectByVisibleText("Bengaluru / Bangalore");
	System.out.println("industry names ");
	WebElement industry= driver.findElement(By.id("id_industry"));
	List<WebElement> industryList=industry.findElements(By.tagName("option"));
	int industryListCount=industryList.size();
	System.out.println(industryListCount);
	for(int i=0;i<industryListCount;i++) {
	locationList.get(i).getText();
	System.out.println(i+"  "+industryList.get(i).getText());
	}

	Select selection=new Select(industry);
	selection.selectByVisibleText("Banking/Financial Services");
	selection.selectByValue("74");
	selection.selectByIndex(2);

	selection.deselectAll();
	
	
	
	
	
	}
}