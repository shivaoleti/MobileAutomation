package pages;

import org.openqa.selenium.By;

import core.BasePage;
import core.TestBase;
import io.appium.java_client.android.AndroidDriver;
import pageObjects.HomePageObjects;
import pageObjects.PayMentMethodsPageObjects;

public class PaymentMethodsPage extends TestBase{
	
	AndroidDriver driver;
	String navigationText="Payment methods";
	PayMentMethodsPageObjects paymentMethodspageObjects;
	BasePage b1;
    public PaymentMethodsPage(AndroidDriver<?> appiumDriver){
    	super();
     
    	paymentMethodspageObjects=new PayMentMethodsPageObjects(appiumDriver);
    	 b1=new BasePage(appiumDriver);
    	driver=new TestBase().getDriver();
    }
    
    
    public void addCardInfo()
    {
    	
    	new HomePageObjects(driver).getnavDrawer().click();
    	new BasePage(driver).scrollToElementByName(navigationText, new HomePage(driver).navigatorResourceId);
    	paymentMethodspageObjects.getPaymentMethodsNavigationDrawer().click();
    	b1.waitSeconds(5000);
    //	driver.findElementByAccessibilityId("Add credit or debit card").click();
    	//paymentMethodspageObjects.getBtnAddCreditOrDebitCard().click();
    	paymentMethodspageObjects.getlblFirstNameText().click();
    	paymentMethodspageObjects.getlblFirstNameText().sendKeys("shiva");
    	
    }

}

