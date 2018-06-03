package tests;


import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import core.BasePage;
import core.Key;
import core.TestBase;
import pages.SearchAddRemovePage;
import pages.SignInPage;
import pages.SplashScreenPage;



public class SearchAddRemoveTests extends TestBase {
	
	@Test
	public void verifyResultsWithValidSearch()
	{
		SplashScreenPage splash=new SplashScreenPage(new TestBase().getDriver());
	    SignInPage s1=new SignInPage(new TestBase().getDriver());
	    SearchAddRemovePage search=new SearchAddRemovePage(new TestBase().getDriver());
	    BasePage base = new BasePage(new TestBase().getDriver());
	    splash.clickBtnNext();
	    s1.clickSignInButton();
	    s1.login("qualitytesting98@gmail.com","android1");
	    search.clickSearchButton();
	    search.searchText("apples");
	    base.sendKeyEvent(Key.ENTER_BUTTON);
	    if(search.isSearchResultsFound())
	    	search.getSearchResultsCount();
	    else
	    	test.log(Status.INFO,"Some Thing went Wrong Search Again");
	    
    
	}
	
	@Test
	public void verifyResultsWithInValidSearch()
	{
		SplashScreenPage splash=new SplashScreenPage(new TestBase().getDriver());
	    SignInPage s1=new SignInPage(new TestBase().getDriver());
	    SearchAddRemovePage search=new SearchAddRemovePage(new TestBase().getDriver());
	    BasePage base = new BasePage(new TestBase().getDriver());
	    base.pressBackButton();
	    search.clickSearchButton();
	    search.searchText("aaaaaaaaaaaaa");
	    base.sendKeyEvent(Key.ENTER_BUTTON);
	    if(search.isSearchResultsFound())
	    	search.getSearchResultsCount();
	    else
	    	search.getNoSearchResultsMessage();
	    
    
	}
}

