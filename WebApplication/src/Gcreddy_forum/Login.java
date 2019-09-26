package Gcreddy_forum;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = null;
String url="http://www.gcreddy.com/forum/";
System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
driver = new FirefoxDriver();
driver.get(url);
//<span>Register</span>
driver.findElement(By.linkText("Register")).click();

//<input type="submit" name="agreed" id="agreed" value="I agree to these terms" class="button1">driver.findElement(By.id("agreed")).click();
driver.findElement(By.id("agreed")).click();

//<input type="text" tabindex="1" name="username" id="username" size="25" value="" class="inputbox autowidth" title="Username">
	driver.findElement(By.id("username")).sendKeys("nathiya1234");
	driver.findElement(By.id("email")).sendKeys("nathiya3212@gmail.com");
	driver.findElement(By.id("new_password")).sendKeys("abcdef");
	driver.findElement(By.id("password_confirm")).sendKeys("abcdef");
	Scanner scan = new Scanner(System.in);
	System.out.println("enter captcha");
	String captcha=scan.nextLine();
	driver.findElement(By.id("confirm_code")).sendKeys(captcha);
	driver.findElement(By.id("submit")).click();
	
	driver.quit();
	

	
	
	
	
	}

}
