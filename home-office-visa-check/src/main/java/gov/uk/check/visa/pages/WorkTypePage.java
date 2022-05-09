package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class WorkTypePage extends Utility {

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> jobType;
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public void selectJobType(String job) {
        CustomListeners.test.log(Status.PASS,"Selecting job type "+job +"<br>");
        for (WebElement menu : jobType) {
            if (menu.getText().equals(job)) {
                clickOnElement(menu);

                break;
            }
        }
    }

    public void clickNextStepButton() {
        CustomListeners.test.log(Status.PASS,"Clicking on next button "+"<br>");
        clickOnElement(continueButton);
    }


}
