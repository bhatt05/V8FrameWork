package com.qait.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

import com.qait.automation.TestSessionInitiator;
import com.qait.keyword.LoginPage;

public class Login {
	public TestSessionInitiator tSessionIni;
	public static String loginTitle;
	public static String homePageTitle;
	@BeforeClass
	public void openBrowser() throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", "Chrome");
		tSessionIni=new TestSessionInitiator();
		String url="https://hris.qainfotech.com/login.php";
		tSessionIni.loginPage.getURL(url);
		Yaml yaml = new Yaml();
		Reader inputStream =  new FileReader("C:\\Users\\jagdishbhatt\\eclipse-workspace\\HRISAuto\\src\\main\\resources\\Data.yaml");
		Map<String, Object> obj = yaml.load(inputStream);
		loginTitle=(String) obj.get("loginTitle");
		homePageTitle=(String) obj.get("homePageTitle");
		inputStream.close();
	}
	@Test
	public void test1() {
		tSessionIni.loginPage.searchLogInPage();
		tSessionIni.loginPage.getPageTitle(loginTitle);
		
	}
	@Test
	public void test2() throws IOException {
		
		tSessionIni.loginPage.searchUsername();
		tSessionIni.loginPage.searchPassword();
		tSessionIni.loginPage.Submit();
		tSessionIni.loginPage.getPageTitle(homePageTitle);
	} 
	
}























