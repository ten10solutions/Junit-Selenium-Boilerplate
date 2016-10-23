package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class LogInPage extends BasePage {

    WebDriver driver;
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    private By CREATE_NEW_ACCOUNT_BUTTON = By.cssSelector("a#createAccountSubmit");

    public void createNewAccount(){
        waitAndClick(CREATE_NEW_ACCOUNT_BUTTON);
    }


}
