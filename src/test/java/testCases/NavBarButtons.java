package testCases;

import org.testng.annotations.Test;

import base.SettingBrowser;
import pageObjects.NavBarB;

public class NavBarButtons extends SettingBrowser {

	NavBarB nvbr;

	@Test(priority = 100)
	public void checkhomebutton() {
		nvbr = new NavBarB(driver);
		nvbr.clickHome();
	}

	@Test(priority = 101)
	public void checkAboutButton() {
		nvbr = new NavBarB(driver);
		nvbr.clickAbout();
	}

	@Test(priority = 102)
	public void checkBlog() {
		nvbr = new NavBarB(driver);
		nvbr.clickBlog();
	}

	@Test(priority = 103)
	public void checkContact() {
		nvbr = new NavBarB(driver);
		nvbr.clickContactUs();
	}
	
	@Test(priority = 104)
	public void checkShippingST() {
		nvbr = new NavBarB(driver);
		nvbr.clickShippingStatement();
	}
}
