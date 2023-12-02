package com.amazon.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	
          // TODO Auto-generated method stub
		
		
			public static void launchApp() {
			    WebDriverManager.chromedriver().setup();
			    WebDriverManager.firefoxdriver().setup();
			    WebDriverManager.iedriver().setup();
			    String browserName = "IE";
			    

			    if (browserName.equals("Chrome"))
			        driver = new ChromeDriver();
			    else if (browserName.equals("Firefox"))
			        driver = new FirefoxDriver();
			    else if (browserName.equals("IE"))
			        driver = new InternetExplorerDriver();

			    driver.get("https://www.amazon.com/");
			    driver.manage().window().maximize();
			}
			
		}


