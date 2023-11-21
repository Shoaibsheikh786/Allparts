package utilities;

import org.openqa.selenium.WebDriver;

public class BroswerRelMethods {
 
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void minimize(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
}
