package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTasksDemo77 {

	public CreateTasksDemo77(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//WebElement for Login Page UserName Edit Field
	 private WebElement username;
	 public WebElement getUsername() {
			return username;
		}
	 
	 //WebElement for Login Page Password Edit Field
	  private WebElement pwd;
	  public WebElement getPwd() {
			return pwd;
		}

	  
	  //WebElement for Login Page Logine Edit Field
	  @FindBy(xpath="//*[@id=\"loginButton\"]/div")
	  private WebElement Login;
	  public WebElement getLogin() {
			return Login;
		}
	  //WebElement for User Edit field
	  @FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	  private WebElement Users;
	  public WebElement getUsers() {
			return Users;
		}

	  
	  //WebElement for Add User edit field
	  @FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
	  private WebElement AddUser;
	  public WebElement getAddUser() {
			return AddUser;
		}

	  
	  //WebElement for FirstName edit field
	  @FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
	  private WebElement FirstName;
	  public WebElement getFirstName() {
			return FirstName;
		}
		
	  
	//WebElement for LastName edit field
	  @FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
	  private WebElement LastName;
	  public WebElement getLastName() {
			return LastName;
		}

	 
	  
	  //WebElement for mailid edit field
	  @FindBy(xpath="//*[@id=\"userDataLightBox_emailField\"]")
	  private WebElement MailId;
	  public WebElement getMailId() {
			return MailId;
		}
	  
	  //WebElement for UserName edit field
	  @FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
	  private WebElement UserName;
	  public WebElement getUserName() {
			return UserName;
		}

	  
	  //WebElement For Password edit field
	  @FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
	  private WebElement Pwds;
	  public WebElement getPwds() {
		return Pwds;
	}
	//WebElement for Retype password edit field
	  @FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
	  private WebElement RetypePwd;
	  public WebElement getRetypePwd() {
			return RetypePwd;
		}
	
		  
	  
	  
	
	

	

	
	
	  
	  
	  
	    
	

	

	
	
	  
}
