package pageObjects;

import core.BasePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchPageObjects extends BasePageObject{

	public SearchPageObjects(AndroidDriver<?> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id = "com.walmart.grocery:id/action_search")
    public MobileElement search_searchBtn;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'com.walmart.grocery:id/search_src_text')]")
    public MobileElement search_SearchField;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.walmart.grocery:id/search_close_btn']")
    public MobileElement search_CloseButton;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'com.walmart.grocery:id/copyText')]")
    public MobileElement search_CopyText;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'com.walmart.grocery:id/search_src_text')]")
    public MobileElement search_ClearSearches;
	
	 @AndroidFindBy(id="com.walmart.grocery:id/no_results_text")
	 public MobileElement search_NoSearchResultsText;
	 
	 /* This is based on content-desc attribute */
	 @AndroidFindBy(accessibility="Back")
	 public MobileElement search_BackButton;
	
	
	
		
}
