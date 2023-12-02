package com.amazon.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseClass;

public class SearchPage extends BaseClass{
	WebElement result = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-bold']"));
	                                                 
	//WebElement selectProduct =  driver.findElement(By.xpath("//span[@class=a-size-medium a-color-base a-text-normal]"));
	
public SearchPage() {
		
		PageFactory.initElements(driver, this);
	}

public String validateResult() {
	//return driver.findElement(By.xpath("//img[@class='s-image']")).isDisplayed();
	return driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-bold']")).getText();
}

public ProductPage clickOnProduct() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//img[@class=\"s-image\"]")).click();
	return new ProductPage();
}

}
