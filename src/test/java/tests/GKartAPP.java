package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GKartAPP extends TestBase {
	@Test
	public void Contact_Us()
	{
		getDriver().findElement(By.xpath("(.//*[contains(text(),'Contact Us')])[3]")).click();
	}
	@Test
	public void Cart()
	{
		getDriver().findElement(By.xpath(".//span[@class='fas fa-shopping-cart fa-fw']")).click();
	}
	@Test
	public void Search()
	{
		getDriver().findElement(By.xpath("(.//li[@class='site-nav__item'])[6]")).click();
	}

}
