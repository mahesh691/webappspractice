package com.WebTable;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver =null;
String url = "http://demo.guru99.com/test/web-table-element.php";
System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
driver =new FirefoxDriver();
driver.manage().window().maximize();
driver.get(url);
List<WebElement> sub=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/table/thead/tr/th"));

	System.out.println(sub.size());
	


	
	}

}
