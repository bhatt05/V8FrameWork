package com.qait.GetPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetPageObj extends BaseUI{

	public GetPageObj(WebDriver driver) {
		super(driver);
		
	}
	protected WebElement element(String str) {
		return driver.findElement(FindElements(str));
	}
	public By FindElements(String str){
		if(str.equalsIgnoreCase("login"))
		return By.xpath("//a[@href=\"#panel1\"]");
		else if(str.equalsIgnoreCase("username"))
			return By.xpath("//input[@name=\"txtUserName\"]");
		else if(str.equalsIgnoreCase("password"))
			return  By.xpath("//input[@name=\"txtPassword\"]");
		else if(str.equalsIgnoreCase("submit"))
			return By.xpath("//input[@name=\"Submit\"]");
		return null;
								
	}
}
































