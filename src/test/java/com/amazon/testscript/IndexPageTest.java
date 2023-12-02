package com.amazon.testscript;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseClass;
import com.amazon.pageobjects.IndexPage;
import com.amazon.utility.TakeScreenshot;

public class IndexPageTest extends BaseClass {
	
	private IndexPage indexPage;
	
	
	@BeforeMethod
	public void setup(){
		launchApp();
		indexPage = new IndexPage();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test
	public void verifyTitle() {
		String actualTitle=indexPage.getAmazonTitle();
		TakeScreenshot.screenShot(driver);
		Assert.assertEquals(actualTitle, "Amazon.com. Spend less. Smile more.");
		
	}
	
	@Test
	public void verifyLogo() {
		boolean result = indexPage.validateLogo();
		TakeScreenshot.screenShot(driver);
		Assert.assertTrue(result);
	}
	
}
	


