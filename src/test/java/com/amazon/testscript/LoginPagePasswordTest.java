package com.amazon.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseClass;
import com.amazon.pageobjects.HomePage;
import com.amazon.pageobjects.IndexPage;
import com.amazon.pageobjects.LoginPage;
import com.amazon.pageobjects.LoginPagePassword;
import com.amazon.utility.TakeScreenshot;

public class LoginPagePasswordTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	LoginPagePassword loginPagePassword;
	HomePage homePage;
	
	@BeforeMethod
	public void setup(){
		launchApp();		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void loginPagePasswordTest() {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignInButton();
		loginPagePassword = loginPage.clickOnContinueButton("7899072088");
		homePage = loginPagePassword.clickOnSignInButton("Iceberg@123");
		String actualURL = homePage.getHomePageURL();
		String expectedURL = "https://www.amazon.com/?ref_=nav_ya_signin";
		TakeScreenshot.screenShot(driver);
		Assert.assertEquals(actualURL,expectedURL);
	}

}
