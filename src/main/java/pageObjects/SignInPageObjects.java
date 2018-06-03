package pageObjects;

import java.util.List;

import core.BasePageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.By;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInPageObjects extends BasePageObject {

    public SignInPageObjects(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SIGN IN' or @text='Sign In']")
    MobileElement SignInButton;

    @AndroidFindBy(id = "com.walmart.grocery:id/sign_in_email_field")
    MobileElement userName;

    @AndroidFindBy(id = "com.walmart.grocery:id/sign_in_password_field")
    MobileElement passWord;

    @AndroidFindBy(xpath = "//*[@text='NEXT']")
    MobileElement btnNext;

    By btnNextWait = By.xpath("//*[@text='NEXT']");//Button to be visible for wait

    @AndroidFindBys(value = {
            @AndroidBy(id = "com.walmart.grocery:id/textinput_error")
    })
    public List<MobileElement> inpurErrorTxt;

    //@AndroidFindBys({@AndroidFindBy(id ="com.walmart.grocery:id/textinput_error")} )
    //private List<MobileElement> inpurErrorTxt;

    @AndroidFindBy(id = "com.walmart.grocery:id/close")
    MobileElement closebtn;

    public MobileElement getSignInButton() {
        return SignInButton;
    }

    public MobileElement getUsername() {
        return userName;
    }

    public MobileElement getPassword() {
        return passWord;
    }

    public MobileElement getNextButton() {
        return btnNext;
    }

    public By getBtnNextWait(){
        return btnNextWait;
    }

    public MobileElement getCloseBtn() {
        return closebtn;
    }
}
