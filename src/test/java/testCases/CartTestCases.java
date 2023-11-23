package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.SettingBrowser;
import pageObjects.Cart;

public class CartTestCases  extends SettingBrowser{
	
	public Cart c;
	
	@BeforeMethod
	public void setup()
	{
	     c=new Cart(driver);
	}
	
    @Test
	public void cartTest1() throws InterruptedException
	{
		c.clickcart();
	}
    
    @Test
    public void cartLogo()
    {
    	c.clickcartlogoo();
    }
    
    @Test
    public void Quantity() 
    {
    	c.checkQuantityChange();
    }
    @Test
    public void checkProductDeletion() throws InterruptedException
    {
    	c.checkProductDeletion();
    }
}
