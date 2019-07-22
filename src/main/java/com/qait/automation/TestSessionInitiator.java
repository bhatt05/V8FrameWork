package com.qait.automation;

import org.openqa.selenium.WebDriver;
import com.qait.keyword.LoginPage;

public class TestSessionInitiator {
	public WebDriver driver;
	public LoginPage loginPage;
	public void initPage() {
		loginPage=new LoginPage(driver);
	}
	WebDriverFactory wb ;
	public TestSessionInitiator() {
		wb= new WebDriverFactory() ;
		System.out.println("Hellocall");
		this.driver=wb.getDriver();
		driver.manage().window().maximize();
		initPage();
	}

	
}































