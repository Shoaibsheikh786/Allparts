package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NavBarB {
	WebDriver driver;
public NavBarB(WebDriver d)
{
	driver=d;
	PageFactory.initElements(d, this);
	
}

@FindBy(xpath="//*[@id=\"navHome\"]/a")
WebElement home;


public void clickHome()
{
	home.click();
	String title="AllParts Equipment & Accessories OEM Quality Replacement Parts";
	Assert.assertEquals(driver.getTitle(),title);
}


}
