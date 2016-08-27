
package com.stock.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
	@FindBy (id="username")
	WebElement uname;
	
	@FindBy (xpath=".//*[@id='password']")
	WebElement pwd;
	
	@FindBy (id="btnsubmit")
	WebElement login;
	
	@FindBy (id="btnreset")
	WebElement reset;
	
	
	public void login(String un,String pwde)
	{
		reset.click();
		uname.sendKeys(un);
		pwd.sendKeys(pwde);
		login.click();
		
		
	}
	
}

