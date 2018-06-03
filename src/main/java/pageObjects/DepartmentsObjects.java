package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import core.BasePageObject;

import java.util.List;

public class DepartmentsObjects   extends BasePageObject  {


    public DepartmentsObjects(AndroidDriver<?> driver) {
		super(driver);
		
    }

	@AndroidFindBy(xpath ="//*[@text='DEPARTMENTS' or @text='DepartmentsPage']")
	public
    MobileElement btnDepartment;

    @FindBys( {
            @FindBy(id ="com.walmart.grocery:id/description")

    } )
    public List<MobileElement> departmentDesc;

    
   
}
