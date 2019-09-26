package com.TestNG_methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import okhttp3.internal.connection.RouteSelector.Selection;

public class NewTours_Registration extends Base_newtour {

	@Test(priority=1)
	public void registrationPage() {
		driver.findElement(By.linkText("REGISTER")).click();
		
		String expected_registerTitlePage="Register";
		System.out.println("the expected title of the register page :"+expected_registerTitlePage);
		
	String actual_registerTitlePage=driver.getTitle();
	System.out.println("the actual title of the register page :"+actual_registerTitlePage);
	if(actual_registerTitlePage.contains(expected_registerTitlePage)) {
		System.out.println("register page is opened");
	}else {
		System.out.println("error in opening in register page");
		
	}
	}
	
	@Test(priority=2)
	public void filling_form() throws IOException, InterruptedException {
		FileInputStream file=new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcellData\\Data_asign.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook(file);
		XSSFSheet sh=wb1.getSheet("Sheet3");
		
		String un=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.name("firstName")).sendKeys(un);
		
		String ln=sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.name("lastName")).sendKeys(ln);
		
		Cell cell21=sh.getRow(2).getCell(1);
		cell21.setCellType(CellType.STRING);
		driver.findElement(By.name("phone")).sendKeys(String.valueOf(cell21.getStringCellValue()));
		
		String email=sh.getRow(3).getCell(1).getStringCellValue();
		driver.findElement(By.id("userName")).sendKeys(email);
		
		String add1=sh.getRow(4).getCell(1).getStringCellValue();
		driver.findElement(By.name("address1")).sendKeys(add1);
		
		String city1=sh.getRow(6).getCell(1).getStringCellValue();
		driver.findElement(By.name("city")).sendKeys(city1);
		
		String state1=sh.getRow(7).getCell(1).getStringCellValue();
		driver.findElement(By.name("state")).sendKeys(state1);
		
		double d=sh.getRow(8).getCell(1).getNumericCellValue();
		long pc=(long)d;
		String password=Long.toString(pc);
		driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(password));
		
		String country91=sh.getRow(9).getCell(1).getStringCellValue();
		WebElement c1=driver.findElement(By.name("country"));
		c1.click();
		Select selection= new Select(c1);
		selection.selectByVisibleText(country91);
		
		
		String email101=sh.getRow(10).getCell(1).getStringCellValue();
		driver.findElement(By.name("email")).sendKeys(email101);
		
		String password111=sh.getRow(11).getCell(1).getStringCellValue();
		
		driver.findElement(By.name("password")).sendKeys(password111);
		
		String confirmPassword121=sh.getRow(12).getCell(1).getStringCellValue();
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword121);
		
	
		driver.findElement(By.name("register")).click();
		
		
		
	}

	private String Long(long x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
}
