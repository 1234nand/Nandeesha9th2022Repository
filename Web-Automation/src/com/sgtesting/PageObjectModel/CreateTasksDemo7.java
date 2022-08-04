package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTasksDemo7 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Login();
		minimizeFlyOutWindow();
		//Logout();
		
	}
	public static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\EampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Login()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPwd().sendKeys("manager");
			oPage.getoLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getGettingStartedShortcutsPanelId().click();;
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*private static void createUser()
	{
		//try
		{
			@FindBy(xpath="//*[@id=\\\"topnav\\\"]/tbody/tr[1]/td[5]/a");
			Thread.sleep(2000);
		}
	}*/
	private static void Logout()
	{
		try
		{
			oPage.getoLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
