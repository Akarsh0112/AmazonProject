package com.amazon.pageobjects;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseClass;

public class IndexPage extends BaseClass{
	
	WebElement signInButton = driver.findElement(By.xpath("//div[@id='nav-al-signin']//span[@class='nav-action-inner']"));
	WebElement searchProductBox = driver.findElement(By.id("twotabsearchtextbox"));
	WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	WebElement amazonLogo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	
	public IndexPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String getAmazonTitle() {
		String amazonTitle = driver.getTitle();
		return amazonTitle;
	}
	
	public boolean validateLogo() {
	return driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
	}
	
	
	
	public LoginPage clickOnSignInButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//signInButton.click();
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
		return new LoginPage();
	}
	
	
}

