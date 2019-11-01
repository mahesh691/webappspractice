package com.PracticeSelenium;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
public class DropDown extends Base
{
@Test
private void selection() throws InterruptedException, IOException {
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scrollBy(0, 120)");  
 
	WebElement cl=driver.findElement(By.name("country"));
	
	List<WebElement> clnames=cl.findElements(By.tagName("option"));
	
	int clnamescount=clnames.size();
	
	System.out.println("number of countries : "+ clnamescount);
	
	FileInputStream fis=new FileInputStream("C:\\Users\\user\\git\\repository\\myrepository\\WebApplication\\src\\com\\PracticeSelenium\\orhrm.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet("sheet2");
	
	
	for(int i=0;i<clnamescount;i++) 
	{
	Row r=sh.createRow(i);
	
		String cname=clnames.get(i).getText();
		r.createCell(0).setCellValue(cname);
		Select selection=new Select(cl);
		selection.selectByIndex(i);
	
		System.out.println(cname);
	
		cl=driver.findElement(By.name("country"));
		
		

	}
	FileOutputStream fi=new FileOutputStream("C:\\Users\\user\\git\\repository\\myrepository\\WebApplication\\src\\com\\PracticeSelenium\\orhrm.xlsx");
	wb.write(fi);
	
 
}
}
