package com.ExcelDataTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OrangeHRM_loginFunction {
	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		
		
		FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcellData\\Data_asign.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("OrangeHRM");
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		for(int r=1;r<=rowcount;r++) {
			Row row=sheet.getRow(r);
			int cellcount=row.getLastCellNum();
			
			
			if((r==r)) {
			String username=row.getCell(0).getStringCellValue();	
			System.out.println("user name : "+username);
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			String password=row.getCell(1).getStringCellValue();	
			System.out.println("password : "+password);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();
			}else {
				System.out.println("failed login");
			}
			try {
				String expurl="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/dashboard";
				System.out.println("expected current url is :"+ expurl);
				Thread.sleep(2000);
				String acturl=driver.getCurrentUrl();
				System.out.println("actual current url is :"+ acturl);
					
					if(acturl.equals(expurl))
					{
						System.out.println("Loggedin to OrangeHRM _ pass");
						sheet.createRow(r).createCell(2).setCellValue("pass");
						
						FileOutputStream update = new FileOutputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcellData\\Data_asign.xlsx");
						wb.write(update);
						
						
					}else {
						TakesScreenshot	ts=(TakesScreenshot)driver;
						File ormHRMfailed_ScreenShot=ts.getScreenshotAs(OutputType.FILE);
						
						FileUtils.copyFile(ormHRMfailed_ScreenShot,new File("E:\\JavaProgrammes\\WebApplication\\screenShots\\ormuser"+r+".png"));
						
						System.out.println("login_fail");
						
						sheet.createRow(r).createCell(2).setCellValue("fail");
						
						FileOutputStream update = new FileOutputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\NewTourLoginvalidation_result\\orhrmResult.xlsx");
						wb.write(update);
						
						
					}
					
				WebElement welcome=driver.findElement(By.linkText("Welcome Admin"));
				welcome.click();
				driver.findElement(By.linkText("Logout")).click();
				}catch(Exception p) {
					
				}
			}
		
		
		
		}
	}
				

