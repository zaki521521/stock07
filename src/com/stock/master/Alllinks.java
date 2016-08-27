package com.stock.master;


import java.util.List;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alllinks {

    public static void main(String[] args) {
        String baseUrl = "http://webapp.qedgetech.com";
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        WebElement un = driver.findElement(By.xpath(".//*[@id='username']"));
        WebElement pwd = driver.findElement(By.xpath(".//*[@id='password']"));
        WebElement LogIN = driver.findElement(By.xpath(".//*[@id='btnsubmit']"));
        WebElement reset = driver.findElement(By.xpath(".//*[@id='btnreset']"));
    reset.click();
  	un.sendKeys("admin");
  	pwd.sendKeys("master");
  	LogIN.click();
        String underConsTitle = "STOCK ACCOUNTING SYSTEM";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(baseUrl);
        
        
     
        
        
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println("\"" + t + "\""
                        + " is under construction.");
            } else {
                System.out.println("\"" + t + "\""
                        + " is working.");
            }
            driver.navigate().back();
        }
        driver.quit();
    }
}