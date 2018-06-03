package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.BasePage;
import core.Key;
import core.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import pageObjects.FavouritesObjects;
import pages.FavouritesPage;
import pages.SearchPage;


public class FavouritesTests extends TestBase{
	
	@Test
	public void verifyFavouritiesIsEmpty()
	{
		FavouritesPage fav=new FavouritesPage(new TestBase().getDriver());
		SearchPage search=new SearchPage(new TestBase().getDriver());
		BasePage base=new BasePage(new TestBase().getDriver());
		new SignInTests().signInFlow();
        fav.navigateToFavouritesPage();
	   if( fav.isFavouritiesEmpty())
	   {
		   fav.getFavouritesEmptyPageMessage();
		   test.log(Status.INFO, "Favourites list is empty");
	   }
	   else
		   test.log(Status.INFO, "Favourites List is not empty");
	    
	}
	
	@Test
	public void searchAddToFavourities()
	{
		FavouritesPage fav=new FavouritesPage(new TestBase().getDriver());
		SearchPage search=new SearchPage(new TestBase().getDriver());
		BasePage base=new BasePage(new TestBase().getDriver());
		new SignInTests().signInFlow();
		base.verifyElementExists(search.getSearchButton(),"Search Button In HomePage");
		test.log(Status.INFO, "Clicking on Search Button in Home Page");
		search.getSearchButton().click();
		search.getSearchFiled().sendKeys("apples");
		 base.sendKeyEvent(Key.ENTER_BUTTON);
		List<MobileElement> favouriteIndicators=fav.getAllFavouritesIndicators();
		
		for(int i=0;i<favouriteIndicators.size();i++)
		{
			String text=favouriteIndicators.get(i).getAttribute("checked");
			if(text.equals("false"))
			{
			favouriteIndicators.get(i).click();
			text=favouriteIndicators.get(i).getAttribute("checked");
			if(text.equals(true))
				test.log(Status.PASS, "Clciked Item added to Favourites-->Check in Favourites tab");
			}
		}
		
		
		base.sendKeyEvent(Key.BACK_BUTTON); 
		fav.navigateToFavouritesPage();
		 
	}

	@Test
	public void removeItemsFromFavourities()
	{
		FavouritesPage fav=new FavouritesPage(new TestBase().getDriver());
		SearchPage search=new SearchPage(new TestBase().getDriver());
		BasePage base=new BasePage(new TestBase().getDriver());
		new SignInTests().signInFlow();
	//	 HomeScreen home=new HomeScreen(new TestBase().getDriver());
		// home.navigateToHome();
		 fav.navigateToFavouritesPage();
		 
		 
		 if(new BasePage(appiumDriver).verifyElementPresent(fav.getFilterHeader()))
		 {
			 String str=fav.getFilterHeader().findElement(By.className("android.widget.TextView")).getText().substring(0, 2);
			 System.err.println(str);
			 if(Integer.parseInt(str)>10)
			 {
				 int count=(Integer.parseInt(str))-10;
			 	 System.err.println("count:"+count);
				 for(int i=0;i<count;i++)
					 fav.getAllFavouritesIndicators().get(0).click();
			 }
		 }
			 
		 
		/* while((fav.isFavouritiesEmpty()))
		 {
						 
					 List<MobileElement> favouriteIndicators=fav.getAllFavouritesIndicators();
					 favouriteIndicators.get(0).click(); ;
				
					 
		 }*/
		
		if(!fav.isFavouritiesEmpty())
		{
			test.pass(MarkupHelper.createLabel("Passed: Favourites Page Is  Empty ",ExtentColor.GREEN));
		}
		else
			  test.fail(MarkupHelper.createLabel("Failed: Favourites Page Is Not Empty ",ExtentColor.RED));
		 
	}
	
	

}
