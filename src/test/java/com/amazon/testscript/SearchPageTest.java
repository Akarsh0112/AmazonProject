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
import com.amazon.pageobjects.ProductPage;
import com.amazon.pageobjects.SearchPage;
import com.amazon.utility.TakeScreenshot;

public class SearchPageTest extends BaseClass{
	IndexPage indexPage;
	LoginPage loginPage;
	LoginPagePassword loginPagePassword;
	HomePage homePage;
	SearchPage searchPage;
	ProductPage productPage;
	
	@BeforeMethod
	public void setup(){
		launchApp();		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void searchPageTest() {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignInButton();
		loginPagePassword = loginPage.clickOnContinueButton("7899072088");
		homePage = loginPagePassword.clickOnSignInButton("Iceberg@123");
		searchPage = homePage.clickOnSearchButton("mobile");
		//productPage = searchPage.clickOnProduct();
		String result = searchPage.validateResult();
		String expectedResult = "Results";
		TakeScreenshot.screenShot(driver);
		Assert.assertEquals(result,expectedResult);

}
}
