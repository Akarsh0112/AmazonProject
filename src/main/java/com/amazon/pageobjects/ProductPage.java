package com.amazon.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseClass;

public class ProductPage extends BaseClass{
	
	WebElement availability = driver.findElement(By.id("availability"));
	WebElement addToCart= driver.findElement(By.id("add-to-cart-button"));
	WebElement price =driver.findElement(By.xpath("//div[@id='priceTracker_feature_div']"));
	
public ProductPage() {
		
		PageFactory.initElements(driver, this);
	}

public String validateAddToCart() {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver.findElement(By.xpath("//span[@id=\"submit.add-to-cart\"]//span[@id='submit.add-to-cart-announce']")).getText();
}

public CartDetailsPage clickOnAddToCart() {
	driver.findElement(By.id("add-to-cart-button")).click();
	return new CartDetailsPage();
}

}
