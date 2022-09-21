package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo2 
{
	public static WebDriver obj=null;
	public static void main(String[] args) 
	{
		launch();
		navigate();
		login();
	}
	private static void launch()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\web_automation\\selenium\\driver\\chromedriver.exe");
			obj=new ChromeDriver();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();		}
	}
	
	private static void navigate()
	{
		try {
			obj.get("file:///C:/Users/manoj/AppData/Local/Temp/AweZip/Temp1/AweZip6/Sample.html");
		} catch (Exception e) {
			e.printStackTrace();		}
	}

	private static void login()
	{
		try {
			obj.findElement(By.xpath("html/body/div/form/input")).sendKeys("man");
			Thread.sleep(1000);
			obj.findElement(By.xpath("html/body/div/form/input[2]")).sendKeys("pan");
			Thread.sleep(1000);
			/*obj.findElement(By.xpath("html/body/div/form/input[3]")).click();
			Thread.sleep(1000);*/
			obj.findElement(By.xpath("//*[@type='checkbox']")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@type='radio'and@id='rad2firefox']")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//input[7]")).sendKeys("mhjk");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//a[4]")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();		}
	}
}
