package com.stock.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {

	
	@FindBy (xpath=".//*[@id='mi_a_suppliers']/a")
	WebElement supp;
	
	@FindBy (xpath=".//*[@id='mi_a_purchases']/a")
	WebElement pur ;

	public void supp()
	{
supp.click();
	}
	public void pur()
	{
pur.click();
	}
	
	
}




