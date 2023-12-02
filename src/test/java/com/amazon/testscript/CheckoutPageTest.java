package com.amazon.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseClass;
import com.amazon.pageobjects.CartDetailsPage;
import com.amazon.pageobjects.CheckoutPage;
import com.amazon.pageobjects.HomePage;
import com.amazon.pageobjects.IndexPage;
import com.amazon.pageobjects.LoginPage;
import com.amazon.pageobjects.LoginPagePassword;
import com.amazon.pageobjects.ProductPage;
import com.amazon.pageobjects.SearchPage;
import com.amazon.utility.TakeScreenshot;

public class CheckoutPageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	LoginPagePassword loginPagePassword;
	HomePage homePage;
	SearchPage searchPage;
	ProductPage productPage;
	CartDetailsPage cartDetails;
	CheckoutPage checkoutPage;
	
	@BeforeMethod
	public void setup(){
		launchApp();		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void checkoutPageTest() {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignInButton();
		loginPagePassword = loginPage.clickOnContinueButton("7899072088");
		homePage = loginPagePassword.clickOnSignInButton("Iceberg@123");
		searchPage = homePage.clickOnSearchButton("Mobile");
		productPage = searchPage.clickOnProduct();
		cartDetails = productPage.clickOnAddToCart();
		checkoutPage = cartDetails.clickOnProceedToCheckout();
		boolean result = checkoutPage.validateShippingAddress();
		TakeScreenshot.screenShot(driver);
		Assert.assertTrue(result);
		

}
}
