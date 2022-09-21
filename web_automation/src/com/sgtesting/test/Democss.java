package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democss {
	public static WebDriver obj=null;
	
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		
	}
	
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\web_automation\\selenium\\driver\\chromedriver.exe");
			obj=new ChromeDriver();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
	 try
	 {
		obj.get("file:///C:/Users/manoj/AppData/Local/Temp/AweZip/Temp1/AweZip3/WebTableHTML.html");
		Thread.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
	}
		


}
