package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Hostel extends TestBase {
	
	@Test 
	public void Go()
	{
			getDriver().findElement(By.xpath(".//button[text()=\"Let's go!\"]")).click();
	}
	
	@Test
	public void Login()
	{
		getDriver().findElement(By.xpath(".//button[@id='header-login']")).click();
	}
	
	@Test
	public void Language()
	{
		getDriver().findElement(By.xpath("(.//div[@class='icon-menu-item'])[1]")).click();
	}
	
	@Test
	public void Currency()
	{
		getDriver().findElement(By.xpath("(.//div[@class='icon-menu-item'])[2]")).click();
	}

}
