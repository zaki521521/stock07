package com.stock.master;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class examplNG 
{

	public static WebDriver driver;
	public static String Expval,Actual;
	public static Properties p;
	public static FileInputStream fis;
	
	@BeforeTest
	public void login() throws IOException
	{
		driver = new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		 p= new Properties();
    	 fis= new FileInputStream("D:\\Zaki\\ERP\\src\\com\\stock\\properties\\Rep.properties");
    	 p.load(fis);
		 WebElement uni = driver.findElement(By.id(p.getProperty("unname")));
         WebElement pwdi = driver.findElement(By.xpath(p.getProperty("pwd123")));
         WebElement LogIN = driver.findElement(By.id(p.getProperty("login")));
         WebElement reset = driver.findElement(By.id(p.getProperty("reset")));
     reset.click();
   	uni.sendKeys("admin");
   	pwdi.sendKeys("master");
   	LogIN.click();	
	}
	
	@BeforeMethod
	public void home()
	{
		Actual= driver.getTitle();
	    Expval ="« Stock Accounting System";	
	 Assert.assertEquals(Expval, Actual);
	    
	}
	
	@Test ()
	public void supp()
	{
	
		WebElement sup = driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a"));
		sup.click();
		Actual= driver.getTitle();
	
	    Expval ="Suppliers « Stock Accounting System";	
		 Assert.assertEquals(Expval, Actual);
	}
	
	@Test ()
	public void sales()
	{
	
		WebElement sal = driver.findElement(By.xpath(".//*[@id='mi_a_sales']/a"));
		sal.click();
		Actual= driver.getTitle();
	    Expval ="Sales « Stock Accounting System";	
		 Assert.assertEquals(Expval, Actual);
	}
	
	@AfterMethod
	public void back()
	{
		WebElement backh = driver.findElement(By.xpath(".//*[@id='mi_dashboard_php']/a"));
		backh.click();
	
	}
	
	
}
