package pageObjects;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import core.BasePageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FavouritesObjects extends BasePageObject {

	
	
	public FavouritesObjects(AndroidDriver driver) {
		super(driver);
		
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='FAVORITES']")
	public MobileElement favouritesBtn;
	
	@AndroidFindBy(id="com.walmart.grocery:id/favorite_icon")
	public MobileElement favouritesIcon;
	
		 @FindBys( {
         @FindBy(id="com.walmart.grocery:id/favorite_indicator")

 } )
		 public List<MobileElement> favouritesIndicator;
		
	
		 @AndroidFindBy(id="com.walmart.grocery:id/filter_header")
			public MobileElement filterHeader;


}
