package com.Gitlab.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Gitlab.PageObject.LoginPage;

public class TC_LoginWithEmailandUsername_002 extends BaseClass{

	
	
	@Test(priority=1)
	public void loginwithemailid() throws InterruptedException
	{
		
		LoginPage login = new LoginPage(driver);
		login.SigninLink();
		Thread.sleep(5000);
		login.EnterUserName(email);
		logger.info("email id is entered");
		login.EnterPassword(password);
		logger.info("Password is Entered");
		login.ClickonSigninbutton();
		logger.info("Clicked on Sign in button");
		
		if(driver.getTitle().equals("Projects · Dashboard · GitLab"))
		{
			Assert.assertTrue(true);
			
			logger.info("Login Testcase Passed!!!!!!");
				
		}else {
			Assert.assertTrue(false);
		logger.info("Login Testcase Failed!!!!!!");
		}
		Thread.sleep(4000);
		login.profiledropdown();
		login.Signout();
		logger.info("Account signed out");
	}
	
	@Test(priority=2)
	public void LoginwithUsername() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		
		Thread.sleep(5000);
		
		login.EnterUserName(username);
		logger.info("username is entered");
		login.EnterPassword(password);
		logger.info("Password is Entered");
		login.ClickonSigninbutton();
		logger.info("Clicked on Sign in button");
		
		if(driver.getTitle().equals("Projects · Dashboard · GitLab"))
		{
			Assert.assertTrue(true);
			
			logger.info("Login Testcase Passed!!!!!!");
				
		}else {
			Assert.assertTrue(false);
		logger.info("Login Testcase Failed!!!!!!");
		}
		Thread.sleep(4000);
		login.profiledropdown();
		login.Signout();
		logger.info("Account signed out");
		Thread.sleep(3000);
	}

	@Test(priority=3)
	public void LoginwithInvalidemail() throws InterruptedException, IOException
	{
		LoginPage login = new LoginPage(driver);

		Thread.sleep(5000);
		login.EnterUserName(invalidemail);
		logger.info("email id is entered");
		login.EnterPassword(invalidpassword);
		logger.info("Password is Entered");
		login.ClickonSigninbutton();
		logger.info("Clicked on Sign in button");
		
		if(driver.getTitle().equals("Projects · Dashboard · GitLab"))
		{
			Assert.assertTrue(true);
			
			logger.info("Login Testcase Passed!!!!!!");
				
		}else
			captureScreen(driver,"LoginwithInvalidemail");
			Assert.assertTrue(false);
		logger.info("Login Testcase Failed!!!!!!");
	}
		
	
}
