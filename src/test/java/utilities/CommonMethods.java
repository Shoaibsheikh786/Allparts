package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonMethods {

	public void verifyTitle(String title, WebDriver driver)
	{
		Assert.assertEquals(driver.getTitle(), title);
	}
}
