package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.SettingBrowser;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageObjects.Cart;

public class CartTestCases  extends SettingBrowser{
	
	public Cart c;
	
	@BeforeMethod
	public void setup()
	{
	     c=new Cart(driver);
	}
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=1, description="Clicks On Add to Cart Button On A Product")
	@Description("Clicks On Add to Cart Button On A Product")
	@Epic("EP Cart")
//	@Feature("Feature2: we are able to search to the items with the help of their reference numbers")
//	@Story("Story: Check the search Feature is working ")
//	@Step("Go to url of allparts.com and enter the data into search box and click on serach")
	public void cartTest1() throws InterruptedException
	{
		c.clickcart();
	}
    
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=1, description="Clicks On Cart Logo")
	@Description("Clicks On Cart Logo")
	@Epic("EP Cart")
    public void cartLogo()
    {
    	c.clickcartlogoo();
    }
    
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=1, description="Checks Product Quantity Can Be Changed")
	@Description("Checks Product Quantity Can Be Changed")
	@Epic("EP Cart")
    public void Quantity() 
    {
    	c.checkQuantityChange();
    }
	
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=1, description="Checks Product Can Be Deleted From The Cart")
	@Description("Checks Product Can Be Deleted From The Cart")
	@Epic("EP Cart")
    public void checkProductDeletion() throws InterruptedException
    {
    	c.checkProductDeletion();
    }
}
