package com.Gitlab.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.Gitlab.Utilities.ReadConfig;



public class BaseClass {

	ReadConfig config = new ReadConfig();
	
	public static WebDriver driver;
	public String baseURL= config.getApplicationURL();
	public String email= config.getEmail();
	public String username= config.getUsername();
	public String password= config.getPassword();
	public static Logger logger;
	
	@BeforeClass
	void SetUp() throws InterruptedException
	{
		logger = Logger.getLogger("Gitlab");
		PropertyConfigurator.configure("log4j.properties");
			System.setProperty("webdriver.chrome.driver", config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(baseURL);
			Thread.sleep(7000);
	}
	
	@AfterTest
	public void tearDown() {
		
		
		if(driver!=null) {
			driver.quit();
		}
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
