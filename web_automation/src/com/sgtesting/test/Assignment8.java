package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launch();
		navigate();
		login();
		minimizeflywindow();
	}

	private static void launch()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\web_automation\\selenium\\driver\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();		}
	}
	private static void login()
	{
	try {
		oBrowser.manage().window().maximize();
		Thread.sleep(100);
		
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(100);
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(100);
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(100);
		
	} catch (Exception e) {
		e.printStackTrace();	}		
	}
	private static void minimizeflywindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(100);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
