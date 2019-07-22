package com.qait.GetPageObject;

import org.openqa.selenium.WebDriver;

public class BaseUI {
	protected WebDriver driver;
	public BaseUI(WebDriver driver) {
		this.driver=driver;
		
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}
