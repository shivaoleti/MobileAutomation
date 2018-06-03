package pages;

import core.BasePage;

import core.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageObjects.HomePageObjects;
import com.aventstack.extentreports.Status;



import java.util.Arrays;
import java.util.List;

public class HomePage extends TestBase {


    BasePage b1;
    SignInPage s1;
    

    String[] navDrawerItms = { "Home","Favorites","Departments","Reserve a time","Your Orders","Payment Methods","Contact Us","Refer & get $10 off","Send app feedback","About Walmart Grocery","Walmart App","Sign out","Version 3.4.0-qa-debug" };
    List<String> navigationItems= Arrays.asList( navDrawerItms );

    String[] tabularItems = { "HOME","FAVORITES","DEPARTMENTS"};
    List<String> tabularItemList= Arrays.asList( tabularItems );
    String navigatorResourceId="com.walmart.grocery:id/design_navigation_view";
    String horizontalScrollViewTabularResourceID="com.walmart.grocery:id/tab_layout";


    HomePageObjects homepageObjects;
    public HomePage(AndroidDriver<?> appiumDriver){
    	super();
     
    	homepageObjects=new HomePageObjects(appiumDriver);
    }
   
  

	public void navigateToHome()
	{
		homepageObjects.getHomeBtn().click();
	}


    public void clickCancelButtonIFExistsInHomeScreen()
    {

        try {
            if (homepageObjects.getCloseBtn().isDisplayed())
            	homepageObjects.getCloseBtn().click();
        } catch (Exception e) {

        }
    }

    public void getyNavigationDrawerItems()
    {

    	homepageObjects.getnavDrawer().click();

        for(String str:navigationItems) {
        	
        	new BasePage(appiumDriver).scrollAndVerifyElement(str, navigatorResourceId);

           /* if(new BasePage(appiumDriver).scrollAndVerifyElement(str, navigatorResourceId))
             // Reporter.log("<font color='green'>"+ str.toString() +"</font>" ,true);
            	test.log(Status.PASS,"<font color='green'>"+str.toString()+"</font>"+ "Is Present");
            	
            else
             //  Reporter.log("<font color='red'>"+ str.toString() +"</font>" ,false);
               test.log(Status.FAIL,"<font color='green'>"+str.toString()+"</font>"+ "Is not Present");
*/

        }


    }

    public void getHorizontalTabularItemsInHomePage()
    {

        for(String str:tabularItemList) {
        	new BasePage(appiumDriver).scrollAndVerifyElement(str, horizontalScrollViewTabularResourceID);
           /* if(new BasePage(appiumDriver).scrollAndVerifyElement(str, horizontalScrollViewTabularResourceID))
               // Reporter.log("<font color='green'>"+ str.toString() +"</font>" ,true);
            	test.log(Status.PASS,"<font color='green'>"+str.toString()+"</font>"+ "Is Present");
            else
              // Reporter.log("<font color='red'>"+ str.toString() +"</font>" ,false);
           test.log(Status.FAIL,"<font color='green'>"+str.toString()+"</font>"+ "Is not Present");*/


        }



    }

    public void clickHomeInHambergerMenu()
    {

        MobileElement element=new BasePage(appiumDriver).scrollToElementByName("Home",navigatorResourceId);
        element.click();
    }
    
    public void signOut()
    {
    	homepageObjects.getnavDrawer().click();
    	MobileElement element=new BasePage(appiumDriver).scrollToElementByName("Sign out",navigatorResourceId);
        element.click();
        
        if(appiumDriver.findElementByXPath("//android.widget.Button[@text='SIGN IN' or @text='Sign In']").isDisplayed())
            //Reporter.log("<font color='green'>"+ "User Signed out Successfully" +"</font>" ,true);
        	test.log(Status.PASS, "<font color='green'>"+ "User Signed out Successfully" +"</font>");
        else
        	test.log(Status.FAIL, "<font color='green'>"+ "User Signed out Failed" +"</font>");	

    }
    
    
}
