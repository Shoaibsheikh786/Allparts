import org.testng.annotations.Test;

import base.SettingBrowser;
import pageObjects.NavBarB;

public class NavBarButtons  extends SettingBrowser {

	NavBarB nvbr ;
	
	@Test(priority=100)
	public void checkhomebutton()
	{
		nvbr = new NavBarB(driver);
		nvbr.clickHome();
	}
	
}
