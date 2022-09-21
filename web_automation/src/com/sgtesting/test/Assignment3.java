package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 
{
public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		Minimizeflywindow();
		createcustomer();
		logout();
	
	}
	
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\web_automation\\selenium\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Minimizeflywindow()
	{
		try {
			oBrowser.findElement(By.className("gettingStartedShortcutsLabel")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.className("plusIcon")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("teertha");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();		}
	}

private static void logout()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	
}
