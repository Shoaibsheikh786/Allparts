package testCases;
import org.testng.annotations.Test;

import base.SettingBrowser;
import pageObjects.Search;
import utilities.CommonMethods;

public class SearchTest extends SettingBrowser {
	
	Search search;
	CommonMethods com=new CommonMethods();
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
		com.verifyTitle("Search results for: '699387'", driver);
	}
	@Test(priority=2)
	public void searchButtonIsDisabledWhenWeDontEnterAnyValue()
	{
		search=new Search(driver);
	    search.isSearchDisabled();
		
	}
}
