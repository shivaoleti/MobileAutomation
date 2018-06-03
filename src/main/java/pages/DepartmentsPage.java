package pages;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import core.BasePage;
import core.BasePageObject;
import core.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageObjects.DepartmentsObjects;


public class DepartmentsPage extends TestBase{

	DepartmentsObjects deptObjects;
	public DepartmentsPage(AndroidDriver<?> appiumDriver) {
		super();
		deptObjects=new DepartmentsObjects(appiumDriver);
	}
	
	 public MobileElement getBtnDepartment() {
	        return deptObjects.btnDepartment;
	    }

	    public List<MobileElement> getDepartmentDesc() {
	        return deptObjects.departmentDesc;
	    }

}
