package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class DurationOfStayPage extends Utility {

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='radio']")
    List<WebElement> selectStay;
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public void selectLengthOfStay(String duration) {
        CustomListeners.test.log(Status.PASS,"Selecting duration of stay "+duration+ "<br");
        switch (duration) {
            case "6 months or less":
                selectStay.get(0).click();
                break;
            case "longer than 6 months":
                selectStay.get(1).click();
                break;
        }


    }

    public void clickNextStepButton() {
        CustomListeners.test.log(Status.PASS,"Clicking on next button "+"<br>");
        clickOnElement(continueButton);
    }




}
