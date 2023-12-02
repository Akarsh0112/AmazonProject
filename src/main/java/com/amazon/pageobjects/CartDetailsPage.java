package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseClass;

public class CartDetailsPage extends BaseClass{
	
	WebElement addedToCart = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"));
	WebElement proceedToCheckout = driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@name='proceedToRetailCheckout']"));
	
public CartDetailsPage() {
		
		PageFactory.initElements(driver, this);
	}

public boolean validateProceedToCheckout() {
return	driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@name='proceedToRetailCheckout']")).isDisplayed();
}

public CheckoutPage clickOnProceedToCheckout() {
	driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@name='proceedToRetailCheckout']")).click();
	return new CheckoutPage();
	
}
	

}
