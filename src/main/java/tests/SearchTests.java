package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import core.BasePage;
import core.Key;
import core.TestBase;
import pages.SearchAddRemovePage;
import pages.SearchPage;
import pages.SignInPage;
import pages.SplashScreenPage;

public class SearchTests extends TestBase {
	
	
	@Test
	public void verifyAllSearchFileds()
	{
		SearchPage search=new SearchPage(new TestBase().getDriver());
		BasePage base=new BasePage(new TestBase().getDriver());
		new SignInTests().signInFlow();
		base.verifyElementExists(search.getSearchButton(),"Search Button In HomePage");
		test.log(Status.INFO, "Clicking on Search Button in Home Page");
		search.getSearchButton().click();
		if(base.verifyElementPresent(search.getSearchFiled()))
			{
				test.log(Status.INFO, "Search Filed is present");
				search.getSearchFiled().sendKeys("aaaaaaa");
				 base.sendKeyEvent(Key.ENTER_BUTTON);
				 base.sendKeyEvent(Key.BACK_BUTTON); 
				 base.sendKeyEvent(Key.BACK_BUTTON); 
			}
		else
			test.log(Status.INFO, "Search Filed is not present");
		search.getSearchButton().click();
		search.getSearchFiled().sendKeys("apple");
		base.verifyElementExists(search.getSearchCopyButton(),"Copy Button");
		base.verifyElementExists(search.getSearchCloseButton(),"Search Close");
		base.verifyElementExists(search.getClearSearchButton(),"Clear Search Results Text Button");
		base.verifyElementExists(search.getSearchBackButton(),"Back Button");
		
	}
 
	@Test
	public void verifyResultsWithValidSearch()
	{
		SplashScreenPage splash=new SplashScreenPage(new TestBase().getDriver());
	    SignInPage s1=new SignInPage(new TestBase().getDriver());
	    SearchPage search=new SearchPage(new TestBase().getDriver());
	    SearchAddRemovePage searchResults=new SearchAddRemovePage(new TestBase().getDriver());
	    BasePage base = new BasePage(new TestBase().getDriver());
	    new SignInTests().signInFlow();
	    base.verifyElementExists(search.getSearchButton(),"Search Button In HomePage");
		test.log(Status.INFO, "Clicking on Search Button in Home Page");
		search.getSearchButton().click();
		search.getSearchFiled().sendKeys("apple");
	    base.sendKeyEvent(Key.ENTER_BUTTON);
	    if(searchResults.isSearchResultsFound())
	    	searchResults.getSearchResultsCount();
	    else
	    	test.log(Status.INFO,"Some Thing went Wrong Search Again");
	    
    
	}
	
	@Test
	public void verifyResultsWithInValidSearch()
	{
		SplashScreenPage splash=new SplashScreenPage(new TestBase().getDriver());
	    SignInPage s1=new SignInPage(new TestBase().getDriver());
	    SearchPage search=new SearchPage(new TestBase().getDriver());
	    SearchAddRemovePage searchResults=new SearchAddRemovePage(new TestBase().getDriver());
	    BasePage base = new BasePage(new TestBase().getDriver());
	    new SignInTests().signInFlow();
	    base.verifyElementExists(search.getSearchButton(),"Search Button In HomePage");
		test.log(Status.INFO, "Clicking on Search Button in Home Page");
		search.getSearchButton().click();
		search.getSearchFiled().sendKeys("aaaaaaaaaaaaaaaaa");
	    base.sendKeyEvent(Key.ENTER_BUTTON);
	    if(searchResults.isSearchResultsFound())
	    	searchResults.getSearchResultsCount();
	    else
	    	searchResults.getNoSearchResultsMessage();
	    
    
	}
}
