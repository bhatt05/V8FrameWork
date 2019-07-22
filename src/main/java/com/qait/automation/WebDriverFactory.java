package com.qait.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
	String driverPath;
	WebDriver driver;
//	public WebDriverFactory() {
//		this.driver
//	}
	public WebDriver getDriver() {
		//String browser=System.getProperty("browser");
		//System.out.println("Browser"+browser);
		//if(browser.equals("Chrome")) {
			driverPath="C:\\Users\\jagdishbhatt\\Downloads\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driverPath);
			//return getChromeDriver(driverPath);
			return new ChromeDriver();
		//}
		/*
		 * else { driverPath=
		 * "C:\\Users\\jagdishbhatt\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 * return getIEDriver(driverPath); }
		 */
	}

	/*
	 * public WebDriver getChromeDriver(String driverPath) { //driverPath=
	 * "C:\\Users\\jagdishbhatt\\Downloads\\chromedriver_win32\\chromedriver.exe";
	 * System.setProperty("webdriver.chrome.driver",driverPath);
	 * System.out.println("Hello1"); return new ChromeDriver(); }
	 */
	public WebDriver getIEDriver(String driverPath) {
		System.setProperty("webdriver.chrome.driver",driverPath);
		return new InternetExplorerDriver();
	}
}





































