package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElementDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser12345");
			Thread.sleep(1000);
			String val=oBrowser.findElement(By.id("username")).getAttribute("value");
			System.out.println(val);
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

