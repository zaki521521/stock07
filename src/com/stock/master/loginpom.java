package com.stock.master;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class loginpom{


	WebDriver driver =new FirefoxDriver();
	
	@Test
	public void logpom()
	{
	
		
		driver.get("http://webapp.qedgetech.com");
		
		loginpage lp= PageFactory.initElements(driver,loginpage.class);
		lp.login("admin","master");	

	}
	
@AfterTest
	
public void exit()
{
	
	
	homepage hp= PageFactory.initElements(driver,homepage.class);
	hp.supp();
	hp.pur();
	
	
	driver.close();
	
}
	

}
