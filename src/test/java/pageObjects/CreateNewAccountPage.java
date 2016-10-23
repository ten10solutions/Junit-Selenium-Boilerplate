package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class CreateNewAccountPage extends BasePage {

    WebDriver driver;
    public CreateNewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private By YOUR_NAME_BOX = By.cssSelector("input#ap_customer_name");
    private By EMAIL_BOX = By.cssSelector("input#ap_email");
    private By PASSWORD_BOX = By.cssSelector("input#ap_password");
    private By PASSWORD_AGAIN_BOX = By.cssSelector("input#ap_password_check");
    private By CREATE_YOUR_ACCOUNT_BUTTON = By.cssSelector("input#continue");

    public void fillInAllDetails(){
        findAndType(YOUR_NAME_BOX, "My Name");
        findAndType(EMAIL_BOX, "test@test.com");
        findAndType(PASSWORD_BOX, "password");
        findAndType(PASSWORD_AGAIN_BOX, "password");
        waitAndClick(CREATE_YOUR_ACCOUNT_BUTTON);
    }
}
