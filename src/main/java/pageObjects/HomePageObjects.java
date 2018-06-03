package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;
import java.util.List;

import core.BasePageObject;

public class HomePageObjects extends BasePageObject {





    public HomePageObjects(AndroidDriver driver) {
		super(driver);
	}

	@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    MobileElement navDrawer;
    
    @AndroidFindBy(xpath="//android.widget.TextView[@text='HOME']")
	MobileElement homeBtn;

    @AndroidFindBy(id = "com.walmart.grocery:id/close")
    MobileElement closebtn;

    public MobileElement getnavDrawer() {
        return navDrawer;

    }

    public MobileElement getCloseBtn() {
        return closebtn;

    }
    
    public MobileElement getHomeBtn() {
        return homeBtn;

    }
}
