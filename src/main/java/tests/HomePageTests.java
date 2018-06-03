package tests;

import core.TestBase;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTests extends TestBase {



    @Test(groups = { "101navigationItems"})
    public void verifyNavigationDrawerItems()
    {

        HomePage h1=new HomePage(new TestBase().getDriver());
        new SignInTests().signInFlow();
        h1.getyNavigationDrawerItems();

    }

    @Test(groups = { "102HorizontalTabularItems"})

    public void verifyHorizontalTabularItemsInHomePage()
    {
    	HomePage h1=new HomePage(new TestBase().getDriver());
       // h1.clickHomeInHambergerMenu();
        new SignInTests().signInFlow();
        h1.getHorizontalTabularItemsInHomePage();
    }
    /*@Test(groups = { "103logOut"})
    public void signOut()
    {
        h1=new HomePageObjects(appiumDriver);
        g1=new GeneralPage(appiumDriver);
        s1=new SignInUserScreen(appiumDriver);
        h1.getnavDrawer().click();
        MobileElement element=g1.scrollToElementByName("Sign out",navigatorResourceId);
        element.click();
        if(s1.getSignInButton().isDisplayed())
            Reporter.log("<font color='green'>"+ "User Signed out Successfully" +"</font>" ,true);



    }*/







}
