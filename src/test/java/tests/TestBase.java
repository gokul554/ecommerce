package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import core.DriverFactory;

public class TestBase {
	
	private WebDriver driver=null;
	
	//browserMethods
	@BeforeClass
	public void InitBrowser()
	{
		DriverFactory factory = new DriverFactory();
		driver=factory.getDriver("chrome");
	}
	
	public WebDriver getDriver()
	{
		return driver;
	
	}
	
	//URL_Method
	@BeforeMethod
	public void ApplicationURL()
	{
		driver.get("https://gokulkart.com/");
	//	driver.get("https://www.hostelworld.com/");
	}
	
	//QuitMethod
	@AfterClass
	public void CleanUP()
	{
		driver.quit();
	}

}