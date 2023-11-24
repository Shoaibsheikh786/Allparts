package testCases;

import org.testng.annotations.Test;

import base.SettingBrowser;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageObjects.NavBarB;

public class NavBarButtonsTest extends SettingBrowser {

	NavBarB nvbr;

	
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=100, description="Check the home button")
	@Description("Clicks On the home button to verify it is working")
	@Epic("EP Navbar")
	public void checkhomebutton() {
		nvbr = new NavBarB(driver);
		nvbr.clickHome();
	}
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=101, description="Check the about button")
	@Description("Clicks On the about button to verify it is working")
	@Epic("EP Navbar")
	
	public void checkAboutButton() {
		nvbr = new NavBarB(driver);
		nvbr.clickAbout();
		
	}

	
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=102, description="Check the Blog button")
	@Description("Clicks On the blog button to verify it is working")
	@Epic("EP Navbar")
	public void checkBlog() {
		nvbr = new NavBarB(driver);
		nvbr.clickBlog();
	}
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=103, description="Check the contact button")
	@Description("Clicks On the check button to verify it is working")
	@Epic("EP Navbar")
	
	public void checkContact() {
		nvbr = new NavBarB(driver);
		nvbr.clickContactUs();
	}
	

	@Severity(SeverityLevel.MINOR)	
	@Test(priority=104, description="Check the shepping button")
	@Description("Clicks On the shipping button to verify it is working")
	@Epic("EP Navbar")
	public void checkShippingST() {
		nvbr = new NavBarB(driver);
		nvbr.clickShippingStatement();
	}
}
