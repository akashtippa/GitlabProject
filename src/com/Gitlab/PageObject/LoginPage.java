package com.Gitlab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver ldriver1;
	public LoginPage(WebDriver rdriver)
	{
		ldriver1=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Sign in")
	@CacheLookup
	WebElement signinlink;
	
	@FindBy(xpath="//input[@id='user_login']")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="user_password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//input[@value='Sign in']")
	@CacheLookup
	WebElement signinbutton;
	
	@FindBy(xpath="//img[@alt='akash tippa']")
	@CacheLookup
	WebElement profiledrop;
	
	@FindBy(xpath="//a[@class='sign-out-link']")
	@CacheLookup
	WebElement Logout;
	
	public void SigninLink()
	{
		signinlink.click();
	}
	public void EnterUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void EnterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void ClickonSigninbutton()
	{
		signinbutton.click();
	}
	public void profiledropdown()
	{
		profiledrop.click();
	}
	public void Signout()
	{
		Logout.click();
	}
}
