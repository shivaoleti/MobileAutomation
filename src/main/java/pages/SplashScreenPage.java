package pages;


import core.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageObjects.SignInPageObjects;
import pageObjects.SplashScreenPageObject;

import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SplashScreenPage   extends TestBase{

    SplashScreenPageObject splashScreenPageObject;
   

    public SplashScreenPage(AndroidDriver<?> appiumDriver) {
        super();
        splashScreenPageObject = new SplashScreenPageObject(appiumDriver);
    }
    
    public void clickBtnNext()
    {
       // SignInUserScreen sis=new SignInUserScreen(appiumDriver)	;
        splashScreenPageObject.getButtonNext().click();
        splashScreenPageObject.getButtonNext().click();
        splashScreenPageObject.getButtonNext().click();
    }


}
