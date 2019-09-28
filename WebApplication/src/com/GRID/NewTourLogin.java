package com.GRID;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTourLogin {

	@Parameters("Browser")
	@Test
	public void Login(String browser) throws IOException, InterruptedException {
		System.out.println("the browser name is :"+browser);
		String huburl="http://192.168.1.11:4444/wd/hub";

		DesiredCapabilities caps = null;
		if(browser.equalsIgnoreCase("edge")) {
			caps=new DesiredCapabilities();
			caps.setBrowserName("edge");
			caps.setPlatform(Platform.WINDOWS);

		}else 
			if(browser.equalsIgnoreCase("firefox")) {
				caps=new DesiredCapabilities();
				caps.setBrowserName("firefox");
				caps.setPlatform(Platform.WINDOWS);
			}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL(huburl),caps);
		String url="http://newtours.demoaut.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcellData\\Data_asign.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("NewtourRegister");
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		for(int r=1;r<=rowcount;r++) {
			Row row=sheet.getRow(r);
			int cellcount=row.getLastCellNum();
			
			String username=sheet.getRow(r).getCell(0).getStringCellValue();	
			System.out.println("user name : "+username);
			String password=sheet.getRow(r).getCell(1).getStringCellValue();	
			System.out.println("password : "+password);
			WebElement un=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
			un.clear();
			un.sendKeys(username);
			WebElement pw=driver.findElement(By.name("password"));
			pw.clear();
			pw.sendKeys(password);
			
		WebElement lognin1=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
		lognin1.click();
		
			String act_title=driver.getTitle();
			System.out.println("actual title of the signin page :"+act_title);
			String exp_title="Find";
			System.out.println("expected title of the sign in page  :"+exp_title);
			
					if(act_title.contains(exp_title))
					{
						System.out.println("Loggedin to newtour _ pass");
						WebElement signOff=driver.findElement(By.linkText("SIGN-OFF"));
						sheet.getRow(r).createCell(2).setCellValue("pass");
						
						FileOutputStream update = new FileOutputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\NewTourLoginvalidation_result\\ntresult.xlsx");
						wb.write(update);
						
						signOff.click();
						
						
					}else {
						
						Thread.sleep(5000);
						TakesScreenshot	ts=(TakesScreenshot)driver;
						File newTourfailed_ScreenShot=ts.getScreenshotAs(OutputType.FILE);
						
						FileUtils.copyFile(newTourfailed_ScreenShot,new File("E:\\JavaProgrammes\\WebApplication\\screenShots\\newtourUser"+r+".png"));
						
						System.out.println("login_fail");
						
						sheet.getRow(r).createCell(2).setCellValue("fail");
						
						FileOutputStream update = new FileOutputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\NewTourLoginvalidation_result\\ntresult.xlsx");
						wb.write(update);
						

					}
					
					
					driver.navigate().back();
				
					
				} driver.quit();
		}

	
	
	}
	
	
	

