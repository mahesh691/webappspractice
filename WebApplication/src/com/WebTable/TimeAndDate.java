package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeAndDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = null;
	String url="https://www.timeanddate.com/worldclock/";
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	driver= new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(10000);
//	/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
//	/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]/a
	for(int k=1; k<=7;k=k+2) {  // k : column numbers 
	System.out.println();
	System.out.println("city names of the column number is : "+k);
	System.out.println("-----------------------------------------");

	for(int i=1;i<=36;i++) { //i : row number
	try {	
	WebElement city=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+k+"]/a"));
	String cityName=city.getText();
	System.out.println(i+" The city Name is :"+cityName);

	}catch(Exception p) {
	}
	
		
		}	
	}
	driver.close();

	}
}
//	/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]/a
//  /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[3]/a