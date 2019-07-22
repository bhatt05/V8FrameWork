package com.qait.keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qait.GetPageObject.GetPageObj;

public class LoginPage extends GetPageObj{
	String password;
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public void getURL(String url){
		driver.get(url);
	}
	public String getPageTitle(String str) {
		String expected=super.getPageTitle();
		Assert.assertEquals(str, expected, "you are not in a correct page!!");
		return "";
	}
	public void searchLogInPage() {
		element("login").click();
	}
	public void searchUsername() throws IOException {
		InputStream input=new FileInputStream("C:\\Users\\jagdishbhatt\\eclipse-workspace\\HRISAuto\\src\\main\\resources\\abc.properties");
		Properties pro=new Properties();
		pro.load(input);
		String username=pro.getProperty("username");
		password=pro.getProperty("password");
		element("username").sendKeys(username);
	}
	public void searchPassword() {
		element("password").sendKeys(password);
	}
	public void Submit() {
		element("submit").click();
	}
}




















