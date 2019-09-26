package com.TestNG_methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OHRM_loginvalidation extends Base {
//successfull programme
	@Test
	public void logIN() throws InterruptedException, IOException {
		FileInputStream file=new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcellData\\Data_asign.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet st=wb.getSheet("OrangeHRM");
		int rc=st.getLastRowNum();
		
		for(int i=1;i<=rc;i++) {
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtPassword")).clear();
			
		String 	username=st.getRow(i).getCell(0).getStringCellValue();
		String 	password=st.getRow(i).getCell(1).getStringCellValue();	

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		String actual_current_url=driver.getCurrentUrl();
		System.out.println("actual current page url is  :"+ actual_current_url);
		
		String expected_current_url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/dashboard";
		System.out.println("actual current page url is  :"+expected_current_url);
		
		if(actual_current_url.equals(expected_current_url))
		{
			System.out.println("Loggedin to OrangeHRM _ pass");
			
			st.getRow(i).createCell(2).setCellValue("login-pass");
			FileOutputStream file1=new FileOutputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\TestNGresults\\ohrmLoginValidationResult.xlsx");
			wb.write(file1);
			
			WebElement welcome=driver.findElement(By.linkText("Welcome Admin"));
			welcome.click();
			driver.findElement(By.linkText("Logout")).click();
			
		}else {
			System.out.println("Error message dispaly to login_fail");
			
			TakesScreenshot f=(TakesScreenshot)driver;
			f.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f.getScreenshotAs(OutputType.FILE),new File( "E:\\JavaProgrammes\\WebApplication\\screenShots\\loginValidation"+i+".png"));
			
			FileOutputStream file1=new FileOutputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\TestNGresults\\ohrmLoginValidationResult.xlsx");
			st.getRow(i).createCell(2).setCellValue("login-fail");
			wb.write(file1);
			file1.close();
			driver.navigate().back();
		}
			
			
		}
		
		//if condition
	}//loop
	}//test case

