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

public class TimeandDate {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody"));
		List<WebElement> rows=data.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		FileInputStream file = new FileInputStream(".\\\\src\\\\com\\\\ExcellData\\\\dataText.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet2");
		
		for(int i=0;i<rows.size();i++) {
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			cols.size();
			Row r=sheet.createRow(i);
			for(int k=0;k<cols.size();k++) {
				String colsName=cols.get(k).getText();
				System.out.print(colsName+"  ");
				
				Cell c=r.createCell(k);
				c.setCellValue(cols.get(k).getText());
				FileOutputStream update = new FileOutputStream(".\\\\src\\\\com\\\\ExcellData\\\\dataText.xlsx");
				workbook.write(update);
				
			}
			System.out.println();
		}
	}
}
