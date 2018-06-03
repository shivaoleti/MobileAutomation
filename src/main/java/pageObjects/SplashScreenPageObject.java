package pageObjects;

import core.BasePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SplashScreenPageObject extends BasePageObject {

    public SplashScreenPageObject(AndroidDriver driver) {
		super(driver);
		
	}

	@AndroidFindBy(xpath = "//*[@text='NEXT']")
    MobileElement btnNext;

    public MobileElement getButtonNext()
    {
        return btnNext;
    }
}
