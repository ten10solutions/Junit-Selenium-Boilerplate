package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static String URL = "http://3.14.228.156/";
    private static final By SIGN_IN_BUTTON = By.cssSelector("a.login");

   public void goTo(){
        driver.get(URL);
   }

   public void navigateToSignInPage(){
       waitAndClick(SIGN_IN_BUTTON);
   }

}
