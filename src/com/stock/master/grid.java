package com.stock.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class grid 

{
DesiredCapabilities cap=null;
@Parameters("Browser")
@Test
public void exe(String Br) throws MalformedURLException

{
   if (Br.equalsIgnoreCase("firefox")) 
   
   {
	   cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		}
   else if (Br.equalsIgnoreCase("chrome")) 
   {
	        cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
   else if (Br.equalsIgnoreCase("Ie")) 
   {
	        cap=new DesiredCapabilities();
			cap.setBrowserName("Ie");
			cap.setPlatform(Platform.ANY);
		
}

	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://10.0.0.15:4444/wd/hub"),cap);
	driver.get("http://webapp.qedgetech.com");
	driver.manage().window().maximize();
	
	loginpage LP=PageFactory.initElements(driver,loginpage.class);
	LP.login("admin","master");

}
}
