package com.amazon.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseClass;

public class LoginPage extends BaseClass{
	WebElement email = driver.findElement(By.id("ap_email"));
	WebElement continueButton = driver.findElement(By.id("continue"));
	
	
public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

public LoginPagePassword clickOnContinueButton(String mailID) {
	
	email.sendKeys(mailID);	
	driver.findElement(By.id("continue")).click();
	return new LoginPagePassword();
}

}
