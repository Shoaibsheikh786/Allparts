package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	WebDriver driver;
	public Search(WebDriver d)
	{   
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	@FindBy(xpath="//div[@class='nav']//input[@id='search']")
	WebElement inputSearch;
	
	@FindBy(xpath="//button[@id='homeSearchbtn']")
	WebElement searchButton;
	
	public void enterdata(String data)
	{
	   inputSearch.sendKeys(data);
	}
	public void clickOnSearch()
	{
		searchButton.click();
	}
	public void verifyTheTitle(String title)
	{
		Assert.assertEquals(title, driver.getTitle());
		
	}
	public void isSearchDisabled()
	{
		
		Assert.assertEquals(false,searchButton.isEnabled());
	}
	
	

}
