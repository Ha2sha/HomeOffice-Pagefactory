package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SelectNationalityPage extends Utility {

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectNationality(String nationality) {
        CustomListeners.test.log(Status.PASS,"Selecting Nationality "+nationality+"<br>");
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
    }

    public void clickNextStepButton() {
        CustomListeners.test.log(Status.PASS,"Clicking on next button "+"<br>");
        clickOnElement(nextStepButton);
    }

}
