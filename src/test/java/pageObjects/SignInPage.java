package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class SignInPage extends BasePage {

    WebDriver driver;
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By EMAIL_ADDRESS_INPUT_BOX = By.cssSelector("input#email_create");
    private static final By CREATE_NEW_ACCOUNT_BUTTON = By.cssSelector("button#SubmitCreate");
    private static final By ALREADY_REGISTERED_ALERT = By.cssSelector("div#create_account_error");

    public void enterEmailAddress(String emailAddress){
        findAndType(EMAIL_ADDRESS_INPUT_BOX, emailAddress);
    }

    public void clickCreateAnAccount(){
        waitAndClick(CREATE_NEW_ACCOUNT_BUTTON);
    }

    public void alreadyRegisteredAlertPresent(){
        WebElement alertBox = driver.findElement(ALREADY_REGISTERED_ALERT);
        Assert.assertTrue(elementIsVisible(alertBox));
    }


}
