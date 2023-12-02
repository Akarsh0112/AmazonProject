package com.amazon.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.amazon.base.BaseClass;

public class TakeScreenshot extends BaseClass{
	
	public static void screenShot(WebDriver driver) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("C:\\Users\\Administrator\\eclipse-workspace\\AmazonTesting\\ScreenShots\\ScreenShot1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
