package com.ExcelDataTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ReporterConfig.Property;

public class orangeHRM_addEmployee {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String fn="";
		String mn="";
		String ln="";
		WebDriver driver =null;
		String url = "http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		FileInputStream file1= new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcelDataTesting\\orangeHRM_addEmployee.properties");
		Properties pr=new Properties();
		pr.load(file1);
		
		
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys("mahesh");
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys("mahesh_01");
		driver.findElement(By.id(pr.getProperty("loginbutton"))).click();
		
		FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcellData\\Data_asign.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("OHRMaddE");
		int rowcount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++) {
//		Thread.sleep(10000);
		WebElement pim=driver.findElement(By.id(pr.getProperty("PIM")));
		Actions act1=new Actions(driver);
		act1.moveToElement(pim).perform();
//		Thread.sleep(5000);	
		
		if(i==i) {
		
		WebElement ae=driver.findElement(By.id(pr.getProperty("PIMmenu")));
		ae.click();
		fn=sheet.getRow(i).getCell(0).getStringCellValue();
		mn=sheet.getRow(i).getCell(1).getStringCellValue();
		ln=sheet.getRow(i).getCell(2).getStringCellValue();
		
		driver.findElement(By.id(pr.getProperty("FirstName"))).clear();
		driver.findElement(By.id(pr.getProperty("FirstName"))).sendKeys(fn);
		 
		driver.findElement(By.id(pr.getProperty("MddleName"))).clear();
		driver.findElement(By.id(pr.getProperty("MddleName"))).sendKeys(mn);
		
		driver.findElement(By.id(pr.getProperty("LastName"))).clear();
		driver.findElement(By.id(pr.getProperty("LastName"))).sendKeys(ln);
		
		driver.findElement(By.id(pr.getProperty("SaveButton"))).click();
		
		
		String id=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		String h11=driver.findElement(By.tagName(pr.getProperty("header"))).getText();
		System.out.println("employee registered name :"+ id +" "+ h11);
		
		driver.navigate().back();

		
		
		
			}
		}
		
		driver.close();
	}

}
	

