package pageObjects;

import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class BasketPage extends BasePage {

    WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }
    public static final String URL = "/cart/view.html/";

    public void isDisplayed(){
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains(URL));
    }

}
