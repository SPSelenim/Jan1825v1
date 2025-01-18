package com.stc.Jan1825;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {

	public WebDriver driver=null;
	
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
@Test
  public void f() {

	System.out.println("STARTED ----------- ");
	driver.manage().window().maximize();
POMSearch ss=new POMSearch(driver);
ss.EnterFirstName("x1");
ss.EnterSecondName("y1");
ss.ClickQA();
}



}
