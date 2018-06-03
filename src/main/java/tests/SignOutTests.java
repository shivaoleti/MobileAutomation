package tests;

import core.BasePage;
import core.Key;
import core.TestBase;
import io.appium.java_client.MobileElement;
import pageObjects.HomePageObjects;


import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignInPage;

import java.util.Arrays;
import java.util.List;

public class SignOutTests extends TestBase {



    HomePageObjects h1;
    BasePage base;
    SignInPage s1;
    String navigatorResourceId="com.walmart.grocery:id/design_navigation_view";



    @Test(groups = { "100logOut"})
    public void signOut()
    {
       /* h1=new HomePageObjects();
        g1=new GeneralPage(appiumDriver);
        s1=new SignInUserScreen();
        h1.getnavDrawer().click();
        MobileElement element=g1.scrollToElementByName("Sign out",navigatorResourceId);
        element.click();
        if(s1.getSignInButton().isDisplayed())
            Reporter.log("<font color='green'>"+ "User Signed out Successfully" +"</font>" ,true);
*/
    	 new SignInTests().signInFlow();
    	 HomePage h1=new HomePage(new TestBase().getDriver());
    	 h1.signOut();
    }







}
