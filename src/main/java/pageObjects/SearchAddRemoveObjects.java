package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import core.BasePageObject;

import java.util.List;

public class SearchAddRemoveObjects extends BasePageObject {
    public SearchAddRemoveObjects(AndroidDriver<?> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id = "com.walmart.grocery:id/action_search")
    public MobileElement searchBtn;

    @AndroidFindBy(id = "com.walmart.grocery:id/search_src_text")
    public MobileElement searchBox;

    @AndroidFindBy(xpath = ".//android.widget.Button[@text='ADD']")
    public MobileElement btnAdd;

    @AndroidFindBy(id = "com.walmart.grocery:id/add_button")
    public MobileElement plusSymbol;

    @AndroidFindBy(id = "com.walmart.grocery:id/subtract_button")
    public MobileElement subtractSymbol;

    @AndroidFindBy(id = "com.walmart.grocery:id/amount")
    public MobileElement noOfItems;



    @FindBys( {
            @FindBy(id ="com.walmart.grocery:id/amount")

    } )
    private List<MobileElement> addList;

    @AndroidFindBy(id="com.walmart.grocery:id/filter_header")
	public MobileElement filterHeader;
    
    @AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.walmart.grocery:id/refine']")
   	public MobileElement btnSortAndFilter;
    
    @AndroidFindBy(id="com.walmart.grocery:id/no_results_text")
    public MobileElement txtNoSearchResultsText;
    

    public MobileElement getSearchBtn() {    return searchBtn;   }

    public MobileElement getSearchBox() {
        return searchBox;
    }

    public List<MobileElement> getAddList() {
        return addList;
    }

    public MobileElement getNoOfItems() {
        return noOfItems;
    }

    public MobileElement getPlusSymbol() {
        return plusSymbol;
    }

    public MobileElement getSubtractSymbol() {
        return subtractSymbol;
    }
    
    public MobileElement getFilterHeader() {
        return filterHeader;
    }
    
    public MobileElement getNoSearchResultsText()
    {
    	return txtNoSearchResultsText;
    }
}
