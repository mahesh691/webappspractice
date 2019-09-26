package com.ExcelDataTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTour_countryNames {

	public static void main(String[] args) throws IOException {
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
		FileInputStream file = new FileInputStream(".\\\\src\\\\com\\\\ExcellData\\\\dataText.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		Row r=sheet.createRow(i);
		Cell c=r.createCell(0);
		c.setCellValue(countryName);
		
		FileOutputStream update = new FileOutputStream(".\\\\src\\\\com\\\\ExcellData\\\\dataText.xlsx");
		workbook.write(update);
	}

		
		
	}

}
