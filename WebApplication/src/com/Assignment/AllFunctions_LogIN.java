package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AllFunctions_LogIN {
 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		String url = "http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("mahesh");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("mahesh_01");
		WebElement login=driver.findElement(By.className("button"));
		login.click();
		
	String exp_welcome="Welcome";
	String act_welcome=driver.findElement(By.linkText("Welcome Admin")).getText();
	System.out.println("actual welcome page of successfull login :"+act_welcome);
	System.out.println("expected welcome page of successfull login:"+exp_welcome );
		
	if(act_welcome.contains(exp_welcome)) {
		System.out.println("successfully login");
	}else {
		System.out.println("enter valid login trandentials");
	}
	
	System.out.println("---------- pim ------------");
	Thread.sleep(2000);

	WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
	Actions act1=new Actions(driver);
	act1.moveToElement(pim).perform();
	System.out.println("showing pim content ");
	Thread.sleep(2000);
	WebElement ae=driver.findElement(By.id("menu_pim_addEmployee"));
	ae.click();
	System.out.println("showing add employee page");
	Thread.sleep(2000);
	
	System.out.println("---------- validation of add employee ------------");
	String expEmployeeUrl="addEmployee";
	System.out.println("expected add employee url:"+expEmployeeUrl);
	String addEmployeeUrl=driver.getCurrentUrl();
	System.out.println("actual add employee url :"+addEmployeeUrl);
	if(addEmployeeUrl.contains(expEmployeeUrl)) {
		System.out.println("matched urls:pass");
	}else {
		System.out.println("not matched urls : fail");
	}
	String fn="srinivas";
	String ln="venkatesh";
	System.out.println("----------  add employee ------------");
	driver.findElement(By.id("firstName")).sendKeys(fn);
	driver.findElement(By.id("lastName")).sendKeys(ln);
	
	WebElement number=driver.findElement(By.id("employeeId"));
	 String empid=number.getAttribute("value");
	 System.out.println("expe_employee id:"+empid);
	 													//	String employeeid=driver.findElement(By.
	 	 											//	System.out.println(employeeid);
	driver.findElement(By.id("btnSave")).click();
	System.out.println();
	
	WebElement empPic=driver.findElement(By.linkText("Personal Details"));
	String expsavedurl=empPic.getAttribute("href");
	
	System.out.println("expected url of saved :"+expsavedurl);
	String actsavedurl=driver.getCurrentUrl();
	System.out.println("actual url of saved :"+actsavedurl);
	
	if(actsavedurl.equals(expsavedurl) ) {
		System.out.println("next page url matched : pass");
	}else {
		System.out.println("not matched next page url: fail");
	}
	
	WebElement name=driver.findElement(By.id("personal_txtEmpFirstName"));
	String nameEmployee=name.getAttribute("value");
	System.out.println("First name :"+nameEmployee);
	WebElement lastnamee=driver.findElement(By.id("personal_txtEmpLastName"));
	String lastnEmp=lastnamee.getAttribute("value");
	System.out.println("Last name :"+lastnEmp);
	WebElement actnumber=driver.findElement(By.id("personal_txtEmployeeId"));
	String actempid=actnumber.getAttribute("value");
	System.out.println("actual employee id:"+actempid);
	
	System.out.print("verifying first name :");
	System.out.println(nameEmployee.equals(fn));
	System.out.print("verifying last name :");
	System.out.println(lastnEmp.equals(ln));
	System.out.print("verifying employee id :");
	System.out.println(actempid.equals(empid));
	
	driver.findElement(By.linkText("Welcome Admin")).click();
	
	driver.findElement(By.linkText("Logout")).click();
	
	driver.quit();
	}

}
