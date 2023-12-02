package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseClass;

public class CheckoutPage extends BaseClass{
	
	WebElement shippingAddress = driver.findElement(By.xpath("//div[@aria-label=\"Choose a shipping address\"]"));
	//WebElement orderSummary = driver.findElement(By.xpath("//h3[@class='a-spacing-base a-spacing-top-micro']"));
	
     public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
     
     public boolean validateShippingAddress() {
    	return driver.findElement(By.xpath("//div[@aria-label=\"Choose a shipping address\"]")).isDisplayed();
     }
}
