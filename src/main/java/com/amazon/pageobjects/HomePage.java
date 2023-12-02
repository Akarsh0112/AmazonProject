package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseClass;

public class HomePage extends BaseClass{
	
	WebElement searchAmazon = driver.findElement(By.id("twotabsearchtextbox"));
	WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	
public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

public String getHomePageURL() {
	return driver.getCurrentUrl();
}

public boolean validateSearchAmazon() {
	return driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
}

public SearchPage clickOnSearchButton(String product) {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	driver.findElement(By.id("nav-search-submit-button")).click();
	return new SearchPage();
	
}

}
