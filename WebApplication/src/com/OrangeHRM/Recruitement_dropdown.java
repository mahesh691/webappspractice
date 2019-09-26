package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Recruitement_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =null;
		String url = "http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get( url);

		driver.findElement(By.id("txtUsername")).sendKeys("mahesh");
		//<input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("mahesh_01");
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement recr=driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
		Actions act1=new Actions(driver);
		act1.moveToElement(recr).perform();

Thread.sleep(1000);

		driver.findElement(By.id("menu_recruitment_viewCandidates")).click();
		
		WebElement status=driver.findElement(By.id("candidateSearch_status"));
		List<WebElement>statuslist=status.findElements(By.tagName("option"));
		int statuslistCount=statuslist.size();
		System.out.println(statuslistCount);
		
		for(int i=0;i<statuslistCount;i++) {
			String StatusName=statuslist.get(i).getText();
			for(int k=0;k<statuslistCount;k++) {
				statuslist.get(k).click(); //which one is selecting and only is selected in that list
				System.out.println(k+"_"+statuslist.get(k).getAttribute("value")+"-"+statuslist.get(i).isSelected());
			}
			
			
			
//			if(StatusName.equals(StatusName)) {
//				Select selection = new Select(status);
//				Thread.sleep(1000);
//				selection.selectByVisibleText(StatusName);
//			System.out.println("selected"+ StatusName);
//			}
		}
	
//	Select selection = new Select(status);
//	selection.selectByVisibleText("Application Initiated");
//	
	
	
	driver.close();
	
	
	
	}

}
