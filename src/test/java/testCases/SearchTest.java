package testCases;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.AllueLilstener;
import base.SettingBrowser;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pageObjects.Search;
import utilities.CommonMethods;

@Listeners({AllueLilstener.class})
public class SearchTest extends SettingBrowser {
	
	Search search;
	CommonMethods com=new CommonMethods();

	@Severity(SeverityLevel.MINOR)	
	@Test(priority=1, description="Search button is working properly when we enter product name")
	@Description("To check are we able to  serach items / proudcts with the product/item name ")
	@Epic("EP Search")
//	@Feature("Feature2: we are able to search to the items with the help of their reference numbers")
//	@Story("Story: Check the search Feature is working ")
//	@Step("Go to url of allparts.com and enter the data into search box and click on serach")
	public void searchItemsWithKeyword()
	{
		search=new Search(driver);
		search.enterdata("fuel tank");
		search.clickOnSearch();
		search.verifyTheTitle("Search results for: 'fuel tank'");
	}
	
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=2, description="Search items with unique numbers")
	@Description("To check are we able to  serach items / proudcts with the numbers ")
	@Epic("EP Search")
//	@Feature("Feature2: we are able to search to the items with the help of their reference numbers")
//	@Story("Story: Check the search Feature is working ")
//	@Step("Go to url of allparts.com and enter the data into search box and click on serach")

	public void searchItemsWithKeyNumbers()
	{
		search=new Search(driver);
		search.enterdata("699387");
		search.clickOnSearch();
		com.verifyTitle("Search results for: '699387'", driver);
	}
	
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=3, description="Search button is disabled when we dont enter any data")
	@Description("To check the search button is disabled when dont enter any data ")
	@Epic("EP Search")
//	@Feature("Feature2: we are able to search to the items with the help of their reference numbers")
//	@Story("Story: Check the search Feature is working ")
//	@Step("Go to url of allparts.com and enter the data into search box and click on serach")
	public void searchButtonIsDisabledWhenWeDontEnterAnyValue()
	{
		search=new Search(driver);
	    search.isSearchDisabled();
		
	}
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=4, description="Search button is working fine when we enter wrong input")
	@Description("To check when we give wrong inputs or we search the product which is not availaible it shows that the product is not availiable ")
	@Epic("EP Search")
//	@Feature("Feature2: we are able to search to the items with the help of their reference numbers")
//	@Story("Story: Check the search Feature is working ")
//	@Step("Go to url of allparts.com and enter the data into search box and click on serach")

	public void searchBtnIsWokringFineWhenWeEnterWrongInp()

	{
		search=new Search(driver);
		search.searchBtnWrksFineWrongInp("Your search returned no results.");
		
	}
	
}
