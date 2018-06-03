package pages;


import core.TestBase;
import io.appium.java_client.android.AndroidDriver;
import pageObjects.SignInPageObjects;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class SignInPage extends TestBase {
	
	SignInPageObjects signInPageObjects;

    public SignInPage(AndroidDriver<?> appiumDriver) {
        super();
        signInPageObjects = new SignInPageObjects(appiumDriver);
    }



    public void splashScreenNextButtonClick() {
          signInPageObjects.getNextButton().click();
    }

    public void clickSignInButton() {
        signInPageObjects.getSignInButton().click();
    }

    public void enterUserName(String username) {
        signInPageObjects.getUsername().sendKeys(username);
    }

    public void clearUserName() {
        signInPageObjects.getUsername().clear();
    }

    public String getUseramePasswordErrorText() {
        return signInPageObjects.inpurErrorTxt.get(0).getText();
    }

    public void userNameErrorValidation()
    {
        Assert.assertEquals(getUseramePasswordErrorText(),
                "Please enter your email address", "The error is displayed..");
       if( getUseramePasswordErrorText().equalsIgnoreCase("Please enter your email address"))
        	test.log(Status.PASS, "Verified Username Error Text");
        else
        	test.log(Status.FAIL, "Verified Username Error Text");
        	
    }

    public void passWordErrorValidation()
    {
        Assert.assertEquals(getUseramePasswordErrorText(),
                "Please enter a password", "The error message for password is displayed..");
        
        if(getUseramePasswordErrorText().equalsIgnoreCase("Please enter a password"))
        	test.log(Status.PASS, "Verified Password Error Text");
        else
        	test.log(Status.FAIL, " Password Error Text Mismatch");
    }
    

    public void login(String userName,String password)
    {
        signInPageObjects.getUsername().clear();
        signInPageObjects.getUsername().sendKeys(userName);
        appiumDriver.hideKeyboard();
        signInPageObjects.getPassword().click();
        signInPageObjects.getPassword().sendKeys(password);
        appiumDriver.hideKeyboard();
        signInPageObjects.getSignInButton().click();
    }

    

    public void enterPassword(String password)
    {
        signInPageObjects.getPassword().clear();
        signInPageObjects.getPassword().sendKeys(password);
    }

}
