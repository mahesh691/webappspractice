package com.Newtour.deoaut;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(url);
		
		WebElement	register=driver.findElement(By.linkText("REGISTER"));
		register.click();
	
		WebElement country=driver.findElement(By.name("country"));
		List<WebElement>countries=driver.findElements(By.tagName("option"));
		int countryCount=countries.size();
		System.out.println("number of countries in the drop down list :"+ countryCount);
		for(int i=0; i<countryCount;i++) {
		String countryName=countries.get(i).getText();
		System.out.println(i+"-country name : "+countryName);
	}
	
		for(int j=0;j<countryCount;j++) {
		if(countries.get(j).isEnabled()) {
			System.out.println(j+"-selected country :"+countries.get(j).getText());
		}else {
			System.out.println(j+"-not selected country :"+countries.get(j).getText());

		}
	}
	
		Select selection= new Select(country);
		selection.selectByVisibleText("INDIA");
//	selection.selectByIndex(4);
//	selection.selectByValue("7");
	
	
//	multiple selection only it work of deselect
//	selection.deselectByVisibleText("INDIA");
	
	
	
	
	}

}
