package com.sgtesting.demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;



public class NewTest1
{
	public static WebDriver o2=null;

	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
			song();
			logout();
	}
	@Test(priority=1)
	private static void launchbrowser()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\web_automation\\selenium\\driver\\chromedriver.exe");
			o2=new ChromeDriver();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		private static void navigate()
		{
			try {
				o2.get("https://www.youtube.com/watch?v=6fVYuzu5lQY");
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();			}
		}
		private static void song()
		{
			try {
				o2.manage().window().maximize();
				Thread.sleep(1000);
				o2.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']")).click();
				Thread.sleep(1000);
				o2.findElement(By.xpath("//button[9]")).click();
				Thread.sleep(3000);
				o2.findElement(By.xpath("//*[@class='ytp-fullscreen-button ytp-button']")).click();
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace()	;		}
			
		}
		private static void logout()
		{
			try {
				o2.quit();
			} catch (Exception e) {
				e.printStackTrace();			}
		}

}
