package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import core.BasePage;
import core.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageObjects.FavouritesObjects;
import pageObjects.HomePageObjects;


public class FavouritesPage  extends TestBase{

	By btnSortAndFilter=By.xpath("//android.widget.Button[@resource-id='com.walmart.grocery:id/refine']");
	FavouritesObjects favPageObjects;
    public FavouritesPage(AndroidDriver<?> appiumDriver)
    {
    	super();
    	favPageObjects=new FavouritesObjects(appiumDriver);
    }
    
    public MobileElement getfavouritesBtn() 
    {
        return favPageObjects.favouritesBtn;
    }
 
    public MobileElement getfavouritesIcon()
    {
        return favPageObjects.favouritesIcon;
    }
 
    public List<MobileElement> getfavouritesIndicator()
    {
        return favPageObjects.favouritesIndicator;
    }
 
    public MobileElement getFilterHeader()
	 {
		 return favPageObjects.filterHeader;
	 }
    
    public List<MobileElement> getAllFavouritesIndicators()
	{
		return getfavouritesIndicator();
	}
		
	public Boolean isFavouritiesEmpty()
	{
		Boolean result=new BasePage(appiumDriver).verifyElementPresent(getfavouritesIcon());
		return result;
	}
	
	public void navigateToFavouritesPage()
	{
		getfavouritesBtn().click();
	}
	
	public void getFavouritesEmptyPageMessage()
	{

		List<MobileElement> elements=getfavouritesIcon().findElements(By.xpath("//following-sibling::android.widget.TextView"));
		System.out.println("no of siblings:"+elements.size());	
		for(MobileElement ele:elements)	
		{		System.out.println(ele.getText());
				test.log(Status.INFO, ele.getText());
				
		}
		
		String str=String.valueOf(getfavouritesIcon());
		System.out.println(str);
		
		List<MobileElement> elements1=appiumDriver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.walmart.grocery:id/favorite_icon']//following-sibling::android.widget.TextView"));
		System.out.println("no of siblings elements1:"+elements1.size());
		for(MobileElement ele:elements1)	
		{		System.out.println(ele.getText());
				test.log(Status.INFO, ele.getText());
				
		}
		
	}
		
	
	public void clickSortAndFilter()
	{
		getFilterHeader().findElement(btnSortAndFilter).click();
	}
	
}
