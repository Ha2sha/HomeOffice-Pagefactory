package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement getMessage;

    public String getResultMessage() {
        CustomListeners.test.log(Status.PASS,"Getting Result "+"<br>");
        String result = getTextFromElement(getMessage);
        return result;

    }

    public void verifyIfResultMessage(String expMsg) {
        CustomListeners.test.log(Status.PASS,"Verifying Result text "+"<br>");
        if (getResultMessage().equalsIgnoreCase(expMsg)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }

    }



}
