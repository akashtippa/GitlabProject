package com.Gitlab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProjectPage {

	
public WebDriver ldriver;
	
	public WebDriver ldriver1;
		public CreateProjectPage(WebDriver rdriver)
		{
			ldriver1=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//a[@class='btn btn-success']")
		@CacheLookup
		WebElement NewProjectButton;
		
//		@FindBy(xpath="//a[1]//div[1]//*[local-name()='svg']")
//		@CacheLookup
//		WebElement createblank;
//		
		@FindBy(id="project_name")
		@CacheLookup
		WebElement projectName;
		
		@FindBy(id="project_description")
		@CacheLookup
		WebElement Description;
		
		@FindBy(id="project_visibility_level_20")
		@CacheLookup
		WebElement publicvisibility;
		@FindBy(xpath="//div[@id='blank-project-pane']//input[@value='Create project']")
		@CacheLookup
		WebElement CreateProject;
		
		@FindBy(xpath="//img[@alt='akash tippa']")
		@CacheLookup
		WebElement profiledrop;
		
		@FindBy(xpath="//a[@class='sign-out-link']")
		@CacheLookup
		WebElement Logout;
		
		public void ClickonNewProjectbutton()
		{
			NewProjectButton.click();
		}
//		public void  CreateBlankProject()
//		{
//			createblank.click();
//			
//		}
		public void EnterProjectName(String proname)
		{
			projectName.sendKeys(proname);;
		}
		public void EnterDescription(String Desc)
		{
			Description.sendKeys(Desc);
		}
		public void SetVisibility()
		{
			publicvisibility.click();
		}
		public void ClickonCreateProjectbutton()
		{
			CreateProject.click();
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
