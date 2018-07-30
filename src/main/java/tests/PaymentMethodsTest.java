package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import core.BasePage;
import core.Key;
import core.TestBase;
import pages.PaymentMethodsPage;
import pages.SearchAddRemovePage;
import pages.SearchPage;
import pages.SignInPage;
import pages.SplashScreenPage;

public class PaymentMethodsTest extends TestBase {
	
	
	
	@Test
	public void addCardInfoToApplication()
	{
		SplashScreenPage splash=new SplashScreenPage(new TestBase().getDriver());
	    SignInPage s1=new SignInPage(new TestBase().getDriver());
	    PaymentMethodsPage p1=new PaymentMethodsPage(new TestBase().getDriver());
	    BasePage base = new BasePage(new TestBase().getDriver());
	    new SignInTests().signInFlow();
	    test.log(Status.INFO, "I am in HomePage");
		p1.addCardInfo();
		
	    
    
	}

}
