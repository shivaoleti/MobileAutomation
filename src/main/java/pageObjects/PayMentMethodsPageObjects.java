package pageObjects;

import core.BasePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PayMentMethodsPageObjects  extends BasePageObject {

	public PayMentMethodsPageObjects(AndroidDriver<?> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/* Mobile Element Names start-with lbl are used for Verifying elemetns,
	 *  start-with txt are used for input values
	 *  ex:lblPayMentsMethodHeaderTitle
	 *  txtLastName
	 */
	
	@AndroidFindBy(xpath = ".//android.widget.CheckedTextView[@text='Payment methods']")
    public MobileElement lblNavDrawerPaymentMethod;
	
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Payment methods']")
    public MobileElement lblPayMentsMethodHeaderTitle;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Credit or debit card']")
    public MobileElement lblCreditOrDebitCard;
	
	@AndroidFindBy(id = "com.walmart.grocery:id/add_credit_card")
    public MobileElement btnAddCreditOrDebitCard;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Add credit card']")
    public MobileElement lblAddCreditOrDebitHeader;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='SAVE']")
    public MobileElement btnSave;
	
	@AndroidFindBy(id = "com.walmart.grocery:id/title")
    public MobileElement lblCardInformationHeaderTitle;
	
	@AndroidFindBy(id = "com.walmart.grocery:id/first_name")
    public MobileElement lblFirstNameText;
	
	
	
	@AndroidFindBy(id = "com.walmart.grocery:id/ti_first_name")
    public MobileElement txtFirstName;
	
	@AndroidFindBy(id = "com.walmart.grocery:id/ti_last_name")
    public MobileElement txtLastName;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@content-desc='Card number, required field']")
    MobileElement txtCardNumber;
	
	@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    MobileElement navDrawer;
    
    @AndroidFindBy(xpath="//android.widget.TextView[@text='HOME']")
	MobileElement homeBtn;
    
    
    public MobileElement getLlblPayMentsMethodHeaderTitle()
    {
    	return lblPayMentsMethodHeaderTitle;
    }
    
    public MobileElement getBtnAddCreditOrDebitCard()
    {
    	return btnAddCreditOrDebitCard;
    }
    
    public MobileElement getlblFirstNameText()
    {
    	return lblFirstNameText;
    }
    
    public MobileElement getPaymentMethodsNavigationDrawer()
    {
    	return lblNavDrawerPaymentMethod;
    }

}
