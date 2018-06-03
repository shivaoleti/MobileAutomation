package pages;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import core.BasePage;
import core.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageObjects.SearchAddRemoveObjects;

public class SearchAddRemovePage extends TestBase {
	By btnSortAndFilter=By.xpath("//android.widget.Button[@resource-id='com.walmart.grocery:id/refine']");
	SearchAddRemoveObjects searchObject;
	public SearchAddRemovePage(AndroidDriver<?> appiumDriver) {
		super();
		searchObject=new SearchAddRemoveObjects(appiumDriver);
	}
	
	public void clickSearchButton()
	{
		searchObject.getSearchBtn().click();
	}
	
	public void searchText(String text)
	{
		searchObject.getSearchBox().click();
		searchObject.getSearchBox().clear();
		searchObject.getSearchBox().sendKeys(text);
	}
	
	
	
	public List<MobileElement> getSearchItems()
	{
		return searchObject.getAddList();
	}
	
	public void clickPlusSymbol()
	{
		searchObject.getPlusSymbol().click();
	}
	
	public void clickMinusSymbol()
	{
		searchObject.getSubtractSymbol().click();
	}
	public int getNoOfItemsAddedToCartFromSingleListItem()
	{
		String itemCount=String.valueOf(searchObject.getNoOfItems().getText());
		System.err.println("Item Count:"+itemCount);
		return Integer.parseInt(itemCount);
	}
	
	public MobileElement getFilterHeader()
	 {
		 return searchObject.filterHeader;
	 }
	
	
	public void clickSortAndFilter()
	{
		getFilterHeader().findElement(btnSortAndFilter).click();
	}
	
	public MobileElement getBtnSortAndFilter() {
        return searchObject.btnSortAndFilter;
    }
	
	public Boolean isSearchResultsFound()
	{
		Boolean result=false;
		try
		{
			searchObject.getFilterHeader().isDisplayed();
			result=true;
			
		}
		catch(Exception e)
		{
			result=false;
			return result;
		}
	
		return result;
	}
	
	public void getSearchResultsCount()
	{
		new BasePage(new TestBase().getDriver()).waitSeconds(10000);
		String str=searchObject.getFilterHeader().findElement(By.className("android.widget.TextView")).getText().substring(0, 2);
		test.log(Status.INFO, "No Of Search Results Displayed:"+str);
	}
	
	public void getNoSearchResultsMessage()
	{
		new BasePage(new TestBase().getDriver()).waitSeconds(30);
		String str=searchObject.getNoSearchResultsText().getText();
		test.log(Status.INFO, str);
	}
	
}
