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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

public class OrangeHRMLoginByDB {
WebDriver driver=null;
String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
Connection conn;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\WebApplication\\DriverFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginvalidationtestbydatabase() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

		String url2= "jdbc:mysql:thin://localhost:3305/world";
String dbname="world";
String dbdriver="com.mysql.jdbc.Driver";
String un="root";
String pwd="mahesh_01";
Class.forName(dbdriver).newInstance();
conn=DriverManager.getConnection(url2, un, pwd);
Statement psmt=conn.createStatement();
ResultSet rs=psmt.executeQuery("select * from orm");

while(rs.next()) {
	String uname=rs.getString("username");
	String pname=rs.getString("password");
	driver.findElement(By.id("txtUsername")).sendKeys(uname);
	driver.findElement(By.id("txtPassword")).sendKeys(pname);
	driver.findElement(By.id("btnLogin")).click();
}

conn.close();
	}
	

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
