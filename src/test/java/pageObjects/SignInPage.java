package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public void enterNewAccountEmailAddress(){
        findAndType(EMAIL_ADDRESS_INPUT_BOX, "test@test.com");
    }

    public void clickCreateAnAccount(){
        waitAndClick(CREATE_NEW_ACCOUNT_BUTTON);
    }


}
