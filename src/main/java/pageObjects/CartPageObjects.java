package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class CartPageObjects  {
    @AndroidFindBy(id = "com.walmart.grocery:id/action_cart")
    public MobileElement cartBtn;

    @AndroidFindBy(id = "com.walmart.grocery:id/actionbar_cart_count")
    public MobileElement cartItemCount;




    @AndroidFindBy(id = "com.walmart.grocery:id/actionbar_cart_subtotal")
    public MobileElement cartItemSubTotal;



   @AndroidFindBy(xpath ="//*[@class='android.widget.FrameLayout']")
   public MobileElement framesInCart; // Here we are taking FrameLayout to check wheather cart is empty or not

    @AndroidFindBy(id = "com.walmart.grocery:id/cart_checkout")
    public MobileElement cartCheckoutBtn;

    @AndroidFindBy(id = "com.walmart.grocery:id/min_total")
    public MobileElement cartMinTotalErrMsg;

    @AndroidFindBy(id = "com.walmart.grocery:id/subtotal_value")
    public MobileElement cartSubTotalInCheckoutPage;

    @AndroidFindBy(xpath ="//*[@resource-id='com.walmart.grocery:id/collapsed_quantity_view']")
    public MobileElement cartCollapsedQuantityView;

    @AndroidFindBy(xpath ="//*[@resource-id='com.walmart.grocery:id/amount']")
    public MobileElement cartItems;



    @AndroidFindBy(xpath ="//android.widget.TextView[@text='REMOVE']")
    public MobileElement cartItemRemove;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text=concat('You don', \"'\", 't have any items in your cart yet.')]")
    public MobileElement cartEmptyMessage;

    @AndroidFindBy(xpath ="//*[@resource-id='com.walmart.grocery:id/empty_cart']")
    public MobileElement cartEmptyId;





    @FindBys( {
            @FindBy(xpath="//android.support.v7.widget.RecyclerView[@resource-id='com.walmart.grocery:id/list_view']/android.widget.FrameLayout")

    } )
	public List<MobileElement> cartViewList;

  

}
