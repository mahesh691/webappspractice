package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test2 {
	
	WebDriver driver;
	
void dataread(String username,String password) throws IOException {
//	FileInputStream file=new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\Practice\\orhrm.xlsx");
//	XSSFWorkbook wb=new XSSFWorkbook(file);
//	XSSFSheet s=wb.getSheet("Sheet1");
//	username=s.getRow(0).getCell(0).getStringCellValue();
//	
//	password=s.getRow(0).getCell(1).getStringCellValue();
//	System.out.println(username);
//	System.out.println(password);
	WebElement un=driver.findElement(By.id("txtUsername"));
	un.sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	
}


	

}
