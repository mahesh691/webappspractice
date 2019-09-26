package com.Newtour.deoaut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register_urlSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(url);
//		<a href="mercuryregister.php?osCsid=bd5b94f6cf335eb99c134f1d79e207e9">REGISTER</a>
		WebElement register_element=driver.findElement(By.linkText("REGISTER"));
		
		String registerElement_Text=register_element.getAttribute("href");
		System.out.println("text name of the register :"+registerElement_Text);

		Thread.sleep(2000);
		
		register_element.click();
		String expectedRegister_url="http://newtours.demoaut.com/mercuryregister.php";
		String register_url=driver.getCurrentUrl();
		System.out.println("actual the register url of the after entering register page :"+ register_url);
		
		if(register_url.contains(expectedRegister_url)) {
			System.out.println("the url matched : pass");
		}else {
			System.out.println("the url not matched : fail");
		}
	
		driver.close();
	
	}

}
