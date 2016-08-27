package com.stock.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Stock_Lib {
	
	public static WebDriver driver;
	public static String Expval,Actual;
	public static Properties p;
	public static FileInputStream fis;
	
	
	
	public String openApp(String Url)
	{
		driver = new FirefoxDriver();
		Expval ="« Stock Accounting System";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Url);
		 Actual=driver.findElement(By.xpath(".//*[@id='msLoginDialog']/div/div/div[1]/h4")).getText();
		 if(Expval==Actual)
			return "LogIn launch fail";
		
		 else
			 return "LogIn launch pass"; 
		 }
//use of properties
     public String logIn(String un,String pwd) throws IOException
     {
    	 p= new Properties();
    	 fis= new FileInputStream("D:\\zaki\\ERP\\src\\com\\stock\\properties\\Rep.properties");
    	 p.load(fis);
    	 WebElement uni = driver.findElement(By.id(p.getProperty("unname")));
         WebElement pwdi = driver.findElement(By.xpath(p.getProperty("pwd123")));
         WebElement LogIN = driver.findElement(By.id(p.getProperty("login")));
         WebElement reset = driver.findElement(By.id(p.getProperty("reset")));
     reset.click();
   	uni.sendKeys(un);
   	pwdi.sendKeys(pwd);
   	LogIN.click();
   	String titl= driver.getTitle();
   	System.out.println("Page title after LogIN is" +titl);
    if(driver.getTitle()=="STOCK ACCOUNTING")
		return "LogIn Validation Passes";
	
	 else
		 return "LogIn Validation Fail"; 
     }

     public void suppliers()
     
     {
    	
     WebElement suppliers = driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a"));
     String bgcolor=suppliers.getCssValue("background-color");
     System.out.println(bgcolor);
     suppliers.click();
     Sleeper.sleepTightInSeconds(2);
     WebElement suppliers1 = driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a"));
     String bgcolor1=suppliers1.getCssValue("background-color");
     System.out.println(bgcolor1);
     
     WebElement sadd = driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span"));
     sadd.click();
     WebElement sname  = driver.findElement(By.xpath(".//*[@id='x_Supplier_Name']"));
     WebElement saddress  = driver.findElement(By.xpath(".//*[@id='x_Address']"));
     WebElement scity  = driver.findElement(By.xpath(".//*[@id='x_City']"));
     WebElement scountry  = driver.findElement(By.xpath(".//*[@id='x_Country']"));
     WebElement scontactperson  = driver.findElement(By.xpath(".//*[@id='x_Contact_Person']"));
     WebElement sphone  = driver.findElement(By.xpath(".//*[@id='x_Phone_Number']"));
     WebElement semail = driver.findElement(By.xpath(".//*[@id='x__Email']"));
     WebElement smobile  = driver.findElement(By.xpath(".//*[@id='x_Mobile_Number']"));
     WebElement snotes  = driver.findElement(By.xpath(".//*[@id='x_Notes']"));
     sname.sendKeys("far22");
     saddress.sendKeys("far22");
     scity.sendKeys("far22");
     scountry.sendKeys("far22");
     scontactperson.sendKeys("far22");
     sphone.sendKeys("far22");
     semail.sendKeys("far22");
     smobile.sendKeys("far22");
     snotes.sendKeys("far22");
     WebElement saddd  = driver.findElement(By.xpath(".//*[@id='btnAction']"));
     saddd.click();
     
     WebElement saccept  = driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]"));
    saccept.click();
    Sleeper.sleepTightInSeconds(2);
     
    WebElement salrt  = driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button"));
    salrt.click();
    
    System.out.println("Successful");
    
     }
     
     public void supliersearchAndstockItems()
     {
    	 
    	 Actions sa=new Actions(driver);
    	   sa.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
    	   WebElement scategories  = driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a"));
    	  scategories.click();
    	  
    	  WebElement scadd  = driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span"));
    	   scadd.click();
    	
    	   WebElement supplierss = driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a"));
    	   supplierss.click();
    	   WebElement searchh  = driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[2]/div[2]/div/button"));
    	   searchh.click();
    	   WebElement search  = driver.findElement(By.xpath(".//*[@id='psearch']"));
    	   search.sendKeys("ikazo");
    	   WebElement searchhh  = driver.findElement(By.xpath(".//*[@id='btnsubmit']"));
    	   
    	   searchhh.click();

    	   WebElement cadd  = driver.findElement(By.xpath(".//*[@id='x_Category_Name']"));
    	   cadd.sendKeys("ikazo");
    	   WebElement caddd  = driver.findElement(By.xpath(".//*[@id='btnAction']"));
    	   caddd.click();
    	   Sleeper.sleepTightInSeconds(5);
    	  WebElement cdd  = driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]"));
    	  cdd.click();
    	  Sleeper.sleepTightInSeconds(5);
    	  
    	  WebElement aler  = driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button"));
    	  aler.click();
     }
     
     public String unitOfMeasur(String cell1,String cell2) throws IOException
     {
    	 
    	 Actions sa=new Actions(driver);
  	   sa.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
  	   WebElement uom  = driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a"));
  	  uom.click();
  	 WebElement uoadd  = driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span"));
	   uoadd.click();
    	 


	   
	   WebElement uid  = driver.findElement(By.xpath(".//*[@id='x_UOM_ID']"));
	   
	   uid.sendKeys(cell1);
	   
  	 
	   WebElement uod  = driver.findElement(By.xpath(".//*[@id='x_UOM_Description']"));
	   
	   uod.sendKeys(cell2);
	   
	   
 WebElement addbut  = driver.findElement(By.xpath(".//*[@id='btnAction']"));
addbut.click();

WebElement adaler  = driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]"));
adaler.click();
Sleeper.sleepTightInSeconds(3);


WebElement adaler1  = driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button"));
adaler1.click();
return "pass";
/*
WebElement tdd  = driver.findElement(By.xpath(".//*[@id='r1_a_unit_of_measurement']/td[3]/div"));
String se= tdd.getText();
System.out.println("fari");
System.out.println(se);
return null;
*/
     }
     

     
     
     public void dclose()
     {
    	 driver.close();
    	 
    	 
     }
     
     
     
     
     
}