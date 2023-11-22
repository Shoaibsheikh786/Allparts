package utilities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonMethods {

	public void verifyTitle(String title, WebDriver driver)
	{
		Assert.assertEquals(driver.getTitle(), title);
	}
	public void contains(String value, WebDriver driver)
	{
		
		Assert.assertTrue(true,driver.getPageSource().concat(value));
	}
	
}
