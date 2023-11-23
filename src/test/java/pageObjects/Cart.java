package pageObjects;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.CommonMethods;

public class Cart{
	
	WebDriver driver;
	WebDriverWait wait;
	CommonMethods cm = new CommonMethods();

	public Cart(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
		wait = new WebDriverWait(d, Duration.ofSeconds(20)); 
	}

	@FindBy(xpath = "//*[@id=\"owl-demo\"]/li[1]/div/form/button")
	WebElement cart;
	@FindBy(xpath = "//*[@id=\"html-body\"]/div[2]/header/div[2]/div[1]/a")
	WebElement clickcartlogo;
	@FindBy(xpath = "//a[@title='Fuel tank kit for extended run plastic new design']")
    WebElement product;
	@FindBy(xpath = "//input[@id='qty']")
    WebElement quantityInput;
	
	@FindBy(xpath = "//a[@aria-label='Mini Cart']")
    WebElement cartLogo;
	@FindBy(xpath = "//a[@class='action delete']")
    WebElement delete;
	@FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement ok;
	
	
	public void clickcart() {
		cart.click();
		String title = "Shopping Cart";
		cm.verifyTitle(title, driver);
	}
	
	public void clickcartlogoo() {
		clickcartlogo.click();
		
	}
	
	public void checkQuantityChange()
	{
		product.click();
		String initialQuantity = quantityInput.getAttribute("value");	
		quantityInput.sendKeys(Keys.ARROW_UP);
		String updatedQuantity = quantityInput.getAttribute("value");
        Assert.assertNotEquals(initialQuantity, updatedQuantity, "Quantity did not change as expected");
	}
	
	public void checkProductDeletion() throws InterruptedException
	{
		
		 cart.click();
	        wait.until(ExpectedConditions.elementToBeClickable(cartLogo)).click();
	        Thread.sleep(2000);
	        wait.until(ExpectedConditions.elementToBeClickable(delete)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(ok)).click();
		
	}
	
	
}

	

