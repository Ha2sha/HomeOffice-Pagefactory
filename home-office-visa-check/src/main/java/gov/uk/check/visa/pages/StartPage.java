package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage extends Utility {

    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookiesButton1;


    public void clickStartNow(){
        CustomListeners.test.log(Status.PASS,"Clicking on Start Now button "+"<br>");
        clickOnElement(startNowButton);
    }
    public void acceptCookiesButton(){
        CustomListeners.test.log(Status.PASS,"Clicking on accepted cookies "+"<br>");
        clickOnElement(acceptCookiesButton1);
    }


}
