package tests;

import core.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import pages.SplashScreenPage;

import java.util.concurrent.TimeUnit;

public class SignInTests extends TestBase{





    @Test(groups = { "UserNameErrorValidation"})
    public void userNameErrorValidation(){
    	System.err.println("driver:"+new TestBase().getDriver());
        SplashScreenPage splash=new SplashScreenPage(new TestBase().getDriver());
        SignInPage s1=new SignInPage(new TestBase().getDriver());
        splash.clickBtnNext();

        s1.clickSignInButton();
        s1.clickSignInButton();
        s1.userNameErrorValidation();
    }

    @Test(groups = { "PasswordErrorValidation"})
    public void passWordErrorValidation(){
      
    	SplashScreenPage splash=new SplashScreenPage(new TestBase().getDriver());
        SignInPage s1=new SignInPage(new TestBase().getDriver());
        splash.clickBtnNext();
        s1.clickSignInButton();
        s1.enterUserName("qualitytesting98@gmail.com");
      //  new TestBase().getDriver().hideKeyboard();
        s1.clickSignInButton();
        s1.passWordErrorValidation();
    }

    @Test(groups = { "102Login"})
     public void signIn()
    {
      
       SignInPage s1=new SignInPage(new TestBase().getDriver());
       HomePage h1=new HomePage(new TestBase().getDriver());
       SplashScreenPage splash=new SplashScreenPage(new TestBase().getDriver());
       splash.clickBtnNext();
       s1.clickSignInButton();
        s1.login("qualitytesting98@gmail.com","android1");
        h1.clickCancelButtonIFExistsInHomeScreen();
    }

    @Test
    public void signInFlow()
   {
       SplashScreenPage splash=new SplashScreenPage(new TestBase().getDriver());
       HomePage h1=new HomePage(new TestBase().getDriver());
       SignInPage s1=new SignInPage(new TestBase().getDriver());
       splash.clickBtnNext();
       s1.clickSignInButton();
       s1.login("qualitytesting98@gmail.com","android1");
       h1.clickCancelButtonIFExistsInHomeScreen();
     
   }
    
}
