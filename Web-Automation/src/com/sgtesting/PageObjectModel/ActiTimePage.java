package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	  
	//WebElement for Login Page UserName text field
		private WebElement username;
				
		//WebElement for Login Page Password text field
		private WebElement pwd;

		//WebElement for Login Page Button field
		@FindBy(xpath="//*[@id=\"loginButton\"]/div")
		private WebElement oLogin;
		
		
		//WebElement for Home Page Flyout Window
		private WebElement gettingStartedShortcutsPanelId;
		
		
		//WebElement for Home Page Logout link
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		
		public WebElement getUsername() {
			return username;
		}


		public WebElement getPwd() {
			return pwd;
		}


		public WebElement getoLogin() {
			return oLogin;
		}


		public WebElement getGettingStartedShortcutsPanelId() {
			return gettingStartedShortcutsPanelId;
		}


		public WebElement getoLogout() {
			return oLogout;
		}
		
	}

    
