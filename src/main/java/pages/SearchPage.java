package pages;

import core.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageObjects.HomePageObjects;
import pageObjects.SearchPageObjects;

public class SearchPage extends TestBase{
	
	SearchPageObjects searchObjects;
	 public SearchPage(AndroidDriver<?> appiumDriver){
	    	super();
	     
	    	searchObjects=new SearchPageObjects(appiumDriver);
	    }
	 
	 public MobileElement getSearchButton()

	 {
		 return searchObjects.search_searchBtn;
	 }
	 
	 public MobileElement getSearchFiled()

	 {
		 return searchObjects.search_SearchField;
	 }
	 
	 public MobileElement getSearchCloseButton()

	 {
		 return searchObjects.search_CloseButton;
	 }

	 public MobileElement getSearchCopyButton()

	 {
		 return searchObjects.search_CopyText;
	 }
	 
	 public MobileElement getClearSearchButton()

	 {
		 return searchObjects.search_ClearSearches;
	 }
	 
	 public MobileElement getSearchBackButton()

	 {
		 return searchObjects.search_BackButton;
	 }

}
