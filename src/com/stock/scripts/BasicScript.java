package com.stock.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class BasicScript {
	
	public static void main(String[] args) {
	
      WebDriver driver= new FirefoxDriver();
      driver.get("http://webapp.qedgetech.com");
   
     /* WebElement cross = driver.findElement(By.xpath(".//*[@id='msLoginDialog']/div/div/div[1]/button"));
      cross.click();
      WebElement lbtn = driver.findElement(By.xpath(".//*[@id='mi_login']/a"));
      lbtn.click();
      */
      WebElement un = driver.findElement(By.xpath(".//*[@id='username']"));
      WebElement pwd = driver.findElement(By.xpath(".//*[@id='password']"));
      WebElement LogIN = driver.findElement(By.xpath(".//*[@id='btnsubmit']"));
      WebElement reset = driver.findElement(By.xpath(".//*[@id='btnreset']"));
  reset.click();
	un.sendKeys("admin");
	pwd.sendKeys("master");
	LogIN.click();
	/*
	
    WebElement suppliers = driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a"));
    suppliers.click();
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
    sname.sendKeys("zak211");
    saddress.sendKeys("zak211");
    scity.sendKeys("zak211");
    scountry.sendKeys("zak211");
    scontactperson.sendKeys("zak211");
    sphone.sendKeys("zak211");
    semail.sendKeys("zak211");
    smobile.sendKeys("zak211");
    snotes.sendKeys("zak211");
    WebElement saddd  = driver.findElement(By.xpath(".//*[@id='btnAction']"));
    saddd.click();
    
    WebElement saccept  = driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]"));
   saccept.click();
   Sleeper.sleepTightInSeconds(2);
    
   WebElement salrt  = driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button"));
   salrt.click();
   
*/

    
   Actions sa=new Actions(driver);
   sa.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
   WebElement scategories  = driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a"));
  scategories.click();
  /*
  WebElement scadd  = driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span"));
   scadd.click();
   /*suppliers search
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
  
  /*
  Alert a= driver.switchTo().alert();
  String s= a.getText();
  System.out.println("alert displayed as" +s);
  a.accept();
  */
  int rc = driver.findElements(By.xpath(".//*[@id='r1_a_stock_categories']/td")).size();
  

	
	}
}

