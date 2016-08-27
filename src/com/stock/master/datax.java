
package com.stock.master;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class datax extends Stock_Lib{
	
	private static final String String = null;
	Stock_Lib sl= new Stock_Lib();
	

	@BeforeSuite
	public void Launch()
	{
		driver = new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		
		
	}
	
	@AfterSuite
	public void exit()
	{
		driver.close();
		
	}
	
	@Parameters({"au","se"})
	@Test
	
	public void datax(String au,String se) throws IOException
	{
		sl.unitOfMeasur(au,se);
		
	}
	
	
	
	/*@Test(dataProvider="ddp")
	public void dp(String cell1,String cell2) throws IOException
	{
	
		sl.unitOfMeasur(cell1,cell2);
		
		
	}
	@DataProvider
	public Object[][] ddp()
	{
		Object[][] ob= new Object[2][2];
		ob[0][0]="212";
		ob[0][1]="zaki21";
		ob[1][0]="213";
		ob[1][1]="zaki23";
		return ob;
	
	}
	*/
	@BeforeTest
	public void Log() throws IOException
	{
	sl.logIn("admin","master");
	
	}
	
	@AfterTest
	
	public void Logo() throws IOException
	{
	sl.dclose();
	
	}
	
	
	
	
	
	
}
