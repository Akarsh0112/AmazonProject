package com.amazon.testscript;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseClass;
import com.amazon.pageobjects.IndexPage;
import com.amazon.pageobjects.LoginPage;
import com.amazon.pageobjects.LoginPagePassword;
import com.amazon.utility.TakeScreenshot;

public class LoginPageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	LoginPagePassword loginPagePassword;
	
	@BeforeMethod
	public void setup(){
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		launchApp();
		//indexPage=new IndexPage();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void loginTest() {
		indexPage = new IndexPage();
		//loginPage = new LoginPage();
		loginPage = indexPage.clickOnSignInButton();
		loginPagePassword = loginPage.clickOnContinueButton("7899072088");
		String actualURL = loginPagePassword.getCurrentURL();
		String expectedURL = "https://www.amazon.com/ap/signin";
		TakeScreenshot.screenShot(driver);
		Assert.assertEquals(actualURL, expectedURL);
	}

}
