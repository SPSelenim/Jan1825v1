package com.stc.Jan1825;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSearch {

	public WebDriver driver = null;
	public String FName = "fname";
	public String LName = "lname";
	public String QA = "//a[@name='QA']";

	public POMSearch(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		WebElement ee;
		ee = driver.findElement(By.id(FName));
		return ee;
	}

	public WebElement getLastName() {
		WebElement ee;
		ee = driver.findElement(By.id(LName));
		return ee;
	}

	public WebElement getQA() {
		WebElement ee;
		ee = driver.findElement(By.xpath(QA));
		return ee;
	}

	public void EnterFirstName(String ff) {
		try {
			getFirstName().sendKeys(ff);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void EnterSecondName(String ll) {
		try {
			getLastName().sendKeys(ll);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void ClickQA() {
		try {
			getQA().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
