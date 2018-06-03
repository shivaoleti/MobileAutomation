package tests;

import core.TestBase;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import pages.DepartmentsPage;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import java.util.Arrays;
import java.util.List;

public class DepartmentTests extends TestBase {

    String[] depts = { "Organic Shop","Special Dietary Needs","Produce","Meat","Eggs & Dairy","Deli","Bread & Bakery","Snacks","Beverages","Home & Outdoors","Beauty & Personal care","Baby","KARF Dept","Celebrations" };
    List<String> departments= Arrays.asList( depts );


    @Test(groups = { "101departmentList"})
    public void getDepartsList()
    {
        //new SignInUserScreenOriginal().signInOnly();
        System.err.println("Appium driver:"+getDriver());
        System.err.println(appiumDriver);
        new SignInTests().signInFlow();
        DepartmentsPage d1 = new DepartmentsPage(new TestBase().getDriver());
        d1.getBtnDepartment().click();
        
        for(String str:depts) {
          
            Boolean result=verifyDepartments(str, "com.walmart.grocery:id/list_view");
            if(result)
            test.log(Status.PASS,"<font color='green'>"+str.toString()+"</font>"+ "Is Present");
            else
            	test.log(Status.FAIL,"<font color='red'>"+str.toString()+"</font>"+ "Is Not Present");
            	
        }
    }

    public void scrollAndClick() {
     

        MobileElement element = appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.walmart.grocery:id/list_view\")).getChildByText("
                        + "new UiSelector().className(\"android.widget.TextView\"), \"Celebrations\")"));


        element.click();
    }

    public Boolean verifyDepartments(String elementName, String listId) {
        // appiumDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();

        MobileElement element = appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\""+listId+"\")).getChildByText("
                        + "new UiSelector().className(\"android.widget.TextView\"), \""+elementName+"\")"));

        Boolean result=false;
        try
        {
            if(element.isDisplayed())
                result= true;
        }
        catch (Exception e)
        {  return result;}


       return result;
    }
}
