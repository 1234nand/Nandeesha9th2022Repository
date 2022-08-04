package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaabrowserDemo {
    
	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		closeApplication();

	    }
        private static void LaunchBrowser()
	    {
		     try
		     {
			     System.getProperty(" webdriver.opera.driver","D:\\EampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\operadriver.exe");
			     oBrowser=new OperaDriver();
			
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
         private static void closeApplication()
         {
        	 try
        	 {
        		 oBrowser.close();
        	 }catch(Exception e)
        	 {
        		 e.printStackTrace();
        	 }
         }

}
