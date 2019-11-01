package com.DatabaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

public class OrangeHRMLoginByDB {
WebDriver driver=null;
String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginvalidationtestbydatabase() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

		String url2= "jdbc:mysql://localhost:3305/test";
String dbname="test";
String dbdriver="com.mysql.jdbc.Driver";
String un="root";
String pwd="mahesh_01";
Class.forName(dbdriver).newInstance();

Connection conn=DriverManager.getConnection(url2, un, pwd);
Statement psmt=conn.createStatement();
ResultSet rs=psmt.executeQuery("select * from data2");

while(rs.next()) {
	String uname=rs.getString("un");
	String pname=rs.getString("pwd");
	System.out.println(uname+" "+pname);
//	driver.findElement(By.id("txtUsername")).sendKeys(rs.getString(1));
//	driver.findElement(By.id("txtPassword")).sendKeys(rs.getString(2));
//	driver.findElement(By.id("btnLogin")).click();
}
rs.close();
conn.close();
	}
	

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
