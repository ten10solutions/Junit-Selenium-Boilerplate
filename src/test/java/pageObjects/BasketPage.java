package pageObjects;

import static junit.framework.TestCase.assertTrue;
import static stepDefs.Sprint1.driver;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class BasketPage extends BasePage {
    public static final String URL = "/cart/view.html/";

    public void isDisplayed(){
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains(URL));
    }

}
