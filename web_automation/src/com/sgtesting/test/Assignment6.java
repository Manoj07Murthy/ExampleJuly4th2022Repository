package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 
{
	public static  WebDriver o1=null;

	public static void main(String[] args)
	{
		launchbrpwse();
		navigate();
	}
	private static void launchbrpwse()
	{
		try 
		{
		System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\web_automation\\selenium\\driver\\chromedriver.exe")	;
		o1=new ChromeDriver();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			o1.get("file:///F:/HTML/in.html");
			Thread.sleep(1000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	


