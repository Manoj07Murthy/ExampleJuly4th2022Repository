package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 
{
	public static WebDriver obj=null;
	
	public static void main(String[] args)
	{
		launchbrowser();
		navigate();
		salary1();
	}
	private static void launchbrowser()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\web_automation\\selenium\\driver\\chromedriver.exe");
			obj=new ChromeDriver();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			obj.get("file:///C:/Users/manoj/AppData/Local/Temp/AweZip/Temp1/AweZip3/WebTableHTML.html");
			Thread.sleep(500);
		} catch (Exception e)
		{
		e.printStackTrace();
		}
		
	}
	private static void salary1()
	{
		try {
			obj.findElement(By.xpath("//*[@id=\'edit1\']")).sendKeys("123");
			Thread.sleep(500);
		obj.findElement(By.xpath("//*[@id=\'chk1\']")).click();
			obj.findElement(By.xpath("//*[@id=\'list1\']/option[2]")).click();
			Thread.sleep(500);
			obj.findElement(By.xpath("//*[@id=\'edit2\']")).sendKeys("12");
			Thread.sleep(500);
			
			obj.findElement(By.xpath("//*[@id=\'list2\']/option[3]")).click();
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
