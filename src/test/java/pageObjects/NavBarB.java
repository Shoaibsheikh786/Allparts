package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import base.AllueLilstener;
import utilities.CommonMethods;

@Listeners({AllueLilstener.class})
public class NavBarB {
	WebDriver driver;
	CommonMethods cm = new CommonMethods();

	public NavBarB(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);

	}

	@FindBy(xpath = "//*[@id=\"navHome\"]/a")
	WebElement home;
	@FindBy(xpath = "//*[@id=\"store.menu\"]/nav/ul[2]/li[2]/a")
	WebElement about;
	@FindBy(xpath = "//*[@id=\"store.menu\"]/nav/ul[2]/li[3]/a")
	WebElement blog;
	@FindBy(xpath = "//*[@id=\"store.menu\"]/nav/ul[2]/li[4]/a")
	WebElement contactus;
	@FindBy(xpath = "//*[@id=\"store.menu\"]/nav/ul[2]/li[5]/a")
	WebElement shippingstatement;
	

	public void clickHome() {
		home.click();
		String title = "AllParts Equipment & Accessories OEM Quality Replacement Parts";
		cm.verifyTitle(title, driver);
	}

	public void clickAbout() {
		about.click();
		String title = "About Us";
		cm.verifyTitle(title, driver);
	}

	public void clickBlog() {
		blog.click();
		String title = "Blog";
		cm.verifyTitle(title, driver);
	}

	public void clickContactUs() {
		contactus.click();
		String title = "Contact";
		cm.verifyTitle(title, driver);
	}
	
	public void clickShippingStatement() {
		shippingstatement.click();
		String title = "Allparts Shipping Statement";
		cm.verifyTitle(title, driver);
	}

}
