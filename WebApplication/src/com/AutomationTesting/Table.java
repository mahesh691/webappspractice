package com.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) {
		WebDriver driver= null;
		String url="http://demo.automationtesting.in/WebTable.html";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement tb=driver.findElement(By.className("ui-grid-viewport ng-isolate-scope"));
		tb.findElements(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div"));
		tb.getText();
		System.out.println(tb.getText());
		driver.close();
	}

}
