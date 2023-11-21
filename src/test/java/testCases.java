import org.testng.annotations.Test;

import base.SettingBrowser;
import pageObjects.Search;

public class testCases extends SettingBrowser {
	
	Search search;
	@Test(priority=1)
	public void searchItemsWithKeyword()
	{
		search=new Search(driver);
		search.enterdata("fuel tank");
		search.clickOnSearch();
		search.verifyTheTitle("Search results for: 'fuel tank'");
	}
	@Test(priority=2)
	public void searchItemsWithKeyNumbers()
	{
		search=new Search(driver);
		search.enterdata("699387");
		search.clickOnSearch();
		search.verifyTheTitle("Search results for: '699387'");
	}
	@Test(priority=2)
	public void searchButtonIsDisabledWhenWeDontEnterAnyValue()
	{
		search=new Search(driver);
	    search.isSearchDisabled();
		
	}
}
