package com.Gitlab.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Gitlab.PageObject.CreateProjectPage;
import com.Gitlab.PageObject.LoginPage;

public class TC_CreateProject_003 extends BaseClass {
	
	private static final boolean ele = false;
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		
		LoginPage login = new LoginPage(driver);
		login.SigninLink();
		Thread.sleep(5000);
		login.EnterUserName(username);
		login.EnterPassword(password);
		login.ClickonSigninbutton();
		
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void CreateNewProject() throws InterruptedException, IOException
	{
		CreateProjectPage create = new CreateProjectPage(driver);
		
		create.ClickonNewProjectbutton();
		Thread.sleep(5000);
	
		//create.CreateBlankProject();
	
		create.EnterProjectName("Genaration Project4");
	
		logger.info("Project name is Entered");
		create.EnterDescription("This new Project");
		logger.info("Project Description is Entered");
		create.SetVisibility();
		logger.info("Visibility mode public");
		create.ClickonCreateProjectbutton();
		logger.info("Clicked on Create Project button");
		logger.info("Project is Created");
		
		
		String Project = driver.findElement(By.xpath("//h1[@class='home-panel-title gl-mt-3 gl-mb-2 gl-font-size-h1 gl-line-height-24 gl-font-weight-bold']")).getText();
		if(Project.contains("Genaration Project4"))
		{
			Assert.assertTrue(true);
			logger.info("Project name is Validated");
			logger.info("test case Passed.....");
		}else
		{
			captureScreen(driver,"CreateNewProject");
			Assert.assertTrue(false);
		}
		Thread.sleep(4000);
		create.profiledropdown();
		create.Signout();
		logger.info("Account signed out");
	
	}
	
	
}
	
	
