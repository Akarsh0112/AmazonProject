package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseClass;

public class LoginPagePassword extends BaseClass{
	WebElement password = driver.findElement(By.id("ap_password"));
	WebElement signInButton = driver.findElement(By.id("signInSubmit"));
	
public LoginPagePassword() {
		
		PageFactory.initElements(driver, this);
	}

public HomePage clickOnSignInButton(String passwd) {
	driver.findElement(By.id("ap_password")).sendKeys(passwd);
	driver.findElement(By.id("signInSubmit")).click();
	return new HomePage();
	
}

public String getCurrentURL() {
	return driver.getCurrentUrl();
}

}
